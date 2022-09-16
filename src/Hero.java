public class Hero {

    private int health ;
    private int damage;
    private String superPower ;




    public  Hero (int health ,int damage ,String superPower){  // конструктор 1
        this.health = health;
        this.damage = damage;
        this.superPower = superPower;
    }
    public Hero (int health , int damage ){   //конструктор2
        this.health = health ;
        this.damage = damage;
    }
    public int getHealth() {
        return health;
    }

    public int getDamage() {

        return damage;
    }

    public String getSuperPower() {

        return superPower;
    }


}
