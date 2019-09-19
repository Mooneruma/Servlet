package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Fconverter;

/**
 * Servlet implementation class getF
 */
@WebServlet("/getF")
public class getF extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public getF() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userTemp = request.getParameter("userTemp");

		Fconverter userTempIn = new Fconverter(Integer.parseInt(userTemp));

		request.setAttribute("UserTempF", userTempIn);

		getServletContext().getRequestDispatcher("/resultF.jsp").forward(request, response);
	}

}
