package com.example;

interface Drawable {
	void draw();
}
class Circle implements Drawable {

	public void draw() {
		System.out.println(" drwa the circle");

	}
}
class Rectangle implements Drawable {

	public void draw() {
		System.out.println("draw the reactangle");

	}
}
public class TestInterface1 {

	public static void main(String[] args) {
		Drawable d=new Circle();
		Drawable r=new Rectangle();
		d.draw();
		r.draw();
		
	}

}
