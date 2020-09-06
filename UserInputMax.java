import java.util.Scanner;
public class UserInputMax {
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
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] numbers = new int[n];
        for(int i=0;i<numbers.length;i++){
            numbers[i]=scanner.nextInt();
        }
        System.out.println(UserInputMax.findIndexOfMax(numbers));
    }
}
