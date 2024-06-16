/*public class Main{
    public static void main(String[]args){
        int [] arr={-118,-12,-6,-2,0,2,34,56,78,89,92,97};
        int target=56;
        int ans= binarysearch(arr,target);
        System.out.println(ans);
    }
    static int binarysearch(int []arr,int target){
        int start =0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;
            if(mid == target){
                return mid;
            }
            if()
            if(target<arr[mid]){
                end = mid-1;
            } else if (target>arr[mid]){
                start= mid +1;
            } else{
                return mid;
            }
        }
        return -1;
    }
}*/
public class Main{
    public static void main(String[]args){
        int[] arr={1,2,3,45,67,89,99};
        int target=99;
        int D=orderagnosticBS(arr,target);
        System.out.print(D);
    }
    static int orderagnosticBS(int[] arr,int target){
        int start=0;
        int end =arr.length-1;
        boolean ifas= arr[start]<arr[end];
        while(start<=end){
            int mid = start +(end - start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(ifas){
                if(target<arr[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else{
                if(target>arr[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }

        }
        return -1;
    }
}