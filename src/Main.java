public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        double m = 63; // масса тела в килограммах
        double h = 1.60; // рост в метрах

        int index = (int) service.calculate(m, h);

        System.out.println("индекс массы тела - " + index);
    }
}