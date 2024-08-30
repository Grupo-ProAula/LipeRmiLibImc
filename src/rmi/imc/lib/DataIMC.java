package rmi.imc.lib;

import java.io.Serializable;

public class DataIMC implements Serializable{
    
    private float weight;
    private float height;
    private float result;
    private String message;

    public DataIMC() {}

    public DataIMC(float weight, float height) {
        this.weight = weight;
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getResult() {
        return result;
    }

    public void setResult(float result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }    
}
