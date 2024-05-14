package uts;

public class kata1 {     //A needle in the Haystack

    public static String findNeedle(Object[] haystack) {
        for (int i = 0; i < haystack.length; i++) {
            if ("needle".equals(haystack[i])) {
                return "found the needle at position " + i;
            }
        }
        return "needle not found"; 
    }

    public static void main(String[] args) {
        Object[] haystack = {"hay", "junk", "hay", "hay", "moreJunk", "needle", "randomJunk"};
        System.out.println(findNeedle(haystack)); 
    }
}
