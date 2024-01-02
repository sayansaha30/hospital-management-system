package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dbUtill.Database;
import pojo.Appointment;

public class AppointmentDAO {
	public static List<Appointment> viewAllAppointment() {
		List<Appointment> appointmentList = new ArrayList<>();
		Connection connection = Database.getConnection();
		String query = "select * from Appointment";
		System.out.println("Executing " + query);
		try {
			// Create a PreparedStatement with the SQL query
			PreparedStatement preparedStatement = connection.prepareStatement(query);

			// Execute the query and get the result set
			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {

				Appointment appointment = new Appointment();
				appointment.setDate(resultSet.getString("date"));
				appointment.setDoctorName(resultSet.getString("doctor_name"));
				appointment.setPatientName(resultSet.getString("patient_name"));
				appointment.setAppointmentId(resultSet.getInt("id"));
				appointmentList.add(appointment);
				

			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		Database.closeConnection(connection);
		return appointmentList;
	}
	
	public static int bookAppointment(Appointment appointment) {
		Connection connection = Database.getConnection();
		String query="INSERT INTO appointment (DOCTOR_NAME, PATIENT_NAME, DATE) VALUES ('"+ appointment.getDoctorName()+"', '"+ appointment.getPatientName()+"', '"+ appointment.getDate()+"')";
		try {
			System.out.println("Executing "+query);
			PreparedStatement prepareStatement = connection.prepareStatement(query);
			int executeUpdate = prepareStatement.executeUpdate(query);
			Database.closeConnection(connection);
			if(executeUpdate>0) {
				System.out.println("appointment added successfully");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return 1;
	}
}
