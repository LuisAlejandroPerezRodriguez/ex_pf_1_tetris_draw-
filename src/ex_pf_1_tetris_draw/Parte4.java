
package ex_pf_1_tetris_draw;

import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Logger;

public class Parte4 {
    

    static private final Logger LOGGER = Logger.getLogger("Saludo buenas");
    
    static public void main(String[] args){
        Funcion tarea = new Funcion();
        Timer temporizador = new Timer();
        Integer segundos = 5;
        
        temporizador.scheduleAtFixedRate(tarea, 0, 1000*segundos);
    }
}
