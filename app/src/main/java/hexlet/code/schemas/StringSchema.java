package hexlet.code.schemas;


public final class StringSchema extends BaseSchema<String> {
    public StringSchema required() {
        addValidation("required", object -> !(object.equals("")));
        return this;
    }

    public StringSchema minLength(int length) {
        addValidation("minLength", object -> object.length() >= length);
        return this;
    }

    public StringSchema contains(String string) {
        addValidation("contains", object -> object.contains(string));
        return this;
    }
}
