package controller;

import java.io.File;
import java.io.IOException;
import java.sql.*;

import javax.swing.*;


public class dbConnection {

	 Connection conn = null;
	 
	 public dbConnection() {
		 dbConnector();
	 }

	 public static Connection dbConnector() 
	 {
		 
		 try {
			 
			 String path = new File(".").getCanonicalPath();
			 String dbName = "Checkwriter.mdb";
			 
			 Connection conn=DriverManager.getConnection("jdbc:ucanaccess://"+ dbPath(path,dbName) + ";jackcessOpener=controller.CryptCodecOpener","","lkllagas");

			 return conn;
			 
		 } catch (SQLException | IOException ex) {
			 
			 JOptionPane.showMessageDialog(null, ex.toString());
			 return null;
			 
		 }

		 
	 }
	 
	 private static String dbPath(String path, String dbName) {
		 return path + "\\" + dbName;
	 }
	 
	 private static boolean isFileExists(String pathDB) {
		 
		 File f = new File(pathDB);
		 
		 if (f.exists()) {
			 return true;
		 } else {
			 return false;
		 }

	 }
	 
	 
	
	
	
}
