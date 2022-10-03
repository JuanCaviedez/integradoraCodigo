package model;

import java.util.ArrayList;

public class Level {
    private String id;
    private int requireScore;
    private ArrayList<Enemy> enemies;
    private ArrayList<Treasure> treasures;
    //private ArrayList treasures = new ArrayList(50);

    Level(String id, int requireScore){
        this.id=id;
        this.requireScore=requireScore;
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

    public boolean addEnemy(Enemy newEnemy){
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
    }
}
