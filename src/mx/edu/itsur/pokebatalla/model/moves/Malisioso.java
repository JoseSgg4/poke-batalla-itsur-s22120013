package mx.edu.itsur.pokebatalla.model.moves;

/**
 *
 * @author Jose Guadalupe Salgado Garcia
 */
public class Malisioso extends MovimientoEstado{
    
    public Malisioso() {
        this.tipo=TiposDeMovimiento.NORMAL;
        this.potencia = 0;
        this.precision = 100;
        this.puntosPoder = 30;
    }
}
