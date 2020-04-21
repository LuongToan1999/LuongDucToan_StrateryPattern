/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luongductoan_59132645_straterypattern_bai3;

import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author Luong Toan
 */
public class QLSV {
    ISoSanh SoSanh;
    ArrayList<SinhVien> DSSV = new ArrayList<>();

    public QLSV() {
    }

    public QLSV(ISoSanh SoSanh) {
        this.SoSanh = SoSanh;
    }

    public void setSoSanh(ISoSanh SoSanh) {
        this.SoSanh = SoSanh;
    }
    
    public void SapXep(){
        for (int i = 0; i < DSSV.size() - 1; i++)
            for (int j = i+1; j < DSSV.size(); j++)
            {
                if(SoSanh.SoSanh(DSSV.get(i), DSSV.get(j)) > 0)
                    Collections.swap(DSSV, i, j);
            }
    }
    
    public void InDS(){
        for (int i=0; i < DSSV.size(); i++)
            DSSV.get(i).HienThiTT();
    }
    
    public void Them(SinhVien sv){
        DSSV.add(sv);
    }
}