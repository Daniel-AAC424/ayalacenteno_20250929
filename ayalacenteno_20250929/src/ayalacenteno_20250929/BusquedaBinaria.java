/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ayalacenteno_20250929;

/**
 *
 * @author UFG
 */

//la clase se convierte en un objeto con memoria ram
public class BusquedaBinaria {
    //metodo para realizar una busqueda binaria en un arreglo unidimensional
    public int buscarEnteroArray(int[] arreglo,int valorBuscado){
        int inicio = 0;//vars inicio fin
        int fin = arreglo.length;
        
        while(inicio <= fin){//ejecucion de busqueda mientras el arreglo tenga al menos un elemento
            int medio = (inicio + fin)/2;//posicion central
            
            if(arreglo[medio] == valorBuscado){//elemento esta en posicion media?
                return medio;
            }else if(arreglo[medio] < valorBuscado){//pos media es menor?
                inicio = medio + 1;
            }else{//se deduce que el elemento es mayor
                fin = medio - 1;
            }
            
        }
        
        
        return -1;
    }
    
    public void buscarEnteroMatriz(int[][]matriz,int objetivo){
        
        int filas = matriz.length;//se declaran las filas y las columnas para conocer la dimension para la matriz
        int columnas = matriz[0].length;
        
        int inicio = 0;//se establece el inicio y el fin
        int fin = (filas * columnas) -1;
        
        boolean encontrado = false;//bandera que indica si el valor fue encontrado en la matriz
        
        while(inicio <= fin){// se realiza una repeticion mientras la matriz posea al menos un elemento
            
            int medio = (inicio + fin)/2;//se de deduce el punto medio de la matriz
            
            //se simula el arrego bidimencional como unidimensionall
            int  f = medio/columnas;//cual fila (cuantas filas completas existen antes del punto medio)
            int c = medio % columnas;//cual columna es (posicion exacta de la columna
            
            if(matriz[f][c] == objetivo){//se evalua si el elemento se encuentra en el punto medio  
                
                System.out.println("En la matriz, el elemento encontrado esta en la posicion ["+f+"] ["+c+"]");
                encontrado = true;//se establece la bandera ya que e l valor fue encontrado
                break;
            }else if(matriz[f][c]<objetivo){
                inicio = medio + 1;//se evalua si el valor del únto medio es menor que el indicado
            }else{
                fin = medio -1;//se evalua si el valor del punto medio es mayor que el indicado
            }
            
        }//fin while
        
        if(encontrado == false){//se evalua la bandera si no se encuentra valor
            System.out.println("El elemento buscaod no ha sido encontrado en la matriz");// se imprime salida en consola
        }
        
        
    }//fin del metodo busquedaEneteroMatriz
    
    
    
}
