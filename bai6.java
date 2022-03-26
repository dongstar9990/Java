package baitap1;
import java.util.*;
public class bai6 {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("do you want check number ?  ");
		int a=bai6.scanner.nextInt();
		Check(a);
	}
	public static void Check(int n){
		if(n<2) {
			System.out.print("day khong la so nguyen to :");
		}
		int squareRoot=(int)Math.sqrt(n);
		for ( int i=2;i<squareRoot;i++) {
			if(n%i==0) {
				System.out.print("day khong la so nguyen to");
				break;
			}
			else if(n%i!=0) {
				System.out.print("day la so nguyen to ");
			}
		}
		
	}

}
