/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luongductoan_59132645_straterypattern_bai3;

import java.util.Date;

/**
 *
 * @author Luong Toan
 */
public class SinhVien {
    String HoTen;
    float DiemTB;
    Date NgaySinh;

    public SinhVien() {
    }

    public SinhVien(String HoTen, float DiemTB, Date NgaySinh) {
        this.HoTen = HoTen;
        this.DiemTB = DiemTB;
        this.NgaySinh = NgaySinh;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public float getDiemTB() {
        return DiemTB;
    }

    public void setDiemTB(float DiemTB) {
        this.DiemTB = DiemTB;
    }

    public Date getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(Date NgaySinh) {
        this.NgaySinh = NgaySinh;
    }
    
    public void HienThiTT(){
        System.out.println("Ho & Ten: "+HoTen);
        System.out.println("Ngay Sinh: "+NgaySinh);
        System.out.println("Diem TB: "+DiemTB);
    }
}
