public class CarAudi implements Prototype{
	private String make;
	private String model;

	public CarAudi() {
		make = "Audi";
		model = "2015";
	}

	@Override
	public Prototype clone() {
		return new CarAudi();
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

	public void display() {
		System.out.println("I am " + this.make + " " + this.model);
	}
}
