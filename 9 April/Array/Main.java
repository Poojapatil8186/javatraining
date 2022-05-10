
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    int i,j;
        Scanner input = new Scanner(System.in);

        System.out.print("Input number of rows of matrix: ");
        int rows = input.nextInt();
        System.out.print("Input number of columns of matrix: ");
        int columns = input.nextInt();

        int[][] arr= new int[3][3];
        int[][] arr1= new int[3][3];
          int[][]sum=new int[3][3];   
for(i=0;i<3;i=i+1) //ROW INDEX
{
for(j=0;j<3;j=j+1)//COL INDEX
{
sum[i][j]=arr[i][j]+ arr1[i][j];
System.out.print(sum[i][j]+" ");
}
System.out.println();
}
}
}

