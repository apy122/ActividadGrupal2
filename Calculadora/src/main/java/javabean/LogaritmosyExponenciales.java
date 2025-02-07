package javabean;

/**
 * Esta clase proporciona funciones para calcular logaritmos y exponenciales
 * @author Aless-Mereu
 */
public class LogaritmosyExponenciales {

        /**
         * Calcula el logaritmo natural/neperiano (base e) de un número.
         * @param x Número de entrada (x > 0)
         * @return log_e(x)
         * @throws IllegalArgumentException si x <= 0
         */
        public static double logaritmoNatural(double x) {
            if(x <= 0)
                throw new IllegalArgumentException("El numero no puede ser menor mo igual a cero");
            return Math.log(x);
        }

        /**
         * Calcula el logaritmo en base 10 de un número.
         * @param x Número de entrada (x > 0)
         * @return log_10(x)
         * @throws IllegalArgumentException si x <= 0
         */
        public static double logaritmoBase10(double x) {
            if(x <= 0)
                throw new IllegalArgumentException("El numero no puede ser menor mo igual a cero");
            return Math.log10(x);
        }

        /**
         * Calcula la exponencial de (e^x).
         * @param x Exponente
         * @return e^x
         */
        public static double exponencial(double x) {
            return Math.exp(x);
        }


    }


