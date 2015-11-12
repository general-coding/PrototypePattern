import java.util.HashMap;

public class DocumentPrototypeMgr {

	static HashMap<String, Prototype> documentMap = new HashMap<String, Prototype>();

	protected DocumentPrototypeMgr(){
		
	}

	public static DocumentPrototypeMgr getInstance() {
		return new DocumentPrototypeMgr();
	}

	public void addDocument(String key, Prototype p) {
		documentMap.put(key, p);
	}

	public Prototype getDocument(String key) {
		return documentMap.get(key);
	}
}
