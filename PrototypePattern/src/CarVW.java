public class CarVW implements Prototype {
	private String make;
	private String model;

	public CarVW() {
		make = "VW";
		model = "2015";
	}

	@Override
	public Prototype clone() {
		return new CarVW();
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