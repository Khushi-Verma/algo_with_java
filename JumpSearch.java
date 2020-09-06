public class JumpSearch {
    public static int search(int[] arr,int target){
        int index=-1;
        int right=0;
        int prevRight=0;
        if(arr.length==0) {
            return -1;
        }
        if(arr[right]==0){
            return 0;
        }
        int jumpLength = (int) Math.sqrt(arr.length);

        while (right < arr.length - 1) {
            right = Math.min(arr.length - 1, right + jumpLength);

            if (arr[right] >= target) {
                break;
            }
            prevRight = right;
        }
        if ((right == arr.length - 1) && target > arr[right]) {
            return -1;
        }
        return search(arr, target, prevRight, right);

    }

    private static int search(int[] arr, int target, int prevRight, int right) {
    }

    public static void main(String[] args){
        int[] arr= {1,2,3,4,5};
        int target=2;
        int result= JumpSearch.search(arr,target);
        System.out.println("JumpSeach element at"+ result);
    }
}
