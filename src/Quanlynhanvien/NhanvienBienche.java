package Quanlynhanvien;
public class NhanvienBienche extends Nhanvien {
	float heso, sonam;
	NhanvienBienche()
	{
		super();
		heso=sonam-0;
	}
	void nhap()
	{
		super.nhap();
		System.out.print("Nhap he so: ");
			heso = sc.nextFloat();
		System.out.print("Nhap so nam: ");
			sonam = sc.nextInt();
	}
	void xuat()
	{
		super.xuat();
		System.out.print(heso+"\t"+sonam+"\t"+luong()+"\n");
	}
	float luong()
	{
		return sonam*heso*10000;
	}
}
