package baitap1;
import java.util.*;
public class bai3 {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("import n ");
		int n = bai3.scanner.nextInt();
		giaiThua(n);
		
	}
	public static void giaiThua(int n) {
		int fatorial=1;
		for (int i=1;i<=n;i++) {
			fatorial=fatorial*i;
		}
		System.out.print("result equal = "+fatorial);
	}
}

