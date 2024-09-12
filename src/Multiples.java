public class Multiples {
    public static void main(String[] args) {

        int divisibleBy3Counter = 0;
        int divisibleBy5Counter = 0;

        for (int i = 1; i < 1000; i++) {
            // Find out which numbers divide i.
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            // Print our appropriate result.
            if (divisibleBy3 && divisibleBy5) {
                divisibleBy3Counter++;
                divisibleBy5Counter++;
            } else if (divisibleBy3) {
                divisibleBy3Counter++;
            }
            else if (divisibleBy5) {
                divisibleBy5Counter++;
            }
        }
        System.out.println("Amount of numbers divisible by 3: " + divisibleBy3Counter);
        System.out.println("Amount of numbers divisible by 3: " + divisibleBy5Counter);

    }
}
