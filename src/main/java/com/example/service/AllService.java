package com.example.service;

import com.example.dao.BaseDao;
import com.example.pojo.AllBot;

import javax.servlet.http.HttpServlet;
import javax.servlet.jsp.jstl.sql.Result;
import java.sql.Array;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class AllService extends HttpServlet {
    //全表查询
    public static List<AllBot> selectAll() throws SQLException, ClassNotFoundException {
        ArrayList<AllBot> list = new ArrayList<>();
        String sql = "SELECT * FROM allbot";
        Result result = BaseDao.runselect(sql, null);
        if (result!=null && result.getRows().length>0){
            for (int i = 0; i < result.getRows().length; i++) {
                Map rows = result.getRows()[i];

                AllBot allBot = new AllBot();
                Integer id = (Integer) rows.get("id");
                allBot.setId(id);
                String userqq = (String) rows.get("userqq");
                allBot.setUserqq(userqq);
                String userwx = (String) rows.get("userwx");
                allBot.setUserwx(userwx);
                String userxy = (String) rows.get("userxy");
                allBot.setUserxy(userxy);
                String botqq = (String) rows.get("botqq");
                allBot.setBotqq(botqq);
                Date starttime = (Date) rows.get("starttime");
                allBot.setStarttime(starttime);
                Date endtime = (Date) rows.get("endtime");
                allBot.setEndtime(endtime);
                Integer time = (Integer) rows.get("time");
                allBot.setTime(time);
                String e = (String) rows.get("e");
                allBot.setE(e);

                list.add(allBot);
            }
            return list;
        }

        return null;
    }

    //用户qq查询
    public static List<AllBot> selectByUserQ(String uq) throws SQLException, ClassNotFoundException {
        ArrayList<AllBot> list = new ArrayList<>();
        String sql = "SELECT * FROM allbot WHERE userqq = '?'";
        Object[] array = {uq};

        Result result = BaseDao.runselect(sql, array);
        if (result!=null && result.getRows().length>0){
            for (int i = 0; i < result.getRows().length; i++) {
                Map rows = result.getRows()[i];

                AllBot allBot = new AllBot();

                Integer id = (Integer) rows.get("id");
                allBot.setId(id);
                String userqq = (String) rows.get("userqq");
                allBot.setUserqq(userqq);
                String userwx = (String) rows.get("userwx");
                allBot.setUserwx(userwx);
                String userxy = (String) rows.get("userxy");
                allBot.setUserxy(userxy);
                String botqq = (String) rows.get("botqq");
                allBot.setBotqq(botqq);
                Date starttime = (Date) rows.get("starttime");
                allBot.setStarttime(starttime);
                Date endtime = (Date) rows.get("endtime");
                allBot.setEndtime(endtime);
                Integer time = (Integer) rows.get("time");
                allBot.setTime(time);
                String e = (String) rows.get("e");
                allBot.setE(e);

                list.add(allBot);
            }
            return list;
        }

        return null;
    }

    //用户微信查询
    public static List<AllBot> selectByUserW() throws SQLException, ClassNotFoundException {
        ArrayList<AllBot> list = new ArrayList<>();
        String sql = "SELECT * FROM allbot";
        Result result = BaseDao.runselect(sql, null);
        if (result!=null && result.getRows().length>0){
            for (int i = 0; i < result.getRows().length; i++) {
                Map rows = result.getRows()[i];

                AllBot allBot = new AllBot();
                Integer id = (Integer) rows.get("id");
                allBot.setId(id);
                String userqq = (String) rows.get("userqq");
                allBot.setUserqq(userqq);
                String userwx = (String) rows.get("userwx");
                allBot.setUserwx(userwx);
                String userxy = (String) rows.get("userxy");
                allBot.setUserxy(userxy);
                String botqq = (String) rows.get("botqq");
                allBot.setBotqq(botqq);
                Date starttime = (Date) rows.get("starttime");
                allBot.setStarttime(starttime);
                Date endtime = (Date) rows.get("endtime");
                allBot.setEndtime(endtime);
                Integer time = (Integer) rows.get("time");
                allBot.setTime(time);
                String e = (String) rows.get("e");
                allBot.setE(e);

                list.add(allBot);
            }
            return list;
        }

        return null;
    }

    //用户咸鱼查询
    public static List<AllBot> selectByX() throws SQLException, ClassNotFoundException {
        ArrayList<AllBot> list = new ArrayList<>();
        String sql = "SELECT * FROM allbot";
        Result result = BaseDao.runselect(sql, null);
        if (result!=null && result.getRows().length>0){
            for (int i = 0; i < result.getRows().length; i++) {
                Map rows = result.getRows()[i];

                AllBot allBot = new AllBot();
                Integer id = (Integer) rows.get("id");
                allBot.setId(id);
                String userqq = (String) rows.get("userqq");
                allBot.setUserqq(userqq);
                String userwx = (String) rows.get("userwx");
                allBot.setUserwx(userwx);
                String userxy = (String) rows.get("userxy");
                allBot.setUserxy(userxy);
                String botqq = (String) rows.get("botqq");
                allBot.setBotqq(botqq);
                Date starttime = (Date) rows.get("starttime");
                allBot.setStarttime(starttime);
                Date endtime = (Date) rows.get("endtime");
                allBot.setEndtime(endtime);
                Integer time = (Integer) rows.get("time");
                allBot.setTime(time);
                String e = (String) rows.get("e");
                allBot.setE(e);

                list.add(allBot);
            }
            return list;
        }

        return null;
    }

    //服役机器人qq查询
    public static List<AllBot> selectByBotQ() throws SQLException, ClassNotFoundException {
        ArrayList<AllBot> list = new ArrayList<>();
        String sql = "SELECT * FROM allbot";
        Result result = BaseDao.runselect(sql, null);
        if (result!=null && result.getRows().length>0){
            for (int i = 0; i < result.getRows().length; i++) {
                Map rows = result.getRows()[i];

                AllBot allBot = new AllBot();
                Integer id = (Integer) rows.get("id");
                allBot.setId(id);
                String userqq = (String) rows.get("userqq");
                allBot.setUserqq(userqq);
                String userwx = (String) rows.get("userwx");
                allBot.setUserwx(userwx);
                String userxy = (String) rows.get("userxy");
                allBot.setUserxy(userxy);
                String botqq = (String) rows.get("botqq");
                allBot.setBotqq(botqq);
                Date starttime = (Date) rows.get("starttime");
                allBot.setStarttime(starttime);
                Date endtime = (Date) rows.get("endtime");
                allBot.setEndtime(endtime);
                Integer time = (Integer) rows.get("time");
                allBot.setTime(time);
                String e = (String) rows.get("e");
                allBot.setE(e);

                list.add(allBot);
            }
            return list;
        }

        return null;
    }

    //群号查询
    public static List<AllBot> selectByGroup() throws SQLException, ClassNotFoundException {
        ArrayList<AllBot> list = new ArrayList<>();
        String sql = "SELECT * FROM allbot";
        Result result = BaseDao.runselect(sql, null);
        if (result!=null && result.getRows().length>0){
            for (int i = 0; i < result.getRows().length; i++) {
                Map rows = result.getRows()[i];

                AllBot allBot = new AllBot();
                Integer id = (Integer) rows.get("id");
                allBot.setId(id);
                String userqq = (String) rows.get("userqq");
                allBot.setUserqq(userqq);
                String userwx = (String) rows.get("userwx");
                allBot.setUserwx(userwx);
                String userxy = (String) rows.get("userxy");
                allBot.setUserxy(userxy);
                String botqq = (String) rows.get("botqq");
                allBot.setBotqq(botqq);
                Date starttime = (Date) rows.get("starttime");
                allBot.setStarttime(starttime);
                Date endtime = (Date) rows.get("endtime");
                allBot.setEndtime(endtime);
                Integer time = (Integer) rows.get("time");
                allBot.setTime(time);
                String e = (String) rows.get("e");
                allBot.setE(e);

                list.add(allBot);
            }
            return list;
        }

        return null;
    }

    //订单编号查询
    public static List<AllBot> selectById() throws SQLException, ClassNotFoundException {
        ArrayList<AllBot> list = new ArrayList<>();
        String sql = "SELECT * FROM allbot";
        Result result = BaseDao.runselect(sql, null);
        if (result!=null && result.getRows().length>0){
            for (int i = 0; i < result.getRows().length; i++) {
                Map rows = result.getRows()[i];

                AllBot allBot = new AllBot();
                Integer id = (Integer) rows.get("id");
                allBot.setId(id);
                String userqq = (String) rows.get("userqq");
                allBot.setUserqq(userqq);
                String userwx = (String) rows.get("userwx");
                allBot.setUserwx(userwx);
                String userxy = (String) rows.get("userxy");
                allBot.setUserxy(userxy);
                String botqq = (String) rows.get("botqq");
                allBot.setBotqq(botqq);
                Date starttime = (Date) rows.get("starttime");
                allBot.setStarttime(starttime);
                Date endtime = (Date) rows.get("endtime");
                allBot.setEndtime(endtime);
                Integer time = (Integer) rows.get("time");
                allBot.setTime(time);
                String e = (String) rows.get("e");
                allBot.setE(e);

                list.add(allBot);
            }
            return list;
        }

        return null;
    }


}
