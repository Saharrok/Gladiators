package org.example;

public class Monster {

    public int hp;
    public int attack;
    public String name;
    private Object speed;
    private Object xp;

    public Monster(int hp, int attack, String name) {
        this.hp = hp;
        this.attack = attack;
        this.name = name;
    }

    public Monster(String monsterName, int attack, int i, int i1, int i2, int i3, int i4, int i5, double v, boolean b) {
    }


    public void takeDamage(int damage) {
    }

    public boolean isAlive() {
    }

    public Object getXp() {
        return xp;
    }

    public void setXp(Object xp) {
        this.xp = xp;
    }

    public int attack() {
    }

    public Object getSpeed() {
        return speed;
    }

    public void setSpeed(Object speed) {
        this.speed = speed;
    }
}