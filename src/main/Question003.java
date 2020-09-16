package main;

class A{
	public A() {
		System.out.println("A ");
	}
}

class B extends A{
	public B() {
		System.out.println("B ");
	}
}


class Question003 extends B{

	public Question003() {
		System.out.println("C ");
	}
	
	public static void main(String[] args) {
		Question003 c = new Question003();
	}

}
