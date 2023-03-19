package Bai3;

import java.util.Scanner;

public class BaiTap3 {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int tuoi, Namsinh;
			System.out.println("Nhap vao ho va ten: ");
			String Hovaten = sc.nextLine();
			System.out.println("Nhap vao nam sinh: ");
			Namsinh = sc.nextInt();
			tuoi = 2023 - Namsinh;
			if(tuoi < 16) {
				System.out.println("Ban" +Hovaten + "o do tuoi vi thanh nien");
			}else if(tuoi >=16 && tuoi <18 ) {
				System.out.println("Ban" +Hovaten + "o do tuoi truong thanh");
			}else {
					System.out.println(" Ban" +Hovaten + " da gia");
				}
			
	}

}
