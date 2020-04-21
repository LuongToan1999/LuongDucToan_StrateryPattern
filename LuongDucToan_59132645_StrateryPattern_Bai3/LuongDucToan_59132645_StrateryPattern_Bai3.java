/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luongductoan_59132645_straterypattern_bai3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

/**
 *
 * @author Luong Toan
 */
public class LuongDucToan_59132645_StrateryPattern_Bai3 {

    public static void main(String[] args) throws ParseException{
        QLSV SV = new QLSV();
        SinhVien SV1 = new SinhVien("Luong Duc Toan",8 ,new SimpleDateFormat("dd/MM/yyyy").parse("11/10/1999"));
        SinhVien SV2 = new SinhVien("Luong Thai Quoc",9 ,new SimpleDateFormat("dd/MM/yyyy").parse("12/12/1998"));
        SinhVien SV3 = new SinhVien("Luong Thai An",7 ,new SimpleDateFormat("dd/MM/yyyy").parse("01/06/2002"));
    
        SV.Them(SV1);
        SV.Them(SV2);
        SV.Them(SV3);
        
        System.out.println("Danh Sach Sinh Vien: ");
        SV.InDS();
        
        ISoSanh SSTheoDiem = new SoSanhTheoDiem();
        ISoSanh SSTheoTen = new SoSanhTheoTen();
        System.out.println("------------------------------------------------------------");
        SV.setSoSanh(SSTheoDiem);
        SV.SapXep();
        System.out.println("Danh Sach Sinh Vien Sap Xep Theo Diem: ");
        SV.InDS();
        
        System.out.println("------------------------------------------------------------");
        
        SV.setSoSanh(SSTheoTen);
        SV.SapXep();
        System.out.println("Danh Sach Sinh Vien Sap Xep Theo Ten: ");
        SV.InDS();
    }
    
}
