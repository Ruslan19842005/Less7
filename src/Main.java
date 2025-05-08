public class Main {
    public static void main(String[] args) {


        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

            for (int i = 10;  i >= 1; i--) {
                System.out.println(i);
            }



            for (int i = 0; i <=17; i += 2){
                System.out.println(i);
            }


            for (int i = 10; i >= -10; i --) {
                System.out.println(i);
            }


            for (int i = 1904; i < 2096; i = i + 4) {
                System.out.println(i);
                System.out.println(" Год високосный");
            }


            for (int i = 0; i <= 98; i = i + 7){
                System.out.println(i);
            }


            for (int i = 1; i <= 512; i= i * 2 ) {
                System.out.println(i);
            }


            for (int i = 0; i <=12 * 29000; i += 29000){
                System.out.println(i);
                System.out.println("Накопления" + i + " за все время");
            }


            int salary = 29000;
            int total = 0;
            for (int i = 0; i <12; i++) {
                total = total + salary;
                total = total + total/100;
                System.out.println("Месяц" + i + "Итого" + total);
                System.out.println(total);
            }


        for (int i =1; i <= 10;  i++){
            System.out.println("2*" + i + "=" + 2 * i);
            System.out.println("Таблица умножения");
        }












        }
    }










