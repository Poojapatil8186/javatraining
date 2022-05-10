class Test {
int i;
static int j;
Test(){
i=i+1;
j=j+1;
}
void show(){
System.out.println(1);
}
}
public class DemoClass3{
public static void main ( String[] args )
{
Test t1=new Test();
Test t2=new Test();
Test t3=new Test();
t1.show();
t2.show();
t3.show();
}// each object created seperate memory  i.e, why the initial value of i ia every time is 0.
}