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
 * Servlet implementation class StudentServlet (in this case it'll be the RegistrationForm)
 */
@WebServlet("/RegFormServlet")
public class RegFormServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	// create a RegistrationFormDAO object (not RegistrationForm object)
	private RegistrationFormDAO formDao;

	public void init() {
		formDao = new RegistrationFormDAO();
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
		String sex = request.getParameter("sex");
		String language = request.getParameter("language");
		String about = request.getParameter("about");
		
		
		// Create form instance
		RegistrationForm form = new RegistrationForm();
		form.setUserName(userName);
		form.setPassword(password);
		form.setName(fullName);
		form.setAddress(address);
		form.setCountry(country);
		form.setPostalCode(zipCode);
		form.setEmail(email);
		// convert the sex to an int
		if (sex.equals("Male"))
		{
			form.setSex(0); // using 0 for male and 1 for female to save memory
		}
		if (sex.equals("Female"))
		{
			form.setSex(1);
		}
		// convert the language to an int
		if (language.equals("english"))
		{
			form.setLanguage(0); // using 0 for English and 1 for French
		}
		if (language.equals("french"))
		{
			form.setLanguage(1);
		}
		form.setAbout(about);
		
		
		// testing stuff
		System.out.println(form.getUserName());
		System.out.println(form.getPassword());
		System.out.println(form.getName());
		System.out.println(form.getAddress());
		System.out.println(form.getCountry());
		System.out.println(form.getPostalCode());
		System.out.println(form.getEmail());
		System.out.println(form.getSex());
		System.out.println(form.getLanguage());
		System.out.println(form.getAbout());
		
		// This is the part where we use the Dao object and send the statement to MySQL server via prepared statement
		try {
			formDao.registerUser(form);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// Redirect user to desired page after hitting submit on properly filled form
		response.sendRedirect("RegistrationSuccess.jsp");
	}

}
