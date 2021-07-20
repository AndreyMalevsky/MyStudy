package org.eho.test2.cars;

public interface Light {
    void turnOnLight();
    default void turnOffLight(){}
}
