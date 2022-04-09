
public class V15 {
    public static double compute(double x,double y,double o,double a){
        double low = Math.pow((Math.cos(x-Math.PI/6)),2) * 3;
        double up = Math.sin(Math.pow(y,2)) + 1/2;
        double fin = up/low;
        return fin;
    }
}
