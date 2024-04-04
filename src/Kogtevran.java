public class Kogtevran extends Students {
    private int smart;//умный
    private int wise;//мудрый
    private int creative; // креативный
    public Kogtevran(String name, String surname, int magic, int transgressions, int smart, int wise, int creative) {
        super(name, surname, magic, transgressions);
        this.smart = smart;
        this.wise = wise;
        this.creative = creative;
    }
    public int getSmart() {
        return smart;
    }
    public void setSmart(int smart) {
        this.smart = smart;
    }
    public int getWise() {
        return wise;
    }
    public void setWise(int wise) {
        this.wise = wise;
    }
    public int getCreative() {
        return creative;
    }
    public void setCreative(int creative) {
        this.creative = creative;
    }
    public void printStudentInfo() {
        super.printStudentInfo();
        System.out.println("Свойства Когтеврана: ");
        System.out.println("Трудолюбие: " + smart);
        System.out.println("Верность: " + wise);
        System.out.println("Честность: " + creative);
    }
    public void compareWith(Kogtevran student1, Kogtevran student2) {
        int sum1 = student1.smart + student1.wise + student1.creative;
        int sum2 = student2.smart + student2.wise + student2.creative;
        if (sum1 > sum2) {
            System.out.println(student1.name + " является лучшим учеником Когтеврана.");
        } else if (sum1 < sum2) {
            System.out.println(student2.name + " является лучшим учеником Когтеврана.");
        } else {
            System.out.println("У " + student1.name + " и " + student2.name + " одинаковая сумма свойств Когтеврана.");
        }
    }

}
