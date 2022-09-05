package Questions;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.HashMap;

public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int longestLength = 0;
        int startIndex = 0;
        int tempLength=0;
        char[] inputStr = s.toCharArray();

        HashMap<Character, Boolean> lookup = new HashMap<>();

        for(int i=0; i<inputStr.length; i++){

            char temp = inputStr[i];
            if(lookup.get(temp)==null){
                lookup.put(temp,true);
                tempLength++;
                System.out.println(inputStr[i]+ ":"+ i + ":" + tempLength);
            }
            else {
                if(longestLength<tempLength) {
                    longestLength = tempLength;
                }
                tempLength=0;
                System.out.println(lookup);
                lookup.clear();
                System.out.println(lookup);
//                startIndex++;
                System.out.println("StartIndex: " + startIndex);
                i=startIndex;
                startIndex++;
            }

            if(i==inputStr.length-1){
                System.out.println(longestLength);
                System.out.println(tempLength);
                if(longestLength<tempLength) {
                    longestLength = tempLength;
                }
            }
        }
        return longestLength;
    }

    public static void main(String[] args) {
        LongestSubstring longestSubstring = new LongestSubstring();
        System.out.println(longestSubstring.lengthOfLongestSubstring("abcabcdbb"));
    }
}
