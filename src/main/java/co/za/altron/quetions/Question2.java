package co.za.altron.quetions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.Message;
import javax.jms.MessageListener;

@MessageDriven(name = "testMDB", activationConfig = {
		@ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue"),
		@ActivationConfigProperty(propertyName = "destination", propertyValue = "queue/test") })
public class Question2 implements MessageListener {


	public void insertToJdbc(int value) {

		
		final String DB_URL = "jdbc:mysql://localhost:8889/altron";
		final String USER = "root";
		final String PASS = "root";

		Connection conn = null;
		Statement stmt = null;

		try {
			;

			conn = DriverManager.getConnection(DB_URL,USER,PASS);
			
			System.out.println("Inserting records into the table...");

			String createSQL = " CREATE TABLE IF NOT EXISTS tbl_altron(id int NOT NULL AUTO_INCREMENT PRIMARY KEY, value int NOT NULL);";
		
			stmt = conn.createStatement();
			
			stmt.executeUpdate(createSQL);
			
			System.out.println("ttt " +stmt.executeUpdate(createSQL));
			
			String sql = "INSERT INTO tbl_altron(value) VALUES ('" + value + "')";
			
			
			
			stmt.executeUpdate(sql);
			
			
			System.out.println("Inserted records into the table...");
			
	

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void onMessage(Message message) {
		for (int i = 0; i < 1000; i++) {
			try {
				insertToJdbc(i);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
