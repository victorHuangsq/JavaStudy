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
		ret = ArrList.get(0);	// ������ʼλ�õ�Ԫ��
		return ret;	
	}
	
	public void StackPush(String str)
	{
		ArrList.add(0, str);	// ��list����ʼλ�ò���Ԫ��	
	}
	
}