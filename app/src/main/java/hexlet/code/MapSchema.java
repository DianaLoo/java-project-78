package hexlet.code;

import java.util.Map;
import java.util.Objects;

public class MapSchema extends BaseSchema<Map<?, ?>> {

    public MapSchema required() {
        addValidation("required", Objects::nonNull);
        return this;
    }
    public MapSchema sizeof(int size) {
        addValidation("sizeof", map -> map.size() == size);
        return this;
    }
    public MapSchema shape(Map<String, BaseSchema<String>> schemas) {
        addValidation(
                "shape", map -> {
                    return schemas.entrySet().stream().allMatch(e -> {
                        String key = e.getKey();
                        BaseSchema<String> schema = e.getValue();
                        return map.containsKey(key) && schema.isValid((String) map.get(key));
                    });
                }
        );
        return this;
    }
}
