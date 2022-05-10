// Buffered IO
import java.io.*;
class Demo
{
public static void main(String[] args)throws Exception 
{
FileInputStream fin;
fin=new FileInputStream("c:\\javatrining\\files\\shin-chan.jpg");
BufferedInputStream bin;
bin=new BufferedInputStream(fin);
FileOutputStream fout;
fout=new FileOutputStream("c:\\javatrining\\files\\hqdefault.jpg");
BufferedOutputStream bout;
bout=new BufferedOutputStream(fout);
int x;
System.out.println(fin.available());
do{
x=bin.read();
if(x!=-1)
{
bout.write(x);
}
}
while(x!=-1);
bin.close();
bout.close();
System.out.println(" File Copied");
}
}
//fout=new 
//FileOutputStearm("c:\\javatrining\\files\\test2.txt");
//BufferedInputStrem bout;
//bout=new
//BufferedOutputStrem fout;
