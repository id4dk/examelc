package array;
import java.util.*;
public class ArrayListText02 {
	public static void main(String[] args) {
		
	
	String[] arrData = {"yang","woo","young"};
	List<String> list = Arrays.asList(arrData); // Arrays.asList�� ����Ŵ� ������ ����.
	System.out.println(list.get(0));
	System.out.println(list.get(2));
	System.out.println(list.size());
	List<String> list2 = new ArrayList<>(list);// << �̰� ���� �ߵ�
	list2.add("yangdoll"); // Arrays.asList�� ���� �� �߰�������. ��������
	// list2.addAll(list); �̷������൵��
	System.out.println(list2.size());
	}
}
