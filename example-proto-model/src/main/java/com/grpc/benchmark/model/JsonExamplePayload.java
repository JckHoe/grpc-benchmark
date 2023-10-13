package com.grpc.benchmark.model;

public class JsonExamplePayload {
    public JsonExamplePayload() {
    }

    private int intField;
    private String stringField;
    private boolean boolField;
    private double doubleField;
    private byte[] bytesField;
    // Getters and Setters

    public int getIntField() {
        return intField;
    }

    public void setIntField(int intField) {
        this.intField = intField;
    }

    public String getStringField() {
        return stringField;
    }

    public void setStringField(String stringField) {
        this.stringField = stringField;
    }

    public boolean isBoolField() {
        return boolField;
    }

    public void setBoolField(boolean boolField) {
        this.boolField = boolField;
    }

    public double getDoubleField() {
        return doubleField;
    }

    public void setDoubleField(double doubleField) {
        this.doubleField = doubleField;
    }

    public byte[] getBytesField() {
        return bytesField;
    }

    public void setBytesField(byte[] bytesField) {
        this.bytesField = bytesField;
    }

}
