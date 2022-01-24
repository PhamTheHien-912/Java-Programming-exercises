package Quanlynhanvien;
import java.util.Scanner;
public class Main {
	public static void main(String args[])
	{
		Nhanvien a[];
		int n,i;
		float tong=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so luong nhan vien: ");
		n = sc.nextInt();
		a = new Nhanvien[n];
		for(i=0;i<n;i++)
		{
			System.out.print("Nhap thong tin nhan vien thu"+(i+1)+":\n");
			System.out.print("Loai nhan vien: 1 - Bien che, 2 - Hop dong: ");
				int check = sc.nextInt();
				if(check==1)
					a[i]= new NhanvienBienche();
				else a[i] = new NhanvienHopdong();
				a[i].nhap();
				tong = tong + a[i].luong();
		}
		System.out.print("Danh sach nhan vien vua nhap la: \n");
			for(i=0;i<n;i++) a[i].xuat();
		System.out.print("Danh sach nhan vien bien che la: \n");
			for(i=0;i<n;i++)
				if(a[i] instanceof NhanvienBienche)
					a[i].xuat();
		System.out.print("Tong luong la: "+tong);
	}
}
