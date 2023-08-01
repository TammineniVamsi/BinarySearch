public class binarysearch {
    public static int binsearch(int arr[],int key){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key){
                return mid;
            }
            if(arr[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;  //if key is not found
    }
    public static void main(String args[]){
        int arr[]={2,4,6,8,10,12,14};
        //always binary search can be done for sorted arrays
        int key=10;
        System.out.println("The element found at index: " + binsearch(arr, key));

    }
    
}
