public class Main {
    public static void main(String[] args) {
        BmiService bmiService = new BmiService();
        double weight = 55; // вес в кг
        double height = 1.60; // рост в метрах
        int bmi = bmiService.calculate(weight, height);
        System.out.println("BMI: " + bmi);
    }
}