public class BinarySearch {
    public static int search(int[] arr,int find,int left,int right) {
        if (right >= left) {
            int mid = left + (right - left) / 2;

        if (arr[mid] == find)
            return mid;
        if (arr[mid] > find)
            return search(arr, left, mid - 1, find);

        return search(arr, mid + 1, right, find);
    }
        return -1;

    }
    public static void main(String[] args){
        int[] arr= {1,2,3,4,5};
        int n=arr.length;
        int find=4;
        int result= BinarySearch.search(arr,find,0,n-1);
        if(result==-1){
            System.out.println("Element not present");
            }
            else{
                System.out.println("Element is present"+ result);
        }


    }
}
