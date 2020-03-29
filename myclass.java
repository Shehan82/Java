class shehan
{
	static void print(String word)
	{
		System.out.println(word);
	}

	static int print(int num)
	{
		System.out.println(num);
		return num;
	}

	int x;
	
	public shehan(int y)
	{
		print("Hello i am the constructor");
		x=y;
	}

	

}

class myclass
{
	static int print(int num)
	{
		System.out.println(num);
		return num;
	}

	static void print(String word)
	{
		System.out.println(word);
	}

	public static void main(String[] args)
	{
		shehan obj=new shehan(200);
		print("hello");
		print(obj.x);

	}
}