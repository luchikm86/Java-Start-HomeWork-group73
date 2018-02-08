public class AverageCalculator {

    public static void main(String[] args) {
        int a = 5;
        int b = 9;

        int[] numbers = {a, b};

        int average = 0;
        if (numbers.length > 0)
        {
            int sum = 0;
            for (int j = 0; j < numbers.length; j++) {
                sum += numbers[j];
            }
            average = sum / numbers.length;
        }

        System.out.println("avg = " + average);

    }

}
