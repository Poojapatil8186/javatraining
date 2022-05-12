/* Question no 01: Print all Amstrong numbers between 100 to 999 using while loop.*/

class Armstrong
{
public static void main(String[] args)
{
int fnum=100,res,rem,temp,temp2,i=0;
while(fnum<=999)
{
temp=fnum;
res=0;
i=i+1;
while(temp !=0)
{
rem=temp % 10;
int temp2=temp2+rem*rem*rem;
temp=temp/10;
i=i+1;
}
if(i== int temp2)
{
if(res==0)
{
//System.out.println("Armstrong number between 100 to 999 is:"+res);
//}
System.out.print(i+" ");
res++;
}
}
}
}
}

