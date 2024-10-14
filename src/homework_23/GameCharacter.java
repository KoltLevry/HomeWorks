package homework_23;

abstract class GameCharacter {
    abstract void attack();
}

class Warrior extends GameCharacter{
    @Override
    public void attack(){
        System.out.println("Warrior атакує мечем, завдаючи фізичної шкоди.");
    }
}
class Mage extends GameCharacter{
    @Override
    public void attack(){
        System.out.println("Mage кидає вогняну кулю, завдаючи магічної шкоди.");
    }
}
class Archer extends GameCharacter{
    @Override
    public void attack(){
        System.out.println("Archer стріляє стрілою з лука, завдаючи шкоди на відстані.");
    }
}
class Assassin extends GameCharacter{
    @Override
    public void attack(){
        System.out.println("Assassin завдає швидких і смертельних ударів кинджалом.");
    }
}
class Tank extends GameCharacter{
    @Override
    public void attack(){
        System.out.println("Tank вдаряє ворога щитом, примушуючи його атакувати себе.");
    }
}
class Healer extends GameCharacter{
    @Override
    public void attack(){
        System.out.println("Healer застосовує світлове заклинання для слабкої атаки ворога.");
    }
}
class Paladin extends GameCharacter{
    @Override
    public void attack(){
        System.out.println("Paladin атакує священним мечем, завдаючи фізичної та священної шкоди.");
    }
}
class Berserk extends GameCharacter{
    @Override
    public void attack(){
        System.out.println("Berserk атакує ворога сокирою, завдаючи величезної шкоди.");
    }
}
class Necromancer extends GameCharacter{
    @Override
    public void attack(){
        System.out.println("Necromancer використовує темну магію або викликає скелета для атаки.");
    }
}
class Druid extends GameCharacter{
    @Override
    public void attack(){
        System.out.println("Druid використовує магію природи або атакує в формі звіра.");
    }
}

class Main{
    public static void main(String[] args) {
        GameCharacter[] gameCharacters = {
                new Warrior(),
                new Mage(),
                new Archer(),
                new Assassin(),
                new Tank(),
                new Healer(),
                new Paladin(),
                new Berserk(),
                new Necromancer(),
                new Druid(),
        };

        for (GameCharacter gameCharacter : gameCharacters){
            gameCharacter.attack();
        }
    }
}