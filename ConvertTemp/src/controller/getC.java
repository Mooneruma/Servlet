package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Cconverter;

/**
 * Servlet implementation class getF
 */
@WebServlet("/getC")
public class getC extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public getC() {
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

		Cconverter userTempIn = new Cconverter(Integer.parseInt(userTemp));

		request.setAttribute("UserTempC", userTempIn);

		getServletContext().getRequestDispatcher("/resultC.jsp").forward(request, response);
	}

}
