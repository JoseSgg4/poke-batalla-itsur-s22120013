package mx.edu.itsur.pokebatalla.model.moves;

/**
 *
 * @author Jose Guadalupe Salgado Garcia
 */
public class Hiperrayo extends MovimientoEspecial{
    
    public Hiperrayo() {
        this.tipo=TiposDeMovimiento.NORMAL;
        this.potencia = 150;
        this.precision = 90;
        this.puntosPoder = 5;
    }
    
}