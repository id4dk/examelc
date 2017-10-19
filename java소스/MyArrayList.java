package arraytest;


public class MyArrayList {
	Object[] arrData = null; // object배열만들었음
	int capacity = 0; //정수형변수 capacity 
	int size = 0; 	  //정수형변수 size	
	public MyArrayList(){ //MyArrayList 메소드 생성
		this.capacity =10; //capacity에 10넣어줌
		arrData = new Object[this.capacity]; //arrData에 capacity값 넣어줌
	}
	public MyArrayList(int capacity){	//MyArrayList 
		if(capacity<0){
			throw new IllegalArgumentException("유효하지 않는 값입니다." + capacity);
		}
		
		this.capacity = capacity;
		arrData = new Object[this.capacity];
	}
	public boolean add(Object data){ //add메소드생성하고 data변수생성
		arrData[size] =data;	//arrData[size]변수에 방금만든 data변수넣어줌
		size++; //size 1씩증가
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
//int size(); 메서드 만들기
//remove메서드만들기(2개)
//object remove(int index)
//boolean remove(Object o)


//void clear()메소드 만들기
//void trimToSize() 만들기
//int indexof(Object o) 메소드 만들기
//boolean contains(Object o) 메소드 만들기

//void ensureCapacity메소드만들기