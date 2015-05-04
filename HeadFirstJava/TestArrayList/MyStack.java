import java.util.ArrayList;

public class MyStack {
	
	private int StackSize;
	private ArrayList<String> ArrList;
	
	public void ChangeListToStack(ArrayList<String> arr)
	{
		ArrList = arr;	
	}
	
	public String StackPop()
	{
		String ret = "";
		ret = ArrList.get(0);	// 返回起始位置的元素
		return ret;	
	}
	
	public void StackPush(String str)
	{
		ArrList.add(0, str);	// 在list的起始位置插入元素	
	}
	
}