import java.util.*;
public class hello{

    public static void printInWord(int n){
        switch(n){
            case 0: System.out.print("zero "); break;
            case 1: System.out.print("one "); break;
            case 2: System.out.print("two "); break;
            case 3: System.out.print("three "); break;
            case 4: System.out.print("four "); break;
            case 5: System.out.print("five "); break;
            case 6: System.out.print("six "); break;
            case 7: System.out.print("seven "); break;
            case 8: System.out.print("eight "); break;
            case 9: System.out.print("nine "); break;
        }
    }



    public static int factorial(int n){
        if(n == 0 || n==1){
            return 1;
        }
        return n * factorial(n-1);
    }




    public static void main(String[] args) {
        
        // count even & odd no -------------------------------
        // int arr[] = {1,2,3,4,5,6,7,8,9};
        // int even=0, odd=0;
        // int n = arr.length;

        // for(int i=0; i<n; i++){
        //     if(arr[i] % 2 == 0){
        //         even++;
        //     }
        //     else{
        //         odd++;
        //     }
        // }

        // System.out.println("Even: " + even + " Odd: " + odd);


        // avg no in array -------------------------------------
        // int arr[] = {1,2,3,4};
        // int n = arr.length;
        // int sum = 0;
        // for(int i=0; i<n; i++){
        //     sum += arr[i];
        // }

        // float avg = (float) sum/n;
        // System.out.println("Avg: " + avg);


        // print given digit in word -----------------------
        // int n = 1234;
        // String arr[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        // String str = "";    
        // while(n > 0){
        //     int digit = n % 10;
        //     str = arr[digit] + " " + str;
        //     n = n / 10;
        // }
        // System.out.println(str.trim());

        // String str = Integer.toString(n);
        // StringBuilder sb = new StringBuilder(str);
        // String revStr = sb.reverse().toString();
        // System.out.println(revStr);

        // while(n > 0){
        //     int lastDigit = n % 10;
        //     printInWord(lastDigit);
        //     n = n / 10;
        // }

        // large no is divisible by 6 or not ----------------------
        // int n = 12345;

        // if(n % 6 == 0){
        //     System.out.println("Divisible by 6");
        // }
        // else{
        //     System.out.println("Not divisible by 6");
        // }



        // no is palindrome or not -----------------------------
        // int n = 123921;
        // String str = Integer.toString(n);
        // StringBuilder sb = new StringBuilder(str);
        // String revStr = sb.reverse().toString();

        // if(str.equals(revStr)){
        //     System.out.println("Palindrome");
        // }
        // else{
        //     System.out.println("Not palindrome");
        // }


        // count vowels in string --------------------------
        // String str = "Hello Sakshi";
        // int i=0, count=0;
        // str.toLowerCase();

        // while(i < str.length()){
        //     char ch = str.charAt(i);

        //     if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
        //         count++;
        //         System.out.print(ch + " ");
        //     }
        //     i++;
        // }


        // check no is perfect suare or not ------------------------
        // int n = 256;
        // double num = Math.sqrt(n);

        // if(num * num == n){
        //     System.out.println("Perfect square");
        // }
        // else{
        //     System.out.println("Not perfect square");
        // }


        // find max elem in matrix -----------------------
        // int matrix[][] = {
        //     {1, 2, 3},
        //     {4, 85, 6},
        //     {7, 8, 9}
        // };

        // int max = Integer.MIN_VALUE;
        // int r = matrix.length;
        // int c = matrix[0].length;

        // for(int i=0; i<r; i++){
        //     for(int j=0; j<c; j++){
        //         if(matrix[i][j] > max){
        //             max = matrix[i][j];
        //         }
        //     }
        // }

        // System.out.println("Max: " + max);

        
        // sum digit of given no -------------------------
        // int n = 123;
        // int sum = 0;
        // while(n > 0){
        //     int ld = n % 10;
        //     sum += ld;
        //     n = n/10;
        // }
        // System.out.println(sum);


        // sum of square-sum of first n natural no ------------------------
        // int n = 3;
        // int sum = 0, squareSum = 0;

        // for(int i=1; i<=n; i++){
        //     sum += i;
        //     squareSum += i * i;
        // }

        // int sumSquare = sum * sum;
        // int diff = Math.abs(squareSum - sumSquare);
        // System.out.println(diff);


        // armstrong no or not --------------------------
        // int n = 133;
        // int originalNum = n;
        // int sum = 0;
        // while (n>0){
        //     int ld = n % 10;
        //     sum += ld * ld * ld;
        //     n = n/10;
        // }
        // if(sum == originalNum){
        //     System.out.println("Armstrong no");
        // }
        // else{
        //     System.out.println("Not armstrong no");
        // }


        // factorial of given no ------------------------
        // int n = 5;
        // int fact = 1;
        // for(int i=1; i<=n; i++){
        //     fact *= i;
        // }
        // System.out.println(fact);
        // System.out.println(factorial(n));


        // array is soted or not ----------------------
        // int arr[] = {1,23,3,4,5};
        // int n = arr.length;
        // boolean isSorted = true;
        // for(int i=0; i<n-1; i++){
        //     if(arr[i] > arr[i+1]){
        //         isSorted = false;
        //         break;
        //     }
        // }

        // System.out.println(isSorted);


        // multiplication table of given no ------------------------------
        // int n = 2;
        // for(int i=1; i<=10; i++){
        //     System.out.println(n + "*" + i +"=" + n*i);
        // }


        // check if a word is present is sentence --------------
        // String str = "Hello Sakshi";
        // String word = "Sakshi"; 
        
        // StringBuilder sb = new StringBuilder(str);
        // int ind = sb.indexOf(word);

        // if(ind != -1){
        //     System.out.println("Word found at index: " + ind);
        // }
        // else{
        //     System.out.println("Word not found");
        // }


        // segregate 0 and 1 ----------------------
        // int arr[] = {0,1,0,1,0,1};
        // Arrays.sort(arr); // way-1

        // way -2 : 2 pointers
        // int left = 0;
        // int n = arr.length;
        // for(int right=1; right<n; right++){
        //     if(arr[right] == 0){
        //         left++;
        //         int temp = arr[left];
        //         arr[left] = arr[right];
        //         arr[right] = temp;
        //     }
        // }
        
        // for(int i=0; i<n; i++){
        //     System.out.print(arr[i] + " ");
        // }


        // way - 3
        // int zero=0, one=0;
        // int n = arr.length;
        // for(int i=0; i<n; i++){
        //     if(arr[i] == 0){
        //         zero++;
        //     }
        //     else{
        //         one++;
        //     }
        // }

        // for(int i=0; i<zero; i++){
        //     arr[i] = 0;
        // }

        // for(int i=zero; i<n; i++){
        //     arr[i] = 1;
        // }

        // for(int i=0; i<n; i++){
        //     System.out.print(arr[i] + " ");
        // }



        //  program to reverse digit oa a no ----------------------
        // int n = 1234;
        // String str = Integer.toString(n);
        // StringBuilder sb = new StringBuilder(str);
        // String revStr = sb.reverse().toString();
        // System.out.println(revStr);


        //  find second largest elem in array
        // int arr[] = {1,2,3,4,57};
        // int largest = Integer.MIN_VALUE;
        // int largest2 = Integer.MIN_VALUE;
        // int n = arr.length;
        // for(int i=0; i<n; i++){
        //     if(arr[i] > largest){
        //         largest2 = largest;
        //         largest = arr[i];
        //     }
        //     else if( arr[i] > largest2 && arr[i] != largest){
        //         largest2 = arr[i];
        //     }
        // }
        // System.out.println("Largest: " + largest);
        // System.out.println("Second largest: " + largest2);


        //  display longest name in array of strings
        // String arr[] = {"Sakshi", "Anjali", "Priya", "Rani"};
        // int largestNameIdx = 0;
        // int largestNameLength = 0;

        // for(int i=0; i<arr.length; i++){
        //     String s = arr[i];
        //     if(s.length() > largestNameLength){
        //         largestNameLength = s.length();
        //         largestNameIdx = i;
        //     }
        // }

        // System.out.println("Longest name: " + arr[largestNameIdx]);



        // find minimum and maximum element in array
        // int arr[] = {1,2,3,4,5,6,7,8,9};
        // int min = Integer.MAX_VALUE;
        // int max = Integer.MIN_VALUE;

        // for(int i=0; i<arr.length; i++){
        //     if(arr[i] > max){
        //         max = arr[i];
        //     }
        //     if(arr[i] < min){
        //         min = arr[i];
        //     }
        // }
        // System.out.println("Min: " + min);
        // System.out.println("Max: " + max);


        // reverse an array --------------------------------
        // int arr[] = {2,3,9,8,4};
        // // Collections.reverse(Arrays.asList(arr));
        // int n = arr.length;
        // int revArr[] = new int[n];
        // int j=0;
        // for(int i=n-1; i>=0; i--){
        //     revArr[j] = arr[i];
        //     j++;
        // }
        // System.out.println("Reversed array: ");
        // for(int i=0; i<n; i++){
        //     System.out.print(revArr[i] + " ");
        // }


        // remove duplicated from sorted array -------------------
        // int arr[] = {1,2,2,3,4,4,5};
        // int n = arr.length;
        // int i=0;
        // for(int j=i+1; j<n; j++){
        //     if(arr[i] != arr[j]){
        //         i++;
        //         arr[i] = arr[j];
        //     }
        // }

        // System.out.println("Array after removing duplicates: ");
        // for(int k=0; k<=i; k++){
        //     System.out.print(arr[k] + " ");
        // }


        // left rotate an array by 1 
        // int arr[] = {1,2,3,4,5};
        // int first = arr[0];
        // for(int j=0; j<arr.length-1; j++){
        //     arr[j] = arr[j+1];
        // }

        // arr[arr.length-1] = first;
        // System.out.println("Array after left rotation: ");
        // for(int i=0; i<arr.length; i++){
        //     System.out.print(arr[i] + " ");
        // }


        // move all zero at end
        // int arr[] = {0,1,0,2,3,0,4};
        // int n = arr.length;
        // int left=0;
        // for(int right=0; right<n; right++){
        //     if(arr[right] != 0){
        //         int temp = arr[left];
        //         arr[left] = arr[right]; 
        //         arr[right] = temp;
        //         left++;
        //     }
        // }

        // System.out.println("Array after moving all zero at end: ");
        // for(int i=0; i<n; i++){
        //     System.out.print(arr[i] + " ");
        // }


        // check if 2 arrays are equal
        // int arr1[] = {1,2,3,4};
        // int arr2[] = {1,2,3,4,7};
        // // Arrays.equals(arr1, arr2);

        // boolean isEqual = true;
        // if(arr1.length != arr2.length){
        //     isEqual = false;
        // }
        // else{
        //     for(int i=0; i<arr1.length; i++){
        //         if(arr1[i] != arr2[i]){
        //             isEqual = false;
        //             break;
        //         }
        //     }
        // }
        // System.out.println(isEqual);


        // leader in array
        int arr[] = {16, 17, 4, 3, 5, 2};
        int n = arr.length; 
        ArrayList<Integer> list = new ArrayList<>();
        int maxFromRight = arr[n-1];
        list.add(maxFromRight); // last element is always a leader
        for(int i=n-2; i>=0; i--){
            if(arr[i] > maxFromRight){
                maxFromRight = arr[i];
                list.add(maxFromRight);
            }
        }
        
        for(int i=list.size()-1; i>=0; i--){
            System.out.print(list.get(i) + " ");
        }


        






        



    }

}