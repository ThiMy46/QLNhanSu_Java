
public class QuanDoc{

	private GiamDoc thongTin = new GiamDoc();
	private int soLuongNV;

	public QuanDoc() {
		super();
		// TODO Auto-generated constructor stub
	}
	public QuanDoc(GiamDoc thongTin, int soLuongNV) {
		super();
		this.thongTin = thongTin;
		this.soLuongNV = soLuongNV;
	}
	public GiamDoc getThongTin() {
		return thongTin;
	}
	public void setThongTin(GiamDoc thongTin) {
		this.thongTin = thongTin;
	}
	public int getSoLuongNV() {
		return soLuongNV;
	}
	public void setSoLuongNV(int soLuongNV) {
		this.soLuongNV = soLuongNV;
	}

}
