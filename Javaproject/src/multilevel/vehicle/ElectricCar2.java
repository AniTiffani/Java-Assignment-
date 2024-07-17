package multilevel.vehicle;
//child class 2

public class ElectricCar2 extends Car1 {
	
   public void display()
   {
	   
	   System.out.println("Car no: "+carno);
	   System.out.println("Car Name: "+carname);
		System.out.println("Car Colour: "+colour);
   }
   public static void main(String[] args)
   {
	   ElectricCar2 objChild2=new ElectricCar2();
	   objChild2.vehicleDetails("Figo Aspire","White");
	   
	   objChild2.carDetails(4541);
	   objChild2.display();
   }
}
