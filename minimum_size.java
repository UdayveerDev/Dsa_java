class uday{
public int min_size (int [] nums,int target)
{
int n=nums.length;
int sum =0;
int res =Integer.MAX_VALUE;
int low =0;
int high=0;

while (high < n)
{
 sum =sum +nums[high];
while (sum>=target)
{
int len =high-low+1;
res =Math.min(res,len);
sum =sum-nums[low];
low ++;
}
high ++;

}
// edge case 
if (res ==Integer.MAX_VALUE)
{
    return 0;
}

else 
{
    return res ;
}
}
}

class minimum_size
{
public static void main (String [] args)
{
int nums []={1,4,4};
int target =4;
uday r= new uday();
System.out.println(r.min_size(nums,target));
}
}

