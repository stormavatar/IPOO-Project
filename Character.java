
public class Character {
    private String name ;
    private int ap;
    private int dp;
    private int xp;
    private String sector;
    private Artifact[] bag;
    

    public Character() {
        this.name = "";
        this.ap = 0;
        this.dp = 0;
        this.xp = 0;
	}

	public void setName(String name){
        this.name = name;
    }
    public void setAp(int ap){
        this.ap = ap;
    }
    public void setDp(int dp){
        this.dp = dp;
    }
    public void setXp(int xp){
        this.xp = xp;
    }
    public String getName() {
        return this.name;
    }
    public int getAp(){
        return this.ap;
    }
    public int getDp(){
       return this.dp; 
    }
    public int getXp(){
        return this.xp;
    }

    public void bag(){
        bag = new Artifact[21];
         
    }

}

