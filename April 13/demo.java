class Overloading
{
void add(int x,int y);
System.out.println("Int Addition"); 
System.out.println(x+y); 
}
 void add(float x,float y)
 {
{
System.out.println(" float addition is ")  ;
System.out.println(x+y);
}
}
class Demo
{
public static void main(String[] args)
{
Overloading t1=new Overloading();
t1.add(102f,2.3f,2.5f);
//Overloading t2=new Overloading();
//Test t3=new Test();
//t1.show();
//t2.show();
//t3.show();