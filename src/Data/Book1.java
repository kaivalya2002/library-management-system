package Data;
import java.util.*;
public class Book1 {
int n;
String[] book;
int[] rollcall;
String[] bookname;
Scanner sc = new Scanner(System.in);

	public void addBook() {
		System.out.println("Enter No of books to add");
		n = sc.nextInt();
        book = new String[n];
        for(int i=0;i<n;i++)
        { 
           System.out.println("Enter Book Name ");
           book[i] = sc.next();	
        
        }
		System.out.println("Books added Successfully ! \n");
	}

	
	public void showBooks() {
	  System.out.println("Available Books :");
	  for(int i=0;i<n;i++)
      {
         System.out.println(i+1+"> "+"  -  "+book[i]);	
      }
		
	}
	

}
