package array;
import java.util.*;
public class ArrayListText02 {
	public static void main(String[] args) {
		
	
	String[] arrData = {"yang","woo","young"};
	List<String> list = Arrays.asList(arrData); // Arrays.asList로 만든거는 사이즈 고정.
	System.out.println(list.get(0));
	System.out.println(list.get(2));
	System.out.println(list.size());
	List<String> list2 = new ArrayList<>(list);// << 이걸 만들어서 잘됨
	list2.add("yangdoll"); // Arrays.asList로 만들어서 더 추가못해줌. 에러나옴
	// list2.addAll(list); 이렇게해줘도됨
	System.out.println(list2.size());
	}
}
