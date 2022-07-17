public class Main {
    public static void main(String[] args) {

        // задача 1

        int clientOS = 0;

        if (clientOS == 0)
        {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else
        {
            System.out.println("Установите версию приложения для Android по ссылке");
        }


        // задача 2

        int ClientOS = 1;

        int clientDeviceYear = 2017;
        {


            if (ClientOS == 0 && clientDeviceYear >= 2015)
            {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
            else if (ClientOS != 1 && clientDeviceYear < 2015)
            {
                System.out.println("Установите облегчённую версию приложения для iOS по ссылке");
            }

            if (ClientOS == 1 && clientDeviceYear >= 2015)
            {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
            else if (ClientOS != 0 && clientDeviceYear < 2015)
            {
                System.out.println("Установите облегчённую версию приложения для Android по ссылке");
            }

        }

        // задача 3


        int year = 2007;
        {

            if (year % 100 == 0 && year % 400 == 0)
            {
                System.out.println(year + " год является високосным");
            }
                else if (year % 4 == 0 && year % 100 > 0)
            {
                System.out.println(year + " год является високосным");
            }
                else if (year % 100 == 0)
            {
                System.out.println(year + " год не является високосным");
            }
                else
            {
                System.out.println(year + " год не является високосным");
            }
        }


        // задача 4
        {

            int deliveryDistance = 10;

            if (deliveryDistance <= 20) {
                System.out.println(" Доставка займёт 1 день ");
            }
            else if (deliveryDistance <= 60 ) {
                System.out.println(" Доставка займёт 2 дня ");
            }
            else if (deliveryDistance <= 100 ) {
                System.out.println(" Доставка займёт 3 дня ");
            }
            else
            {
                System.out.println(" доставка будет долго ");
        }

            // задача  5

            {
                int monthNumber = 18;

                switch (monthNumber) {
                    case 12:
                    case 1:
                    case 2:
                        System.out.println("зима");
                        break;
                    case 3:
                    case 4:
                    case 5:
                        System.out.println("весна");
                        break;


                    case 6:
                    case 7:
                    case 8:
                        System.out.println("лето");
                        break;

                    case 9:
                    case 10:
                    case 11:
                        System.out.println("осень");
                        break;

                    default:
                        System.out.println("такого месяца нет");
                }


            }


        }


    }









}





