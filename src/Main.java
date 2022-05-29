public class Main {
    public static void main(String[] args) {

        double mass = 58; // масса тела в кг
        double height = 1.58; // рост в метрах

        BmiService service = new BmiService();
        double bmi = service.calculate(mass, height);
        System.out.println("Индекс массы тела: " + bmi);
    }
}