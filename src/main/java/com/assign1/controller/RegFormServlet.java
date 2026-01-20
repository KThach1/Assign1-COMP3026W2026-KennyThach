package com.assign1.controller;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import com.assign1.dao.RegistrationFormDAO;
import com.assign1.model.RegistrationForm;

/**
 * Servlet implementation class StudentServlet
 */
@WebServlet("/RegFormServlet")
public class RegFormServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

//	private RegistrationFormDAO stDao;

	public void init() {
//		stDao = new RegistrationFormDAO();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

//		String firstname = request.getParameter("firstName");
//		String lastname = request.getParameter("lastName");
//		String grade = request.getParameter("grade");

		RegistrationForm form = new RegistrationForm();
//		st.setFirstname(firstname);
//		st.setLastname(lastname);
//		st.setGrade(grade);
		

		try {
//			stDao.registerStudent(st);
		} catch (Exception e) {
			e.printStackTrace();
		}
		response.sendRedirect("index.jsp");
	}

}
