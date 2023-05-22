package Manage;
import java.util.*;

import Data.Book1;
import Data.Book2;
import Data.SRecords;

public class Admin  {
	
Welcome w = new Welcome();
SRecords sr = new SRecords();
Book1 b = new Book1();
Book2 bb = new Book2();
public void admin() {
	
	System.out.println("\n***Admin Page***");
	System.out.println("\n1.Student Records \n2.Book Records\n3.Manage Books\n4.Exit");
	System.out.println("Enter your choice :");
	int ch =sc.nextInt();
	
	switch(ch)
	{
	case 1:
		student();
	    break;
	case 2 :
		booksRecords();
		break;
	case 3: 
	    manageBooks();
		break;
	case 4:
		Welcome.menu();
		break;
	default :
		System.out.println("Enter valid Input");	
		admin();
	}
	
}


	Scanner sc = new Scanner(System.in);
	public void student() {
		System.out.println("\n**Student Page**");
		System.out.println("\n1.Add Students \n2.Display all Students \n3.Exit");
		System.out.println("Enter your choice :");
		int chx = sc.nextInt();
		
		switch(chx)
		{
			case 1:
				sr.add();
				student();
				break;
			case 2 :
				sr.show();
				admin();
				break;
			case 3:
			    admin();
			    break;
			default :
				System.out.println("Enter valid Input");  
				student();
		}      
	}

	public void booksRecords() {
	 System.out.println("\n**Books Page**");
	 System.out.println("\n1.Add Books \n2.Display All Books \n3.Exit");
	 System.out.println("Enter your choice :");
		int chy = sc.nextInt();
		switch(chy)
		{
			case 1:
				b.addBook();
				booksRecords();
				break;
			case 2 :
				b.showBooks();
				booksRecords();
				break;
			case 3:
			    admin();
			    break;
			default :
				System.out.println("Enter valid Input");
				booksRecords();
		}    
		
		
	}

	public void manageBooks() {
		 System.out.println("\n**Manage Book Page**");
		 System.out.println("\n1.AddBooks \n2.Display available books \n3.Issue book  \n4.Return Book \n5.Exit");
		 System.out.println("Enter your choice :");
			int chx = sc.nextInt();
			switch(chx)
			{
			   case 1 :
				    bb.addBook();
					manageBooks();
					break;
	     		case 2:
	     			 bb.displayBooks();
           		     manageBooks();
					break;
				case 3 :
					bb.issueBook();
				    manageBooks();
					break;
				case 4:
					bb.returnBook();
					manageBooks();
					break;
				case 5:
				    admin();
				    break;
				default :
					System.out.println("Enter valid Input");
					manageBooks();
			}    
		
		
	}

}
