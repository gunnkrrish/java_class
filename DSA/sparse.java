package DSA;
public class sparse{
    public static void main(String[] args) {
        int[][] arr = {{1,0,0},{3,0,4},{0,5,0}};
        int rows=3;
        int cols=3;
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j] == 0){
                    count++;
                }
            }
        }
        if(count > (rows*cols/2)){
            System.out.println("sparse");
        }
        else{
            System.out.println("not sparse");
        }
    }
}

// sparse is something in which we majority elements must be 0 and to do so if 3 x 3 matrix is there then majority must be total elements divide by half 