package BaiTap8;

import java.util.Scanner;

public class Bai8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so phan tu: ");
		int n = sc.nextInt();
		int A[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("A[" +i+"] = ");
			A[i]=sc.nextInt();
			
		}
		int s = 0;
		for (int i = 0; i < n; i++) {
			s = s + A[i];
			
		}
		System.out.println("Trung binh so vua nhap la: " +s/n);
	}

}
