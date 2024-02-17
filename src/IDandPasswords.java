import java.util.HashMap;

public class IDandPasswords {
	
	HashMap<String,String> logininfo = new HashMap<String, String>();
	
	 IDandPasswords() {
		logininfo.put("Kasty","jeanie");
		logininfo.put("Jeanie","motu");
		logininfo.put("Motu","JEANIE");
		
		
	}
	 	protected HashMap<String, String> getLogininfo() {
			return logininfo;
		}
}
