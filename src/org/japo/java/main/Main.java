/* 
 * Copyright 2019 Javier Monterde - javier.monterde.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Javier Monterde - javier.monterde.alum@iescamp.es
 */
public class Main {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static void main(String[] args) {
        //Constantes (Referencias)
        final double IMPORTE_INI = 60;
        final int DIAS_DESCUENTO = 30;
        final double TIPO_DESCUENTO = 20;

        //Variables (Variables auxiliares)
        double importeFinal;
        double importeDescuento = 0.0;
        int diasDemora;
        boolean testOk;

        //Bloque Principal
        try {
            //Cabecera
            System.out.println("Alternativa Multa");
            System.out.println("=================");

            //Introducir los días de demora
            System.out.print("Días de demora ...........: ");
            diasDemora = SCN.nextInt();

            //Separador
            System.out.println("---");

            //Comparación
            testOk = diasDemora <= DIAS_DESCUENTO;

            //Calcula el descuento
            if (testOk) {
                importeDescuento = IMPORTE_INI * TIPO_DESCUENTO / 100;
            }

            //Calcula el importe final
            importeFinal = IMPORTE_INI - importeDescuento;

            //Muestra el importe de la multa
            System.out.printf(Locale.ENGLISH,
                    "Importe inicial multa ....: %.2f €%n",
                    IMPORTE_INI);
            System.out.println("---");

            System.out.printf(Locale.ENGLISH,
                    "Plazo con descuento ......: %d días%n",
                    DIAS_DESCUENTO);
            System.out.printf(Locale.ENGLISH,
                    "Tanto descuento ..........: %.0f %%%n",
                    TIPO_DESCUENTO);
            System.out.printf(Locale.ENGLISH,
                    "Importe descuento ........: %.2f €%n",
                    importeDescuento);
            System.out.println("---");

            System.out.printf(Locale.ENGLISH,
                    "Importe final multa ......: %.2f €%n",
                    importeFinal);
        } catch (Exception e) {
            System.out.println("---");
            System.out.println("ERROR: Entrada incorrecta");
        }
    }
}
