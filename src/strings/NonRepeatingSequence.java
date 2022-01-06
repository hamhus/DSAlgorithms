package strings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NonRepeatingSequence {
    //Method -1 : Time complexity - O(n^2); Space Complexity - O(n)
    public static String printNonRepeatingSeq(String str)
    {
        if(str.length() == 1) return str;
        HashSet hashSet;
        String longestNonReapSeq = "";
        String newStr="";
        char[] inputArray = str.toCharArray();
        for(int i=0; i<inputArray.length-1; i++)
        {
            char c = inputArray[i];
            hashSet = new HashSet();//Create a new hash set
            //if(!hashSet.contains(str.charAt(i))) { //If the hashset doesn't
            hashSet.add(c);
            longestNonReapSeq = String.valueOf(c);
            //}
            int j = i+1;

            while (j<=str.length()-1)
            {
                if(hashSet.contains(inputArray[j])) //If the element is found
                {
                    break;
                }
                else //if the ele is not found in hashset, add it to hashset
                {
                    hashSet.add(inputArray[j]);
                    longestNonReapSeq += String.valueOf(inputArray[j]);
                    //oldStr = longestNonReapSeq;
                    j++;
                }
            }
            if(longestNonReapSeq.length() > newStr.length()) {//If longestNonReapSeq > newStr, then replace newStr with longestNonReapSeq
                newStr = longestNonReapSeq;
                //newStr = oldStr;
            }
            //else
            //{
                //newStr = longestNonReapSeq;
            //}
            longestNonReapSeq = "";
        }
        return newStr;
    }
    //Method 2 : Sliding window
    public static String printNonRepeatingSeq_SlidingWindow(String str)
    {
        if(str.length() == 0) return str;
        else if(str.length() == 1) return str;

        char[] inputArray = str.toCharArray();
        int l=0, r=1;
        String newStr = "";
        HashSet hashSet = new HashSet();
        StringBuilder stringBuilder = new StringBuilder();
        hashSet.add(inputArray[l]);   //a
        stringBuilder.append(inputArray[l]); //a
        while(l<r && r<str.length() -1) //Sliding window - make sure i is not greater than j
        {
            if(!hashSet.contains(inputArray[r]))
            {
                hashSet.add(inputArray[r]); //a, b
                stringBuilder.append(inputArray[r]); //ab; bac; bacd
                r++; //r=2, 3, 4, 5
            }
            else{
                if(newStr.length() < stringBuilder.length())
                {
                    newStr = stringBuilder.toString();
                    stringBuilder.deleteCharAt(l);
                }
                hashSet.remove(inputArray[l]);
                hashSet.add(inputArray[r]);
                 //a
                l++;  //l=1
                r++; //r=3
            }
            if(r==str.length()-1)
            {
                l++;
            }
        }

        return newStr;
    }

    public static String printNonRepeatingSeq_SlidingWindow1(String str) {
        String res="";
        int left=0, right=0;
        int max_length = Integer.MIN_VALUE;
        Set<Character> charSet = new HashSet();

        for(right=0; right<str.length(); right++)
        {
            char ch= str.charAt(right);
            if(!charSet.contains(ch)) //if the char is not seen/repeating
                charSet.add(ch);
            else //char is repeating: store the result, delete the char from the hashset
            {
                if(right-left > max_length) {
                    res = str.substring(left, right); //endIndex is exclusive
                    max_length = right-left;
                }
                if(left<right && str.charAt(left) != ch || str.charAt(right-1) == ch || str.charAt(left+1) == ch)
                {
                    charSet.remove(ch);
                    left++;
                }
                /*if(left<right && str.charAt(right-1) == ch)
                {
                    charSet.remove(ch);
                    left++;
                }*/
                left++;
            }
        }
        //After right traverses the whole string
        if(str.length() - left > max_length)
            res = str.substring(left, str.length());
        return res;
    }
    public static void main(String[] args)
    {
        //abcadefc
        //zbaebqp
        //abacdb
        //pwwkew
        //aab
        String str = "aab";
        //String newStr = printNonRepeatingSeq(str);
        //String newStr = printNonRepeatingSeq_SlidingWindow(str);
        String newStr = printNonRepeatingSeq_SlidingWindow1(str);
        System.out.println("Longest non-repeating sequence : "+newStr);
        System.out.println("Longest non-repeating sequence length : "+newStr.length());

        //List<List<Integer>> list = new ArrayList<Integer>();

        List<Integer> list1 = new ArrayList<Integer>();

        List<List<Integer>> lists;
        lists = new ArrayList<List<Integer>>();

    }

}
