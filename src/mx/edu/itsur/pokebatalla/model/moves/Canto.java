package mx.edu.itsur.pokebatalla.model.moves;

/**
 *
 * @author Jose Guadalupe Salgado Garcia
 */
public class Canto extends MovimientoEstado{

    public Canto() {
        this.tipo=TiposDeMovimiento.NORMAL;
        this.potencia = 0;
        this.precision = 55;
        this.puntosPoder = 15;
    }
}