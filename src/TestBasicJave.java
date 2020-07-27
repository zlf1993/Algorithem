public class TestBasicJave {
    public static void main(String[] args) {
        String s = new String("wo.ai.ni");
        String[] strArray = s.split("\\.");
        for (String s1 : strArray) {
            System.out.println(s1);
        }
    }
}
