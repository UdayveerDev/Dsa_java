//target sum problem using two pointer technique 

class A 
{
public static boolean target(int a[],int tar)
{
int i=0;
int j=a.length-1;

while (i<j){

if (a[i]+a[j]==tar)
{
return true;
}
else if (a[i]+a[j]<tar)
{
i++;
}
else 
{
j--;
}
}
return false;
}
}

 public class Target_sum
{
public static void main (String []args)
{
int a[]={1,2,3,4,5,6,7};
int tar=7;
System.out.println(A.target(a,tar));

}
}
