/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author gtada
 */
public class Persona {
    
    ArrayList <String> Temperaturas = new ArrayList <>();
     ArrayList <String> Nombres = new ArrayList <>();
    String nombre,parentesco,temp;
    int edad;
    

    public Persona() {
    }
    
    public void agrgarPersona(){
        Scanner entrada = new Scanner (System.in);
        System.out.println("Nombre: ");
        nombre=entrada.nextLine();
         System.out.println("Parentesco: ");
        parentesco=entrada.nextLine();
         System.out.println("Edad: ");
        edad=entrada.nextInt();  
        
        Nombres.add(nombre+" "+parentesco+" "+edad);
        
    }
    public void agregarTemperaturas(){
        Scanner entrada = new Scanner (System.in);
        System.out.println("Ingrese una temperatura: ");
        temp=entrada.nextLine();
        Temperaturas.add(temp);       
    }
    
    
    public void mostrarPersonas(){
        
        
       int a =0;
       for(int i=0;i<Nombres.size();i++){
           for(int j=a;j<Temperaturas.size();j++){
                System.out.println(Nombres.get(i));
                System.out.println("Temperatura:  "+Temperaturas.get(j));
                a=Taller.x;
              }
            }
        
        }
        
    }

