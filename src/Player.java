public class Player {
    private String name;
    private Integer healthPercentage;
    private Weapon weapon;

    public Player(String name, Integer healthPercentage, Weapon weapon) {
        this.name = name;
        this.weapon = weapon;
        if (healthPercentage > 100) {
            this.healthPercentage = 100;
        } else if (healthPercentage < 0) {
            this.healthPercentage = 0;
        } else {
            this.healthPercentage = healthPercentage;
        }
    }

    public Integer healthRemaining() {
        return this.healthPercentage;
    }

    public void loseHealth(Integer damage) {
        this.healthPercentage = this.healthPercentage - damage;
        if (this.healthPercentage < 0)
            System.out.println(name + " player has been knocked out of game");

    }

    public void restoreHealth(Integer healthPoint) {
        this.healthPercentage = this.healthPercentage + healthPoint;
        if (this.healthPercentage > 100) {
            this.healthPercentage = 100;
        }
    }

}
