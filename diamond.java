import java.io.*;
import java.util.Scanner;
public class diamond{
 public static void main(String[] args){
 int i=0;
 Scanner reader = new Scanner(System.in);
 System.out.println("Enter a number: ");
 int n = reader.nextInt();
 reader.close();
 int m=n-1;
 int m2=1;
 for(;i<n;i++)
 {for(int k=m;k>0;k--)
  {System.out.print(" ");}
  for(int j=0;j<=2*i;j++)
 {
  System.out.print("*");
 }
 System.out.println("");
 m=m-1;
 }
 System.out.print(" ");
 for(i=n-2;i>=0;i--)
 {for(int j=0;j<=2*i;j++)
 {
  System.out.print("*");
 }
 System.out.println("");
 for(int r=0;r<=m2;r++)
  {System.out.print(" ");}
 m2=m2+1;
 }
 
}
}

