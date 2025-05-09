public class binary_search{
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,10,15,17};
        int target =10;
        int ans=Binarysearch( arr, target);
        int ans2=linearsearch( arr, target);

        System.out.println("Answer from Binary Search: " + ans);
        System.out.println("Answer from Linear Search: " + ans2);
    }
    static int Binarysearch(int[] arr, int target){
        int start=0;
        int end= arr.length-1;
        while (start <=end){
            int mid=start+(end-start)/2;
            if(target > arr[mid]){
                start=mid+1;
            } else if (target < arr[mid]) {
                end= mid-1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
    static int linearsearch(int[] arr, int target){
        for (int i=0; i <arr.length; i++){
            int nums =arr[i];
            if (nums==target){
                return i;
            }
        }
        return -1;
    }
}
