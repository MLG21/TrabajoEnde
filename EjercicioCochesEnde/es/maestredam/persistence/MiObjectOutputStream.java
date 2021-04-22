package es.maestredam.persistence;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 * Clase que hereda de ObjectOutputStream para que 
 * NO escriba cabecera al escribir objetos en un fichero.
 * <br>
 * Sobreescribe el método writeStreamHeader 
 * para que no haga nada. 
 * 
 * @author josema
 */
public class MiObjectOutputStream extends ObjectOutputStream{
	
    public MiObjectOutputStream() throws IOException{
            super();

    }

    public MiObjectOutputStream(OutputStream out) throws IOException{
            super(out);

    }

    @Override
    protected void writeStreamHeader() throws IOException{

            // Sobreescrito sin implementación, 
            // para que NO incluya cabecera al añadir objetos.
    }

}
