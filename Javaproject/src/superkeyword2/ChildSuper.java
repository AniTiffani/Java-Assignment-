package superkeyword2;

public class ChildSuper extends ParentSuper{
	int n1;
	public ChildSuper(int num)
	{
		n1=num;
		super.n1=num;
		//display();
		//super.display();
	}
public void display()
{
	super.display();
System.out.println("Child Number: "+n1);	
System.out.println("Parent number: "+super.n1);
}
	public static void main(String[] args) {
		ChildSuper obj=new ChildSuper(12);
		obj.display();
		//obj.displaychild();
		
	}

}
