package QuantityMeasurement.QuanityMeasurementApp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FeetMeasurementTest {

    // UC1 - Feet Tests
    @Test
    void testFeetEquality_SameValue() {
    FeetMeasurement.Feet f1 = new FeetMeasurement.Feet(1.0);
        FeetMeasurement.Feet f2 = new FeetMeasurement.Feet(1.0);
        assertTrue(f1.equals(f2));
    }

    @Test
    void testFeetEquality_DifferentValue() {
        assertFalse(
            new FeetMeasurement.Feet(1.0)
                .equals(new FeetMeasurement.Feet(2.0))
        );
    }

    @Test
    void testFeetEquality_Null() {
        assertFalse(new FeetMeasurement.Feet(1.0).equals(null));
    }

    @Test
    void testFeetEquality_TypeMismatch() {
        assertFalse(new FeetMeasurement.Feet(1.0).equals("abc"));
    }

    @Test
    void testFeetEquality_SameReference() {
        FeetMeasurement.Feet f = new FeetMeasurement.Feet(1.0);
        assertTrue(f.equals(f));
    }

    // UC2 - Inch Tests
    @Test
    void testInchEquality_SameValue() {
        assertTrue(
            new FeetMeasurement.Inches(5.0)
                .equals(new FeetMeasurement.Inches(5.0))
        );
    }

    @Test
    void testInchEquality_DifferentValue() {
        assertFalse(
            new FeetMeasurement.Inches(5.0)
                .equals(new FeetMeasurement.Inches(6.0))
        );
    }

    @Test
    void testInchEquality_Null() {
        assertFalse(new FeetMeasurement.Inches(5.0).equals(null));
    }

    @Test
    void testInchEquality_TypeMismatch() {
        assertFalse(new FeetMeasurement.Inches(5.0)
                .equals(new FeetMeasurement.Feet(5.0)));
    }

    @Test
    void testInchEquality_SameReference() {
        FeetMeasurement.Inches i = new FeetMeasurement.Inches(5.0);
        assertTrue(i.equals(i));
    }
}
