class Shehan
{
	int x;
	int y;
}

class Sandeepa
{
	static void method1()
	{
		System.out.println("static methods can be called without creating object");
	}

	public void method2()
	{
		System.out.println("public methods can be called only with creating object");
	}
	public static void main(String[] args)
	{
		Sandeepa obj_one= new Sandeepa();
		Shehan obj_two= new Shehan();

		method1();
		obj_one.method2();
		


	}
}