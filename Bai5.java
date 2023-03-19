package BaiTap5;

import java.util.Scanner;

public class Bai5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao so nguyen: ");
		int a = sc.nextInt();
		int tong = 0;
		while (a!=0) {
			tong += a%10;
			a/=10;
			
		}
		System.out.println("Tong cac chu so vua nhap la:" +tong);
		
	}

}
