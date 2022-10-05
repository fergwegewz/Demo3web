<%@ page import="java.util.ArrayList" %>
<%@ page import="com.example.pojo.AllBot" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>机器人租聘</title>
</head>
<body>
<%--<h1><%= "Hello World!" %>--%>
<%--</h1>--%>
<br/>
    <div>
<%--        <span>全表查询</span>--%>
<%--        <option value="订单号"></option>--%>
<%--        <option value="用户QQ"></option>--%>
<%--        <option value="用户微信"></option>--%>
<%--        <option value="用户闲鱼号"></option>--%>
<%--        <option value="服役QQ"></option>--%>
<%--        <option value="开始时间"></option>--%>
<%--        <option value="结束时间"></option>--%>
<%--        <option value="时长"></option>--%>
<%--        <option value="备注"></option>--%>
    <table>
    <tr>
        <td>订单号</td>
        <td>用户QQ</td>
        <td>用户微信</td>
        <td>用户闲鱼号</td>
        <td>服役QQ</td>
        <td>开始时间</td>
        <td>结束时间</td>
        <td>时长</td>
        <td>备注</td>
    </tr>
    <%--<%
        ArrayList<AllBot> list = (ArrayList<AllBot>) request.getAttribute("list");
        for (int i = 0; i < list.size(); i++) {
    %>--%>
    <%
        ArrayList<AllBot> list = (ArrayList<AllBot>) request.getAttribute("list");
        for (int i = 0; i <list.size() ; i++) {
    %>
    <tr>
        <td><%=list.get(i).getId()%></td>
        <td><%=list.get(i).getUserqq()%></td>
        <td><%=list.get(i).getUserwx()%></td>
        <td><%=list.get(i).getUserxy()%></td>
        <td><%=list.get(i).getBotqq()%></td>
        <td><%=list.get(i).getStarttime()%></td>
        <td><%=list.get(i).getEndtime()%></td>
        <td><%=list.get(i).getTime()%></td>
        <td><%=list.get(i).getE()%></td>
    </tr>
        <%}%>
        </table>

    </div>
</body>
</html>