package Manage;
import java.util.*;

public class Manage extends Welcome {

public static String id;
public static String pass;
Scanner sc = new Scanner(System.in);	

Admin a = new Admin();
public void signup()
{
  	
System.out.println("Enter Name");
String n = sc.next();
System.out.println("Enter UId");
 id = sc.next();
System.out.println("Enter password");
pass = sc.next();

System.out.println("Sign Up Successfully\n");
menu();
}



public void login(String id , String pass) {

System.out.println("\n**Login Page**\n");	
System.out.println("Enter Id");
String nid = sc.next();

System.out.println("Enter password");
String passid = sc.next();

if(id.equals(nid) && pass.equals(passid))
{
  System.out.println("Logged in Succeddfully !\n");
  a.admin();
  
}
else
  {	
	System.out.println("Incorrect id or pass \n Enter valid credentials ");
    menu();
  }
}


	
}
