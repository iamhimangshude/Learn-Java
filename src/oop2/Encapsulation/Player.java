package oop2.Encapsulation;

public class Player {
    public String fullName;
    public int health;
    public String weapon;

    public Player() {
    }

    public Player(String fullName, int health, String weapon) {
        this.fullName = fullName;
        this.health = health;
        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        this.health -= damage;
        if (health < 0) {
            System.out.println("Player is knocked out of the game");
            health = 0;
            return;
        }
    }

    public void restoreHealth(int extraHealth) {
        this.health += extraHealth;

        if (health > 100) {
            System.out.println("Player health is already 100%");
            this.health = 100;
            return;
        }
    }

    public int remainingHealth() {
        return this.health;
    }
}
