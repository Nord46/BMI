public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double mass = 80;
        double growth = 1.75;
        double BMI = service.calculate(mass,growth);
        System.out.println(BMI);
    }
}
