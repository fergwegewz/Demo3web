package com.example.Demo3web;

import com.example.pojo.AllBot;
import com.example.service.AllService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet("/selectByUserQ")
public class SelectByUserQ extends HttpServlet {
    AllService allService = new AllService();
    @Override

    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");

        //有问题
        try {
            List<AllBot> allBots = allService.selectByUserQ(req.getMethod());
            req.setAttribute("list",allBots);
            req.getRequestDispatcher("index.jsp").forward(req,resp);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        super.service(req, resp);
    }



}
