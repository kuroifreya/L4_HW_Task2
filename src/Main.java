public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double mass = 77;
        double height = 1.70;
        int bmi = service.calculate(mass, height);
        System.out.println(bmi);
        System.out.println();

        mass = 98;
        height = 1.87;
        bmi = service.calculate(mass, height);
        System.out.println(bmi);
        System.out.println();

        mass = 59.9;
        height = 1.6;
        bmi = service.calculate(mass, height);
        System.out.println(bmi);
        System.out.println();
    }
}
