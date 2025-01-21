public class array {
    public static void main(String[] args) {
        int arr[] = {1,2,3,2,5,2};
        int count =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] ==2){
                count++;
            }
        }
        System.out.println(count);
    }
}
