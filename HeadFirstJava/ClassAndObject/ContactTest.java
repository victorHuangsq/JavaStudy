public class ContactTest{
	
	public static void main(String[] args)
	{
			Contact Tom = new Contact();
			Contact Jerry = new Contact();
			Tom.SetName("Tom");
			Jerry.SetName("Jerry");
			System.out.println(Tom.GetName());
			System.out.println(Jerry.GetName());
	}

}