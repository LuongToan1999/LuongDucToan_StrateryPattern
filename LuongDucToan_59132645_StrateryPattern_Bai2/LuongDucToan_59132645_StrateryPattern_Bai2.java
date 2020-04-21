
package luongductoan_59132645_straterypattern_bai2;

public class LuongDucToan_59132645_StrateryPattern_Bai2 {

    public static void main(String[] args) {
        GioHang GH1 = new GioHang();
        GioHang GH2 = new GioHang();
        
        GH1.setHinhThucTT(new ThanhToanOnline());
        GH2.setHinhThucTT(new ThanhToanCOD());
        
        HangHoa HH1 = new HangHoa("Carot",200000,"Khong thuoc tru sau");
        HangHoa HH2 = new HangHoa("Sua Bo",100000,"Sua bo tuoi");
        HangHoa HH3 = new HangHoa("Thit Heo",150000,"Thit tuoi");
        
        GH1.themHH(HH1);
        GH1.themHH(HH3);
        GH1.themHH(HH2);
        
        GH2.themHH(HH1);
        GH2.themHH(HH3);
        
        System.out.println("Danh sach hang hoa GH1: ");
        GH1.HienThi();
        System.out.println("Tong tien GH1: \nTong tien hang: " +GH1.tinhTienHang()+
                "\nTien khach tra: "+GH1.tinhTienKhachTra());
        
        System.out.println("-------------------------------------------");
        
        System.out.println("Danh sach hang hoa GH2: ");
        GH2.HienThi();
        System.out.println("Tong tien GH2: \nTong tien hang: " +GH2.tinhTienHang()+
                "\nTien khach tra: "+GH2.tinhTienKhachTra());
    }
    
}
