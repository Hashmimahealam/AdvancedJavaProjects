package storeFile.myStoreFile;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.*;
import java.util.stream.Collectors;  
class StoreFile  
{
	public static void main(String[] args) throws FileNotFoundException, IOException 
	{
		System.out.println("Hello World! this is mavan project");
		try{  
Class.forName("com.mysql.cj.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/firstdb","root","root");  
              
PreparedStatement ps=con.prepareStatement(  
"insert into filetable values(?,?)");  
              
String projectPath = System.getProperty("user.dir");
//File f=new File(projectPath+"\\myfile.txt");

String fileContent = Files.lines(Paths.get(projectPath+"\\myfile.txt")).collect(Collectors.joining());
System.out.println(fileContent);

ps.setString(1, fileContent);
ps.setInt(2,102);  
ps.executeUpdate();  
//System.out.println(i+" records affected");  
              
con.close();  
              
}catch (Exception e) {e.printStackTrace();}  
 
	}
}
