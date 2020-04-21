
package luongductoan_59132645_straterypattern_bai2;

import java.util.ArrayList;

public class GioHang {
    IThanhToan HinhThucTT;
    ArrayList<HangHoa> dshh = new ArrayList<>();

    public void setHinhThucTT(IThanhToan HinhThucTT) {
        this.HinhThucTT = HinhThucTT;
    }

    public void themHH(HangHoa hh){
        dshh.add(hh);
    }
    
    public int tinhTienHang(){
        int S = 0;
        for (int i=0; i<dshh.size(); i++){
            S = S + dshh.get(i).getGia();
        }
        return S;
    }
    
    public double tinhTienKhachTra(){
        return HinhThucTT.ThanhToan(tinhTienHang());
    }
    
    public void HienThi(){
        for (int i= 0; i<dshh.size(); i++){
            dshh.get(i).HienThi();
        }
    }
}
