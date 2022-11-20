public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double bmi = service.calculate(75, 1.83);
        System.out.println("Индекс массы тела: " + bmi);
    }
}