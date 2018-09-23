package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;



/**
 * Servlet implementation class Personal
 */
@WebServlet("/Personal")
public class Personal extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Personal() {}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		String fathername = request.getParameter("fathername");
		System.out.println("name from page " + name);
		System.out.println("fathername from page " + fathername);
		HttpSession session = request.getSession();
		session.setAttribute(name, name);
		session.setAttribute(fathername, fathername);
		RequestDispatcher rd=null;
		rd=request.getRequestDispatcher("register2.jsp");
		rd.include(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
