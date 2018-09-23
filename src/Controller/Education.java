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



/**
 * Servlet implementation class Personal
 */
@WebServlet("/Education")
public class Education extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Education() {}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String college = request.getParameter("college");
		String degree = request.getParameter("degree");
		String year = request.getParameter("year");
		System.out.println("name from page " + college);
		System.out.println("fathername from page " + degree);
		System.out.println("fathername from page " + year);
		HttpSession session = request.getSession();
		session.setAttribute(college, college);
		session.setAttribute(degree, degree);
		session.setAttribute(year, year);
		response.sendRedirect("review.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
