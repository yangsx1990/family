package com.family.basic;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @description:
 * @author: yangsaixing
 * @date: Created in 2020/8/25 上午10:37
 * @modified By:
 */
@WebServlet(urlPatterns="/servlet/test", description="Servlet的说明",initParams= {@WebInitParam(name="key",value="yellowcong")})
public class MyServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doGet(req, resp);
        System.out.println("myServlet get...");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

    @Override
    public void destroy() {
        super.destroy();
        System.out.println("myServlet destroy...");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("myServlet service ......");
        super.service(req, resp);
    }

    @Override
    public void init() throws ServletException {
        super.init();
        System.out.println("init myServlet......");
    }
}
