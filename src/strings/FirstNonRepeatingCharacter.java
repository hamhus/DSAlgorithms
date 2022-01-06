package strings;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args)
    {
        //leetcode - returns 0
        //loveleetcode - returns 2
        //aabb - returns -1
        String str = "loveleetcode";
        //String newStr = printNonRepeatingSeq(str);
        //String newStr = printNonRepeatingSeq_SlidingWindow(str);
        int firstIndex = firstUniqChar(str);
        System.out.println("First Unique Character Index : "+firstIndex);
    }



    private static int firstUniqChar(String str) {
        Map<Character, Integer> map;
        map = new HashMap<>();
        /*int[] nonDuplicateIndex = new int[str.length()];
        int dup = 1;
        int j=0;*/
        for(int i=0; i<str.length(); i++)
        {
            /*if(!map.containsKey(str.charAt(i))) //Key is not present in hashmap
            {
                map.put(str.charAt(i), 1);
                nonDuplicateIndex[i] = 1;
            }
            else //duplicate key is found
            {
                map.put(str.charAt(i), ++dup);
                nonDuplicateIndex[i] = dup;
                dup = 1;
            }*/
            if(!map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), 1);
            }
            else
                map.put(str.charAt(i), map.get(str.charAt((i)))+1);
        }
        for(int i=0; i<str.length(); i++)
        {
            if(map.get(str.charAt(i)) == 1)
                return i;
        }
        return -1;
    }
}
