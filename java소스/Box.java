package generic;

public class Box {
	private int age; // 정수만 저장할 수 있는 필드
	private Object var1; // 모든 자료를 저장할 수 있는 필드
	private Object var2; // 모든 자료를 저장할 수 있는 필드
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Object getVar1() {
		return var1;
	}
	public void setVar1(Object var1) {
		this.var1 = var1;
	}
	public Object getVar2() {
		return var2;
	}
	public void setVar2(Object var2) {
		this.var2 = var2;
	}
	
}
