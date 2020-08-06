package com.qf.controller;

import com.qf.dao.AaDao;
import com.sun.org.apache.bcel.internal.generic.NEW;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AaController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        AaDao aaDao= new AaDao();
        String s = aaDao.selectUserNameById(151515);
        request.setAttribute("msg",s);
        request.getRequestDispatcher("msg.jsp").forward(request,response);
    }
}
