package pro.sky.java.course1;

public class Main {

    public static void main(String[] args) {

        /*Task 1*/
        int clientOS = 0;

        if (clientOS == 0) {

            System.out.println("Установите версию приложения для iOS по ссылке");

        } else if (clientOS == 1) {

            System.out.println("Установите версию приложения для Android по ссылке");
        }

        /*Task 2*/
        clientOS = 1;


        int clientDeviceYear = 2015;

        if (clientOS == 0) {

            if (clientDeviceYear >= 2015) {

                System.out.println("Установите версию приложения для iOS по ссылке");

            } else {

                System.out.println("Установите облегченную версию приложения для iOS по ссылке");

            }
        }
        if (clientOS == 1) {

            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для Android по ссылке");

            } else {

                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }

        /*Task 3*/
        int year = 2021;

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {

            System.out.println(year + " год является високосным");

        } else {

            System.out.println(year + " год не является високосным");
        }

        /*Task 4*/
        int deliveryDistance = 95;
        int deliveryDays = 1;

        if (deliveryDistance < 20) {

            System.out.println("Потребуется дней: " + deliveryDays);

        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {

            ++deliveryDays;
            System.out.println("Потребуется дней: " + deliveryDays);

        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {

            deliveryDays += 2;
            System.out.println("Потребуется дней: " + deliveryDays);
        }

        /*Task 5*/
        int monthNumber = 12;

        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зимний сезон");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весенний сезон");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Летний сезон");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осенний сезон");
                break;
            default:
                System.out.println("В году всего 12 месяцев");
        }
    }
}
