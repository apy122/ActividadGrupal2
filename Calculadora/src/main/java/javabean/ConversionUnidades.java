package javabean;
/**Esta clase es un conversor de unidades
 * @author apy122
 * @version 1.0
 **/
public class ConversionUnidades {
    // Atributos
    private double celsius;
    private double fahrenheit;
    private double grados;
    private double radianes;

    /**Constructor clase OonversionUnidades sin parametros*/
    public ConversionUnidades() {
    }
    /**Constructor con todo
     * @param  celsius para celsius
     * @param fahrenheit para fahrenheit
     * @param grados para grados
     * @param radianes para radianes*/

    public ConversionUnidades(double celsius, double fahrenheit, double grados, double radianes) {
        this.celsius = celsius;
        fahrenheit = fahrenheit;

        this.grados = grados;
        this.radianes = radianes;
    }

    /**Get and set*/
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

    /**ToString**/
    @Override
    public String toString() {
        return "ConversionUnidades{" +
                "celsius=" + celsius +
                ", fahrenheit=" + fahrenheit +
                ", grados=" + grados +
                ", radianes=" + radianes +
                '}';
    }

    /**Conversor celsius a fahrenheit
    * @param celsius pedir cantidad de celsius a convertir a fahrenheit
    * @return La cantidad en fahrenheit*/
    public double ConversionCelsiusFahrenheit(double celsius) {
        fahrenheit = (celsius * 9/5) + 32;
        return fahrenheit;
    }

    /**Conversor fahrenheit a celsius
     * @param  fahrenheit pedir la cantidad de fahrenheit a convertir celsius
     * @return La cantidad en celsius*/
    public double ConversionFahrenheitCelsius(double fahrenheit) {
        celsius=(fahrenheit -32)*5/9;
        return celsius;
    }

    /**Conversor grados a radianes
     * @param grados pedir la cantidad de grados a convertir a Radianes
     * @return la cantidad en radianes*/
    public double ConversionGradosRadianes(double grados) {
        radianes= grados* Math.PI/180;
        return radianes;
    }

    /**Conversor grados a radianes
     * @param radianes pedir la cantidad de radianes a convertir a grados
     * @return la cantidad en grados*/
    public double ConversionRadianesCelsius(double radianes) {
        grados= radianes*180/Math.PI;
        return grados;
    }
}
