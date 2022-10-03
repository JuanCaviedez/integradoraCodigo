package model;

public class Player {
    
    private String nickname;
    private String name;
    private int Score;
    private int numberOfLifes;

    Player(String nickname, String name, int Score, int numberOfLifes){
        this.nickname=nickname;
        this.name=name;
        this.Score=Score;
        this.numberOfLifes=numberOfLifes;
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
