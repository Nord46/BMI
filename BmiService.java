public class BmiService {
    public double calculate(double kilogram, double meter) {
        double mass = kilogram;
        double growth = meter * 2;
        double BMI;
        BMI = mass / growth;

        return BMI;
    }
}
