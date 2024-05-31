package org.example;

import java.util.Random;
import java.util.Scanner;

class Main {
    private int constitution;
    private int strength;
    private double xp;
    private int dexterity;
    private int level;
    private int basicAttack;
    private int basicHP;
    private double critChance;
    private int charisma;
    private boolean haveShield;
    private int currentHP;
    private int speed;

    public int main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ваш класс гладитора:");
        System.out.println("1. Сатигариус-ловкость");
        System.out.println("2. Галус-танк");
        System.out.println("3. ССпартак-сила");
        int choice = scanner.nextInt();

        Gladiator gladiator = null;
        switch (choice) {
            case 1:
                gladiator = new Gallus(5, 2, 0, 1, 0, 3, 10, 30, true);
                System.out.println("Ваш выбор: Галус");
                break;
            case 2:
                gladiator = new Sagittarius(2, 2, 0, 5, 0, 2, 8, 20, false);
                System.out.println("Ваш выбор: Сатигарус");
                break;
            case 3:
                gladiator = new Spartac(2, 5, 0, 2, 0, 1, 14, 15, false);
                System.out.println("Ваш выбор: Спартак");
                break;
            default:
                System.out.println("Что то пошло не так");
        }


        public void takeDamage ( double damage){
            this.currentHP -= damage;
            if (this.currentHP < 0) {
                this.currentHP = 0;
            }
        }

        public boolean isAlive () {
            return this.currentHP > 0
        }

        public double getXp () {
            return xp;
        }
    }

                Scanner scanner = new Scanner(System.in);


            Gladiator gladiator = null;
                while (true) {
                    System.out.println("Your choise?");
                    System.out.println("1 Fight");
                    System.out.println("2 Level up");
                    System.out.println("3 Change characteristics");
                    int value = scanner.nextInt();
                    if (value == 1) {
                        fight(gladiator);
                    } else if (value == 2) {
                        levelUp(gladiator);
                    } else if (value == 3) {
                        changeCharacteristic(gladiator, scanner);
                    }
                }
            }

            private static void fight(Gladiator gladiator) {
                Random random = new Random();
                String monsterName = null;
                Monster monster = new Monster(monsterName, 5, 5, 3, 10, 1, 7, 50, 0.2, false);

                Scanner scanner = new Scanner(System.in);
                while (gladiator.isAlive() && monster.isAlive()) {
                    System.out.println("Ваше действие:");
                    System.out.println("1. Fight");
                    System.out.println("2. trick");
                    System.out.println("3. Run away");
                    int choice = scanner.nextInt();

                    switch (choice) {
                        case 1:
                            int damage = gladiator.attack();
                            System.out.println("gladiator Damage " + damage);
                            monster.takeDamage(damage);
                            if (!monster.isAlive()) {
                                System.out.println("Gladiator win");
                                gladiator.winBattle(monster.getXp());
                                break;
                            }
                            damage = monster.attack();
                            System.out.println("Monster Damage " + damage );
                            gladiator.takeDamage(damage);
                            if (!gladiator.isAlive()) {
                                System.out.println("Monster wins");
                                gladiator.loseBattle();
                                break;
                            }
                            break;
                        case 2:
                            if (random.nextDouble() < (double) gladiator.getCharisma() / (gladiator.getCharisma() + 10)) {
                                System.out.println("you bribed the monster");
                                gladiator.negotiate();
                            } else {
                                System.out.println("the monster is fair and didn’t take it");
                                int monsterDamage = monster.attack();
                                System.out.println("Monster Damage " + monsterDamage +);
                                gladiator.takeDamage(monsterDamage);
                                if (!gladiator.isAlive()) {
                                    System.out.println("Monster wins");
                                    gladiator.loseBattle();
                                    break;
                                }
                                int gladiatorDamage = gladiator.attack();
                                System.out.println("gladiator Damage " + gladiatorDamage);
                                monster.takeDamage(gladiatorDamage);
                                if (!monster.isAlive()) {
                                    System.out.println("Gladiator win");
                                    gladiator.winBattle(monster.getXp());
                                    break;
                                }
                            }
                            break;
                        case 3:
                             if (random.nextDouble() < 0.3) {
                                System.out.println("you ran away");
                                break;
                            } else {
                                System.out.println("the monster caught upМ");
                                int monsterDamage = monster.attack();
                                System.out.println("Monster Damage " + monsterDamage );
                                gladiator.takeDamage(monsterDamage);
                                if (!gladiator.isAlive()) {
                                    System.out.println("Monster wins");
                                    gladiator.loseBattle();
                                    break;
                                }
                                int gladiatorDamage = gladiator.attack();
                                 System.out.println("gladiator Damage " + gladiatorDamage);
                                monster.takeDamage(gladiatorDamage);
                                if (!monster.isAlive()) {
                                    System.out.println("Gladiator win");
                                    gladiator.winBattle(monster.getXp());
                                    break;
                                }
                            }
                            break;
                        default:
                            System.out.println("что то пошло не так");
                            break;
                    }
                }
            }
            private static void levelUp(Gladiator gladiator) {
                System.out.println("Level up!");
            }

            private static void changeCharacteristic(Gladiator gladiator, Scanner scanner) {
                System.out.println("Your choise?");
                System.out.println("1. Constitution");
                System.out.println("2. Strength");
                System.out.println("3. Dexterity");
                System.out.println("4. BasicAttack");
                System.out.println("5. BasicHP");
                System.out.println("6. CritChance");
                System.out.println("7. Charisma");

                int value = scanner.nextInt();
                switch (value) {
                    case 1:
                        gladiator.setConstitution(gladiator.getConstitution() + 1);
                        System.out.println("Constitution + 1");
                        break;
                    case 2:
                        gladiator.setStrength(gladiator.getStrength() + 1);
                        System.out.println("Strength + 1");
                        break;
                    case 3:
                        gladiator.setDexterity(gladiator.getDexterity() + 1);
                        System.out.println("Dexterity + 1");
                        break;
                    case 4:
                        gladiator.setBasicAttack(gladiator.getBasicAttack() + 1);
                        System.out.println("BasicAttack + 1");
                        break;
                    case 5:
                        gladiator.setBasicHP(gladiator.getBasicHP() + 1);
                        System.out.println("BasicHP + 1");
                        break;
                    case 6:
                        gladiator.setAlive(gladiator.getCritChance() + 1);
                        System.out.println("CritChance + 1");
                        break;
                                 case 7:
                        gladiator.setCharisma(gladiator.getCharisma() + 1);
                        System.out.println("Charisma + 1");
                        break;
                    default:
                        System.out.println("Что то пошло не так");
                        break;
                }
            }
        }



