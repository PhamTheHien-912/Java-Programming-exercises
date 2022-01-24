package Quanlynhanvien;
import java.io.*;
import java.util.Scanner;
abstract public class Nhanvien {
	String Hoten;
	int Maphong;
	Scanner sc = new Scanner(System.in);
	Nhanvien(){Maphong=0;Hoten="";};
	void nhap() 
	{
		System.out.print("Nhap ho ten nhan vien: ");
		Hoten = sc.nextLine();
		System.out.print("Nhap ma phong: ");
		Maphong = sc.nextInt();
	}
	void xuat()
	{
		System.out.print(Hoten+"\t"+Maphong+"\t");
	}
	abstract float luong();
}
