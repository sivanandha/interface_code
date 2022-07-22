package com.example;

interface Printa {
	public void run();
}

abstract  class Printab {
	abstract void show();
}

class Test extends Printab {

	public void show() {
		System.out.println(" world");

	}
}
	class Test1 extends Printab{
	public void show() {
		System.out.println(" hello");

	}}
	class TestInterface3 {
	public static void main(String[] args) {
		Test1 t1=new Test1();
		Test t=new Test();
		t.show();
		t1.show();

	}

	
	}


