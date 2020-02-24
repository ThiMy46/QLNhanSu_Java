
public class NhanVien{

	private GiamDoc thongTin = new GiamDoc();
	private String tenQL;

	public NhanVien() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NhanVien(GiamDoc thongTin, String tenQL) {
		super();
		this.thongTin = thongTin;
		this.tenQL = tenQL;
	}
	public GiamDoc getThongTin() {
		return thongTin;
	}
	public void setThongTin(GiamDoc thongTin) {
		this.thongTin = thongTin;
	}
	public String gettenQL() {
		return tenQL;
	}
	public void settenQL(String tenQL) {
		this.tenQL = tenQL;
	}

}
