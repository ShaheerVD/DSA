public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target=15;
        int ans = ceiling(arr,target);
        System.out.println(ans);

    }

    //return index of smallest number >= target

    static int ceiling(int[] arr, int target ){

        //but if target is greater than greatest num in array
        if(target> arr[arr.length] -1){
            return -1;
        }
        int start = 0;
        int end=arr.length - 1;

        while(start <= end){
            //find middle element
            //int mid = (start+end)/2;

            int mid = start+(end-start)/2;

            if(target < arr[mid]){
                end = mid-1;
            }else if(target > arr[mid]){
                start = mid+1;
            }else{
                //ans found
                return mid;
            }
        }
        return start;
    }
}
