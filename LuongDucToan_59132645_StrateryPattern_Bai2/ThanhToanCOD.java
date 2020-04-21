
package luongductoan_59132645_straterypattern_bai2;

public class ThanhToanCOD implements IThanhToan{

    @Override
    public double ThanhToan(int tienhang) {
       if (tienhang > 2000000)
           return (double) tienhang*0.98;
       else
           return tienhang;
    
}
}
