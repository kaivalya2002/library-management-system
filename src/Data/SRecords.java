package Data;
import java.util.*;

public class SRecords {
	String name[];
	 int roll[];
	 int n; 
Scanner sc = new Scanner(System.in);
//protected Books1 b = new Books1();
	public void add() {
		System.out.println("Enter size");
		 n =sc.nextInt();
		 name = new String[n];
		 roll = new int[n]; 
	
	for(int i=0;i<n;i++)
	 {
	   System.out.println("Enter name");
	   name[i] = sc.next();
	   System.out.println("Enter Roll No");
	   roll[i] = sc.nextInt();
	   
	 }
	System.out.println("Data Entered Successfully !");
  }

	public void show() {
		
	 System.out.println("Data of students :");
	
	
	 for(int i=0;i<n;i++)
	 {
		 System.out.println(i+1+"> "+name[i]+"  - "+roll[i]);
		 
	 }
	 
	}

}
