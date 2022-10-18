package model;

public class Treasure {
    private String name;
    private String url;
    private int scoreAwarded;
    private Treasure[] treasures = new Treasure[50];

    public Treasure(String name, String url, int scoreAwarded){
        this.name=name;
        this.url=url;
        this.scoreAwarded=scoreAwarded;
    }

/**
 * Adicionar tesoro
 * Este metodo adiciona un tesoro cada vez que el usuario desde la interfaz selecciona la opcion de "Registrar nivel"
 * @param newTreasure Este es el parametro de tipo Treasure que recibira el metodo
 * @return Status, si el tesoro fue correctamente creado devolvera un valor boolean y asi indicará al repetidor que se detenga
 * @see model.Treasure
 */

    public boolean addTreasure(Treasure newTreasure){
        boolean status = false;
        for (int i=0; i<=treasures.length && !status; i++){
            if (treasures[i]==null){
                status = true;
                treasures[i]=newTreasure;
            }
        }
    return status;
    }

    /**
     * Lanzar un mensaje en pantalla
    * Este metodo mostrará al usuario un mensaje en pantalla para indicar que el tesoro fue creado exitosamente
     * @exception if En caso de que el metodo de adicionar tesoro regrese un valor falso, no se verá ejecutado el metodo 
     * 
     */

    public void show(){
        addTreasure(null);
        if (addTreasure(null)==true){
            System.out.println("El tesoro fue creado correctamente: "+ getnameT());
        }
    }

    public int getscoreAwarded(){
        return scoreAwarded;
    }

    public void setscoreAwarded(int scoreAwarded){
        this.scoreAwarded=scoreAwarded;
    }

    public String getnameT(){
        return name;
    }

    public void setNameT(String name){
        this.name=name;
    }

    public String geturl(){
        return url;
    }

    public void seturl(String url){
        this.url=url;
    }
}
