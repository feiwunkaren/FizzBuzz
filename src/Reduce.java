public class Reduce {
    public static void main(String[] args) {
        /*purpose of code
        write a main method that prints how many steps it takes to reach 0 if you start at 100

        For example, if you start with n = 2, the answer is 2.
        Details: 2 (even, divide by 2) --> 1 (odd, subtract 1) --> 0.
         */
        int counter = 0;
        for (int i = 100; i > 0; i--) {
            if (i % 2 == 0) {
                i = i / 2;
            } else {
                i--;
            }
            counter++;
        }
        System.out.println("how many steps it takes to reach 0 if you start at 100: "+counter);
    }
}
