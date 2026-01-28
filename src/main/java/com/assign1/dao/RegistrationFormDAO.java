package com.assign1.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.assign1.model.RegistrationForm;

public class RegistrationFormDAO {

// method for inserting values to db using preparedstatement. 	
	public int registerUser(RegistrationForm regForm) throws ClassNotFoundException {

		// create SQL statement (id is auto increment so I will let MySQL handle that)
		String INSERT_USERS_SQL = " INSERT INTO registration_form" + " (user_name, password, name, address, country, postal_code, email, sex, language, about ) VALUES "
				+ "(?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
		int result = 0;
		Class.forName("com.mysql.cj.jdbc.Driver");

		try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/week6", "root",
				"02821800")) {
			// prepared statements..
			// week6 is schema/db name - change as per your db, "root" remains same , your
			// pass as per ur db
			PreparedStatement ps = connection.prepareStatement(INSERT_USERS_SQL);
			//ps.setInt(1, 5);
			ps.setString(1, regForm.getUserName()); //regForm object is passed in line 13
			ps.setString(2, regForm.getPassword());
			ps.setString(3, regForm.getName());
			ps.setString(4, regForm.getAddress());
			ps.setString(5, regForm.getCountry());
			ps.setString(6, regForm.getPostalCode());
			ps.setString(7, regForm.getEmail());
			ps.setInt(8, regForm.getSex());
			ps.setInt(9, regForm.getLanguage());
			ps.setString(10, regForm.getAbout());

			System.out.println(ps);
			result = ps.executeUpdate();
		} catch (SQLException e) {
			printSQLException(e);
			
		}
		return result;
	}

	private void printSQLException(SQLException ex) {
		for (Throwable e : ex) {
			if (e instanceof SQLException) {

				e.printStackTrace(System.err);
				System.err.println("SQLState: " + ((SQLException) e).getSQLState());
				System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
				System.err.println("Message: " + e.getMessage());
				Throwable t = ex.getCause();
				while (t != null) {
					System.out.println("Cause: " + t);
					t = t.getCause();

				}
			}

		}

	}
}
