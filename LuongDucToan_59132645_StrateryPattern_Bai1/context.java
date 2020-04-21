
package luongductoan_59132645_straterypattern_bai1;

/**
 *
 * @author Luong Toan
 */
public class context {
    ITinh tinhtoan;

    public void setTinhtoan(ITinh tinhtoan) {
        this.tinhtoan = tinhtoan;
    }
    
    public  float tinh(float a, float b){
        return tinhtoan.tinh(a,b);
    }
}
