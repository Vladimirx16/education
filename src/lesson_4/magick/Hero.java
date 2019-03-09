package lesson_4.magick;

public class Hero extends Knight {
    private String skill;
    public String getSkill(){
        return skill;
    }
    public void setSkill(String skill){
        this.skill = skill;
    }
    @Override
    public void setCharacteristic(){
        System.out.println("Имя персонажа:");
        setName(input.next());
        System.out.println("Пол персонажа:");
        setGender(input.next());
        System.out.println("Раса персонажа:");
        setRace(input.next());
        System.out.println("Возраст персонажа:");
        setAge(input.nextInt());
        System.out.println("Рост персонажа:");
        setHeight(input.nextInt());
        System.out.println("Оружие персонажа:");
        setWeapon(input.next());
        System.out.println("Навык персонажа:");
        setSkill(input.next());
    }
    public void printInformation(){
        System.out.println("-------------Характеристики героя-------------");
        System.out.println("Имя героя: " + getName());
        System.out.println("Пол героя: " + getGender());
        System.out.println("Раса героя: " + getRace());
        System.out.println("Возраст героя: " + getAge());
        System.out.println("Рост героя: " + getHeight());
        System.out.println("Используемое оружие: " + getWeapon());
        System.out.println("Навык героя: " + getSkill());
        System.out.println("-----------------------------------------------");
    }
}
