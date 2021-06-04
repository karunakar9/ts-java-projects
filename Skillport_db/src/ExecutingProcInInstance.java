
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.sql.*;

import org.apache.ibatis.jdbc.ScriptRunner;

public class ExecutingProcInInstance {

	public static void main(String[] args) {

		String dbURL = "jdbc:sqlserver://QA-VSQL80BDSP01:1433;databaseName=vsp80bdMaster";
		String user = "sa";
		String password = "@pples2017";
		// Connection conn = DriverManager.getConnection(dbURL, user, password);

		try (Connection conn = DriverManager.getConnection(dbURL, user, password);) {

			String queryDrop = "select * from vtag where Active=1";
			PreparedStatement stmt = conn.prepareStatement(queryDrop);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getString("DbName"));
				//String dbURL1 = "jdbc:sqlserver://QA-VSQL80BDSP01:1433;databaseName=" + rs.getString("DbName");
				String dbURL1 = "jdbc:sqlserver://QA-VSQL80BDSP01:1433;databaseName="+"roc2_vsp80bd" ;
				String user1 = "sa";
				String password1 = "@pples2017";
				try (Connection conn1 = DriverManager.getConnection(dbURL1, user1, password1);) {
					String queryDrop1 = "select top 10 * from dbo.courseware_master";
					PreparedStatement stmt1 = conn1.prepareStatement(queryDrop1);
					ResultSet rs1 = stmt1.executeQuery();
					while (rs1.next()) {
						System.out.println(rs.getString(1));
					}
					/*
					 * ScriptRunner sr = new ScriptRunner(conn1); //Creating a reader object Reader
					 * reader = new BufferedReader(new FileReader("C:\\Temp\\iltproc.sql"));
					 * //Running the script sr.runScript(reader);
					 */
					/*
					 * String queryDrop1 =""; Statement statement = conn1.createStatement();
					 * statement.executeUpdate(queryDrop1); statement.close(); conn1.close();
					 */
					/*
					 * reader.close(); sr.closeConnection();
					 */
					 rs1.close();
					 stmt1.close();
				      conn1.close();
				      
				}catch (SQLException ex1) {
					ex1.printStackTrace();
				} /*
					 * catch (FileNotFoundException e) { // TODO Auto-generated catch block
					 * e.printStackTrace(); } catch (IOException e) { // TODO Auto-generated catch
					 * block e.printStackTrace(); }
					 */

			}
			/*
			 * String queryCreate = "CREATE PROCEDURE delete_book (IN bookID INT) ";
			 * queryCreate += "BEGIN "; queryCreate +=
			 * "DELETE FROM book WHERE book_id = bookID; "; queryCreate += "END";
			 * 
			 * // drops the existing procedure if exists statement.execute(queryDrop);
			 * 
			 * // then creates a new stored procedure statement.execute(queryCreate);
			 */
			rs.close();
			stmt.close();
			conn.close();
			

			System.out.println("Stored procedure created successfully!");

		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
}
