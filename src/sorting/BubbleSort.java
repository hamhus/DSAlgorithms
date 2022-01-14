package sorting;

public class BubbleSort {

    private static int[] bubble_sort_bruteforce(int[] array)
    {
        // Brute-force approach = Time complexity - O(n^2); Space = O(1)
        /*
        * Iterate using two for loops and perform the swap operation by taking a temp variable
        * */
        //if(array.length == 0) return new int[] {};
        for(int i=0;i<array.length-1; i++)
        {
            for(int j=i+1;j<array.length; j++)
            {
                if(array[i] > array[j])
                {
                    array = swap(i,j, array);
                }
            }

        }
        return array;
    }
    private static int[] swap(int i, int j, int[] array)
    {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

        return array;
    }
    private static int[] bubble_sort_twopointers(int[] array)
    {
        // Optimized - two pointers - O(n)
        /*
         * Using two pointers, left and right = left+1,
         * Move to the right until the length of the string and perform the swap operation,
         * Once right reaches the end, increment left and assign right = left+1
         * */
        if(array.length == 0) return array;
        int left = 0;
        int right = 1;
        /*
        * //If you don't provide right<array.length, then the program will run into indexoutofbounds error
        * on line 61 at the last two elements in the array
        * You can also provide left<array.length-1 which is actually logical and makes more sense,
        * given that left<right by 1;
        * * */
        while(left < right && left<array.length-1)
            {
            if(array[left] > array[right])
            {
                swap(left, right, array);
            }
            else
            {
                if(right == array.length-1)
                {
                    left++;
                    right = left+1;
                }
                else
                    right++;
            }
        }
        return array;

    }
    public static void main(String[] args)
    {
        int[] array = {5,4,3,2,1};
        array = bubble_sort_bruteforce(array);
        printElements(array);
        System.out.println("*************************");
        System.out.println("Two Pointers");
        System.out.println("*************************");
        array = new int[]{5,4,3,2,1};
        array = bubble_sort_twopointers(array);
        printElements(array);
    }
    private  static void printElements(int[] array)
    {
        for(Integer element : array)
        {
            System.out.println(element);
        }
    }
}
