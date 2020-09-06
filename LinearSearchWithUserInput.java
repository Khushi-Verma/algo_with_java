import java.util.Scanner;
public class LinearSearch {
    public static int Search(int[] numbers,int value){
        int index=-1;
        for (int i=0;i<numbers.length;i++){
            if(numbers[i] == value){
                index=i;
                break;
            }
        }
        return index;
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=scanner.nextInt();
        System.out.println("enter the values to array");
        int[] numbers=new int[n];
        for(int i=0;i<numbers.length;i++){
            numbers[i]=scanner.nextInt();
        }
        System.out.println("enter the value which you want to search");
        int value=scanner.nextInt();
        System.out.println("the index is " +LinearSearch.Search(numbers,value));
    }
}
