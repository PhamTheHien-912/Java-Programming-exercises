package Quanlynhanvien;

public class NhanvienHopdong extends Nhanvien {
	float luong;
	float loaiHopdong;
	NhanvienHopdong()
	{
		super();
		luong=loaiHopdong=0;
	}
	void nhap()
	{
		super.nhap();
		System.out.print("Nhap luomng hop dong: ");
		luong = sc.nextFloat();
		System.out.print("Nhap loai hop dong: 1 - Ngan han, 2 - Dai han: ");
		loaiHopdong = sc.nextInt();
	}
	void xuat()
	{
		super.xuat();
		System.out.print(loaiHopdong+"\t"+luong()+"\n");
	}
	float luong()
	{return luong;}
}
