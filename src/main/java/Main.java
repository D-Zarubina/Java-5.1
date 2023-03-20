import ru.netology.services.MonthService;

public class Main {
    public static void main(String[] args) {
        MonthService service = new MonthService();

        int count = service.calculate(30000, 10000, 60000);
        System.out.println(count);
    }
}
