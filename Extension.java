class Extension
{
	public static void main(String[] arg)
	{
		String str;
		System.out.print("Enter a string:");
		str=new java.util.Scanner(System.in).nextLine();
		System.out.println(str.substring(str.indexOf(".")+1,--null));
	}
}