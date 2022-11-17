public class BmiService {
    public double calculate(double bodyMassIndex) {
        double height = 1.83;
        double bmi = bodyMassIndex / (height * height);
        return bmi;
    }
}
