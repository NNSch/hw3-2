public class BmiService {
    public double calculate(double m, double h) {

        double index = m / (h * h);
        return index;
    }
}
