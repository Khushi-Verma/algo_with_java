 public class MaximumNumber {
    public static int findIndexOfMax(int[] numbers) {
        int index = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > numbers[index]) {
                index = i;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4 };
        System.out.println(MaximumNumber.findIndexOfMax(numbers));
    }
}
