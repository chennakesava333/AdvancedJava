package com.pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class JdbcPro3 {
	Scanner sc = new Scanner(System.in);
	String driver = "oracle.jdbc.OracleDriver";
 Connection connect(){
	 Connection con=null;
	 try {
	 Class.forName(driver);
	 con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","kesava");
	 System.out.println("Database Connected SUccessfully");
	 }
	 catch(Exception e) {
		 e.printStackTrace();
	 }
	 return con;
 }
 void operations() {
	 Connection con=connect();
	 try {
		  PreparedStatement pstm1=con.prepareStatement("insert into patient values(?,?,?,?)");
		  PreparedStatement pstm2=con.prepareStatement("select * from patient");
		  PreparedStatement pstm3=con.prepareStatement("select * from patient where pid=?");
		  PreparedStatement pstm4=con.prepareStatement("update patient set pname=? where pid=?");
		  PreparedStatement pstm5=con.prepareStatement("update patient set age=? where pid=?");
		  PreparedStatement pstm6=con.prepareStatement("update patient set pcontact=? where pid=?");
		  PreparedStatement pstm7=con.prepareStatement("delete from patient where pid=? ");
		while(true) {
			System.out.println("==========welcome data=========");
			System.out.println("1.Add Patient Data \n2.View Patient Data\n3.Retrive Patient Data\n4.Update Patient Data\n5.Delete Patient Data\n6.Exit");
			System.out.println("enter your choice");
			int choice =Integer.parseInt(sc.nextLine());
			switch(choice) {
			case 1:
				System.out.println("===Adding patient details:===");
				System.out.println("enter pid");
				String pid=sc.nextLine();
				System.out.println("enter patient Name:");
				String pname=sc.nextLine();
				System.out.println("enter patient age:");
				int age=Integer.parseInt(sc.nextLine());
				System.out.println("enter patient contact number:");
				long pcontact=Long.parseLong(sc.nextLine());
				
				pstm1.setString(1, pid);
				pstm1.setString(2,pname);
				pstm1.setInt(3, age);
				pstm1.setLong(4, pcontact);
				 
				int rs=pstm1.executeUpdate();
				if(rs>0)
					System.out.println("data inserted.");
				else
					System.out.println("data not inserted");
				break;
			case 2:
				System.out.println("====view patient details====");
				ResultSet rs1=pstm2.executeQuery();
				while(rs1.next()) {
					System.out.println(rs1.getString(1)+" "+rs1.getString(2)+" "+rs1.getInt(3)+" "+rs1.getLong(4));
				}
				System.out.println("data viewed");
				break;
			case 3:
				System.out.println("===retrive specific patient details===");
				System.out.println("enter pid:");
				String pid1=sc.nextLine();
				pstm3.setString(1, pid1);
				ResultSet rs2=pstm3.executeQuery();
				if(rs2.next())
					System.out.println(rs2.getString(1)+" "+rs2.getString(2)+" "+rs2.getInt(3)+" "+rs2.getLong(4));
				else
					System.out.println("there is no available record: "+pid1);
				break;
			case 4:
				System.out.println("===update patient details===");
				System.out.println("1.change name\n2.change age\n3.change contact number\n4.exit");
				System.out.println("enter your choice");
				int choice1=Integer.parseInt(sc.nextLine());
				switch(choice1) {
				case 1:
					System.out.println("===change name===");
					System.out.println("enter patient updated name:");
					String pname1=sc.nextLine();
					System.out.println("enter pid:");
					String pid2=sc.nextLine();
					pstm4.setString(1,pname1);
					pstm4.setString(2, pid2);
					int rs3=pstm4.executeUpdate();
					if(rs3>0)
						System.out.println("update the patient name successfully:");
					else
						System.out.println("not update");
					break;
				case 2:
					System.out.println("===change age===");
					System.out.println("enter patient updated age");
					int age1=Integer.parseInt(sc.nextLine());
					System.out.println("enter pid:");
					String pid3=sc.nextLine();
					pstm5.setInt(1,age1);
					pstm5.setString(2, pid3);
					int rs4=pstm5.executeUpdate();
					if(rs4>0)
						System.out.println("update the patient age successfully:");
					else
						System.out.println("NOT update");
					break;
				case 3:
					System.out.println("===change contact number===");
					System.out.println("enter patient updated contact number");
					long pcontact1=Long.parseLong(sc.nextLine());
					System.out.println("enter pid:");
					String pid4=sc.nextLine();
					pstm6.setLong(1,pcontact1);
					pstm6.setString(2, pid4);
					int rs5=pstm5.executeUpdate();
					if(rs5>0)
						System.out.println("update the patient contact number successfully:");
					else
						System.out.println("NOT update");
					break;
				case 4:
					System.out.println("===visit again ! :)===");
					System.exit(0);
					break;
					default:
						System.out.println("invalid input:");
				}
				break;
			case 5:
				System.out.println("===delete the patient details===");
				System.out.println("enter pid");
				String pid5=sc.nextLine();
				pstm7.setString(1, pid5);
				int rs6=pstm7.executeUpdate();
				if(rs6>0)
					System.out.println(rs6+" row deleted");
				else
					System.out.println("Data NOT deleted");
				break;
			case 6:
				System.out.println("====visit again ! :)===");
				System.exit(0);
				break;
				default:
					System.out.println("invalid input check again...!");
			}
		}
	 }
	 catch(Exception e) {
		 e.printStackTrace();
	 }
 }
 public static void main(String[] args) {
	JdbcPro3 obj= new JdbcPro3();
	obj.operations();
}
}
