public class MinMaxCalculation {
    public static void main(String[] args) {
        int[] numbers = {35, 111, 1, 56, 77, 8, 22, 2, 27, 25};
    
        int miniValue = numbers[0];
        int maxiValue = numbers[0];

        for (int i : numbers) {
            if (i < miniValue) {
                miniValue = i;
            }
            if (i > maxiValue) {
                maxiValue = i;
            }
        }

        System.out.println("Minimum value: " + miniValue);
        System.out.println("Maximum value: " + maxiValue);
    }
}
