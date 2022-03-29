public class V10 {
    public static double compute(double x,double y,double z){
        double left = Math.pow((x),1/5);
        double right = Math.cos(y)*Math.cos(y);
        double leftr = Math.atan(z);
        return left * (right + leftr);
    }
}
