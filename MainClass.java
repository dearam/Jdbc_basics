import java.util.*;
import java.sql.*;
public class MainClass {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/dearam";
		String name="root";
		String password="dearam8114";
		
		try {
			Connection con=DriverManager.getConnection(url,name,password);
			Statement st=con.createStatement();
//			String create="create table bey"+"(id int,"+"name varchar(20))";
//			st.executeUpdate(create);
//			System.out.println("created");
//			PreparedStatement ps=con.prepareStatement("insert into bae values(?,?,?)");
//			ps.setInt(1,1);
//			ps.setString(2,"dearam");
//			ps.setInt(3, 20);
//			int c=ps.executeUpdate();
			System.out.println("added");
//			int dlt=st.executeUpdate("delete from bey where id=2");
//			System.out.println("deleted");
			//int result=st.executeUpdate("update hello set name='elon musk' where id=5");
			ResultSet rs=st.executeQuery("select * from bae order by age asc");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	}
