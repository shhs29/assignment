import java.io.*;
import java.util.Scanner;
public class isoscelestriangle{
 public static void main(String[] args){
 int i=0;
 Scanner reader = new Scanner(System.in);
 System.out.println("Enter a number: ");
 int n = reader.nextInt();
 reader.close();
 int m=n-1;
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
}
}

