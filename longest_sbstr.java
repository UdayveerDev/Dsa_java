//Longest Substring with K Uniques
import java.util.*; 
class uday {
    public int long_sbstr(String s, int k) {
        int n = s.length();
        int left = 0;
        int right = 0;
        int max_len = -1; 

        Map<Character, Integer> map = new HashMap<>();

        while (right < n) {
            char rightChar = s.charAt(right);

            
            map.put(rightChar, map.getOrDefault(rightChar, 0) + 1);

           
            while (map.size() > k) {
                char leftChar = s.charAt(left);

                map.put(leftChar, map.get(leftChar) - 1);

                if (map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }
                left++;
            }
            
            if (map.size() == k) { 
                int len = right - left + 1;
                max_len = Math.max(max_len, len); 
            }
            right++;
        }
        return max_len;
    }
} 

class longest_sbstr {
    public static void main(String[] args) {
        String s = "abababnkdjhjh";
        int k = 3;
        uday r = new uday();
        System.out.println("longest length of substring with k unique is: " + r.long_sbstr(s, k));
    }
}