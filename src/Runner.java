/**
 * Created by h205p2 on 8/31/17.
 */

import java.util.*;


public class Runner {

    //your main containing tests and output
    public static void main(String[] args) {
    }

    //your codingbat method here - must match
    // the method name from codingbat
    public boolean sleepIn(boolean weekday, boolean vacation) {

        if (vacation == true) {
            return true;
        }
        if (weekday == false) {
            return true;
        }
        else {
            return false;
        }

    }
    // next codingbat method here
    public String stringTimes(String str, int n) {
        String newStr = "";
        for (int i = 1; i <= n; i++) {
            newStr = newStr + str;
        }
        return newStr;
    }

    public String helloName(String name) {
        return "Hello " + name + "!";
    }

    public boolean firstLast6(int[] nums) {
        if (nums[0] == 6 || nums[(nums.length -1)] == 6) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public boolean closeFar(int a, int b, int c) {
        if (Math.abs(a-c) <= 1 && Math.abs(b-c) > 1 && Math.abs(b-a) > 1) {
            return true;
        }
        if (Math.abs(b-c) <= 1 && Math.abs(a-c) > 1 && Math.abs(b-a) > 1) {
            return true;
        }
        if (Math.abs(a-b) <= 1 && Math.abs(a-c) > 1 && Math.abs(b-c) > 1) {
            return true;
        }
        else {
            return false;
        }
    }

    public String doubleChar(String str) {
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            newStr += str.substring(i, i+1);
            newStr += str.substring(i, i+1);
        }
        return newStr;
    }

    public int countEvens(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]%2 == 0) {
                count++;
            }
        }
        return count;
    }

    public boolean cigarParty(int cigars, boolean isWeekend) {
        if (cigars >= 40 && cigars <= 60) {
            return true;
        }
        if (cigars >= 40 && isWeekend == true) {
            return true;
        }
        else {
            return false;
        }
    }

    public int countYZ(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if ((Character.isLetter(str.charAt(i)) && (str.charAt(i) == 'y'|| str.charAt(i) == 'z' || str.charAt(i) == 'Y' || str.charAt(i) == 'Z')) && !Character.isLetter(str.charAt(i+1))) {
                count++;
            }
            else {
                count += 0;
            }
        }
        return count;
    }
    public int[] fix34(int[] nums) {
        for (int i = 0; i < nums.length ; i++) {
            if (nums[i] == 3) {
                int saved = nums[i+1];
                nums[i+1] =4;
                for (int j = i+2; j < nums.length; j++) {
                    if (nums[j] == 4) {
                        nums[j] = saved;

                    }
                }
            }
        }
        return nums;
    }
}