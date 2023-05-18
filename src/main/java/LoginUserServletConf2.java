import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginUserServletConf2 extends HttpServlet{
		
	public void doGet(HttpServletRequest req, HttpServletResponse res) 
		throws IOException, ServletException {
		doPost(req, res);
	}

	public void doPost(HttpServletRequest req, HttpServletResponse res) 
		throws IOException, ServletException {
			
		req.setCharacterEncoding("UTF-8");
		res.setContentType("text/html;charset=UTF-8");
	
		String id = req.getParameter("id");
		String pw = req.getParameter("pass");
		
		UserDao dao = new UserDao();
		String name = dao.getName(id,pw);
		
		if(name != null) {
			
			req.setAttribute("login_name", name);
			req.setAttribute("dptname", dao.getAName(id));
		
		
			RequestDispatcher rd = req.getRequestDispatcher("/web/menu.jsp");
			rd.forward(req, res);
		}else {
			
			req.setAttribute("err","IDもしくはPASSが間違っています");
			RequestDispatcher rd = req.getRequestDispatcher("/web/login.jsp");
			rd.forward(req, res);
		}
		
	}
			
}