import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        checkLeapYear(2022);
        getDeviceLink(0, 2016);
        int deliveryDays = calculateDeliveryDays(95);
        System.out.println("Потребуется дней: " + deliveryDays);
    }
    //task 1
    public static void checkLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " является високосным");
        } else {
            System.out.println(year + " не является високосным");
        }
    }
    //task 2
    public static void getDeviceLink(int clientOS1, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientOS1 == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS1 == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS1 == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS1 == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }
    //task 3
    public static int calculateDeliveryDays(int deliveryDistance) {
        int days = 1;
        if (deliveryDistance <= 20) {
            days = 1;
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            days = 2;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            days = 3;
        } else if (deliveryDistance > 100) {
            days = 4;
        }
        return days;
    }
}