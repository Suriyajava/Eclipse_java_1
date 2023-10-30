//package java_tamil_programming;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import com.mysql.jdbc.ResultSet;
//import com.mysql.jdbc.Statement;
//
//public class Mysql {
//	public static void main(String[] args) {
//		try {
//			Class.forName("com.mysql.jdbc.Driver");
//			Connection con= DriverManager.getConnetion(
//					"jdbc:mysql://localhost:3306/tamil?characterEncoding=latinl","root","admin");
//			Statement stmt=con.createStatement();
//			ResultSet rs=stmt.executQuery("select * from tamil");
//			
//			while(rs.next())
//				System.out.println(rs.getint(1)+" "+rs.getString(2)+" "+rs.getString(3)+" ");
//		con.close();
//		}catch (Exception e) {
//			System.out.println(e);
//		} 
//	}
//
//}
