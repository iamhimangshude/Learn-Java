package oop2.Encapsulation;

public class Main {
    public static void main(String[] args) {
        // Player player = new Player();
        // player.fullName = "Tim";
        // player.health = 20;
        // player.weapon = "Sword";

        // int damage = 10;
        // player.loseHealth(damage);
        // System.out.printf("Remaining Health = %d%n", player.remainingHealth());

        // player.loseHealth(11);
        // System.out.printf("Remaining Health = %d%n", player.remainingHealth());

        EnhancedPlayer himangshu = new EnhancedPlayer("Himangshu", 100, "sword");
        System.out.println("Initial health: " + himangshu.remainingHealth());

    }
}
