package zovlzhongguanhua.demo.springmvc;

public class Utils {

    public static <T> T newObject(String mathod, T values) {
        String s = mathod + ":" + (values == null ? "" : values);
        System.out.println("--------------------------------------->" + s);
        return values;
    }

    public static String newString(String mathod, Object values) {
        String s = mathod + ":" + (values == null ? "" : values);
        System.out.println("--------------------------------------->" + s);
        return s;
    }
}
