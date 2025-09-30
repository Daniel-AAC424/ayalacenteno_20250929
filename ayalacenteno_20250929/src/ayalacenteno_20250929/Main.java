/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ayalacenteno_20250929;

/**
 *
 * @author UFG
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        BusquedaBinaria buscar = new BusquedaBinaria();//instaciamos var o puntero
        
        int[] arreglo ={17,19,21,23,25,27,29,31};//arreglo unidimensional
        
        int [][] matriz = {
            {   1,   3,   5},
            {   7,   9,   11},
            {   13,  15,  17}
        };
        
        int a_buscar = 17;//se establece valor a buscar
        
        int posicion = buscar.buscarEnteroArray(arreglo, a_buscar);//se implementa el metodo correspondiente al arreglo de busqueda
        if(posicion!= -1){//mediante herencia de busqueda, enviando el arreglo necesario, luego se evalua el arreglo
            System.out.println("El valor " + a_buscar + " esta en la posicion: "+posicion);//si encontro el valor devuelve el mensaje 
        }else{//no encontro el valor
            System.out.println("No se encontro el valor: " +a_buscar);
        }
           
        
        buscar.buscarEnteroMatriz(matriz, a_buscar);
    }
    
}
