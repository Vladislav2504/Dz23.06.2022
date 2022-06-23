import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год ");
        int n1 = scanner.nextInt();
        System.out.println("Введите месяц \n (Первый месяц - это 0)");
        int n2 = scanner.nextInt();
        System.out.println("Введите день");
        int n3 = scanner.nextInt();

        String day = "EEEE";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(day,
                new Locale ("EN", "USA"));
        Calendar calendar = new GregorianCalendar(n1,n2,n3);
        Date date = calendar.getTime();
        System.out.println(simpleDateFormat.format(date));

    }
}