
package ex_pf_1_tetris_draw;

import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Funcion extends TimerTask {
    
    static private final Logger LOGGER = Logger.getLogger("mx.com.hash.tareaprogramada.Tarea");
    private Integer contador;  
    
     public Funcion() {
        contador = 0;
    }
     
     @Override
    public void run() {
        LOGGER.log(Level.INFO, "Numero de ejecución {0}", contador);
        contador++;
    } 
    
}
