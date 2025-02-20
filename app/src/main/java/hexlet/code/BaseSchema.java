package hexlet.code;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

public abstract class BaseSchema<T> {
    private Map<String, Predicate<T>> validations = new HashMap<>();
    protected void addValidation(String key, Predicate<T> validation) {
        this.validations.put(key, validation);
    }
    public boolean isValid(T object) {
        if (validations.containsKey("required") && object == null) {
            return false;
        }
        if (object == null) {
            return true;
        }
        for (Predicate<T> value : this.validations.values()) {
            if (!value.test(object)) {
                return false;
            }
        }
        return true;
    }
}
