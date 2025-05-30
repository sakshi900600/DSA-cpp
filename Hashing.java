import java.util.*;
public class Hashing {
    

    // majority elem in array - freq > n/2
    public static int majorityElem(int arr[]){
        int n = arr.length;
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }

        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue() > n/2){
                return entry.getKey();
            }
        }
        return -1;
    }


    // count freq of all elem
    public static void frequency(int arr[]){
        int n = arr.length;
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }

        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            System.out.println(entry.getKey() + "-" + entry.getValue() );
        }
        System.out.println();
    }


    // find elem with highest frequency
    public static int highFreq(int arr[]){
        int n = arr.length;
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }

        int highestFreq = 0;
        int highestFreqElem = -1;
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue() > highestFreq){
                highestFreq = entry.getValue();
                highestFreqElem = entry.getKey();
            }
        }
        return highestFreqElem;
    }


    // first repeating elem
    public static int repeatingElem(int arr[]){
        int n = arr.length;
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }

        for(int i=0; i<n; i++){
            if(map.get(arr[i]) > 1){
                return arr[i];
            }
        }
        return -1;
    }

    // first non-repeating elem in array
    public static int nonRepeatingElem(int arr[]){
        int n = arr.length;
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }

        for(int i=0; i<n; i++){
            if(map.get(arr[i]) == 1){
                return arr[i];
            }
        }
        return -1;
    }




    public static void main(String[] args) {
        
        // majority elem
        int arr[] = {2,3,4,1,1,1,2,2};
        // System.out.println(majorityElem(arr));
        // frequency(arr);
        // System.out.println(highFreq(arr));

        // System.out.println(repeatingElem(arr));
        System.out.println(nonRepeatingElem(arr));

        
    }
}
