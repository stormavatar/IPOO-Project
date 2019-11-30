import java.util.Random;

public class AttackPack {
    Random random = new Random();

    private int weight;
    private int xp;
    private int ap;
    private int dp;
    private int i;
    private int coins;
    private String name;

    public void attackPack() {
        name = "Pacote De Ataque";
        ap = 50 + random.nextInt(51);
        dp = 0;
        setWeight(200);
        coins = 0;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
