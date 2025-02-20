package hexlet.code;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StringSchemaTest {

    @Test
    void requiredTest() {
        var schema = new StringSchema();
        assertTrue(schema.isValid(null));
        assertFalse(schema.required().isValid(null));
        assertFalse(schema.required().isValid(""));
    }

    @Test
    void minLengthTest() {
        var schema = new StringSchema();
        assertTrue(schema.isValid(null));
        assertTrue(schema.minLength(10).isValid("what does the fox say"));
        assertFalse(schema.minLength(10).isValid("Hexlet"));
        assertTrue(schema.minLength(5).isValid(null));
    }

    @Test
    void containsTest() {
        var schema = new StringSchema();
        assertTrue(schema.isValid(null));
        assertTrue(schema.contains("wh").isValid("what does the fox say"));
        assertFalse(schema.contains("whatthe").isValid("what does the fox say"));
        assertTrue(schema.contains("wh").isValid(null));
    }
}
