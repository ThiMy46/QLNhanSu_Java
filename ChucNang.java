import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChucNang {
	private List<NhanVien> lstNV = new ArrayList<NhanVien>();
	private List<QuanDoc> lstQD = new ArrayList<QuanDoc>();
	private GiamDoc giamDoc = new GiamDoc();
	public void inputAllData() {
		Scanner sc = new Scanner(System.in);
		/*Print information Director */
		System.out.println("GIAM DOC");
		inputData(sc, giamDoc);
		System.out.println("--------------------------");
		/*Print information Manager */
		System.out.println("QUAN DOC");
		for (int i=0 ; i<2; i++) {
			System.out.println("QuanDoc "+(i+1)+" :");
			QuanDoc qd = new QuanDoc();
			inputData(sc, qd.getThongTin());
			System.out.println("SL nhan vien: ");
			qd.setSoLuongNV(sc.nextInt());
			sc.nextLine();
			lstQD.add(qd);
		}	
		System.out.println("--------------------------");
		System.out.println("So Luong nhan vien: ");
		int n = sc.nextInt();
		sc.nextLine();
		System.out.println("--------------------------");
		/*Print information Employee */
		System.out.println("NHAN VIEN");
		for (int i = 0 ; i < n ; i++) {
			System.out.println("NhanVien :"+(i+1)+" :");
			NhanVien nv = new NhanVien();
			inputData(sc, nv.getThongTin());
			System.out.println("Ten QuanLy: ");
			nv.settenQL(sc.nextLine());
			lstNV.add(nv);
		}		
	}

	public void inputData(Scanner sc, GiamDoc giamDoc1) {
		System.out.println("Ho Ten: ");
		giamDoc1.setHoTen(sc.nextLine());
		System.out.println("Ngay Sinh: ");
		giamDoc1.setNgaySinh(sc.nextLine());
		System.out.println("He so luong: ");
		giamDoc1.setHeSoLuong(sc.nextDouble());
		sc.nextLine();
	}

	public void printAllData() {
		System.out.println("==========================");
		/*Print information Director */
		System.out.println("GIAM DOC");
		printData(giamDoc);
		/*Print information Manager */
		System.out.println("QUAN DOC");
		for (QuanDoc qd : lstQD) {
			printData(qd.getThongTin());
			System.out.println("SL nhanvien: " + qd.getSoLuongNV());
		}	
		/*Print information Employee */
		System.out.println("NHAN VIEN");
		System.out.println("Co "+ lstNV.size()+" nhan vien");
		for (NhanVien nv : lstNV) {
			printData(nv.getThongTin());
			System.out.println("Ten QL: " + nv.gettenQL());
		}		
		System.out.println("==========================");
	}
	public void printData(GiamDoc giamDoc) {
		System.out.println("Ho Ten: " + giamDoc.getHoTen());
		System.out.println("Ngay Sinh: " + giamDoc.getNgaySinh());
		System.out.println("He so luong: " + giamDoc.getHeSoLuong());
	}

	public void InfoMaxLuong() {
		NhanVien maxSalaryNV = new NhanVien(giamDoc, "");
		for (QuanDoc qd : lstQD) {
			if(qd.getThongTin().getHeSoLuong() > maxSalaryNV.getThongTin().getHeSoLuong()) {
				maxSalaryNV.setThongTin(qd.getThongTin());
			}
		}
		for (NhanVien nhanVien : lstNV) {
			if(nhanVien.getThongTin().getHeSoLuong() > maxSalaryNV.getThongTin().getHeSoLuong()) {
				maxSalaryNV.setThongTin(nhanVien.getThongTin());
			}
		}
		printData(maxSalaryNV.getThongTin());
		System.out.println("==========================");
	}

	public void printLastName(String lastName) {
		if(giamDoc.getHoTen().split("\\s",0)[0].compareTo(lastName) == 0) {
			printData(giamDoc);
		}
		for (QuanDoc qd : lstQD) {
			if(qd.getThongTin().getHoTen().split("\\s",0)[0].compareTo(lastName) == 0) {
				printData(qd.getThongTin());
				System.out.println("Ten QL: " + qd.getSoLuongNV());
			}
		}
		for (NhanVien nhanVien : lstNV) {
			if(nhanVien.getThongTin().getHoTen().split("\\s",0)[0].compareTo(lastName) == 0) {
				printData(nhanVien.getThongTin());
				System.out.println("Ten QL: " + nhanVien.gettenQL());
			}
		}
	}

	public List<NhanVien> sortASC(List<NhanVien> lstNhanVien){
		return null;
	}
}
