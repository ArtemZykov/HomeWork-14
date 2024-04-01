public class Slizerin extends Students {
    int cunning; // хитрость
    int determination; // решительность
    int ambition; // амбиции
    int resourcefulness; // находчивость
    int thirstForPower; // жажда власти

    public Slizerin(String name, String surname, int magic, int transgressions, int cunning, int determination, int ambition,
                    int resourcefulness, int thirstForPower) {
        super(name, surname, magic, transgressions);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }
    public int getCunning() {
        return cunning;
    }
    public void setCunning(int cunning) {
        this.cunning = cunning;
    }
    public int getDetermination() {
        return determination;
    }
    public void setDetermination(int determination) {
        this.determination = determination;
    }
    public int getAmbition() {
        return ambition;
    }
    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }
    public int getResourcefulness() {
        return resourcefulness;
    }
    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }
    public int getThirstForPower() {
        return thirstForPower;
    }
    public void setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
    }
    public void printPeople() {
        super.printPeople();
        System.out.println("Свойства Слизарена: ");
        System.out.println("Хитрость: " + cunning);
        System.out.println("Решительность: " + determination);
        System.out.println("Амбициозность : " + ambition);
        System.out.println(" Находчивость " + resourcefulness);
        System.out.println( "Жажда власти: " + thirstForPower);
    }
    public void compareWith(Slizerin student1, Slizerin student2) {
        int sum1 = student1.cunning + student1.determination + student1.ambition + student1.resourcefulness + student1.thirstForPower;
        int sum2 = student2.cunning + student2.determination + student2.ambition + student2.resourcefulness + student2.thirstForPower;
        if (sum1 > sum2) {
            System.out.println(student1.name + " " + student1. surname + " является лучшим учеником Слизарена.");
        } else if (sum1 < sum2) {
            System.out.println(student2.name + " является лучшим учеником Слизарена.");
        } else {
            System.out.println("У " + student1.name + " и " + student2.name + " одинаковая сумма свойств Слизарена.");
        }
    }
}
