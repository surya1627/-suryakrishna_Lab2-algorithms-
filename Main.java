package lab2gl;

import java.util.*;


public class Main{

// function to count and print currency notes for a given amount
	public static void getCurrencyCount(int amount,int[] notes,int n )
	{
		int[] cnt = new int[n];
	
		for (int i = 0; i < n; i++) {
			if (amount >= notes[i]) {
				cnt[i] = amount / notes[i];
				amount = amount % notes[i];
			}
		}
	
		for (int i = 0; i < n; i++) {
			if (cnt[i] != 0) {
				System.out.println(notes[i] + " : "
					+ cnt[i]);
			}
		}
	}
	
	// main function
	public static void main(String argc[]){
	    Scanner sc= new Scanner(System.in);
	    System.out.println("Enter the size of currency denominations");
	    int n=sc.nextInt();
		
		
		int[] notes = new int[n];
		System.out.println("Enter the currency denominations value");
		for(int i=0;i<n;i++)
		{
		notes[i]=sc.nextInt();
		}
	    System.out.println("Enter the amount you want to pay");
	    int amount=sc.nextInt();		
		getCurrencyCount(amount,notes,n);
	}
}