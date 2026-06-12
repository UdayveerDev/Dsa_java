import java.util.*;

class A {
   
    public List<List<Integer>> triplet_sum(int a[]) {
        List<List<Integer>> result = new ArrayList<>();
        int n = a.length;
        
        
        Arrays.sort(a); 

        for (int i = 0; i < n - 2; i++) {
           
            if (i > 0 && a[i] == a[i - 1]) continue;

            
            int left = i + 1;
            int right = n - 1;
            int sum = -1 * a[i]; 

            while (left < right) {
                int s = a[left] + a[right];
                
                if (s == sum) {
                   
                    result.add(Arrays.asList(a[i], a[left], a[right]));
                    
                    left++;
                    right--; 

                    
                    while (left < n && a[left] == a[left - 1]) {
                        left++;
                    }
                    while (right >= 0 && a[right] == a[right + 1]) {
                        right--; 
                    }
                } 
                else if (s < sum) {
                    left++;
                } 
                else {
                    right--; 
                }
            }
        }
       
        return result; 
    }
}

class triplets_sum_zero {
    public static void main(String[] args) {
        int a[] = {-1, 0, 1, -1, 4, 2};
        A r = new A();
        java.util.List<java.util.List<Integer>> res = r.triplet_sum(a);
        System.out.println(res);
    }
}