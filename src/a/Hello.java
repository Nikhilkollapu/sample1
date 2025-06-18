package a;

//import jdk.internal.org.jline.terminal.TerminalBuilder.SystemOutput;



abstract class A
{
	abstract void m();
	void c()
	{
		System.out.println("hello");
	}

}
class B extends A
{
	void m()
	{
		System.out.println("hello m");
	}
}
class Hello
{
	public static void main(String args[])
	{
		B obj=new B();
		obj.m();
		obj.c();
	}
}

