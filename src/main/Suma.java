package main.negocio.calculo;

public class Suma implements Aritmetica {

    /**
     * Realiza la suma de dos términos proporcionados.
     * Este método calcula la suma de dos números dados y retorna el resultado.
     * No hay validaciones específicas para los valores de entrada ya que la suma
     * en Java maneja adecuadamente los rangos de valores normales, incluyendo cero y valores negativos.
     * Sin embargo, se debe considerar el manejo de la posible sobrefluencia (overflow) para valores extremadamente grandes.
     * @param primerTermino el primer sumando en la operación de suma.
     * @param segundoTermino el segundo sumando en la operación de suma.
     * @return el resultado de sumar el primer término al segundo término.
     */
    @Override
    public double calcular(double primerTermino, double segundoTermino) {
        return primerTermino + segundoTermino;
    }
    
}
