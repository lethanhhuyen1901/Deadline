package Bai2;

import java.util.Scanner;

public class BaiTap2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.println("Nhap vao so a: ");
		a = sc.nextInt();
		System.out.println("So vua nhap là so chan: "+(a%2==0));
		System.out.println("So vua nhap là so le: "+(a%2==1));
	}

}
