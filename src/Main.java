public class Main {

    private static void printLeapYear(int year) {
        if (year % 4 == 0) {
            if ((year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(+year + " год является високосным");
            } else {
                System.out.println(+year + " год является не високосным");
            }
        } else {
            System.out.println(+year + " год является не високосным");
        }
    }

    private static void printInstallVersion(int clientOS, int clientDeviceYear) {
        if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
    }

    private static void printDeliveryDay(int deliveryDistance) {
        int deliveryDay = 1;

        if (deliveryDistance > 20)
            deliveryDay++;
        if (deliveryDistance > 60)
            deliveryDay++;
        {
            System.out.println("Потребуется дней: " + deliveryDay);
        }
        if (deliveryDistance > 100) {
            System.out.println("Доставка не осуществляется.");
        }
    }

    public static void main(String[] args) {

        //task 1
        int year = 2021;
        printLeapYear(year);

        //task 2
        int clientOS = 1;
        int clientDeviceYear = 2013;
        printInstallVersion(clientOS, clientDeviceYear);

        //task 3
        int deliveryDistance = 20;
        printDeliveryDay(deliveryDistance);


    }
}