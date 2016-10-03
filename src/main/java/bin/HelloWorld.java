package bin;

public class HelloWorld {

    private static final String getHelloString() {
        return "hello";
    }

    private static final String getWorldString() {
        return "world";
    }

    public static void main(String[] args) {
        System.out.println(getHelloString() + " " + getWorldString());
    }
}
