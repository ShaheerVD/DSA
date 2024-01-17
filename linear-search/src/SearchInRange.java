public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {18,12,-7,3,14,28};
        int target = 3;
        System.out.println(linearSearch(arr,target,1,4));
    }

    //search in the array: return index if item found
    //otherwise if not found return -1
    static int linearSearch(int[] arr, int target,int start,int end) {
        if (arr.length == 0) {
            return -1;
        }

        for (int index = start; index <= end; index++) {
            //check for element at every index if it is = target
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        //this line will execture if  none of the return statements above have
        //executed, target not found
        return -1;
    }
}
