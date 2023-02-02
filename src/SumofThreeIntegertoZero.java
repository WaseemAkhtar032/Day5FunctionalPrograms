/*
Sum of three Integer adds to ZERO
a. Desc -> A program with cubic running time. Read in N integers and counts the
number of triples that sum to exactly 0.
b. I/P -> N number of integer, and N integer input array
c. Logic -> Find distinct triples (i, j, k) such that a[i] + a[j] + a[k] = 0
d. O/P -> One Output is number of distinct triplets as well as the second output is to
print the distinct triplets.
 */
    public class SumofThreeIntegertoZero {
        static void findTriplets(int[] arr, int n)
        {

            for (int i = 0; i < n - 2; i++) {
                for (int j = i + 1; j < n - 1; j++) {
                    for (int k = j + 1; k < n; k++) {
                        if (arr[i] + arr[j] + arr[k] == 0) {
                            System.out.println(arr[i] + " "+ arr[j] + " "+ arr[k]);
                        }
                    }
                }
            }
        }
        public static void main(String[] args)
        {
            int arr[] = { 0, -1, 2, -3, 1 ,3,1,-2};
            int n = arr.length;
            findTriplets(arr, n);
        }
    }

