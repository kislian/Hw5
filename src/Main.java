public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1 вариант 1")    ;
        byte clientOS=0;
         if (clientOS == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        System.out.println("Задание 1 вариант 2")    ;
        clientOS=1;
        if (clientOS == 1) {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        System.out.println("Задание 2 вариант 1");
        int clientDeviceYear=2015;
        clientOS=0;
         if (clientDeviceYear<=2015 && clientOS==0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }else if (clientDeviceYear<=2015 && clientOS==1) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке")   ;
            }
         if (clientDeviceYear>2015 && clientOS==0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }else if (clientDeviceYear>2015 && clientOS==1) {
                System.out.println("Установите версию приложения для Android по ссылке")   ;
            }
        System.out.println("Задание 2 вариант 2");
        clientOS=1;
         if (clientDeviceYear<=2015 && clientOS==0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }else if (clientDeviceYear<=2015 && clientOS==1) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке")   ;
            }
         if (clientDeviceYear>2015 && clientOS==0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }else if (clientDeviceYear>2015 && clientOS==1) {
                System.out.println("Установите версию приложения для Android по ссылке")   ;
            }
        System.out.println("Задание 2 вариант 3");
        clientDeviceYear=2016;
         if (clientDeviceYear<=2015 && clientOS==0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }else if (clientDeviceYear<=2015 && clientOS==1) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке")   ;
            }
            if (clientDeviceYear>2015 && clientOS==0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }else if (clientDeviceYear>2015 && clientOS==1) {
                System.out.println("Установите версию приложения для Android по ссылке")   ;
            }
        System.out.println("Задание 2 вариант 4");
        clientOS=0;
        if (clientDeviceYear<=2015 && clientOS==0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }else if (clientDeviceYear<=2015 && clientOS==1) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке")   ;
            }
        if (clientDeviceYear>2015 && clientOS==0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }else if (clientDeviceYear>2015 && clientOS==1) {
                System.out.println("Установите версию приложения для Android по ссылке")   ;
            }
        System.out.println("Задание 3 ");
        int    year=2100;
        System.out.println(year);
         if (year-1584<=0) {
             System.out.println("Год должен быть больше, чем 1584") ;
            }else if ((year % 4 == 0 || year % 100 == 0) && (year % 400 !=0)){
            System.out.println(" год является високосным");
            }else{
                System.out.println(" год не является високосным");
            }
        System.out.println("Задание 4 ");
        byte deliveryDistance=90;
        byte day=0;
         if(deliveryDistance<20){
                day=1;
            }else if(deliveryDistance>=20 && deliveryDistance<60){
                day=2;
            }else if (deliveryDistance>=60 && deliveryDistance<100){
                day=3;
            }else{
                System.out.println("Свыше 100 км доставки нет ");
            }
        if(day!=0){
            System.out.println("Потребуется дней: "+ day);
        }
        System.out.println("Задание 5 ");
        byte monthNumber=12;
        System.out.println("Месяц" +monthNumber);
        switch(monthNumber){
            case 12:
            case 1:
            case 2:
                System.out.println("Это  зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Это Весна ");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Это Лето ");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Это Осень ");
                break;
            default:
                System.out.println("Месяц должен быть от 1 до 12 ");
        }

    }
}