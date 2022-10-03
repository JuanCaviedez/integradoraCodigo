package model;

public class Treasure {
    private String name;
    private String url;
    private int scoreAwarded;

    Treasure(String name, String url, int scoreAwarded){
        this.name=name;
        this.url=url;
        this.scoreAwarded=scoreAwarded;
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
