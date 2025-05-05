package BinarySearch;
//Given a sorted array of size “N”; find the index of the number in the array which is just greater than x and as close as possible to x.

 //       -> Upper Bound (x) = Returns index of the number which is just greater than x and as close as possible to x.

public class BinarySearch2 {
    public static void main(String[] args) {
        int [] arr = {3,5,5,8,8,10,12};
        int target = 4;
        int start =0;
        int end= arr.length-1;
        int difference =0;
        while (start<end)
        {
            int mid= start + (end - start) / 2;

            if(arr[mid] < target)
            {
                end = mid - 1;
            }
            if (arr[mid] > target)
            {
                start=mid +1;
                System.out.println(mid);
                return;
            }
            if (arr[mid]==target)
            {
                start =mid+1;
            }
        }
    }
}
