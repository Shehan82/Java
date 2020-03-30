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

final class class1
{
	int x;
}

// class class2 extends class1
// {
// 	int y=x;
// }

abstract class class2
{
	int b=20;
}

class class3 extends class2
{
	int x=b;
	//System.out.println(x);
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
		class3 boo= new class3();
		print(boo.x);

	}
}