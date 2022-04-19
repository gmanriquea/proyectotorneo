/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba2;

import java.util.*;

/**
 *
 * @author Acer
 */
public class Prueba2 {

    /**
     * @param args the command line arguments
     */
    private static ArrayList<Equipo> crearequipo(ArrayList<Equipo> equipo){
        Scanner sc= new Scanner(System.in); //Scanner para las entradas
        System.out.print("Inserte la cantidad de grupos que desea agregar: ");
        Integer numequipos = sc.nextInt();
        System.out.println("Recuerda que la cantidad de integrantes por equipos son 5");
        Integer nummiembros = 5;            
        sc.nextLine();
        if(equipo.isEmpty()){
            ArrayList<Equipo> equipos = new ArrayList<>();
            for(int j =0 ;j<numequipos;j++){
                System.out.print("Nombre del grupo(si no colocas por defecto sera grupo #"+(j+1)+"): ");
                String nombregrupo = sc.nextLine();
                if(nombregrupo.isBlank()){
                  //System.out.println("\tGrupo #"+(j+1)+":");
                   nombregrupo="Grupo #"+(j+1);
                }
                Miembros[] arreglomiembros = new Miembros[nummiembros]; 
                System.out.println(nombregrupo);
                for(int i = 0;i<nummiembros;i++){
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
                    arreglomiembros[i]=miembro;
                }
                Equipo objequipo = new Equipo(nombregrupo,nummiembros,0,arreglomiembros);
                equipos.add(objequipo);
            }
            return equipos;
        }else{
            ArrayList<Equipo> equipos = new ArrayList<>();
            for(int j =0;j<numequipos;j++){
                System.out.print("Nombre del grupo(si no colocas por defecto sera grupo #"+(j+equipo.size()+1)+"): ");
                String nombregrupo = sc.nextLine();
                if(nombregrupo.isBlank()){
                   //System.out.println("\tGrupo #"+(j+1)+":");
                    nombregrupo="Grupo #"+(j+equipo.size()+1);
                }
                Miembros[] arreglomiembros = new Miembros[nummiembros]; 
                System.out.println(nombregrupo);
                for(int i = 0;i<nummiembros;i++){
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
                    arreglomiembros[i]=miembro;
                }
                Equipo objequipo = new Equipo(nombregrupo,nummiembros,0,arreglomiembros);
                equipos.add(objequipo);
            }
            return equipos;
        }  
    }
    private static void imprimirequipos(ArrayList<Equipo> equipos){
        for (Equipo itrnx : equipos) {
            System.out.println(itrnx.getNombre());
            System.out.println("Posicion: "+itrnx.getPosicion());
            System.out.println("miembros: ");
            for(Miembros mim: itrnx.getArrmiembros()){
                System.out.println(mim.getNombre()+" "+mim.getApellido());
            }
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
         // TODO code application logic here
        String respfinal="N";
        while (respfinal.equals("S")){
            Scanner sc= new Scanner(System.in); //Scanner para las entradas
            System.out.println("Bienvenido al programa de clasificaciones");
            ArrayList<Equipo> equipos = new ArrayList<>();
            equipos = crearequipo(equipos);
            System.out.println(equipos.size());
            imprimirequipos(equipos);
            //Primer menu de opciones

            Integer respuesta1 = 0;
            Integer[][] primer ;
            while(respuesta1!=2){
                System.out.println("\t ¿Que desea hacer ahora?");
                System.out.println("1)Agregar un equipo");
                System.out.println("2)Generar lista de primeros enfrentamientos");
                System.out.println("3)Ver equipos inscritos");
                respuesta1 = sc.nextInt();
                switch (respuesta1) {
                    case 1 -> {
                        ArrayList<Equipo> equiposagregados = crearequipo(equipos);
                        for (Equipo itrnx : equiposagregados) {
                            equipos.add(itrnx);
                        }
                    }
                    case 2 -> {
                        Random random = new Random();
                        ArrayList<Integer> valores = new ArrayList<>();
                        for(int i=0;i<equipos.size();i++){
                            valores.add(i);
                        }
                        if((equipos.size()%2)==0){
                            primer = new Integer[valores.size()/2][2];
                            for(int i=0;i<((equipos.size()/2));i++){
                                int valrand = random.nextInt(0,valores.size());
                                Integer[] enfre = new Integer[2];
                                enfre[0]=valores.get(valrand);
                                valores.remove(valrand);
                                int valrand2 = random.nextInt(0,valores.size());
                                enfre[1]=valores.get(valrand2);
                                valores.remove(valrand2);
                                primer[i]=enfre;
                            }
                            System.out.println("\tEnfrentamientos");
                            for(int i = 0;i<(equipos.size()/2);i++){
                                System.out.println((i+1)+")"+equipos.get(primer[i][0]).getNombre()+" vs "+equipos.get(primer[i][1]).getNombre());
                            }
                        }
                    }
                    case 3 -> imprimirequipos(equipos);
                    default -> System.out.println("Has ingresado una opcion invalida, vuelve a intentarlo");
                }
            }
            Integer resp2=0;
            while(resp2!=4 && resp2!=5){
                //Segundo menu de opciones
                System.out.println("1)ver tabla de posicionamiento");
                System.out.println("2)Continuar registro de puntos");
                System.out.println("3)Editar los puntos de un equipo");
                System.out.println("4)Reiniciar el programa");
                resp2=sc.nextInt();
                switch (resp2) {
                    case 1 -> {
                        System.out.print("hola");
                    }
                }
            }
        }
    }
    
}
