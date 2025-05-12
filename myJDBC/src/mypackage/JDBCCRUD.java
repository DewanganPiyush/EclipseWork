package mypackage;
import java.sql.*;

public class JDBCCRUD {

	public static void main(String[] args) {
		
		try {
            //Load driver(Not need)
            //class.forName("com.mysql.cj.jdbc.Driver");

            //Create connection
            String url = "jdbc:mysql://localhost:3306/mydb";
            String user = "root";
            String password = "piyush";
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to DB");

            //INSERT (Create)
//            String insertQuery = "INSERT INTO student (id, name) VALUES (?, ?)";
//            PreparedStatement insertStmt = con.prepareStatement(insertQuery);
//            insertStmt.setInt(1, 102);
//            insertStmt.setString(2, "Rahul");
//            insertStmt.executeUpdate();
//            System.out.println("Inserted");

            //SELECT (Read)
//            String selectQuery = "SELECT * FROM student";
//            Statement selectStmt = con.createStatement();
//            ResultSet rs = selectStmt.executeQuery(selectQuery);
//            System.out.println("Student Table:");
//            while (rs.next()) {
//                System.out.println(rs.getInt("id") + " - " + rs.getString("name"));
//            }

            //UPDATE
            String updateQuery = "UPDATE student SET name=? WHERE id=?";
            PreparedStatement updateStmt = con.prepareStatement(updateQuery);
            updateStmt.setString(1, "Rana");
            updateStmt.setInt(2, 102);
            
            updateStmt.executeUpdate();
            System.out.println("Updated");

            //DELETE
//            String deleteQuery = "DELETE FROM student WHERE id=?";
//            PreparedStatement deleteStmt = con.prepareStatement(deleteQuery);
//            deleteStmt.setInt(1, 102);
//            deleteStmt.executeUpdate();
//            System.out.println("Deleted");

            //Close connection
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
		

	}

}
