public class Unit {

    protected String name;
    protected String surname = "Popov";
    protected int health = 100;
    protected int defense = 100;
    protected int power = 10;

    public Unit(String name) {
        Game.countOfUnits++;
        this.name = name;
    }

/*
    public Unit(String name, String surname) {
        this(name);
        this.surname = surname;
    }
*/

    protected float criticalChance = 0.1f;
    protected float parryChance = 0.1f;

    public int getHealth() {//getter
        return health; //this.health could go as well
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public float getCriticalChance() {
        return criticalChance;
    }

    public void setCriticalChance(float criticalChance) {
        this.criticalChance = criticalChance;
    }

    public float getParryChance() {
        return parryChance;
    }

    public void setParryChance(float parryChance) {
        this.parryChance = parryChance;
    }

    public void attack(Unit unit) {
        unit.getDamage(power);
    }

    public void getDamage(int damage) {
        this.health -= damage;
    }

    @Override
    public String toString() {
        return "Unit{" +
                "health=" + health +
                ", defense=" + defense +
                ", power=" + power +
                '}';
    }

    public void print() {
        System.out.println(this);
    }
    public void print(String str) {
        System.out.println(str + " " + this);
    }
}
