package main.negocio.calculo;

public class Calculo implements Aritmetica {
    
    private Operacion operacionActual;
    private Aritmetica aritmetica;
    
    /**
     * Constructor que inicializa el objeto Calculo con una operación por defecto.
     * Valida que la operación no sea null; si lo es, lanza IllegalArgumentException.
     * Este método asegura que el objeto Calculo siempre tenga una operación definida al crearse.
     * @param operacionDefecto la operación aritmética inicial que no debe ser null.
     * @throws IllegalArgumentException si operacionDefecto es null, asegurando que el objeto siempre esté correctamente inicializado.
     */
    public Calculo(Operacion operacionDefecto) {
        if (operacionDefecto == null) {
            throw new IllegalArgumentException("Operacion no puede estar vacío");
        }
        
        cambiarOperador(operacionDefecto);
    }

    /**
     * Cambia el operador aritmético actual y actualiza la instancia de Aritmetica
     * correspondiente. Valida que el nuevo operador no sea null antes de asignarlo.
     * Si el operador es null, no realiza cambios y puede lanzar una excepción según el diseño.
     * Este método permite modificar el comportamiento de cálculo del objeto Calculo en tiempo de ejecución.
     * @param operacion el nuevo operador aritmético que define la operación a realizar, no debe ser null.
     */
    public void cambiarOperador(Operacion operacion) {
        if (operacion == null) {
            throw new IllegalArgumentException("Operacion no puede ser null");
        }
        this.operacionActual = operacion;
        this.aritmetica = operacionActual.obtenerOperacionAritmetica();
    }
    
    /**
     * Devuelve el operador aritmético actual en uso. Este método permite verificar cuál es el operador
     * aritmético actualmente configurado en el objeto Calculo.
     * @return el operador aritmético actual.
     */
    public Operacion obtenerOperadorActual() {
        return this.operacionActual;
    }
    
    /**
     * Realiza un cálculo aritmético usando los términos proporcionados según el operador aritmético actual.
     * Valida que los términos de entrada no causen errores en la operación específica (por ejemplo, división por cero).
     * Delega la operación aritmética al objeto Aritmetica correspondiente al operador actual.
     * Este método puede lanzar ArithmeticException u otras excepciones dependiendo de la operación específica.
     * @param primerTermino el primer número en la operación aritmética, debe ser un valor válido para la operación.
     * @param segundoTermino el segundo número en la operación aritmética, debe ser un valor válido para la operación.
     * @return el resultado de la operación aritmética.
     * @throws ArithmeticException si la operación aritmética falla debido a valores inválidos, como división por cero.
     */
    @Override
    public double calcular(double primerTermino, double segundoTermino) {
        return this.aritmetica.calcular(primerTermino, segundoTermino);
    }
    
}
