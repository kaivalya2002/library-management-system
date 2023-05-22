package Manage;
import java.util.*;

public class Welcome
{
  
protected static void menu()
{
	Scanner sc = new Scanner(System.in);
	Manage a = new Manage();
	System.out.println("********** Welcomee to the Library Management **********\n");
	System.out.println("1.Sign Up \n2.Login \n3.Exit");
	System.out.println("Enter your choice :");
	int n = sc.nextInt();
	switch(n)
	{
	case 1 :
	  	a.signup();
	  	break;
	case 2 :
		a.login(Manage.id,Manage.pass);
		break;
	case 3 : 
		System.out.println("Thank you for visiting our management ");
		break;
	default :
		System.out.println("Enter valid Input");
		menu();
	}
	
}
 	
}



