public class binarySearch {
    public static int binarySearch(int arr[],int key){
        int start=0;
        int end=arr.length-1;
        while (start<=end) {
            int mid=(start+end)/2;

            if(arr[mid]==key){
                return key;
            }
            if (arr[mid]<key) {
                start=mid+1;
            }
            else{
                end = mid -1;
            }
        }
        return -1;
        
    }

    public static void main(String[] args) {
        int[] num = { 34, 178, 455, 7995, 44555, 995555, 555555 };
        int x =binarySearch(num,455);
        
        if(x == -1){
            System.out.println("not FOund");
        }
        else{
            System.out.println(x + " FOund");
        }
    }

}
