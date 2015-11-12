public class Client {
	static CarPrototypeMgr carPrototype;
	static DocumentPrototypeMgr docPrototype;

	static CarBMW carBMW1, carBMW2;
	static CarVW carVW1, carVW2;
	static CarAudi carAudi1, carAudi2;

	static DocBook docBook1, docBook2;
	static DocPeriodicals docPeriodicals1, docPeriodicals2;
	static DocConfProc docConfProc1, docConfProc2;

	static Prototype p;

	public static void main(String[] args) {
		// Create prototypes of the classes
		carPrototype = new CarPrototypeMgr();
		docPrototype = new DocumentPrototypeMgr();

		carBMW1 = new CarBMW();
		carVW1 = new CarVW();
		carAudi1 = new CarAudi();
		docBook1 = new DocBook();
		docPeriodicals1 = new DocPeriodicals();
		docConfProc1 = new DocConfProc();

		// Store these prototypes in the CarPrototypeMgr
		carPrototype.addCar("CarBMW1", carBMW1);
		carPrototype.addCar("CarVW1", carVW1);
		carPrototype.addCar("CarAudi1", carAudi1);
		docPrototype.addDocument("DocBook1", docBook1);
		docPrototype.addDocument("DocPeriodicals1", docPeriodicals1);
		docPrototype.addDocument("DocConfProc1", docConfProc1);

		// Clone the cars
		carBMW2 = (CarBMW) carPrototype.getCar("CarBMW1");
		carVW2 = (CarVW) carPrototype.getCar("CarVW1");
		carAudi2 = (CarAudi) carPrototype.getCar("CarAudi1");
		docBook2 = (DocBook) docPrototype.getDocument("DocBook1");
		docPeriodicals2 = (DocPeriodicals) docPrototype.getDocument("DocPeriodicals1");
		docConfProc2 = (DocConfProc) docPrototype.getDocument("DocConfProc1");

		// Before changing the values of the clones
		System.out.println("Before changing values of clones");
		carBMW2.display();
		carVW2.display();
		carAudi2.display();
		docBook1.display();
		docPeriodicals1.display();
		docConfProc1.display();

		// Change the values of clones
		carBMW2.setMake("BMW 3");
		carBMW2.setModel("2016");

		carVW2.setMake("VW Golf");
		carVW2.setModel("2016");

		carAudi2.setMake("Audi A4");
		carAudi2.setModel("2016");
		
		docBook2.setname("James Bond");
		docBook2.setyear("2016");
		
		docPeriodicals2.setname("Times");
		docPeriodicals2.setyear("2016");
		
		docConfProc2.setname("G8 Conference");
		docConfProc2.setyear("2016");

		// After changing values of the clones
		System.out.println("After changing values of clones");
		carBMW2.display();
		carVW2.display();
		carAudi2.display();
		docBook2.display();
		docPeriodicals2.display();
		docConfProc2.display();
	}
}
