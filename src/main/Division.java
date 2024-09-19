package main.negocio.calculo;

public class Division implements Aritmetica {
    
    /**
     * Realiza la división de dos términos proporcionados.
     * Valida que el segundo término no sea cero para evitar la división por cero.
     * Si el segundo término es cero, lanza una IllegalArgumentException.
     * Este método es responsable de asegurar que la división se realice correctamente sin errores aritméticos.
     * @param primerTermino el numerador en la división.
     * @param segundoTermino el denominador en la división; no debe ser cero.
     * @return el resultado de dividir el primer término por el segundo término.
     * @throws IllegalArgumentException si el segundo término es cero, para prevenir la división por cero.
     */
    @Override
    public double calcular(double primerTermino, double segundoTermino) {
        if (segundoTermino == 0) {
            throw new IllegalArgumentException("No se puede dividir por cero");
        }
        
        return primerTermino / segundoTermino;
    }
}
