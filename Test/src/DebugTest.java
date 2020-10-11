import java.util.HashMap;

/**
 * @ClassName DebugTest
 * @Description TODO
 * @Author Sun Jian
 * @Date 2020/10/11 19:07
 * @Version 1.0
 **/
public class DebugTest {
    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            System.out.println("i = " + i);
        }

        HashMap<String, String> map = new HashMap<>();

        map.put("name", "SJ");
        map.put("age", "20");
        map.put("school", "Peking University");
        map.put("major", "Chinese");

        String age = map.get("age");
        System.out.println("age1 = " + age);
        System.out.println("age2 = " + map.get("age"));

        map.remove("age");
        System.out.println("map = " + map);
        
    }
}
