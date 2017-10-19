package array;
import java.util.*;
public class ArrayListText01 {
	public static void main(String[] args) {
		List list = new ArrayList();
		 
		/*System.out.println( list.size() );
		list.add("yangdoll");
		System.out.println( list.size() );
		list.add("yangdoll");
		System.out.println( list.size() );
		list.add(127);
		System.out.println( list.size() );*/
		
		
		for(int i=0; i < 10; i+=2){
			list.add(i+1);
			list.add("ȫ�浿"+i);
		}
		System.out.println(list.size());
		
		for(int i =1; i < 10; i+=2){
			System.out.println(list.get(i));
		}
	}

	
	
}
