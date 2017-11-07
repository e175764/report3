package jp.ac.uryukyu.ie.e175764;

public class LivingThings {
    String name;
    int hitPoint;
    int attack;
    boolean dead;


    public boolean isDead() {
        return dead;
    }

    public String getName() {
        return name;
    }

    public LivingThings (String name, int maximumHP, int attack){
        this.name = name;
        hitPoint = maximumHP;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }

    public void wounded(int damage) {
        hitPoint -= damage;
        if (hitPoint < 0) {
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
    }

}