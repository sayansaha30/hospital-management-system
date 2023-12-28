package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dbUtill.Database;
import pojo.Patient;

public class PatientDAO {
	public static List<Patient> viewAllPatient() {
		List<Patient> patientList = new ArrayList<>();
		Connection connection = Database.getConnection();
		String query = "select * from patient";
		System.out.println("Executing " + query);
		try {
			// Create a PreparedStatement with the SQL query
			PreparedStatement preparedStatement = connection.prepareStatement(query);

			// Execute the query and get the result set
			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {

				Patient patient = new Patient();
				// Retrieve data from the result set
				patient.setAge(resultSet.getInt("AGE"));
				patient.setName(resultSet.getString("NAME"));
				patient.setSex(resultSet.getString("SEX"));
				patient.setPatientId(resultSet.getInt("ID"));
				System.out.println(patient.getPatientId()+ " " +patient.getAge());
				patientList.add(patient);

			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		Database.closeConnection(connection);
		return patientList;
	}
	
	public static int addPatient(Patient patient) {
		Connection connection = Database.getConnection();
		String query="INSERT INTO patient (NAME, AGE, SEX) VALUES ('"+patient.getName()+"', '"+patient.getAge()+"', '"+patient.getSex()+"')";
		try {
			System.out.println("Executing "+query);
			PreparedStatement prepareStatement = connection.prepareStatement(query);
			int executeUpdate = prepareStatement.executeUpdate(query);
			Database.closeConnection(connection);
			if(executeUpdate>0) {
				System.out.println("Patient added successfully");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return 1;
	}
}
