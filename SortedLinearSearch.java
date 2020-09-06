public class LinearSearchWithSortedArray {
    public static int SortedArray(int[] numbers,int value){
        int index=-1;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==value){
                index=i;
                break;
            }else if(numbers[i]>value){
                break;
            }
        }
        return index;
    }
    public static void main(String[] args){
        int[] numbers={2,5,6,10,20};
        int value=20;
        System.out.println(LinearSearchWithSortedArray.SortedArray(numbers,value));

    }
}
