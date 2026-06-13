import java.util.Arrays;
class A 
{
    public int closest_sum(int a[],int target)
    {
        Arrays.sort(a);
        int n=a.length;
        int closestSum = Integer.MAX_VALUE/2;


        for (int i=0;i<n-2;i++)
        {
            int left =i+1;
            int right =n-1;

            while (left <right)
            {
                int sum=a[i]+a[left]+a[right];

                if (Math.abs(target-sum) < Math.abs(target-closestSum))
                {
                    closestSum=sum;
                }
                if (sum==target)
                {
                    return sum;
                }
                else if (sum<target)
                {
                    left ++;
                }
                else 
                {
                    right --;
                }
            }
        }
            return closestSum;

    }
}


class triplets_sum_closest_toTarget
{
    public static void main (String args[])
    {
        A r=new A ();
    int a[]={-1,2,1,-4};
    int target =1;


       System.out.println(r.closest_sum(a,target));
    }
}