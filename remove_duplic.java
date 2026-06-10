class A 
{
public int remove_duplicate(int a[])
{
	if (a.length==0)
    {
        return 0;
    }
	int idx=1;
for (int i=1;i<a.length;i++)
{
	if (a[i] !=a[i-1])
{
	a[idx]=a[i];
	idx++;
}
}
return idx;
}
}

public class remove_duplic
{
public static void main (String args[])
{
    A r = new A();
	int a [] ={5,5,6,6,6,7,7,8,8,9,9,9};
	System.out.println(r.remove_duplicate(a));
}
}