package ui;
import java.util.Scanner;

import model.Enemy;
import model.Level;
import model.Player;
import model.Treasure;
import model.Videogame;


public class Main{

    public static void main(String args[]) {
        
        Scanner entrada = new Scanner(System.in);
        int cont=0;
        
        do {

        System.out.println("MENU");

        System.out.println("1) Crear un jugador");
        System.out.println("2) Registrar Nivel");
        System.out.println("3) Modificar el nivel de un jugador");
        int opc = entrada.nextInt();
        entrada.nextLine();

        switch (opc){
            case 1:

                System.out.println("-Digita tu nickname: ");
                String nick= entrada.nextLine();

                System.out.println("-Digita tu nombre completo: ");
                String name= entrada.nextLine();

                int Score = 10;

                int lifes = 5;

                Player mensajero = new Player(nick, name, Score, lifes);
                mensajero.addPlayer();
                mensajero.imprimir();

                break;
            
            case 2:

                System.out.println("Digite el identificador");
                String id = entrada.nextLine();

                System.out.println("¿Cual es el puntaje necesario para pasar de nivel?");
                int requireScore = entrada.nextInt();

                Level mensajero2 = new Level(id, requireScore);
                mensajero2.addLevel(mensajero2);
                mensajero2.imprimir();

                System.out.println("¿Cuantos enemigos desea registrar para este nivel?");
                int L=entrada.nextInt();
                entrada.nextLine();

                int contador=0;

            while(contador<L){

                System.out.println("Escriba el nombre del enemigo:");
                String name2 = entrada.nextLine();

                System.out.println("¿Cual es el puntaje que resta al jugador?");
                int defeatScore = entrada.nextInt();

                System.out.println("¿Cual es el puntaje que suma al jugador?");
                int winScore = entrada.nextInt();
                entrada.nextLine();

                Enemy mensajero3 = new Enemy(name2, defeatScore, winScore);
                mensajero3.addEnemy(mensajero3);
                mensajero3.show();

                contador=contador+1;
            }

            System.out.println("¿Cuantos tesoros desea registrar para este nivel?");
            int T=entrada.nextInt();
            entrada.nextLine();

            int contador2=0;

            while (contador2<T){

                System.out.println("Escriba el nombre del tesoro:");
                String name3 = entrada.nextLine();

                System.out.println("¿Cual es la url de la imagen del tesoro?");
                String url = entrada.nextLine();

                System.out.println("¿Cual es el puntaje que suma al jugador?");
                int winScore = entrada.nextInt();
                entrada.nextLine();

                Treasure mensajero4 = new Treasure(name3, url, winScore);
                mensajero4.addTreasure(mensajero4);
                mensajero4.show();

                contador2=contador2+1;

            }

            break;
            
            case 3:
                String name4="";
                String lastName="";
                int Score1 = 10;
                int lifes1 = 5;
                System.out.println("¿De que jugador desea modificar el puntaje?");
                Player mensajero3 = new Player(name4, lastName, Score1, lifes1);
                mensajero3.ListPlayers();

                break;
        } 
    } while (cont==0);
}
}
