public class EnchancedPlayer {

    private String fullName;
    private int healthPercentage;
    private String weapon;

    public EnchancedPlayer(String fullName) {
        this(fullName, 100, "Sword");
    }

    public EnchancedPlayer(String fullName, int health, String weapon) {
        this.fullName = fullName;
        if (health <= 0) {
            this.healthPercentage = 0;
        } else if (health > 100) {
            this.healthPercentage = 100;
        } else {
            this.healthPercentage = health;
        }
        this.weapon = weapon;
    }
    public void loseHealth (int damage) {

        healthPercentage -= damage;
        if (healthPercentage <= 0) {
            System.out.println("You lose");
        }
    }
    public int healthRemaining() {
        return healthPercentage;
    }

    public void restoreHealth(int extraHealth) {
        healthPercentage += extraHealth;
        if (healthPercentage > 100) {
            healthPercentage = 100;
            System.out.println("Player has full hp");
        }
    }
}
