public class Main {
    public static void main(String[] args) {
//        Player player = new Player();
//        player.fullName = "Tim";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining hp = " + player.healthRemaining());
//        player.health = 200;
//        player.loseHealth(11);
//        System.out.println("Remaining hp = " + player.healthRemaining());
        EnchancedPlayer tim = new EnchancedPlayer("Tim");
        System.out.println("Initial health is " + tim.healthRemaining());
    }
}
