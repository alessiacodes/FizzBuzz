public class Multiples {
    public static void main(String[] args) {
        /* In Multiples.java, write a main method that prints how many multiples of 3 or 5 there are below 1000.
         Add this file to your project, commit, and push. Check your repo on GitHub to confirm your changes were pushed
         successfully.
         */

        int multiples = 0;

        for (int i=1; i < 1001; i++){
            if ((i % 3 == 0) || i % 5 == 0){  // if a number is divisible by x, it must also be a multiple by x
                multiples += 1;
            }
        }

        System.out.println(multiples);
    }
}
