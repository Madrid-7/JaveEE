package Madrid.model;

public class DuckFactory {

    public static Duck create() {
        Duck d = new Duck();
        d.setAge(3);
        d.setName("DuckF");
        return d;
    }

    public Duck create2() {
        Duck d = new Duck();
        d.setAge(3);
        d.setName("DuckF");
        return d;
    }
}
