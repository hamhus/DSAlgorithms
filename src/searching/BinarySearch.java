package searching;

import java.util.ArrayList;
import java.util.List;

public class BinarySearch {

    public static int binarySearch(int[] array, int target) {
    /* Divide the input into half
				Check if the middle is the target
				Otherwise, check if the target is less or greater than the middle
				Divide the left half of the middle if the target is less than the middle
				Otherise, divide the right half of the middle if the target is greater than the middle
				Keep on dividing until you get the actual target.
				Target is obtained in the middle
		*/
        if(array.length == 0) return -1;
        int arrLength = array.length;
        int middle = array.length / 2;

        for(int i = 0; i<arrLength; i++)
        //while(arrLength <= 0)
        {

            if(array[middle] == target)
                return middle;
            else if(target <= array[middle])
            {
                i = -1;
                arrLength = middle;
                middle = middle/2;
            }
            else if(target > array[middle])
            {
                i = middle;
                middle = (middle+arrLength)/2;
                //arrLength =  array.length;
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int[] array = {0, 1, 21, 33, 45, 45, 61, 71, 72, 73};

        int index = binarySearch(array, 33);
        System.out.println(index);

        List<Integer> list = new ArrayList<>();
    }
}
