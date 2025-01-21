//check if array is sort
package DSA;
public class array_05{

    public static void main(String[] args) {
        int arr[] = {1,2,9,4,5};
        int k=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] > arr[i+1]){
                k=0;
                break;
            }
            else{
                k=1;
            }
        }
        if(k==0){
            System.out.println("not sorted");
        }
        else{
            System.out.println("sorted");
        }
    }
}
