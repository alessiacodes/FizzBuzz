public class Reduce {
    public static void main(String[] args) {
        /*
        In Reduce.java, write a main method that prints how many steps it takes to reach 0 if you start at 100. Add this
        file to your project, commit, and push. If you don't get the right answer, that's okay for now. This is to get
        you to practice. You'll have until the end of the week to work out the details and submit your working code on
        MarkUs.
        */

        int n = 100;
        int step_count = 0;

        while(n > 0){
            step_count ++;

            if (n % 2 == 0){
                n = n/2;
            }
            else {
                n-=1;
            }
        }

        System.out.println(step_count);
    }
}
