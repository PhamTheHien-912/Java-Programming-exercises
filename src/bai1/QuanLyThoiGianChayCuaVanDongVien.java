package bai1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class QuanLyThoiGianChayCuaVanDongVien {
	private List<Time> dsThoiGianChayCuaVanDongVien;

	public QuanLyThoiGianChayCuaVanDongVien() {
		dsThoiGianChayCuaVanDongVien = new ArrayList<>();
	}

	public void themThoiGianChay(Time time) {
		dsThoiGianChayCuaVanDongVien.add(time);
	}

	public void sapXepThoiGianChayTheoThuTuTangDan() {
		Collections.sort(dsThoiGianChayCuaVanDongVien);
	}

	public void inDanhSach() {
		for(Time t : dsThoiGianChayCuaVanDongVien) {
			System.out.println(t);
		}
	}
}
