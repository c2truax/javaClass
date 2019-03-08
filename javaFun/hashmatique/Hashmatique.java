import java.util.HashMap;
import java.util.Set;
public class Hashmatique {
    public static void main(String[] args) {

        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Showbiz", "Controlling my feelings far too long, Controlling my feelings far too long");
        trackList.put("Muscle Museum", "She had something to confess to, But you don't have the time");
        trackList.put("Fillip", "It's happening soon, it's happening soon, It's scent has been blowing in my direction");
        trackList.put("Falling Down", "I'm falling down, And 15 thousand people scream");

        String lyrics = trackList.get("Fillip");
        System.out.println("Lyrics: " + lyrics);
        
        Set<String> keys = trackList.keySet();
        for(String key : keys) {
            System.out.println("Song: " + key);
            System.out.println("Lyrics: " + trackList.get(key));    
        }
        
    }
}