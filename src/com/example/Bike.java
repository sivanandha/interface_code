package com.example;

interface Inte
{
	void run();
}
class Cbshine implements Inte
{
	public void run()
	{
		System.out.println("this is my first interface ");
	}
}
class Honda implements Inte
{
	public void run()
	{
		System.out.println("this is my second interface ");
	}
}
public class Bike  {

	public static void main(String[] args) {
		Cbshine c=new Cbshine();
		Honda h=new Honda();
		c.run();
		h.run();
		

	}

}
