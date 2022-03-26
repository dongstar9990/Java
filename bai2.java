package baitap1;
import java.util.*;

public class bai2 {
	public static Scanner scanner=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//khai bao a,b,c
		System.out.println("nhap vao so a :");
		float a =bai2.scanner.nextFloat();
		System.out.println("nhap vao so b :");
		float b = bai2.scanner.nextFloat();
		System.out.println("nhap vao so c :");
		float c = bai2.scanner.nextFloat();
		giaiPTB2(a,b,c);
	}
	public static void giaiPTB2(float a ,float b, float c)
	{
		if(a==0)
		{
			if(b==0) {
				System.out.print("Phương trình vô nghiệm  ");
			}
			else {
				System.out.print("phuong trinh co nghiem x= " +(-c/b));
			}
			return;
		}
		// tinh delta 
		float delta = b*b - 4*a*c;
		float x1;
		float x2;
		
		// tinh nghiem 
		if(delta<0) {
			System.out.print("phuong trinh vo nghiem :");
		}
		else if(delta==0) {
			System.out.print("phuong trinh co nghiem kep x1=x2 ="+(-b/2/a));
		}
		else {
			x1=(float)(-b+Math.sqrt(delta)/a/2);
			x2=(float)(-b-Math.sqrt(delta)/a/2);
			System.out.print("phuong trinh co nghiem x1 ="+x1 +" x2 ="+x2);
		}
	}

}
