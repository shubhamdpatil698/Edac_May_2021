package dacsession;

//private -> default -> protected -> public

class A{
	int var1 = 100;
	int var2 = 200;
	void m1() {System.out.println("A:m1()");}
	void m2() {System.out.println("A:m2()");}
	//void m4() {System.out.println("A:m4()");}
	void m5() {System.out.println("A:m5()");}
	
	void m6(int x,int y) {
		System.out.println("A:m6(int,int)");
	}
	
	void m6(int p, float q) {
		System.out.println("A:m6(int,foat)");
	}
	
	
}

class B extends A{
	int var1=300;
	int var3 = 400;
	
	void m1() {System.out.println("B:m1()");}
	void m2() {System.out.println("B:m2()");}
	void m3() {System.out.println("B:m3()");}
	
	void m6(int p, double q) {
		System.out.println("B:m6(int,double)");
	}
}


class C extends B{
	int var1 = 500;
	int var4 = 600;
	
	void m1() {System.out.println("C:m1()");}
	void m2() {System.out.println("C:m2()");}
	void m4() {System.out.println("C:m4()");}
}

public class Demo {
	
	public static void main(String[] args) {
		A avar = new B();// upcasting => object of child is assigned to parent reference
