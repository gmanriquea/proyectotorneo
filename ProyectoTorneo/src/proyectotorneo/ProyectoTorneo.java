/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectotorneo;

import java.util.*;

/**
 *
 * @author Acer
 */
public class ProyectoTorneo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in); //Scanner para las entradas
        System.out.println("Bienvenido al programa de clasificaciones");
        System.out.print("Inserte la cantidad de grupos que desea crear: ");
        Integer numequipos = sc.nextInt();
        System.out.print("Cantidad de miembros por grupo: ");
        Integer nummiembros = sc.nextInt();            
        sc.nextLine();
        Equipo[] equipos = new Equipo[numequipos];
        for(int j = 0;j<numequipos;j++){
            System.out.print("Nombre del grupo(si no colocas por defecto sera grupo #"+(j+1)+"): ");
            String nombregrupo = sc.nextLine();
            if(nombregrupo.isBlank()){
                //System.out.println("\tGrupo #"+(j+1)+":");
                nombregrupo="Grupo #"+(j+1);
            }
            System.out.println(nombregrupo);
            Miembros[] arreglomiembros = new Miembros[nummiembros]; 
            for(int i = 0;i<arreglomiembros.length;i++){
                System.out.print("Nombre (si no ingresas un nombre se guardara como miembro #"+(i+1)+"): ");
                String nombre = sc.nextLine();
                String apellido;
                if(nombre.isBlank()){
                    nombre="miembro";
                    apellido="#"+(Integer.toString(i+1));
                }else{
                    System.out.print("Apellido de "+nombre+": ");
                    apellido = sc.nextLine();
                }
                Miembros miembro = new Miembros(nombre,apellido);
                arreglomiembros[i] = miembro;
            }
            System.out.println(nombregrupo);
            
            equipos[j]= new Equipo(nombregrupo,nummiembros,0.0,0,arreglomiembros);
        }
        for(Equipo eq: equipos){
            System.out.println(eq.getNombre());
            System.out.println("Posicion: "+eq.getPosicion());
            System.out.println("puntos: "+eq.getPuntaje());
            System.out.print("miembros: ");
            for(Miembros mim: eq.getArrmiembros()){
                System.out.println(mim.getNombre()+" "+mim.getApellido());
            }
        }
    }
    
}
