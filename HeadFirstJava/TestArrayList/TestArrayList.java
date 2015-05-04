import java.util.ArrayList;
public class TestArrayList{

	public static void main(String[] args)
	{
		int i = 0;
		int size = 5;
		String value = "six";
		MyStack mystack = new MyStack();
		ArrayList<String> arr = new ArrayList<String>();
		// 往ArrayList添加5个元素
		for(i=0; i<5; i++)
		{
			String str = new String();
			str = String.valueOf(i);	// 讲int转换为String
			arr.add(str);	
		}
		
		mystack.ChangeListToStack(arr);
		
		// 打印ArrayList原始的元素顺序
		System.out.println("The original ArrayList");
		for(String name : arr)
		{
			System.out.println(" " + name);
		}
		System.out.println(" ");
		
		// 从Stack中pop出一个元素
		value = mystack.StackPop();
		System.out.println("The pop value from ArrayList is " + value);
		System.out.println(" ");
		
		// 往Stack中push String为"5"的元素
		value = "5";
		mystack.StackPush(value);
		
		System.out.println("The original ArrayList");
		for(String name : arr)
		{
			System.out.println(" " + name);
		}
	}
}