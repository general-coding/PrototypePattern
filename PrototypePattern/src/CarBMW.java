public class CarBMW implements Prototype {
	private String make;
	private String model;

	public CarBMW() {
		make = "BMW";
		model = "2015";
	}

	@Override
	public Prototype clone() {
		return new CarBMW();
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	public void display(){
		System.out.println("I am " + this.make + " " + this.model);
	}
}