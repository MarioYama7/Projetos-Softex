
package Softe03;
//Importa��o das bibliotecas para o c�digo. 


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

        
public class Projeto_07{

       public static void main(String[] args) {

             BufferedReader breader = null;

             try {
                    breader = new BufferedReader(new FileReader
                     ("arquivo.bin")); //Arquivo fict�cio
             } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
             }
       }
}       
