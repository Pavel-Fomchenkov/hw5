public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        byte clientOS = 1;
        if (clientOS == 0) System.out.println("Установите версию приложения для iOS по ссылке");
        if (clientOS == 1) System.out.println("Установите версию приложения для Android по ссылке");
    }

    public static void task2() {
        short clientDeviceYear = 2015;
        short truePhoneProductionYear = 2011;
        byte clientOS = 1;
        if (clientOS == 0 && truePhoneProductionYear < clientDeviceYear)
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            else if (clientOS == 0)
                System.out.println("Установите версию приложения для iOS по ссылке");
            else if (clientOS == 1 && truePhoneProductionYear < clientDeviceYear)
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            else System.out.println("Установите версию приложения для Android по ссылке");
    }

    public static void task3() {
        short year = 2100;
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else System.out.println(year + " год не является високосным");
    }

    public static void task4() {
        int deliveryDistance = 95;
        int days = 0;
        if (deliveryDistance <= 20) days = 1;
        if (deliveryDistance > 20 && deliveryDistance <= 60) days = 2;
        if (deliveryDistance > 60 && deliveryDistance <= 100) days = 3;
        if (deliveryDistance > 100)
            System.out.println("Доставка в ваш регион не осуществляется");
            else
            System.out.println("Потребуется дней: " + days);
    }

    public static void task5() {
        int monthNumber = 12;
        String season = "Месяц " + monthNumber + " принадлежит сезону ";
        switch (monthNumber) {
            case 12, 1, 2: System.out.println(season + "зима");
                break;
            case 3, 4, 5: System.out.println(season + "весна");
                break;
            case 6, 7, 8: System.out.println(season + "лето");
                break;
            case 9, 10, 11: System.out.println(season + "осень");
                break;
            default:
                break;
        }
    }
}


