package com.zhangshaoliang.www;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by admin on 2017/9/3.
 */
public class IndexServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        PrintWriter writer = response.getWriter();
        writer.write("This is a Servlet doPost method.");
        writer.flush();
        writer.close();
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        PrintWriter writer = response.getWriter();
        writer.write("This is a Servlet doGet method.");
        writer.flush();
        writer.close();
    }
}
