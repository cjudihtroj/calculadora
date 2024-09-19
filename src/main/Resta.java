package main.negocio.calculo;

public class Resta implements Aritmetica {

    /**
     * Realiza la sustracción del segundo término del primer término proporcionado.
     * Este método calcula la diferencia entre dos números dados y retorna el resultado.
     * No hay validaciones específicas para los valores de entrada ya que la sustracción
     * en Java maneja adecuadamente los rangos de valores normales, incluyendo cero y valores negativos.
     * Sin embargo, es importante tener en cuenta la posibilidad de resultados negativos, especialmente
     * en contextos donde se esperan valores no negativos.
     * @param primerTermino el minuendo en la sustracción.
     * @param segundoTermino el sustraendo en la sustracción.
     * @return el resultado de sustraer el segundo término del primer término.
     */
    @Override
    public double calcular(double primerTermino, double segundoTermino) {
        return primerTermino - segundoTermino;
    }

}
