package Encapsulation;//class BankAccount {
//    private double balance;
//
//
//
//    public void deposit(double amount) {
//        if (amount > 0) {
//            balance += amount;
//            System.out.println("Deposited: $" + amount);
//        } else {
//            System.out.println("Deposit amount must be positive!");
//        }
//    }
//
//    public void withdraw(double withdrawAmount) {
//        if (withdrawAmount > 0 && withdrawAmount <= balance) {
//            balance -= withdrawAmount;
//            System.out.println("Withdrawn: $" + withdrawAmount);
//        } else {
//            System.out.println("Invalid withdrawal amount!");
//        }
//    }
//
//
//    public double getBalance() {
//        return balance;
//    }
//}


class GameCharacter {
    private int health;


    public GameCharacter(int health) {
        if (health > 0) {
            this.health = health;
        } else {
            System.out.println("Health must be positive! Setting default health to 100.");
            this.health = 100;
        }
    }


    public int getHealth() {
        return health;
    }


    public void setHealth(int health) {
        if (health > 0) {
            this.health = health;
        } else {
            System.out.println("Health cannot be negative!");
        }
    }


    public void takeDamage(int damage) {
        if (damage > 0 && damage <= health) {
            health -= damage;
            System.out.println("Character took " + damage + " damage.");
        } else {
            System.out.println("Invalid damage amount!");
        }
    }


    public void heal(int healAmount) {
        if (healAmount > 0) {
            health += healAmount;
            System.out.println("Character healed by " + healAmount);
        } else {
            System.out.println("Invalid heal amount!");
        }
    }
}


