public class ArrayTest{
	
		public static void main(String[] args)
		{
			int[] array = new int[3];
			int[] array1 = new int[3];
			int[] array2 = array;
			array[0] = 0;
			array[1] = 1;
			array[2] = 2;
			array1[0] = 0;
			array1[1] = 1;
			array1[2] = 2;
			System.out.println("length = " + array.length);
			if(array.equals(array1))
				System.out.println("array equal array1");
			if(array.equals(array2))
				System.out.println("array equal array2");
		}
}