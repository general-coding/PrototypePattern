import java.util.HashMap;

public class CarPrototypeMgr {
	static HashMap<String, Prototype> carMap = new HashMap<String, Prototype>();
	
	public static CarPrototypeMgr getInstance(){
			return new CarPrototypeMgr();
	}
	
	public void addCar(String key, Prototype p){
		carMap.put(key, p);
	}
	
	public Prototype getCar(String key){
		return carMap.get(key);
	}
}