package com.mycompany.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    private App Ejercicio;


    public void setUp()
    {
        this.Ejercicio = new App();
    }
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void main() throws  Exception{
        String[] Ubicacion = {"C:\\Users\\caerr_000\\Documents\\Project\\Ejercicio-Datio\\Sacramentorealestatetransactions.csv"};
        this.Ejercicio.main(Ubicacion);
    }
}
