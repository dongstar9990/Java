package baitap1;
import java.util.*;
public class bai7 {
	public static Scanner scanner = new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr;
		System.out.print("Nhap so phan tu cua mang ");
		int n= bai7.scanner.nextInt();
		arr= new int[n];
		
		for (int i=0;i<n;i++) {
			System.out.println("nhap gia tri phan tu cua mang ");
			arr[i]=scanner.nextInt();
		}	
		for (int i=0;i<n;i++) {
			System.out.println("A["+(i+1)+"] = "+arr[i]);
		}
		
		System.out.print("nhap gia tri ban can tim kiem");
		int search =bai7.scanner.nextInt();
		for(int i=0;i<n;i++) {
			if(search==arr[i]) {
				System.out.println(" co trong mang nam o vi tri "+(i+1));
			}
		}
	}
	

}
