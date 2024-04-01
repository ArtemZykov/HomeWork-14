public class Puffenduy extends Students {
    int hardworking;
    int loyal;
    int honest;
    public Puffenduy(String name, String surname, int magic, int transgressions, int hardworking, int loyal, int honest) {
        super(name, surname, magic, transgressions);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }
    public int getHardworking() {
        return hardworking;
    }
    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }
    public int getLoyal() {
        return loyal;
    }
    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }
    public int getHonest() {
        return honest;
    }
    public void setHonest(int honest) {
        this.honest = honest;
    }
    public void printPeople() {
        super.printPeople();
        System.out.println("Свойства Пуффендуев: ");
        System.out.println("Трудолюбие: " + hardworking);
        System.out.println("Верность: " + loyal);
        System.out.println("Честность: " + honest);
    }
    public void compareWith(Puffenduy student1, Puffenduy student2) {
        int sum1 = student1.hardworking + student1.loyal + student1.honest;
        int sum2 = student2.hardworking + student2.loyal + student2.honest;
        if (sum1 > sum2) {
            System.out.println(student1.name + " является лучшим учеником Пуффендуя.");
        } else if (sum1 < sum2) {
            System.out.println(student2.name + " является лучшим учеником Пуффендуя.");
        } else {
            System.out.println("У " + student1.name + " и " + student2.name + " одинаковая сумма свойств Пуффендуя.");
        }
    }
}
