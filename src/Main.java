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
            }


            for (int i = 0; i <= 98; i = i + 7){
                System.out.println(i);
            }


            for (int i = 1; i <= 512; i= i * 2 ) {
                System.out.println(i);
            }


            for (int i = 0; i <=12 * 29000; i += 29000){
                System.out.println(i);
            }


            int salary = 29000;
            int total = 0;
            for (int i = 0; i <12; i++) {
                total= total+ total/100;
                total = total + salary;
                System.out.println("Месяц" + i + "Итого" + total);
                System.out.println(total);
            }












        }
    }










