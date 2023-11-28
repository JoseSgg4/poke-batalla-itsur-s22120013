package mx.edu.itsur.pokebatalla.model.moves;

/**
 *
 * @author Jose Guadalupe Salgado Garcia
 */
public class PistolaAgua extends MovimientoEspecial{
    
    public PistolaAgua() {
        this.tipo=TiposDeMovimiento.AGUA;
        this.potencia = 40;
        this.precision = 100;
        this.puntosPoder = 25;
    }
    
}