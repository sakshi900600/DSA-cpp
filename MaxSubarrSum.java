public class MaxSubarrSum {

    public static void main(String[] args) {

        int arr[] = { 2, -1, -5, 6, -4, 3, 10 };
        int n = arr.length;
        int maxSum = 0;
        int start = 0, end=0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {

                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                    if (sum > maxSum) {
                        maxSum = sum;
                        start = i;
                        end = k;
                    }
                }

            }
        }

        System.out.println(maxSum);
        System.out.println(start + " " + end);
    }
}