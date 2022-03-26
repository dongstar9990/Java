package baitap1;
import java.util.Scanner;
public class bai5 {
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("nhap so thu 1:");
		int a =bai5.scanner.nextInt();
		System.out.print("Nhap so thu 2 :");
		int b=bai5.scanner.nextInt();
		UCLN(a,b);
	}
	public static void UCLN(int a ,int b) {
		int ucln=1;
		for(int i=1 ;i<=a	&&	i<=b;i++) {
			if(a%i==0&&b%i==0) {
				ucln=i;
			}
			
		}
		System.out.print("uoc chung lon nhat la  :"+ucln);
		
	}

}
