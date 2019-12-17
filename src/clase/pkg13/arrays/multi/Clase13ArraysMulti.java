/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg13.arrays.multi;

import java.util.Scanner;

/**
 *
 * @author mmurillo
 */
public class Clase13ArraysMulti {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // arreglo multidimensional (vector).
        
         Scanner sc = new Scanner(System.in);
        
         
         //int intMatriz[f][c];
        //se puede declarar de dos maneras
        int intMatriz[][]; 
        int[][] intMatriz2; 
        int[][] intMatriz3; 

        //se puede para diferentes tipos de datos
        byte byteMatriz[][];
        short shortsMatriz[][];
        boolean booleanMatriz[][];
        long longMatriz[][];
        float floatMatriz[][];
        double doubleMatriz[][];
        char charMatriz[][];
        String StringMatriz[][];
        
        //se debe inicializar
        //Puedo inicializarlo con los valores previamenet definidos asi
        // sin necesidad de tener igual numero de columnas y filas
        //int intMatriz[f][c];
        intMatriz = new int[][]{{1, 2}, 
                                {4, 5, 6, 9}, 
                                {7}, 
                               };
        
        //me devuelve el numero de filas de la matriz.
        System.out.println("Numero de filas:" + intMatriz.length);
        
        //me devuelve el numero de columnas por fila
        System.out.println("Largo de la fila1: " + intMatriz[0].length);
        System.out.println("Largo de la fila2: " + intMatriz[1].length);
        System.out.println("Largo de la fila3: " + intMatriz[2].length);
        
        //Puedo inicializarlo con los valores previamenet definidos asi
        // con igual numero de columnas y filas
        intMatriz2 = new int[][]{{1, 2, 3}, 
                                {4, 5, 6}, 
                                {7, 8, 9}, 
                               }; 
        
        //me devuelve el numero de filas de la matriz.
        System.out.println("\nNumero de filas:" + intMatriz.length);
        
        //me devuelve el numero de columnas por fila
        System.out.println("Largo de la fila1: " + intMatriz2[0].length);
        System.out.println("Largo de la fila2: " + intMatriz2[1].length);
        System.out.println("Largo de la fila3: " + intMatriz2[2].length);
        
        
        //acceder a valores especificos en la matriz
        System.out.println("\nValor de la fila1 columna1: " + intMatriz2[0][0]);
        System.out.println("Valor de la fila2 columna1: " + intMatriz2[1][0]);
        System.out.println("Valor de la fila3 columna1: " + intMatriz2[2][0]);
        
        System.out.println("\nValor de la fila1 columna2: " + intMatriz2[0][1]);
        System.out.println("Valor de la fila2 columna2: " + intMatriz2[1][1]);
        System.out.println("Valor de la fila3 columna2: " + intMatriz2[2][1]);
        
        System.out.println("\nValor de la fila1 columna3: " + intMatriz2[0][2]);
        System.out.println("Valor de la fila2 columna3: " + intMatriz2[1][2]);
        System.out.println("Valor de la fila3 columna3: " + intMatriz2[2][2]);
        
        
        //puedo inicializarlo con un tamano definido, sin defirnir los valores
        // 2 filas con dos columnas
        //    1 4
        //    2 5
        //    3 6
        intMatriz3 = new int[3][2]; 
        
        //insertar valores en matriz
        intMatriz3[0][0] = 1;
        intMatriz3[1][0] = 2;
        intMatriz3[2][0] = 3;
        intMatriz3[0][1] = 4;
        intMatriz3[1][1] = 5;
        intMatriz3[2][1] = 6;
        
        
        //como leemos una matriz con un ciclo? 
        //el primer ciclo recorre las filas
        for (int i = 0; i < intMatriz3.length; ++i) {
            
            System.out.println("\nEstamos en la fila numero " + (i+1) + "\n");//le sumo 1 porque inician en cero
            
            //el segundo ciclo recorre las columnas por cada fila
            for(int j = 0; j < intMatriz3[i].length; ++j) {
               System.out.println("Estamos en la fila " + (i+1) 
                                  + " columna " + (j+1) + 
                                  " y el valor es: " + intMatriz3[i][j]);
            }
        }
        
   
        
        //podriamos incluso llenar un array
        //Vamos a meter 4 nombres, y cada columna es un dato del nombre (Nombre, Apellido1, Apellido2)
        String [][] StringMatrizNombres = new String[4][3]; 
        
        /*
        Columna1 | Columna2  | Columna2  |
         --------------------------------
        | Nombre | Apellido1 | Apellido2 | --> esto es meramente para titulo y seguir la estructura
         --------------------------------
        | Fer    | Murillo   | Sotela    |  Fila 1       
        | Pepe   | Florez    | Montero   |  Fila 2 
        | Juan   | Salas     | Alvarado  |  Fila 3 
        | Maria  | Perez     | Valdez    |  Fila 4 
         --------------------------------
        */
        
