package validEmail;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class main {

	static void isValidEmai(String email ,String name) {
		 boolean emailValid=true;
		String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
	      emailValid= email.matches(regex);
	      Set<String> mySet=new LinkedHashSet<>();
	      if(emailValid==true && email.contains("com")){
	         mySet.add(name);
	          System.out.println("This is the Valid Email");
	      }
	      else {
	    	  System.out.println("This is the wrong Email");
	      }
	   
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);
   System.out.println("Please Enter your name and email by Space");
   sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
   String[] firstNameEmailID = sc.nextLine().split(" ");

   String firstName = firstNameEmailID[0];

   String emailID = firstNameEmailID[1];
   isValidEmai(emailID, firstName);
   
 //  isValidEmai(emailID, firstName);
  // System.out.println(firstName);
  // System.out.println(emailID);
   
	}

}
