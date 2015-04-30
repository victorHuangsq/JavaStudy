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
		
		// 普通版for循环
		System.out.println("Standard for statement:");
		for(i=0; i<nameArray.length; i++)
		{
			System.out.println("StringName: " + nameArray[i]);
			number = Integer.parseInt(numArray[i]);
			System.out.printf("IntNum: %d\n",  number++);
			
			// 不能这么做，因为Integer.parseInt()返回的是一个值而不是变量，无法进行++操作
			//System.out.printf("IntNum: %d\n", (Integer.parseInt(numArray[i]))++);
		}
		
		System.out.println();
		
		// 加强版for循环
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