import java.util.Arrays;

class A 
{
	public int smallerSum(int a[],int target)
{
	Arrays.sort(a);
	int n=a.length;
	int count =0;
	for (int i=0;i<n-2;i++)
{
	int left =i+1;
	int right = n-1;
	
	while (left <right)
{
    int currentSum =a[i]+a[left]+a[right];
if (currentSum<target)
{
	count += right-left;
	left ++;
}
else if (currentSum >=target)
{
	right --;
}
}	
}
return count;
}
}

public class smaller_sum
{
	public static void main (String []args)
{
	int a[]={-1,-2,3,-4,2,4,5,-3};
	int target =5;
	A r=new A();
	System.out.println(r.smallerSum(a,target));
}
}
