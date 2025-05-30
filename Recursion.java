public class Recursion {
    

    // fibonacci
    public static int fibonacci(int n){
        if(n==0 || n==1){
            return n;
        }

        return fibonacci(n-1)+ fibonacci(n-2);
    }


    // sum of first n natural no
    public static int sumN(int n){
        if(n == 0){
            return 0;
        }

        return n + sumN(n-1);
    }


    // print no from n to 1
    public static void printNt1(int n){
        if(n == 0){
            return;
        }

        System.out.print(n + " ");
        printNt1(n-1);
    }


    // check palindrom using recursion
    public static boolean palindrom(String s, int si, int ei){
        if(si >= ei){
            return true;
        }

        if(s.charAt(si) != s.charAt(ei)){
            return false;
        }

        return palindrom(s, si+1, ei-1);
    }




    public static void main(String[] args) {

    
        // System.out.println(fibonacci(5));
        // System.out.println(sumN(3));

        // printNt1(5);
        String s = "aba";
        System.out.println(palindrom(s, 0, s.length()-1));

    }
}
