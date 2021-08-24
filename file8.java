{
	int acc_no;
	String name;
	Bank()
	{
		acc_no = 101;
		name = "Sai";
	}
	Bank(String name)
	{
		acc_no =102;
		this.name = name ;
	
	}
	Bank(int acc_no, String name)
	{
		this.acc_no =acc_no;
		this.name = name ;
		
	}
	void display()
	{
		System.out.println("account number = "+ acc_no);
		System.out.println("name = "+ name );
	}
}


public class file8 {

	public static void main(String[] args) {
		Bank obj = new Bank ();
		obj.display();
		Bank obj2 = new Bank("raju ");
		obj2.display();	
		Bank obj3 = new Bank(122,"vikky");
		obj3.display();
		
	}
}
