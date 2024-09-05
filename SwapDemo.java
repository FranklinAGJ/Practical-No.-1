class Swap
{
	 int var1;
	 int var2;
	
	public void setValue (int x, int y)
	{
		var1 = x;
		var2 = y;
	}

	public int displayValue()
	{ 

		System.out.println(" var1 = " + var1);
 		System.out.println(" var2 = " + var2);
		return 0;
	}
	public void swapValue()
	{ 
		 
		int temp=var1;
		var1=var2;
		var2=temp;
		
	}
}

 public class SwapDemo
{
	public static void main(String[]args)
	{
		Swap object=new Swap();
		int x=Integer.parseInt(args[0]);
		int y=Integer.parseInt(args[1]);
		object.setValue(x,y);
		
		
		object.displayValue();
		object.swapValue();
		object.displayValue();
	}
}