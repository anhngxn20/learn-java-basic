public class Demo {
    public static void main(String[] args) {
        int j;
        try {
            j = 18 / 0;
            System.out.println(j);
        } catch (Exception e) {
            System.out.println("Wrong calculation");
        }
    }
}
