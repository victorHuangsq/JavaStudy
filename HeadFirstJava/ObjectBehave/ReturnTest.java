public class ReturnTest{

	public static void main(String[] args)
	{
		int[] value = new int[3];	// 传给ReturnCase()方法的对象引用变量（实参）
		int[] ret = new int[3];		// 存放从ReturnCase()方法返回的对象引用变量（返回值）
		value[0] = 1;				// 对象实例化
		value[1] = 2;
		value[2] = 3;
		ReturnTest test = new ReturnTest();
		ret = test.ReturnCase(value);
		System.out.printf("I get return value:%d, %d, %d from ReturnCase in main\n", ret[0], ret[1], ret[2]);
		System.out.printf("The current value:%d, %d, %d in main\n", value[0], value[1], value[2]);
	}

	int[] ReturnCase(int[] LocalValue)
	{
		int i = 0;
		System.out.printf("I get value:%d , %d, %d In ReturnCase\n", LocalValue[0], LocalValue[1], LocalValue[2]);
		for(i=0; i<LocalValue.length; i++)
			LocalValue[i] += 1;
		return LocalValue;	
	}
}