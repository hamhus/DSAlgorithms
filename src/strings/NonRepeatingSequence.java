package strings;

import java.util.HashSet;

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

    public static void main(String[] args)
    {
        //abcadefc
        String str = "abacdb";

        //String newStr = printNonRepeatingSeq(str);

        String newStr = printNonRepeatingSeq_SlidingWindow(str);
        System.out.println("Longest non-repeating sequence : "+newStr);
        System.out.println("Longest non-repeating sequence length : "+newStr.length());

    }

}
