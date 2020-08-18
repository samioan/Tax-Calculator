//’σκηση 4
//Υπολογισμός φόρου με βάση το εισόδημα
//Μέθοδοι κύριας κλάσης
//Assignment4Methods.java

import java.util.Scanner;

public class Assignment4Methods{
   
   Scanner input = new Scanner(System.in);
   
   //Μεταβλητές
   private double income; //εισόδημα
   private double tax; //φόρος
   
   //Αρχικοποίηση μεταβλητών
   public Assignment4Methods(){
   
      income = 0;   
      tax = 0;
      
   }//τέλος constructor
   
   //Υπολογισμός φόρου με βάση το εισόδημα
   public void findTax(){
   
      while(income !=-1){
      
         System.out.print("Please enter your income or -1 to terminate the program: ");
      
         income = input.nextDouble();
      
         if(income < 5000 && income >=0){
      
            tax = 0;
            System.out.println("Your tax is: " +tax);
            System.out.println("");   
      
         } else if (income >=5000 && income <=10000){
      
            tax = income * 0.05;
            System.out.println("Your tax is: " +tax);
            System.out.println("");
      
         } else if (income > 10000 && income <=30000){
      
            tax = income * 0.15;
            System.out.println("Your tax is: " +tax);
            System.out.println("");
      
         } else if (income > 30000){
      
            tax = income * 0.35;
            System.out.println("Your tax is: " +tax);
            System.out.println("");
      
         } else if (income < 0 && income !=-1){
      
            System.out.println("You have entered an invalid value. Try again.");
            System.out.println("");
      
         }//τέλος if
                    
      }//τέλος while
   
   }//τέλος μεθόδου findTax
      
}//τέλος κλάσης Assignment4Methods