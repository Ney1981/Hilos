import java.io.File;
import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Paso1 extends Thread{   
    @Override
    public void run(){
        
        Scanner sc = new Scanner(System.in);
        int m;
        System.out.println("Ingresa un numero ");
        m = sc.nextInt();
        System.out.println("\nNumeros de 1 hasta " + m + " : ");
        for(int i = 0; i <=m; i++){
            System.out.println(i); 
            
        }
        
    }
    
}