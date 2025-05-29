import java.util.*;
public class string {
    

    


    public static void main(String[] args) {
        
        // palindrome check
        // String str = "madam";
        // StringBuilder sb = new StringBuilder(str);
        // String str2 = sb.reverse().toString();
        // if(str.equals(str2)){
        //     System.out.println("The string is a palindrome.");
        // } else {
        //     System.out.println("The string is not a palindrome.");
        // }


        // anagram check
        // String s1 = "listen";
        // String s2 = "silengt";

        // if(s1.length() != s2.length()){
        //     System.out.println("The strings are not anagrams.");
        //     return;
        // }
        // else{
        //     s1.toLowerCase();
        //     s2.toLowerCase();
        //     char s1arr[] = s1.toCharArray();
        //     char s2arr[] = s2.toCharArray();
        //     Arrays.sort(s1arr);
        //     Arrays.sort(s2arr);
            
        //     if(Arrays.equals(s1arr, s2arr)){
        //         System.out.println("The strings are anagrams.");
        //     } else {
        //         System.out.println("The strings are not anagrams.");
        //     }
        // }


        // reverse a string
        // String str = "hello";
        // StringBuilder sb = new StringBuilder(str);
        // String revStr = sb.reverse().toString();
        // System.out.println(revStr);


        //  remove duplicates from a string
        // String str = "hello";
        // String str2 = "";
        // for(int i=0; i<str.length(); i++){
        //     char ch = str.charAt(i);
        //     if(str2.indexOf(ch) == -1){
        //         str2 += ch;
        //     }
        // }

        // System.out.println(str2); 


        //  first non-repeating character in a string
        String str = "sawiwiss";
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch,0)+1);
        }

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(map.get(ch) == 1){
                System.out.print(ch);
                break;
            }            
        }



        // chekk if a string is a rotation of another
        // String str1 = "hello";
        // String str2 = "llohe";

        // if(str1.length() != str2.length()){
        //     System.out.println("not a rotation");
        //     return;
        // }

        // String str3 = str1 + str1;
        // int index = str3.indexOf(str2);

        // if(index != -1){
        //     System.out.println("yes, it is a rotation");
        // }
        // else{
        //     System.out.println("no, it is not a rotation");
        // }

    }
}
