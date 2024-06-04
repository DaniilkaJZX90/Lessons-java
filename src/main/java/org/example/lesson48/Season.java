package org.example.lesson48;

public enum Season {
    SUMMER(30),WINTER(-25), AUTUMN(10), SPRING(20);

    private  int temperature;
    Season(int temperature){
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }
}
