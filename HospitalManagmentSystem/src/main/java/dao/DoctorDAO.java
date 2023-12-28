package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dbUtill.Database;
import pojo.Doctor;

public class DoctorDAO {

	public static List<Doctor> viewAllDoctor() {
		List<Doctor> doctorList = new ArrayList<>();
		Connection connection = Database.getConnection();
		String query = "select * from doctor";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(query);

			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				Doctor doctor = new Doctor();
				doctor.setName(resultSet.getString("NAME"));
				doctor.setSpecialization(resultSet.getString("SPECIALIZATION"));
				doctor.setDoctorId(resultSet.getInt("ID"));
				doctorList.add(doctor);
			}
			Database.closeConnection(connection);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return doctorList;

	}

	public static void addDoctor(Doctor doctor) {
		Connection connection = Database.getConnection();
		String query="INSERT INTO doctor (NAME, SPECIALIZATION) VALUES ('"+doctor.getName()+"', '"+doctor.getSpecialization()+"')";
		try {
			PreparedStatement prepareStatement = connection.prepareStatement(query);
			int executeUpdate = prepareStatement.executeUpdate();
			if(executeUpdate>0) {
				System.out.println("Doctor added successfully");
			}
			Database.closeConnection(connection);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
