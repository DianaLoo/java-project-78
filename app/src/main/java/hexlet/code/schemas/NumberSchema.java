package hexlet.code.schemas;

import java.util.Objects;

public final class NumberSchema extends BaseSchema<Integer> {
    public NumberSchema required() {
        addValidation("required", Objects::nonNull);
        return this;
    }

    public NumberSchema positive() {
        addValidation("positive", object -> object > 0);
        return this;
    }

    public NumberSchema range(int begin, int end) {
        addValidation("range", object -> object >= begin && object <= end);
        return this;
    }
}
