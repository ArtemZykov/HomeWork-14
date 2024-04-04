public class Grifindor extends Students {
    private int nobility;
    private int honor;
    private int bravery;
    public Grifindor(String name, String surname, int nobility, int honor, int bravery, int transgressions, int magic) {
        super(name, surname, magic, transgressions);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }
    public int getNobility() {
        return nobility;
    }
    public void setNobility(int nobility) {
        this.nobility = nobility;
    }
    public int getHonor() {
        return honor;
    }
    public void setHonor(int honor) {
        this.honor = honor;
    }
    public int getBravery() {
        return bravery;
    }
    public void setBravery(int bravery) {
        this.bravery = bravery;
    }
    public void printStudentInfo() {
        super.printStudentInfo();
        System.out.println("Свойства Гриффиндорцев: ");
        System.out.println("Благородство: " + nobility);
        System.out.println("Честь: " + honor);
        System.out.println("Храбрость: " + bravery);

    }
    public void compareWith(Grifindor student1, Grifindor student2) {
        int sum1 = student1.nobility + student1.honor + student1.bravery;
        int sum2 = student2.nobility + student2.honor + student2.bravery;

        if (sum1 > sum2) {
            System.out.println(student1.name + " является лучшим учеником Грифиндора.");
        } else if (sum1 < sum2) {
            System.out.println(student2.name + " является лучшим учеником Грифиндора.");
        } else {
            System.out.println("У " + student1.name + " и " + student2.name + " одинаковая сумма свойств Грифиндора.");
        }
    }

}
