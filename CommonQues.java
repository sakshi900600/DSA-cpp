public class CommonQues {
    

    public static void main(String[] args) {
        
        // patterns - pyramid, inverted pyramid, diamond
        int n = 5;
        // for(int i=1; i<=n; i++){
        //     // space
        //     for(int j=0; j<n-i; j++){
        //         System.out.print(" ");
        //     }

        //     // star
        //     for(int k=0; k<2*i-1; k++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        // inverted 
        // for(int i=n; i>=1; i--){
        //     // space
        //     for(int j=0; j<n-i; j++){
        //         System.out.print(" ");
        //     }

        //     // star
        //     for(int k=0; k<2*i-1; k++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        // diamond

        for(int i=1; i<=n; i++){
            // space
            for(int j=0; j<n-i; j++){
                System.out.print(" ");
            }

            // star
            for(int k=0; k<2*i-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=n-1; i>=1; i--){
            // space
            for(int j=0; j<n-i; j++){
                System.out.print(" ");
            }

            // star
            for(int k=0; k<2*i-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
