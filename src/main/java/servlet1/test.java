package servlet1;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class test extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("utf-8");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        System.out.println(username+"   "+password);
        if(DButils.login(username,password)){
            System.out.println("登陆成功 即将跳转下一个页面");
            resp.sendRedirect("/mysqltest_war/success.jsp");
        }else
        {
            resp.getWriter().println("登陆失败");
            //运用了转发的技术作为支撑
            resp.sendRedirect("/mysqltest_war/fault.jsp");
        }
    }
}
