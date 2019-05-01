package com.mycompany.app;

import java.io.*;
import java.util.*;

public class App {
    public static void main(String[] args) throws IOException {
        final long startTime = System.currentTimeMillis();
        BufferedReader DataFile;
        int TotalConteo = 0;
        String Linea;
        String Texto;

        try {
            DataFile = new BufferedReader(new FileReader(args[0]));

            System.out.println("Archivo Cargado:");

            while ((Linea = DataFile.readLine()) != null) {
                StringTokenizer sToken = new StringTokenizer(Linea, ",");
                while ((sToken.hasMoreTokens())) {
                    Texto = sToken.nextToken();
                    if (Texto.equals("Multi-Family")) {
                        System.out.println(Linea);
                        TotalConteo++;
                    }

                }
            }
            System.out.println("El total de ocurrencias de la palabra Multi_Family es: " + TotalConteo);

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("No se encuentra el archivo");
        }

        final long finalTime = System.currentTimeMillis() - startTime;

        System.out.println("El tiempo de ejecución del programa fue de: " + finalTime / 1000.0 + " Segundos");
    }
}