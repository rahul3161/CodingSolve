package lfh;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ToSort {

	
	public static void main (String[]args)throws IOException
	{   int n1,n2;
	ToSort ob=new ToSort();
	Scanner sc=new Scanner(System.in);
	
	  
	 ArrayList<Integer> ar1=new ArrayList<Integer>();
	 ArrayList<Integer> ar2=new ArrayList<Integer>();
	 
	 while (sc.hasNextInt())
     {
        int input = sc.nextInt();
        ar1.add(input);
     }
	 while (sc.hasNextInt())
     {
        int input = sc.nextInt();
        ar2.add(input);
     }
	 ar1.addAll(ar2);
	 Collections.sort(ar1);
	 System.out.println(ar1);
		

}
}