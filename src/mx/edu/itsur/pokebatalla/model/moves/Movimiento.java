/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model.moves;
import mx.edu.itsur.pokebatalla.model.Pokemons.Pokemon;
/**
 *
 * @author jose
 */
public class Movimiento {

    enum TiposDeMovimiento {
        //Primera Generación
        AGUA,
        BICHO,
        DRAGON,
        ELECTRICO,
        FANTASMA,
        FUEGO,
        HIELO,
        LUCHA,
        NORMAL,
        PLANTA,
        PSIQUICO,
        ROCA,
        SINIESTRO,
        TIERRA,
        VENENO,
        VOLADOR
        //Segunda Generación
        //...        
    }

    //Atributos
    protected TiposDeMovimiento tipo;
    protected int potencia;
    protected int precision;
    protected int puntosPoder;

    //Métodos
    public void utilizar(Pokemon usuario, Pokemon objetivo) {
        //Calcular el daño
        int nivelAtacante = usuario.getNivel();
        int ataqueAtacante = usuario.getAtaque();
        int poderMovimiento = this.puntosPoder; //this.getPoder();
        int defensaObjetivo = objetivo.getDefensa();
        
        //Calcular el modificador, considerando tipos.
        double modificador = 1.0; // Modificador base (sin modificaciones)       
        //if ()... POR HACER        
        
        int danio = (int) (((
                ((2 * nivelAtacante / 5 + 2) 
                        * ataqueAtacante 
                        * poderMovimiento / defensaObjetivo) 
                  / 50) + 2) * modificador);
        
        objetivo.recibirDanio(danio); 

        //Imprimir efecto del movimiento en consola
        System.out.println(
                         usuario.getClass().getSimpleName() + " aplica " + 
                         this.getClass().getSimpleName() + " a " +  
                         objetivo.getClass().getSimpleName() + " y causa danio de " +
                         danio);
        System.out.println("El objetivo quedo asi: " + objetivo);
        
    }    
}
