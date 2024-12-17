public class Pattern {
    public static void main(String[] args) {
        // for(int i=0;i<3;i++){
        //     for(int j=0;j<5;j++){
        //         System.out.print("*" + " ");
        //     }
        //     System.out.println();
        // }
//******************************************************************************* */


        // for(int i=0;i<4;i++){
        //     for(int j=0;j<=i;j++){
        //         System.out.print("*" + " ");
        //     }
        //     System.out.println();
        // }

//************************************************************************************ */

    //     for(int i=0;i<4;i++){
    //         for(int j=4;j>i;j--){
    //             System.out.print("*" + " ");
    //         }
    //         System.out.println();
    //     }
    // }

    //****************************************************************************** */
//DIAMOND

    // for(int i=0;i<4;i++){
    //     for(int j=3;j>=i;j--){
    //         System.out.print(" ");
    //     }
    //     for(int j=0;j<=i;j++){
    //         System.out.print("*");
    //     }
    //     for(int j=0;j<i;j++){
    //         System.out.print("*");
    //     }
    
    //     System.out.println();
    // }

    // for(int i=0;i<3;i++){
    //     for(int j=0;j<=i+1;j++){
    //         System.out.print(" ");
    //     }
    //     for(int j=2;j>=i;j--){
    //         System.out.print("*");
    //     }
    //     for(int j=2;j>i;j--){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }

    //****************************************************************** */

    //HOLLOW diamond 
        // int n=4;
        // for (int i = 1; i <= n; i++) {
            
        //     for (int j = 1; j<=n-i; j++) {
        //         System.out.print("  ");
        //     }             
        //     for (int k = 1; k <= 2*i-1; k++) {
        //         if(k==1 || k==2*i-1)
        //         System.out.print("* ");
        //         else
        //         System.out.print("  ");
                 
        //     }
        //     System.out.println();
        // }
        // for (int i = n-1; i >=1; i--) {
            
        //     for (int j = 1; j<=n-i; j++) {
        //         System.out.print("  ");
        //     }

        //     for (int k = 1; k <= 2*i-1; k++) {
        //         if(k==1 || k==2*i-1)
        //         System.out.print("* ");
        //         else
        //         System.out.print("  ");
                 
        //     }
        //     System.out.println();
        // }


//********************************************************************** */
        //hourglass

        // int n=4;
        // for (int i = 1; i <= n; i++) {
            
        //     for (int j = 1; j<=i-1; j++) {
        //         System.out.print("  ");
        //     }             
        //     for (int k = 1; k <= 2*(n-i)+1; k++) {
                
        //         System.out.print("* ");
                 
        //     }
        //     System.out.println();
        // }
        // for (int i = n-1; i >=1; i--) {
            
        //     for (int j = 1; j<=i-1; j++) {
        //         System.out.print("  ");
        //     }             
        //     for (int k = 1; k <= 2*(n-i)+1; k++) {
                
        //         System.out.print("* ");
                 
        //     }
        //     System.out.println();
        // }


//********************************************************************** */

        //Hollow hourglass
//         int n=4;
//         for (int i = 1; i <= n; i++) {
            
//             for (int j = 1; j<=i-1; j++) {
//                 System.out.print("  ");
//             }             
//             for (int k = 1; k <= 2*(n-i)+1; k++) {
//                 if (i>1){
//                     if(k==1 || k==2*(n-i)+1)
//                 System.out.print("* ");
//                 else
//                 System.out.print("  ");
//                 }
//                  else{
//                     System.out.print("* ");
                 
//                  }
//             }
//             System.out.println();
//         }
//         for (int i = n-1; i >=1; i--) {
            
//             for (int j = 1; j<=i-1; j++) {
//                 System.out.print("  ");
//             }             
//             for (int k = 1; k <= 2*(n-i)+1; k++) {
//                 if (i>1){
//                     if(k==1 || k==2*(n-i)+1)
//                 System.out.print("* ");
//                 else
//                 System.out.print("  ");
//             }
//             else{
//                System.out.print("* ");
            
//             }
//        }
//        System.out.println();
//    }

//****************************************************************************** */

        // for(int i=0;i<4;i++){
        //     for(int j=0;j<=i;j++){
        //         if((i+j) %2==0){
        //             System.out.print("1 ");
        //         }
        //         else{
        //             System.out.print("0 ");
        //         }
        //     }
        //     System.out.println();
        // }

        //************************************************************ */
        int n=3;
        int f=1;
        for(int i=1;i<=2*n;i++){
            
            for(int j=1;j<=n;j++){
                if(f==1){
                    System.out.print(". . ");
                }
                else{
                    System.out.print("# # ");
                    
                }
                f=f*-1;
            }
            f=f*-1;
            if(i%2==0){
                f=f*-1;
            }
            System.out.println();
        }
    }
}
