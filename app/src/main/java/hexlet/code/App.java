package hexlet.code;

public class App {
    public static void main(String[] args) {
        var v = new Validator();
        var schema = v.string().required().minLength(5).contains("hex");
    }
}
