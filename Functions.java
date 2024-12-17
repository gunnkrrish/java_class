// public class Functions {
//     public static int num (int n){
//         if(n<10){
//             return n;
            
//         }
// return -1;
//     }
//     public static void main(String[] args) {
//         for(int i=0;i<10;i++){
//             int a= num(i);
//             System.out.println(a);
//         }
//     }
// }



// public static void num(int n){
    //     System.out.println(n);
    //     if(n<10){
    //         num(n+1);
    //     }
    //     else {
    //         return ;
    //     }
    // } 
    // public static void main(String[] args) {
    //     int n=0;
    //     num(n);
    // }




//CALCULATE X TO THE POWER Y

// import java.util.Scanner;
// public class Functions {
//     public static int num (int base , int expo ){
//         if(expo ==0){
//             return 1;
//         }
//         return base*num(base,expo-1);
//     }
//     public static void main(String[] args) {
//         int sub,sup,fi;
//         Scanner sc = new Scanner(System.in);
//         System.out.println("print subscript");
//         sub = sc.nextInt();
//         System.out.println("print superscript");
//         sup = sc.nextInt();
        
//             fi = num(sub,sup); 
    
//         System.out.println(fi);

//     }
// }



import java.util.Scanner;

public class Functions {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
