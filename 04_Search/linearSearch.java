public class linearSearch {

    public static boolean linearSearch(int num[],int key){
        for (int i = 0; i < num.length ; i++) {
            if(num[i]==key){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] num = {34,78,4,799,44,99,5};
        int key = 433;

         Boolean found = linearSearch(num, key);

         if(found){
            System.out.println("Found");

         }
         else{
            System.out.println("Not found");
         }
    }
}