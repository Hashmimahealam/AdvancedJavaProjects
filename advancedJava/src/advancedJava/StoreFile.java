import java.io.*;  
import java.sql.*; 
class StoreFile  
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		try{  
Class.forName("com.mysql.cj.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/filetable","root","root");  
              
PreparedStatement ps=con.prepareStatement(  
"insert into filetable values(?,?)");  
              
File f=new File("d:\\myfile.txt");  
FileReader fr=new FileReader(f);  
              
ps.setInt(1,101);  
ps.setCharacterStream(2,fr,(int)f.length());  
int i=ps.executeUpdate();  
System.out.println(i+" records affected");  
              
con.close();  
              
}catch (Exception e) {e.printStackTrace();}  
 
	}
}
