public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void checkConditions(int a) {
        if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0) {
            System.out.println(a + " год — високосный год");
        } else {
            System.out.println(a + " год — невисокосный год");
        }
    }
    public static String checkOS (int a) {
        if (a == 0) {
            return "iOS";
        } else {
            return "Android";
        }
    }

    public static String checkYearPhone (int a, String b) {
        if (a < 2015) {
            return "Установите облегченную версию приложения для " + b + " по ссылке";
        } else {
            return "Установите обычную версию приложения для " + b + " по ссылке";
        }
    }
    public static int checkDistance (int a) {
        int days = 1;
        if (a > 20) {
            days++;
        }
        if (a > 60) {
            days++;
        }
        if (a > 100) {
            days++;
        }
        return days;
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int year = 4003;
        checkConditions(year);
    }

    public static void task2 () {
        System.out.println("Задача 2");
        int currentYear = 2017;
        int currentOS = 0;
        System.out.println(checkYearPhone(currentYear, checkOS(currentOS)));
    }

    public static void task3 () {
        System.out.println("Задача 3");
        int deliveryDistance = 120;
        System.out.println("Потребуется дней: "+ checkDistance(deliveryDistance));
    }
}