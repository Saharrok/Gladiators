package org.example;

public class Gladiator {
    public int constitution;
    public int strength;
    public int xp;
    public int dexterity;
    public int level;
    public int charisma;
    public int basicAttack;
    public final int basicHp;
    public final boolean haveShield;
    private Object speed;
    private Object basicHP;
    private boolean critChance;

    public Gladiator(
            int constitution, int strength,
            int xp, int dexterity,
            int level, int charisma,
            int basicAttack, double v, int basicHp,
            boolean haveShield
    ) {
        this.constitution = constitution;
        this.strength = strength;
        this.xp = xp;
        this.dexterity = dexterity;
        this.level = level;
        this.charisma = charisma;
        this.basicAttack = basicAttack;
        this.basicHp = basicHp;
        this.haveShield = haveShield;
    }

    public int getConstitution() {
        return constitution;
    }

    public void setConstitution(int constitution) {
        this.constitution = constitution;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getCharisma() {
        return charisma;
    }

    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }

    public int getBasicAttack() {
        return basicAttack;
    }

    public int getBasicHp() {
        return basicHp;
    }

    public boolean isHaveShield() {
        return haveShield;
    }

    public int attack() {
    }
    public int winBattle(Object xp) {
    }

    public void takeDamage(int damage) {
    }

    public boolean isAlive() {
        boolean alive;
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public void loseBattle() {
    }

    public void negotiate() {
    }

    public Object getSpeed() {
        return speed;
    }

    public void setSpeed(Object speed) {
        this.speed = speed;
    }

    public void setBasicAttack(int basicAttack) {
        this.basicAttack = basicAttack;
    }

    public Object getBasicHP() {
        return basicHP;
    }

    public void setBasicHP(Object basicHP) {
        this.basicHP = basicHP;
    }

    public boolean getCritChance() {
        return critChance;
    }

    public void setCritChance(boolean critChance) {
        this.critChance = critChance;
    }
}