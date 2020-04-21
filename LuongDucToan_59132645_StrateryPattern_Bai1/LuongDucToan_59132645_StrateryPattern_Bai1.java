
package luongductoan_59132645_straterypattern_bai1;

/**
 *
 * @author Luong Toan
 */
public class LuongDucToan_59132645_StrateryPattern_Bai1 {

    public static void main(String[] args) {
        context ct = new context();
        
        ct.setTinhtoan(new Cong());
        System.out.println("Ket qua cua 75 + 12 = "+ ct.tinh(75,12));
        
        ct.setTinhtoan(new Tru());
        System.out.println("Ket qua cua 54 - 78 = "+ ct.tinh(54,78));
        
        ct.setTinhtoan(new Nhan());
        System.out.println("Ket qua cua 4 * 0 = "+ ct.tinh(4,0));
        
        ct.setTinhtoan(new Chia());
        System.out.println("Ket qua cua 2 / 3 = "+ ct.tinh(2,3));
    }   
}
