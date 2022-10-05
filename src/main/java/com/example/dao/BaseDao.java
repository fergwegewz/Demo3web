package com.example.dao;

import javax.servlet.jsp.jstl.sql.Result;
import javax.servlet.jsp.jstl.sql.ResultSupport;
import java.sql.*;

public class BaseDao {
    public static Connection getConnetion() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        //此步有两种方法，一种是return DriverManager.getConnection(......)
        //另外一种就是下面的方法
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bot", "root", "123456");
        return connection;

    }
    //释放资源
    public static void close(Connection conn) throws SQLException {//拿到资源
        //进行逻辑判断
        if (conn!=null){
            conn.close();
        }
    }
    //替换问号，首先不知道问号到底几个，是什么类型，所以可以采用一个object类型的数组
    public static void setParameter(PreparedStatement ps,Object[] params) throws SQLException {
        //进行逻辑判断数组是否为空
        if (params!=null && params.length>0){
            //对数组进行遍历，遍历的同时进行问号值的替换
            for (int i =0;i<params.length;i++){
                //对问号的值进行替换，其中i+的意思是替换问号都是从第一个开始，而遍历是从第0个开始
                ps.setObject(i+1,params[i]);
            }
        }
    }
    //执行sql 增删改
    public static int runUpdate(String sql,Object[] params) throws SQLException, ClassNotFoundException {
        //调用了上面写的获取连接方法
        Connection con = getConnetion();
        //获取sql执行对象
        PreparedStatement ps = con.prepareStatement(sql);
        setParameter(ps,params);
        int count = ps.executeUpdate();
        close(con);
        return count;
    }
    //执行sql  查询
    public static Result runselect(String sql,Object[] params) throws SQLException, ClassNotFoundException {
        Connection conn = getConnetion();
        PreparedStatement ps = conn.prepareStatement(sql);
        setParameter(ps,params);
        ResultSet rs =ps.executeQuery();
        Result result = ResultSupport.toResult(rs);
        close(conn);
        return result;
    }

}
