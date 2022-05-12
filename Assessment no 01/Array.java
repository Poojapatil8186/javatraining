/* write a program that take 5 number into array and print square value of each number*/
class Array
{
public static void main(String[] args)
{
int []arr={2,4,6,8,10};
for(int value : arr)
{
System.out.println(value);
}
for(int i=1;i<=arr.length;i=i+1) 
{
System.out.println(arr[i]);
arr[i]=(int) Math.pow(arr[i],2);
}
for(int value : arr)
{
System.out.println(value);
}
}
}
