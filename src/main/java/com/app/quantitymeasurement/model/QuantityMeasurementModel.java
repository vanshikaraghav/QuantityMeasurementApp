package com.app.quantitymeasurement.model;
import com.app.quantitymeasurement.units.IMeasurable;

public class QuantityMeasurementModel<U extends IMeasurable> {

    private double value;
    private U unit;

    QuantityMeasurementModel(double value, U unit) {
        this.value = value;
        this.unit = unit;
    }

    public double getValue() {
        return value;
    }

    public U getUnit() {
        return unit;
    }
}