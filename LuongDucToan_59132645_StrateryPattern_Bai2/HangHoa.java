
package luongductoan_59132645_straterypattern_bai2;

public class HangHoa {
    private String tenHH;
    private int gia;
    private String mota;

    public HangHoa() {
    }

    public HangHoa(String tenHH, int gia, String mota) {
        this.tenHH = tenHH;
        this.gia = gia;
        this.mota = mota;
    }

    public String getTenHH() {
        return tenHH;
    }

    public void setTenHH(String tenHH) {
        this.tenHH = tenHH;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public void HienThi(){
        System.out.println("Ten hang hoa: " + tenHH);
        System.out.println("Gia hang: " + gia);
        System.out.println("Mo ta HH: " + mota);
    }  
}
