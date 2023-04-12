package com.test.oops;

interface Printable {
}

class M implements Printable {
	public void a() {
		System.out.println("a method");
	}
}

class Z implements Printable {
	public void b() {
		System.out.println("b method ");
	}
}

class Calls {
	void invoke(Printable p) {
		if (p instanceof M) {
			M a = (M) p;
			a.a();
		}
		if (p instanceof Z) {
			Z b = (Z) p;
			b.b();
		}
	}
}
	
class Test4 {
	public static void main(String[] args) {
		Printable p = new Z();
		Call c = new Call();
		c.invoke(p);
	}
}
