package model;

public class Player {
    
    private String nickname;
    private String name;
    private int Score;
    private int numberOfLifes;
    private Player[] listplayer = new Player[20];

    public Player(String nickname, String name, int Score, int numberOfLifes){
        this.nickname=nickname;
        this.name=name;
        this.Score=Score;
        this.numberOfLifes=numberOfLifes;
    }
/**
 * Adicionar jugador
 * Este metodo adiciona un jugador cada vez que el usuario desde la interfaz selecciona la opcion de "Crear jugador"
 * @param 
 * @return Status, si el jugador fue correctamente creado devolvera un valor boolean y asi indicará al repetidor que se detenga
 */
    public boolean addPlayer(){
        boolean status = false;
        for (int i=0; i<=listplayer.length && !status; i++){
            listplayer[i]= new Player(nickname, name, Score, numberOfLifes);
            status = true;
    }
    return status;
}
/**
 * Lanzar un mensaje en pantalla
 * Este metodo mostrará al usuario un mensaje en pantalla para indicar que el jugador fue creado exitosamente
 * @exception if En caso de que el metodo de adicionar al jugador regrese un valor falso, no se verá ejecutado el metodo 
 * 
 */
   public void imprimir(){
        addPlayer();
        if (addPlayer()==true){
            System.out.println("El jugador fue creado correctamente: "+getNickName());
        }
    } 
/**
 * Lista de jugadores
 * Este metodo me ayuda a saber la lista de jugadores registrados en el juego
 * @see model.Player
 */
    public void ListPlayers(){
        for (int i=0; i<listplayer.length; i++){
            System.out.println(" "+ i + " " + listplayer[i]);
        }
    }

    public String getNickName(){
        return nickname;
    }

    public void setNickName(String nickname){
        this.nickname=nickname;
    }

    public String getname(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public int getScore(){
        return Score;
    }

    public void setScore(int Score){
        this.Score=Score;
    }

    public int getNumberOfLifes(){
        return numberOfLifes;
    }

    public void setNumberOfLifes(int numberOfLifes){
        this.numberOfLifes=numberOfLifes;
    }

}
