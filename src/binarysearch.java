public class binarysearch {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60,70,80,90,100};
        int target=50;
        int c=binary(arr,target);
        System.out.print(c);
    }
    static int binary(int[]  arr,int target){
        int start=0;
        int end=1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                target=mid;
            }
            return mid;
        }
        return -1;
    }
}
