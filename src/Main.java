public class Main {
    public static void main(String[] args) {

        //1

        int i = 1;
        while (i < 11){
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (i = 10; i > 0;i = i - 1){
            System.out.print(i + " ");
        }
        System.out.println();

        //2

        int firstFriday = 1;
        for (i = firstFriday; i <= 31; i = i + 7){
            System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет.");
        }
        System.out.println();

        //3

        int year = 2021;
        for (i = year - 200; i < year + 100; i++){
            if (i % 79 == 0){
                System.out.println(i);
            }
        }
        System.out.println();

        //4

        for (i = 1; i < 31; i++){
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println(i + ": ping pong");
            } else if (i % 3 == 0) {
                System.out.println(i + ": ping");
            } else if (i % 5 == 0) {
                System.out.println(i + ": pong");
            } else {
                System.out.println(i + ":");
            }
        }
        System.out.println();

        //5

        int a = 0;
        int b = 1;
        int c = 0;
        System.out.print(a + " " + b + " ");
        for (i = 1; i < 9; i++){
            c = b;
            b = a + b;
            a = c;
            System.out.print(b + " ");
        }



    }
}