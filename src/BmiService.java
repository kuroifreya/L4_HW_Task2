public class BmiService {
    public int calculate(double kg, double meter) {
        int i;
        i = (int) (kg / Math.pow(meter, 2));
        return i;
    }
}
