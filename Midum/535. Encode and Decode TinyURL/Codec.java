import java.util.HashMap;
import java.util.Map;

public class Codec {
    Map<String, String> codeDb = new HashMap<>(), urlDp = new HashMap<>();
    static final String chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        if (urlDp.containsKey(longUrl)) {
            return urlDp.get(longUrl);
        }
        char [] c = new char[4];
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {

    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));