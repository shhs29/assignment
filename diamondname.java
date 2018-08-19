import java.io.*;
import java.util.Scanner;
public class diamondname{
 public static void main(String[] args){
 int i=0;
 Scanner reader = new Scanner(System.in);
 System.out.println("Enter a number: ");
 int n = reader.nextInt();
 reader.close();
 int m=n-1;
 int m2=0;
 for(;i<n-1;i++)
 {for(int k=m-1;k>0;k--)
  {System.out.print(" ");}
  for(int j=0;j<=2*i;j++)
 {
  System.out.print("*");
 }
 System.out.println("");
 m=m-1;
 }
 System.out.println("Bill");
 for(i=n-2;i>=0;i--)
 {for(int j=0;j<=2*i;j++)
 {
  System.out.print("*");
 }
 System.out.println("");
 for(int k=0;k<=m2;k++)
  {System.out.print(" ");}
 m2=m2+1;
 }
}
}

