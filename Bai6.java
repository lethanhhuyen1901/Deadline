package BaiTap6;

import java.util.Scanner;

public class Bai6 {
	public static void main(String[] args) {
		Scanner hb = new Scanner(System.in);
		System.out.println("Nhap vao so nguyen duong: ");
		int n = hb.nextInt();
		int res = 1;
		for (int i = 1; i <= n; i++) {
			res *=i;
			
		}
		System.out.println("Giai thua cua so vua nhap la: "+res);
	}

}
