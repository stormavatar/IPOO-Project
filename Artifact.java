import java.util.Random;

public class Artifact {

    Random random = new Random();

    private int weight;
    private int xp;
    private int ap;
    private int dp;
    private int coins;
    private String name;
    private String Type;
    private int index;

    public Artifact(int indexOfArtifact){
        switch(indexOfArtifact){
            case 0:
            setAsAttackPack();
            break;
            case 1:
            setAsDefensePack();
            break;
            case 2:
            setAsMonster();
            break;
            case 3:
            setAsAlien();
            break;
            case 4:
            setAsMonetarySmall();
            break;
            case 5:
            setAsMonetaryMedium();
            break;
            case 6:
            setAsMonetaryLarge();
            break;
            case 7:
            setAsKey();
            break;
            case 8:
            setAsVault();
            break;
        } 
    }

    public int getWeight() {
        return weight;
    }
    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        this.Type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCoins() {
        return coins;
    }

    public void setCoins(int coins) {
        this.coins = coins;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    public int getAp() {
        return ap;
    }

    public void setAp(int ap) {
        this.ap = ap;
    }

    public int getDp() {
        return dp;
    }

    public void setDp(int dp) {
        this.dp = dp;
    }
    public void setXp(int xp){
        this.xp = xp;
    }
    public int getXp(){
        return xp;
    }

    private void setAsAttackPack() {
        setName("Pacote De Ataque");
        setType("Attack Pack");
        ap = 50 + random.nextInt(51);
        setDp(0);
        setWeight(200);
        setCoins(0);
        index = 0;
    }
    public void setAsDefensePack() {
        setName("Pacote De Defesa");
        setType("Defense Pack");
        dp = 50 + random.nextInt(51);
        setAp(0);
        setWeight(200);
        setCoins(0);
        index = 1;
    }
    public void setAsMonster(){
        setName("Monstro intergalático");
        setType("Monster");
        ap = 50 + random.nextInt(51);
        setCoins(0);
        setDp(0);
        setWeight(0);
        xp = 3 + random.nextInt(1);
        index = 2;
    }
    public void setAsAlien(){
        setName("Alienígena");
        setType("Alien");
        ap = 20 + random.nextInt(31);
        setCoins(0);
        setDp(0);
        setWeight(0);
        xp = 1 + random.nextInt(1);
        index = 3;
    }
    public void setAsMonetarySmall(){
        setName("Pacote Monetário - Pequeno");
        setType("Monetary Small");
        setAp(0);
        setCoins(10);
        setDp(0);
        setWeight(100);
        setXp(1);
        index = 4;
    }
    public void setAsMonetaryMedium(){
        setName("Pacote Monetário - Médio");
        setType("Monetary Medium");
        setAp(0);
        setCoins(20);
        setDp(0);
        setWeight(200);
        setXp(2);
        index = 5;
    }
    public void setAsMonetaryLarge(){
        setName("Pacote Monetário - Large");
        setType("Monetary Large");
        setAp(0);
        setCoins(30);
        setDp(0);
        setWeight(300);
        setXp(3);
        index = 5;
    }
    public void setAsKey(){
        setName("A Chave (especial)");
        setType("KEY");
        setAp(0);
        setCoins(0);
        setDp(0);
        setWeight(100);
        setXp(0);
        index = 6;
    }
    public void setAsVault(){
        setName("O Cofre (especial)");
        setType("VAULT");
        setAp(0);
        setCoins(0);
        setDp(0);
        setWeight(100);
        setXp(0);
        index = 7;
    }     
}