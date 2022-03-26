package baitap1;

import java.util.Scanner;

public class bai8 {
	private static Scanner scanner= new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("nhap so phan tu cua mang : ");
		int n=scanner.nextInt();
		int[] arr= new int[n];
		
		for(int i=0;i<n;i++) {
			System.out.println("A["+(i+1)+"] = ");
			arr[i]=scanner.nextInt();
			
		}
		System.out.println("mang vua nhap la");
		for(int i=0;i<n;i++){
			System.out.print("A["+(i+1)+"]"+" = "+arr[i]);
		}
		int temp=arr[0];
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<=n-1;j++) {
				if(arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Mang sau khi sap xep ");
		for(int i=0 ;i<n;i++) {
			System.out.print(" \t " +arr[i]);
		}
	}

}
