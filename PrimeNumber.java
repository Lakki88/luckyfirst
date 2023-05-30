package com.lucky.logic;
import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		//System.out.println("Enter Any Number ");
		//int n =scan.nextInt();
		 
		/*int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) 
				count++;	
		}
		if(count==2) 
			System.out.println("It Is Prime Number");
		else 
			System.out.println("Not A Prime Number");	*/
		//Find Prime Number From 1 To nth Number
				
		/*for (int i=1;i<=n;i++) {// i will run till n
			int count=0;
			for (int j= 1; j<=i;j++) { //here we check first digit is prime or not 
				if(i%j==0) {
					count++;}				
			}
			if(count==2) {
				System.out.println(i+" It Is A Prime Number ");
			}	
			}*/
		
		/*int[] arr= {1,2,3,4,5,6,7,8,9};
		int count;
		int i;
		System.out.println(arr.length);
		for (i=1;i<=arr.length-1;i++) {
			count=0;
			for(int j=1;j<=arr[i];j++) {
				if(arr[i]%j==0)
					count++;
			}
			if(count==2)
				System.out.println(arr[i]+" It Is Prime");
			else 
				System.out.println(arr[i]+" It Is Not Prime ");	
		}*/
		//Program For Length Of Araay Is Prime Or Not
		int[] arr= {1,2,3,4,5,6,7,8,9};
		System.out.println(arr.length);
		int i;int count=0;
		for(i=1;i<=arr.length;i++) {
			if(arr.length%i==0) {
				count++;
			}
		}
		if(count==2) 
			System.out.println(arr.length+" It Is Prime Number");
		else
			System.out.println("It Is Not Prime");
		
		
	}		
	}

