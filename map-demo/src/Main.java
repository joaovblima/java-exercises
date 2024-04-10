import java.util.TreeMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, String> cookies = new TreeMap<>();

        cookies.put("username", "Maria");
        cookies.put("email", "maria@maria.com");
        cookies.put("phone", "778855422");

        cookies.remove("phone");
        cookies.put("email", "joao@joaopica.com");
        System.out.println("Contains phone? " + cookies.containsKey("phone"));
        System.out.println("Email: " + cookies.get("phone"));
        System.out.println("cokies: ");
        for(String key : cookies.keySet()) {
            System.out.println(key + ":" + cookies.get(key));
        }

    }
}