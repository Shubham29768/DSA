import static jdk.internal.org.jline.utils.Colors.s;

public class rotated_bsearch {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 0, 1, 2, 4};
        int target = 5;
        System.out.println(search(arr,target));
       // System.out.println("Peak Index: " + findPivot(arr)); // Returns index
        //System.out.println("Peak Value: " + arr[findPivot(arr)]); // Access value at the index

    }

    static int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        if (pivot == -1) {
            return binarysearch(nums, target, 0, nums.length - 1);
        }
        if (nums[pivot] == target) {
            return pivot;
        }
        if (nums[0] > target) {
            return binarysearch(nums, target, pivot + 1, nums.length - 1);
        }
        return binarysearch(nums, target, 0, pivot);
    }


    static int binarysearch(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > nums[mid]) {
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;

    }

        static int findPivot(int[] arr) {

            int start = 0;
            int end = arr.length - 1;
            while (start <= end) {
                int mid = start + (end - start) / 2;
                // 4 cases over here
                if (arr[mid] > arr[mid + 1]) {
                    return mid;
                }
                if ( arr[mid] < arr[mid - 1]) {
                    return mid - 1;
                }
                if (arr[mid] <= arr[start]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            return -1;
        }
    }
