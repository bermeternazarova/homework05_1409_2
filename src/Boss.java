public class Boss {
    private int bossHealth;
    private  int bossDamage;
    private   String defenceType ;

    public Boss ( int bossHealth , int bossDamage , String defenceType){
        this.bossHealth = bossHealth;
        this.bossDamage = bossDamage;
        this.defenceType = defenceType;
    }
    public int getBossHealth() {
        return bossHealth;
    }

    public int getBossDamage() {
        return bossDamage;
    }

    public String getDefenceType() {

        return defenceType;
    }

    public void setBossHealth(int bossHealth) {

        this.bossHealth = bossHealth;
    }

    public void setBossDamage(int bossDamage)
    {
        this.bossDamage = bossDamage;
    }

    public void setDefenceType(String defenceType) {

        this.defenceType = defenceType;
    }




}
