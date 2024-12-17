package DSA;

public class Array_03 {
    public static void main(String[] args) {
        //insertion in array
        int arr[] = {10,20,30,40,50};
        int element = 35;
        int index =4;
        int arr1[] = new int[arr.length+1];
        for(int i=0;i<index;i++){
            arr1[i] = arr[i];
        }
        for(int i=arr.length-1;i>=index;i--) {
            arr1[i+1]=arr[i];
        }
        
        arr1[4] = 35;
        for(int i=0;i<6;i++){
            System.out.print(arr1[i]+" ");
        }

        System.out.println();



        //delete from array
        int arr2[] = new int[arr1.length-1];
        for(int i=0;i<5;i++){
            if(arr1[i] == 35){
                for(int j= i;j<5;j++){
                    arr2[j] = arr1[j+1];
                }
                
            }
            for(int j=0;j<i;j++){
                arr2[j] = arr1[j];
            } 
        }
        for(int i=0;i<5;i++){
            System.out.print(arr2[i] + " ");
        }



        System.out.println();


        //sum of array and find how many operations are performed
        int sum=0;
        int count =0;
        for(int i=0;i<5;i++){
            sum = sum+ arr2[i];
            count++;
        }
        count--;
        System.out.println(sum);
        System.out.println(count);
    }
}
