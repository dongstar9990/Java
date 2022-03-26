package baitap1;
import java.util.*;
public class bai10 {
	private static Scanner scanner= new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("nhap so phan tu cua mang :");
		int n =scanner.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			System.out.print("a["+(i+1)+"]");
			arr[i]=scanner.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			System.out.print("\ta["+(i+1)+"] = "+arr[i]);
		}
		int temp=arr[0];
		for(int i=0;i<n-1;i++) {
			for (int j=i+1;j<=n-1;j++) {
				if(arr[i]<arr[j]) {
				temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
				}
			}
		}
		System.out.println("mang sau khi nhap : ");
		for(int i=0;i<n;i++) {
			System.out.print("\t "+ arr[i]);
		}
		for(int i=0;i<n;i++) {
			if(isPrime(arr[i])){
				System.out.print(arr[i]+"la so nguyen to ");
			}
			else {
				System.out.print(arr[i]+"Khong la so nguyen to ");
			}
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
