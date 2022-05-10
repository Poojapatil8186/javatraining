/*Create classes that capture bank customers and bank accounts.
 A customer has a first and last name. 
 An account has a customer and a balance.
  Make objects for two accounts held by the same customer.*/
class Acc 
{
//attributes
int id;
String name;
int balance;
Account()                                                                                                                                                                    
{
id=181900029;
name="Aarti Wetal";
balance=5000;
System.out.println("Constructor without arrgument called");
}
void show()
{
System.out.println("Id of Account Holder=" +id);
System.out.println("Name of Account Holder=" +name);
System.out.println("Balance of Account Holder=" +balance);
}
}
Account2(int id1,String name1,int balance1)
{
id= id1;
name=name1;
balance=balance1;
System.out.println("Constructor with arrgument called");
}
class Democonstructor
{
public static void main(String[]args)
{
Account ob1=new Account();
ob1.show();
}
}
}