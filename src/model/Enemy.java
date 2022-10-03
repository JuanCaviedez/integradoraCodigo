package model;

public class Enemy {
    private String name;
    private int defeatScore;
    private int winScore;

    Enemy(String name, int defeatScore, int winScore){
        this.name=name;
        this.defeatScore=defeatScore;
        this.winScore=winScore;
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

