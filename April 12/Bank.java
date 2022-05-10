/*Create classes that capture bank customers and bank accounts. 
A customer has a first and last name. An account has a customer and a balance.
 Make objects for two accounts held by the same customer.*/

import java.util.*;

class BankCustomer {
  String firstName;
  String lastName;
  Scanner sc=new Scanner(System.in);
  
  BankCustomer (String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
    
  }
  void disp(){
  System.out.println("enter first name of account holder:"+firstName);
  firstName=sc.next();
  System.out.println("enter last name of account holder:"+ lastName);
  lastName=sc.next();
}
}

class BankAccount {
  BankCustomer forCust;
  double balance;
  
  BankAccount (BankCustomer forCust, double balance) {
    this.forCust = forCust;
    this.balance = balance;
    }
    void disp1(){
      Scanner sc1=new Scanner(System.in);
    
    System.out.println("enter total balnce of account holder:");
    balance=sc1.nextDouble();
    
  }
}

 class Bank{
public static void main(String[] args)
{
BankCustomer cust1= new BankCustomer();
cust1.disp();
BankAccount acc1=new BankAccount();
acc1.disp1();
}
}