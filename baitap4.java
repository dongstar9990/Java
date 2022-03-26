package baitap1;
import java.util.*;
public class baitap4 {
	private static Scanner scanner=new Scanner(System.in);
		public static void main(String[] args) {
		    //sử dụng class Scanner để lấy dữ liệu từ bàn phím
		    Scanner sc = new Scanner(System.in);
		    //khai báo n1, n2 là hai số cần tính bội chung nhỏ nhất
		    //lcm là BCNN của a và b, gcd là UCLN của a và b
		    int n1, n2, gcd = 1, lcm;
		    System.out.println("\n\nnhap vao so thu nhat ");
		    n1 = sc.nextInt();
		    System.out.println("nhap vao so thu 2: ");
		    n2 = sc.nextInt();
		    //sử dụng vòng lặp For để tính UCLN
		    for(int i = 1; i <= n1 && i <= n2; i++)
		    {
		      if(n1%i==0 && n2%i==0)
		        gcd = i;
		    }
		    //BCNN = (số thứ nhất * số thứ 2) / UCLN
		    lcm = (n1 * n2) / gcd;
		    System.out.printf("\t boi chung nho nhat cua %d and %d is: %d", n1, n2, lcm);
		 
		    System.out.println("\n------------------------------------");
		  }
}
