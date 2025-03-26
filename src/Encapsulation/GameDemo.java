
package Encapsulation;

public class GameDemo {
    public static void main(String[] args) {

        GameCharacter player = new GameCharacter(100);

        player.takeDamage(30);
        System.out.println("Current Health: " + player.getHealth()); // Using getter to check health


        player.heal(20);
        System.out.println("Updated Health: " + player.getHealth());

        player.setHealth(-50);
        System.out.println("Final Health: " + player.getHealth());
    }
}


