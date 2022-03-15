
public class V2 {
    public static double compute(double x,double y,double o,double a){
        double low = Math.pow((1+2*x),a);
        double up = Math.abs(x-y);
        double left = up/low;
        double right = Math.pow(Math.E,Math.sqrt(1+o));
        return left - right;
    }
}
