package arraytest;


public class MyArrayList {
	Object[] arrData = null; // object�迭�������
	int capacity = 0; //���������� capacity 
	int size = 0; 	  //���������� size	
	public MyArrayList(){ //MyArrayList �޼ҵ� ����
		this.capacity =10; //capacity�� 10�־���
		arrData = new Object[this.capacity]; //arrData�� capacity�� �־���
	}
	public MyArrayList(int capacity){	//MyArrayList 
		if(capacity<0){
			throw new IllegalArgumentException("��ȿ���� �ʴ� ���Դϴ�." + capacity);
		}
		
		this.capacity = capacity;
		arrData = new Object[this.capacity];
	}
	public boolean add(Object data){ //add�޼ҵ�����ϰ� data��������
		arrData[size] =data;	//arrData[size]������ ��ݸ��� data�����־���
		size++; //size 1������
		return true;
	}
	public Object get(int index){	
		return arrData[index];
	}
	
	public int size(){
		return size;
	}
	public Object remove(){
		
		for(int i = 0; i <arrData.length; i--){
			int k = (int) arrData[i];
			System.out.println(k);
		}
		return remove();
	}
	public Object remove02(){
		
		return remove02();
	}
	public Object remove(int index){
		return remove(index);
	}
	public boolean remove(Object o){
		return remove(o);
	}
	public void clear(){
		int size =0;
		for(int i =0; i <arrData.length; i++){
			
		}
		
	}
	public void trimToSize(){
		
	}
	public int indexof(Object o){
		return indexof(o);
	}
	public boolean contains(Object o){
		return contains(o);
	}
	public void ensureCapacity(){
	
	}
}
//int size(); �޼��� �����
//remove�޼��常���(2��)
//object remove(int index)
//boolean remove(Object o)


//void clear()�޼ҵ� �����
//void trimToSize() �����
//int indexof(Object o) �޼ҵ� �����
//boolean contains(Object o) �޼ҵ� �����

//void ensureCapacity�޼ҵ常���