        //en este array sabemos justo el valor de cada columna ya que lo usamos como tabla
        //no es necesario hacer un ciclo para recorrer cada columna
        //el primer ciclo recorre las filas
        for (int i = 0; i < StringMatrizNombres.length; ++i) {
            String nombre;
            String apellido1;
            String apellido2;
            System.out.println("\nEstamos insertando la persona (fila) " + (i+1) + "\n");//le sumo 1 porque inician en cero
          
            //   
                //le solicito a los usuarios los datos de la persona
                System.out.println("Inserte el nombre de la persona :" + i);
                nombre = sc.nextLine();
                System.out.println("Inserte el apellido1 de la persona :" + i);
                apellido1 = sc.nextLine();
                System.out.println("Inserte el apellido2 de la persona :" + i);
                apellido2 = sc.nextLine();
                
            //ya con los datos los inserto en la matriz en cada posicion
            StringMatrizNombres[i][0] = nombre; //--> 0 es el nombre
            StringMatrizNombres[i][1] = apellido1; //--> 1 es el apellido1
            StringMatrizNombres[i][2] = apellido2; //--> 2 es el apellido2    
            
            
        }
        
        //imprimir los nombres, ya sabemos las columnas entonces no es necesario
        //hacer el ciclo interno para recorrer las columnas, ya sabemos que son 3 especificas
        //a un valor (nombre, apellido1, apellido2).
        for (int i = 0; i < StringMatrizNombres.length; ++i) {
            
            System.out.println("\nEstamos revisando la persona en la fila numero " + (i+1) + "\n");//le sumo 1 porque inician en cero
            
            System.out.println("El nombre de la persona es " + 
                                StringMatrizNombres[i][0] + " " +
                                StringMatrizNombres[i][1] + " " +
                                StringMatrizNombres[i][2]);
        }
        
       

        //podriamos incluso llenar un array
        //Vamos a meter numeros en orden
        int [][] intMatrizNum = new int[4][4]; 
        
        /* No esta asociado a un dato ordenado o especifico como los nombres
           no podemos referenciarlo directament si no que tenemos que recorrer 
           cada columna y cada fila
        
        | 1 | 2 | 3 | 4 |       
        | 5 | 6 | 7 | 8 |
        | 9 | 10| 11| 12| 
        | 13| 14| 15| 16|
        
         --------------------------------
        */
        
        //el primer ciclo recorre las filas
        int num = 1;
        for (int i = 0; i < intMatrizNum.length; ++i) {
            
         
            //el segundo ciclo recorre las columnas por cada fila e inserta el valor
            for(int j = 0; j < intMatrizNum[i].length; ++j) {
                
               intMatrizNum[i][j]= num;
               //voy agregando el numero de 1 en 1
               num++;
                                 
            }
        }
        
        //podemos pedir el numero al usuario tambien
        //el primer ciclo recorre las filas
//        for (int i = 0; i < intMatrizNum.length; ++i) {
//            int num = 0;
//            System.out.println("\nEstamos en la fila numero " + (i+1) + "\n");//le sumo 1 porque inician en cero
//            
//            //el segundo ciclo recorre las columnas por cada fila e inserta el valor
//            for(int j = 0; j < intMatrizNum[i].length; ++j) {
//               System.out.println("Insertar valor en la fila " + (i+1) 
//                                  + " columna " + (j+1));
//               num = sc.nextInt();
//               intMatrizNum[i][j]= num;
//               //voy agregando el numero de 1 en 1
//       
//                                 
//            }
//        }
        
        
        //imprimir el ciclo anterior
        //el primer ciclo recorre las filas
        for (int i = 0; i < intMatrizNum.length; ++i) {
            
            System.out.println("\nEstamos en la fila numero " + (i+1) + "\n");//le sumo 1 porque inician en cero
            
            //el segundo ciclo recorre las columnas por cada fila
            for(int j = 0; j < intMatrizNum[i].length; ++j) {
               System.out.println("Estamos en la fila " + (i+1) 
                                  + " columna " + (j+1) + 
                                  " y el valor es: " + intMatrizNum[i][j]);
            }
        }
        
        
         //podemos imprimir como tabla incluso
        
        System.out.println("\n --------------------------------");
        
        int numImprimir = 0;
        
        for (int i = 0; i < intMatrizNum.length; ++i) {
            
            for(int j = 0; j < intMatrizNum[i].length; ++j) {
                
                numImprimir = intMatrizNum[i][j]; 
                
                if (String.valueOf(numImprimir).length() ==1){
                    System.out.print("| " + numImprimir + " ");
                } else {
                    System.out.print("| " + numImprimir + "");
                }
                
                
            }
             //cerrar la tabla
            System.out.print("|");
             //saltar linea para siguiente fila
            System.out.println();
        }
        
        System.out.println(" --------------------------------");
        
        
        // imprimir con un foreach
        System.out.println("\n --------------------------------");

        for (int[] filaArray: intMatrizNum) {
        for(int numImpr: filaArray) {
            
            if (String.valueOf(numImpr).length() == 1) {
                System.out.print("| " + numImpr + " ");
            } else {
                System.out.print("| " + numImpr + "");
            }
        }
        
        //cerrar la tabla
            System.out.print("|");
             //saltar linea para siguiente fila
            System.out.println();
     }
        System.out.println(" --------------------------------");
        
    }
    
}
