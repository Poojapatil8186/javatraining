class sum
{
public static void main ( String[] args )
{
int sum=0,i;
int[] arr = {0, 1, 2, 3};
for( i = 0; i < arr.length; i=i+1)
{
sum += arr[i];
}
System.out.println(sum);
}
}