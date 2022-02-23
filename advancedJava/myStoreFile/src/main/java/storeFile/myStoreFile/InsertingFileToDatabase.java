package storeFile.myStoreFile;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class InsertingFileToDatabase {
   public static void main(String args[]) throws Exception {
      //Registering the Driver
      DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
      //Getting the connection
      String mysqlUrl = "jdbc:mysql://localhost/firstdb";
      Connection con = DriverManager.getConnection(mysqlUrl, "root", "root");
      System.out.println("Connection established......");
      
      //Inserting values
      String query = "INSERT INTO article(Name, Article) VALUES (?, ?)";
      PreparedStatement pstmt = con.prepareStatement(query);
      pstmt.setString(1, "article1");
      FileReader reader = new FileReader("E:\\data\\article1.txt");
      pstmt.setCharacterStream(2, reader);
      pstmt.execute();
      pstmt.setString(1, "article2");
      reader = new FileReader("E:\\data\\article2.txt");
      pstmt.setCharacterStream(2, reader);
      pstmt.execute();
      pstmt.setString(1, "article3");
      reader = new FileReader("E:\\data\\article3.txt");
      pstmt.setCharacterStream(2, reader);
      pstmt.execute();
      System.out.println("Data inserted......");
   }
}
