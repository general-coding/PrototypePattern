public class DocConfProc implements Prototype {
	private String name;
	private String year;

	public DocConfProc() {
		name = "Conference Proceedings";
		year = "2015";
	}

	@Override
	public Prototype clone() {
		return new CarBMW();
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public String getyear() {
		return year;
	}

	public void setyear(String year) {
		this.year = year;
	}

	public void display() {
		System.out.println("I am " + this.name + " " + this.year);
	}
}
