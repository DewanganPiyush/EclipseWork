package Exception;
import java.io.*;
import java.sql.*;

public class ThrowsExample {
	
	public static void performTask() throws IOException, SQLException {
		
        
        if (Math.random() > 0.5) {
            throw new IOException("IO issue");
        } else {
            throw new SQLException("SQL issue");
        }
    }
	
	public static void main(String[] args) {
		
		try {
            performTask();
        } catch (IOException | SQLException e) {
            System.out.println("exception " + e.getMessage());
        }

	}

}
