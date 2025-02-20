package hexlet.code;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class NumberSchemaTest {

    @Test
    void requiredTest() {
        var schema = new NumberSchema();
        assertTrue(schema.isValid(null));
        assertFalse(schema.required().isValid(null));
    }

    @Test
    void positiveTest() {
        var schema = new NumberSchema();
        assertTrue(schema.isValid(null));
        schema.positive();
        assertTrue(schema.isValid(10));
        assertFalse(schema.isValid(-10));
        assertFalse(schema.isValid(0));
        assertTrue(schema.isValid(null));
    }

    @Test
    void rangeTest() {
        var schema = new NumberSchema();
        assertTrue(schema.isValid(null));
        schema.range(5, 10);
        assertTrue(schema.isValid(5));
        assertTrue(schema.isValid(10));
        assertFalse(schema.isValid(3));
        assertFalse(schema.isValid(12));
        assertTrue(schema.isValid(null));
    }
}
