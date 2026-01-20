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

		// Name attribute on the form has to match the getParameter
		// create variables to hold the form data from user to then set as the form object variables
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		String fullName = request.getParameter("fullName");
		String address = request.getParameter("address");
		String country = request.getParameter("country");
		String zipCode = request.getParameter("zipCode");
		String email = request.getParameter("email");
		
		
		// Create
		RegistrationForm form = new RegistrationForm();
		form.setUserName(userName);
		form.setPassword(password);
		form.setName(fullName);
		form.setAddress(address);
		form.setCountry(country);
		form.setPostalCode(zipCode);
		form.setEmail(email);
		
		// testing stuff
		System.out.println(form.getUserName());
		System.out.println(form.getPassword());
		System.out.println(form.getName());
		System.out.println(form.getAddress());
		System.out.println(form.getCountry());
		System.out.println(form.getPostalCode());
		System.out.println(form.getEmail());
//		System.out.println(form.getPostalCode());
		

//		try {
////			stDao.registerStudent(st);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		// Redirect user to desired page after hitting submit on properly filled form
		response.sendRedirect("index.jsp");
	}

}
