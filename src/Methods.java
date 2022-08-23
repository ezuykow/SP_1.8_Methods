import java.time.LocalDate;
import java.time.Year;

public class Methods {
    public static void main(String[] args) {

        System.out.println("\nTask 1:");
        task1();

        System.out.println("\nTask 2:");
        task2();

        System.out.println("\nTask 2:");
        task3();
    }

    private static void task1() {
        int year = LocalDate.now().getYear();
        checkYearIsLeap(year);
    }

    private static void checkYearIsLeap(int year) {
        if (Year.isLeap(year)) {
            System.out.println(year + " - leap year");
        } else {
            System.out.println(year + " - not leap year");
        }
    }

    private static void task2() {
        int userOS = (int) (Math.random() + 0.5);
        int productYear = (int) (2010 + (Math.random() * 13));

        checkPhone(userOS, productYear);
    }

    private static void checkPhone(int userOS, int productYear) {
        StringBuilder result = new StringBuilder("Install the ");

        if (productYear < LocalDate.now().getYear()) {
            result.append("lite version of the ");
        } else {
            result.append("normal version of the ");
        }

        if (userOS == 0) {
            result.append("iOS app");
        } else {
            result.append("Android app");
        }

        System.out.println(result);
    }

    private static void task3() {
        int deliveryDistance = 95;

        int daysForDelivery = calculateDeliveryTime(deliveryDistance);

        System.out.println("Delivery will take days: " + daysForDelivery);
    }

    private static int calculateDeliveryTime(int dist) {
        int days = 1;
        dist -= 20;

        while (dist > 0) {
            days++;
            dist -= 40;
        }

        return days;
    }
}
