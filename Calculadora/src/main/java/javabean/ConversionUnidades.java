package javabean;

public class ConversionUnidades {
    // Atributos
    private double celsius;
    private double fahrenheit;
    private double grados;
    private double radianes;

    //Contructor sin nada
    public ConversionUnidades() {
    }

    //Constructor con todo
    public ConversionUnidades(double celsius, double fahrenheit, double grados, double radianes) {
        this.celsius = celsius;
        fahrenheit = fahrenheit;

        this.grados = grados;
        this.radianes = radianes;
    }

    //Get and set
    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public double getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(double fahrenheit) {
        fahrenheit = fahrenheit;
    }

    public double getGrados() {
        return grados;
    }

    public void setGrados(double grados) {
        this.grados = grados;
    }

    public double getRadianes() {
        return radianes;
    }

    public void setRadianes(double radianes) {
        this.radianes = radianes;
    }

    //ToString
    @java.lang.Override
    public java.lang.String toString() {
        return "ConversionUnidades{" +
                "Celsius=" + celsius +
                ", Fahrenheit=" + fahrenheit +
                ", grados=" + grados +
                ", radianes=" + radianes +
                '}';
    }

    //Conversor celsius a fahrenheit
    public double ConversionCelsiusFahrenheit(double celsius) {
        fahrenheit = (celsius * 9/5) + 32;
        return fahrenheit;
    }

    //Conversor fahrenheit a celsius
    public double ConversionFahrenheitCelsius(double fahrenheit) {
        celsius=(fahrenheit -32)*5/9;
        return celsius;
    }

    //Conversor grados a radiales
    public double ConversionGradosRadianes(double grados) {
        radianes= grados* Math.PI/180;
        return radianes;
    }

    //Conversor radiales a Celsius
    public double ConversionRadianesCelsius(double radians) {
        grados= radianes*180/Math.PI;
        return grados;
    }
}
