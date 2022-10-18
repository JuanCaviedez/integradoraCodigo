package model;

public class Level {
    private String id;
    private int requireScore;
    private Level[] listLevel = new Level[10];

    public Level(String id, int requireScore){
        this.id=id;
        this.requireScore=requireScore;
    }
/**
 * Adicionar nivel
 * Este metodo adiciona un nivel cada vez que el usuario, desde la interfaz, selecciona la opcion de "Registrar nivel"
 * @param newLevel Este es el parametro de tipo Level que recibira el metodo
 * @return Status, si el nivel fue correctamente creado devolvera un valor boolean y asi indicará al repetidor que se detenga
 * @see model.Level
 */
    public boolean addLevel(Level newLevel){
        boolean status = false;
        for (int i=0; i<=listLevel.length && !status; i++){
            if (listLevel[i]==null){
                status = true;
                listLevel[i]=newLevel;
            }
        }
    return status;
    }

    /**
     * Lanzar un mensaje en pantalla
    * Este metodo mostrará al usuario un mensaje en pantalla para indicar que el nivel fue creado exitosamente
     * @exception if En caso de que el metodo de adicionar nivel regrese un valor falso, no se verá ejecutado el metodo 
     * 
     */

    public void imprimir(){
        addLevel(null);
        if (addLevel(null)==true){
            System.out.println("El nivel fue creado correctamente: "+ getIdLevel());
        }
    }

    public String getIdLevel(){
        return id;
    }

    public void setIdLevel(String id){
        this.id=id;
    }

    public int getrequireScore(){
        return requireScore;
    }

/*    public boolean addEnemy(Enemy newEnemy){
        boolean status = false;
        if (enemies.add(newEnemy)){
            status = true;
            enemies.add(newEnemy);
        }
        return status;
    }

    public boolean addTreasure(Treasure newTreasure){
        boolean status = false;
        if (treasures.add(newTreasure)){
            status = true;
            treasures.add(newTreasure);
        }
        return status;
    } */
}
