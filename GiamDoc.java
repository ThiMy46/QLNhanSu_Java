
public class GiamDoc{

	private String hoTen;
	private String ngaySinh;
	private Double heSoLuong;

	public GiamDoc() {
		super();
	}
	public GiamDoc(String hoTen, String ngaySinh, Double heSoLuong) {
		super();
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.heSoLuong = heSoLuong;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public Double getHeSoLuong() {
		return heSoLuong;
	}
	public void setHeSoLuong(Double heSoLuong) {
		this.heSoLuong = heSoLuong;
	}
}
