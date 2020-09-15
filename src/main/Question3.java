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


class Question3 extends B{

	public Question3() {
		System.out.println("C ");
	}
	public static void main(String[] args) {
		Question3 c = new Question3();
	}

}
