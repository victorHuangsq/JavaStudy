public class TestForStatement{
	
	public static void main(String[] args)
	{
		int i = 0;
		int number = 0;
		String[] nameArray = new String[3];
		String[] numArray = new String[3];
		
		nameArray[0] = "zero";
		nameArray[1] = "one";
		nameArray[2] = "two";
		
		numArray[0] = "0";
		numArray[1] = "1";
		numArray[2] = "2";
		
		// ��ͨ��forѭ��
		System.out.println("Standard for statement:");
		for(i=0; i<nameArray.length; i++)
		{
			System.out.println("StringName: " + nameArray[i]);
			number = Integer.parseInt(numArray[i]);
			System.out.printf("IntNum: %d\n",  number++);
			
			// ������ô������ΪInteger.parseInt()���ص���һ��ֵ�����Ǳ������޷�����++����
			//System.out.printf("IntNum: %d\n", (Integer.parseInt(numArray[i]))++);
		}
		
		System.out.println();
		
		// ��ǿ��forѭ��
		System.out.println("More stronger for statement:");
		for(String name : nameArray)
		{
			System.out.println("StringName: " + name);
		}
		
		for(String num : numArray)
		{
			number = Integer.parseInt(num);
			System.out.printf("IntNum: %d\n", number++);
		}
	}
}