
package luongductoan_59132645_straterypattern_bai2;

public class ThanhToanOnline implements IThanhToan{

    @Override
    public double ThanhToan(int tienhang) {
       if (tienhang < 1000000)
           return (double) tienhang*0.95;
       else
           return tienhang*0.93;
    }  
}
