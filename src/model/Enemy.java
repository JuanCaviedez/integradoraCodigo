package model;

public class Enemy {
    private String name;
    private int defeatScore;
    private int winScore;
    private Enemy[] enemies = new Enemy[25];

    public Enemy(String name, int defeatScore, int winScore){
        this.name=name;
        this.defeatScore=defeatScore;
        this.winScore=winScore;
    }
/**
 * Adicionar Enemigo
 * Este metodo adiciona un enemigo cada vez que el usuario desde la interfaz selecciona la opcion de "Registrar nivel"
 * @param newEnemy Este es el parametro de tipo Enemy que recibira el metodo
 * @return Status, si el enemigo fue correctamente creado devolvera un valor boolean y asi indicará al repetidor que se detenga
 * @see model.Enemy
 */
    public boolean addEnemy(Enemy newEnemy){
        boolean status = false;
        for (int i=0; i<=enemies.length && !status; i++){
            if (enemies[i]==null){
                status = true;
                enemies[i]=newEnemy;
            }
        }
    return status;
    }
    /**
     * Lanzar un mensaje en pantalla
    * Este metodo mostrará al usuario un mensaje en pantalla para indicar que el enemigo fue creado exitosamente
     * @exception if En caso de que el metodo de adicionar enemigo regrese un valor falso, no se verá ejecutado el metodo 
     * 
     */
    public void show(){
        addEnemy(null);
        if (addEnemy(null)==true){
            System.out.println("El enemigo fue creado correctamente: "+ getname());
        }
    }

    public String getname(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public int getdefeatScore(){
        return defeatScore;
    }

    public void setdefeatScore(int defeatScore){
        this.defeatScore=defeatScore;
    }

    public int getwinScore(){
        return winScore;
    }

    public void setwinScore(int winScore){
        this.winScore=winScore;
    }
}

