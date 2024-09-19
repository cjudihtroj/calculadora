package main.negocio;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;

public class Historial {

    private static Historial _instancia = null;
    private Map<String, Registro> _items;
    
    private Historial() {
        _items = new LinkedHashMap<String, Registro>();
    }
    
    public static Historial obtenerInstancia() {
        if (_instancia == null) {
            _instancia = new Historial();
        }
        
        return _instancia;
    }
    
    public void agregarRegistro(String descripcion, double valor) {
        _items.put(Util.ObtenerGuid(), new Registro(descripcion, valor));
    }
    
    public void agregarRegistro(String clave, Registro registro) {
        _items.put(clave, registro);
    }
    
    public Map<String, Registro> listar() {
        return _items;
    }
    
    public Registro obtenerRegistro(String clave) {
        Optional<Registro> registro = _items.entrySet().stream()
            .filter(x -> x.getKey().equals(clave))
            .map(Map.Entry::getValue)
            .findFirst();
        
        if (!registro.isPresent()) {
            throw new NoSuchElementException("No existe ninguna operacion con la clave dada");
        }
            
        return registro.get();
    }
    
    /**
     * Trunca el historial de registros hasta el registro especificado por la clave, incluyéndolo.
     * Esto significa que todos los registros posteriores a la clave dada son eliminados del historial.
     * Si la clave no existe, lanza una excepción NoSuchElementException.
     * Este método primero valida que exista un registro con la clave especificada usando obtenerRegistro(clave),
     * luego crea un nuevo mapa y copia los registros hasta encontrar la clave, eliminando los restantes.
     * @param clave la clave del registro hasta donde se desea truncar el historial.
     * @throws NoSuchElementException si no se encuentra un registro con la clave especificada.
     */
    public void truncarEnRegistro(String clave) {      
        // Validar que exista el elemento
        obtenerRegistro(clave);
        
        // Generar lista auxiliar
        Map<String, Registro> aux = new LinkedHashMap<String, Registro>();
        
        for(Map.Entry<String, Registro> item: _items.entrySet()) {
            if (clave == item.getKey()) {
                aux.put(item.getKey(), item.getValue());
                break;
            }
            else {
                aux.put(item.getKey(), item.getValue());
            }
        }
        
        _items = aux;
    }
    
    public void vaciar() {
        _items.clear();
    }
}
