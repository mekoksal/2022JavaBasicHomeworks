public class Main {
    public static void main(String[] args) {
        //mükemmel sayi bölenlerinin toplamının kendisini verdiği sayıdır.
        //6  --> 1,2,3 =6
        //28 --> 1,2,4,7,14 =28

        int number = 27;
        int total = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total = total + i;
            }
        }

        if (number == total) {
            System.out.println("Mükemmel sayıdır.");
        } else {
            System.out.println("Mükemmel sayı değildir.");
        }


    }
}