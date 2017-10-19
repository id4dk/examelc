package generic;

public class GenericBox<B,J> {
	int age;
	B var1;
	J var2;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public B getVar1() {
		return var1;
	}
	public void setVar1(B var1) {
		this.var1 = var1;
	}
	public J getVar2() {
		return var2;
	}
	public void setVar2(J var2) {
		this.var2 = var2;
	}
}
