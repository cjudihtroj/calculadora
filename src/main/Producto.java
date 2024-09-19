package main.negocio.calculo;

public class Producto implements Aritmetica {

    /**
     * Realiza la multiplicación de dos términos proporcionados.
     * Este método calcula el producto de dos números dados y retorna el resultado.
     * No hay validaciones específicas para los valores de entrada ya que la multiplicación
     * en Java maneja adecuadamente los rangos de valores normales, incluyendo cero y valores negativos.
     * Sin embargo, se debe considerar el manejo de la posible sobrefluencia (overflow) para valores extremadamente grandes.
     * @param primerTermino el primer factor en la multiplicación.
     * @param segundoTermino el segundo factor en la multiplicación.
     * @return el resultado de multiplicar el primer término por el segundo término.
     */
    @Override
    public double calcular(double primerTermino, double segundoTermino) {
        return primerTermino * segundoTermino;
    }

}
