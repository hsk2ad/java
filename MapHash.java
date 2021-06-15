import java.util.HashMap;
import java.util.Set;

public class MapHash {
	public static void main(String[] args) {
		HashMap<String, String> trackList = new HashMap<String, String>();
		trackList.put("Jess Glynne", "Hold my hand");
		trackList.put("Celtic woman", "You raise me up");
		trackList.put("Sarah Brightman", "Nella Fantasia");
		trackList.put("Cello", "Gabriel's oboe");
		
		System.out.println(trackList.get("Cello"));
		Set<String> keys = trackList.keySet();
		for(String key: keys) {
			System.out.println(key);
			System.out.println(trackList.get(key));
		}
	}
}
