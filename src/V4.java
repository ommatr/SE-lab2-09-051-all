public class V4 {
    public static double function(double x,double a){
        double left = Math.ln(Math.abs(Math.pow(a,7)));
        double mid = Math.arctg(Math.pow(x,2));
        double up = Math.PI;
        double down = Math.sqrt(Math.abs(x+a));
        double right = up/down;
        return left + mid + right;
    }
}