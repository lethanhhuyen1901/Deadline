package Bai1;

import java.util.Scanner;

public class BaiTap1 {
	public static void main(String[] args) {
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao so a: ");
		a = sc.nextInt();
		System.out.println("Nhap vao so b: ");
		b = sc.nextInt();
		
		//Cau a
		int Tong = a + b;
		System.out.println(a+ " + "+b+" = "+Tong);
		int Hieu = a - b;
		System.out.println(a+ " - "+b+" = "+Hieu);
		int Tich = a * b;
		System.out.println(a+ " * "+b+" = "+Tich);
		float Thuong = (float) a/b;
		System.out.println(a+ " / "+b+" = "+Thuong);
		int Chialaydu = a % b;
		System.out.println(a+ " % "+b+" = "+Chialaydu);
		
		//Cau b
		System.out.println(a+ " Bang "+b+ " : " +(a==b));
		System.out.println(a+" Khac "+b+" : "+(a!=b));
		System.out.println(a+" Nho hon "+b+" : "+(a<b));
		System.out.println(a+" Lon hon "+b+" : "+(a>b));
		System.out.println(a+" Nho hon hoac bang "+b+" : "+(a<=b));
		System.out.println(a+" Lon hon hoac bang "+b+" : "+(a>=b));
	}
	

}
