package oop2.Encapsulation;

public class EnhancedPlayer {
    private String fullName;
    private int healthPercentage;
    private String weapon;

    public EnhancedPlayer(String fullName) {
        this(fullName, 100, "sword");
    }

    public EnhancedPlayer(String fullName, int health, String weapon) {
        this.fullName = fullName;
        if (health <= 0) {
            this.healthPercentage = 1;
        } else if (health > 100) {
            this.healthPercentage = 100;
        } else {
            this.healthPercentage = health;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        this.healthPercentage -= damage;
        if (healthPercentage < 0) {
            System.out.println("Player is knocked out of the game");
            healthPercentage = 0;
            return;
        }
    }

    public void restoreHealth(int extraHealth) {
        this.healthPercentage += extraHealth;

        if (healthPercentage > 100) {
            System.out.println("Player health is already 100%");
            this.healthPercentage = 100;
            return;
        }
    }

    public int remainingHealth() {
        return this.healthPercentage;
    }
}
