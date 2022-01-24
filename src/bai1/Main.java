package bai1;

public class Main {

	public static void main(String[] args) {
		QuanLyThoiGianChayCuaVanDongVien quanLyThoiGianChayCuaVanDongVien = new QuanLyThoiGianChayCuaVanDongVien();
		quanLyThoiGianChayCuaVanDongVien.themThoiGianChay(new Time(2, 19));
		quanLyThoiGianChayCuaVanDongVien.themThoiGianChay(new Time(1, 30));
		quanLyThoiGianChayCuaVanDongVien.themThoiGianChay(new Time(4, 50));
		quanLyThoiGianChayCuaVanDongVien.themThoiGianChay(new Time(1, 19));
		quanLyThoiGianChayCuaVanDongVien.themThoiGianChay(new Time(2, 19));

		quanLyThoiGianChayCuaVanDongVien.inDanhSach();

		quanLyThoiGianChayCuaVanDongVien.sapXepThoiGianChayTheoThuTuTangDan();

		System.out.println("\n sau khi sap xep tang dan");
		quanLyThoiGianChayCuaVanDongVien.inDanhSach();
	}

}
