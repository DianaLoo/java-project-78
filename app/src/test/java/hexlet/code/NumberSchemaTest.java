package hexlet.code;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NumberSchemaTest {

    @Test
    void requiredTest() {
        var schema = new NumberSchema();
        Assertions.assertFalse(schema.required().isValid(null));
    }

    @Test
    void positiveTest() {
        var schema = new NumberSchema();
        Assertions.assertTrue(schema.positive().isValid(10));
        Assertions.assertFalse(schema.positive().isValid(-10));
        Assertions.assertFalse(schema.positive().isValid(0));
    }

    @Test
    void rangeTest() {
        var schema = new NumberSchema().range(5, 10);
        Assertions.assertTrue(schema.isValid(5));
        Assertions.assertTrue(schema.isValid(10));
        Assertions.assertFalse(schema.isValid(3));
        Assertions.assertFalse(schema.isValid(12));
    }
}
