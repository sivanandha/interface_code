package com.example;

interface WaterFun {
	String color = "blue";

	void fillup();
	void flowwater();
}

public class InterfaceFun implements WaterFun {

	public static void main(String[] args) {
		System.out.println(color);
		InterfaceFun i = new InterfaceFun();
		i.fillup();
		i.flowwater();

	}

	@Override
	public void fillup() {
		System.out.println("water is fillup quickely");

	}

	@Override
	public void flowwater() {
		System.out.println(" water bflow very fastly");
		
	}

}
