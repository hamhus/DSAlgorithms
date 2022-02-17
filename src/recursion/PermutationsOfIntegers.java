package recursion;

import linkedlist.RemoveDuplicates;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PermutationsOfIntegers {
    public static List<List<Integer>> getPermutations(List<Integer> array) {
    /*
		Iterate through the array,
		take 1 element,
		take the other two in an array, and pass it to a recursive function
		Recurisvely iterate each element

		*/
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if(array.size() < 1)
        {
            //List<Integer> nullList = new ArrayList<Integer>();
            //list.add(nullList);
            return list;
        }
        else if(array.size() == 1)
        {
            list.add(array);
            return list;
        }

        int[] output = new int[array.size()-1];
        Iterator<Integer> iter = array.iterator();

        for(int i=0; i< array.size(); i++)
        {
            List<Integer> arr = new ArrayList<Integer>();
            Integer element = array.get(i);
            //Integer element = ele;
            arr = array;
            arr.remove(element);
            System.out.println(output.length);
            list = getPermutationsRec(element, 0, arr, output, list);
        }
        return list;
    }
    public static List<List<Integer>> getPermutationsRec(Integer ele, int read, List<Integer> array, int[] output, List<List<Integer>> list)
    {
        if(read == output.length)
        {
            System.out.println(read);
            list = buildList(ele, output, list);
            //List<Integer> l = new ArrayList<Integer>();
            //l.add(ele);
            //for(int i = 0; i<output.length; i++)
            //{
            //	l.add(output[i]);
            //}
            //Reverse the output file
            int temp = output[0];
            output[0] = output[1];
            output[1] = temp;
            //
            System.out.println(temp);
            list = buildList(ele, output, list);
            //output = new int[array.size()-1];
            //list.add(l);
            return list;
        }
        System.out.println(read);
        output[read] = array.get(read);

        getPermutationsRec(ele, read+1, array, output, list);
        //getPermutationsRec(ele, read+2, array, output, list);

        return list;
    }

    public static List<List<Integer>> buildList(Integer ele, int[] output, List<List<Integer>> list)
    {
        List<Integer> l = new ArrayList<Integer>();
        l.add(ele);
        for(int i = 0; i<output.length; i++)
        {
            l.add(output[i]);
        }
        list.add(l);
        return list;
    }
    public static void main(String[] args)
    {
        List<Integer> array = new ArrayList<Integer>();
        array.add(1);
        array.add(2);
        array.add(3);
        getPermutations(array);
    }
}
