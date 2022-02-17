package recursion;

import java.util.ArrayList;
import java.util.List;

public class ProductSum {

    public static int productSum(List<Object> array) {
        // Write your code hereif(array==null) return -1;
        if(array==null) return -1;
        int sum = 0;
        int depth = 1;
        for(Object ele:array)
        {
            if(ele instanceof Integer)
            {
                sum = sum + (int)ele;
            }
            else if(ele instanceof int[])
            {
                depth++;
                sum += depth * (productSum((int[])ele,0));
            }
        }
        //productSum(array, sum, depth);
        return sum;
    }
    public static int productSum(int[] array, int i)
    {
        //for(int i=0;i<array.length; i++)
        //{
        //sum = sum+array[i];
        //}
        if(i>=array.length) return 0;
        return array[i]+productSum(array, i+1);
        //return sum;
    }
    public static void main(String[] args)
    {
        List<Object> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(new int[]{3});
//        list.add(4);
//        list.add(5);
        //"array": [5, 2, [7, -1], 3, [6, [-13, 8], 4]]
        List<Object> ipList = new ArrayList<>();
        ipList.add(6);
        ipList.add(new int[]{-13,8});
        ipList.add(4);
        list.add(5);
        list.add(2);
        list.add(new int[]{7,-1});
        list.add(3);
        list.add(ipList);
        System.out.println(productSum(list));
    }
}
