package baitap1;

import java.util.Scanner;

public class bai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s= new Scanner(System.in);
	        System.out.println("enter the number");
	        int n =s.nextInt();
	        if(isPrime(n)){
	            System.out.print(n+" is not  prime number");
	        }
	        else
	        {   
	            System.out.print(n+" is prime number");
	        }
	}
	public static boolean isPrime(int n)
    {
        if(n<=1){
            return false;
        }
        for (int i=2;i<=Math.sqrt(n);i++)
        {   
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

}


