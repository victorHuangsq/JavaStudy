import java.util.ArrayList;
public class TestArrayList{

	public static void main(String[] args)
	{
		int i = 0;
		int size = 5;
		String value = "six";
		MyStack mystack = new MyStack();
		ArrayList<String> arr = new ArrayList<String>();
		// ��ArrayList���5��Ԫ��
		for(i=0; i<5; i++)
		{
			String str = new String();
			str = String.valueOf(i);	// ��intת��ΪString
			arr.add(str);	
		}
		
		mystack.ChangeListToStack(arr);
		
		// ��ӡArrayListԭʼ��Ԫ��˳��
		System.out.println("The original ArrayList");
		for(String name : arr)
		{
			System.out.println(" " + name);
		}
		System.out.println(" ");
		
		// ��Stack��pop��һ��Ԫ��
		value = mystack.StackPop();
		System.out.println("The pop value from ArrayList is " + value);
		System.out.println(" ");
		
		// ��Stack��push StringΪ"5"��Ԫ��
		value = "5";
		mystack.StackPush(value);
		
		System.out.println("The original ArrayList");
		for(String name : arr)
		{
			System.out.println(" " + name);
		}
	}
}