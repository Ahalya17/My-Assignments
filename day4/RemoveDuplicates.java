package week3.day4;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		String[] a=text.split(" ");
		
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i].equalsIgnoreCase(a[j]))
					a[j]="";
			}
		}
	
	for(int i=0;i<a.length;i++)
	System.out.print(a[i]+" ");
	}

}
