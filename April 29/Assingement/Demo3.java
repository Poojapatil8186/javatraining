//Create an ArrayList which will be able to store only numbers like int,float,double,etc, but not any other data type.
import java.util.*;
class Demo3
{
int n = 4;
class AccData {
int AccNumber;
float Balance;
long phone;
AccData(int AccNumber, float Balance, long phone)
{
this.AccNumber = AccNumber;
this.Balance = Balance;
this.phone = phone;
}
}
public static void main(String args[])
{
int AccNumber[] = { 1542, 26546, 3665, 44565 };
float  Balance[] = {100.54f, 9458f, 9354f, 9454f};
long phone[] = { 8762357381L, 8762357382L,8762357383L, 8762357384L };
Demo3 custom = new Demo3();
custom.addValues(AccNumber,Balance, phone);
}
void addValues(int AccNumber[],float Balance[], long phone[])
{
ArrayList<AccData> list = new ArrayList<>();
for (int i = 0; i < n; i++) {
list.add(new AccData(AccNumber[i],Balance[i],phone[i]));
}
printValues(list);
}
public void printValues(ArrayList<AccData> list)
{
for (int i = 0; i < n; i++) 
{
AccData data = list.get(i);
System.out.println(data.AccNumber +" "+ data.Balance + " "+ data.phone+"\n");
}
}
}
