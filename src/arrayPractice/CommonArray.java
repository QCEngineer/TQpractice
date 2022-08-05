package arrayPractice;

import java.util.Scanner;

public class CommonArray {
	
	public void commonElement(int a[],int b[])
	{
		System.out.println("Common element are: ");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					System.out.println(a[i]+" ");
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter the first array ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int b[]=new int[n];
		System.out.println("enter the second array ");
		for(int i=0;i<b.length;i++)
		{
			b[i]=sc.nextInt();
		}
		CommonArray c=new CommonArray();
		c.commonElement(a, b);
		sc.close();
	}

}
