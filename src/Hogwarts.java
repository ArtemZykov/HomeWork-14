public class Hogwarts {
    public static void compareStudents (Students student1, Students student2) {
        int magicalPower1 = student1.getMagic();
        int magicalPower2 = student2.getMagic();

        int teleportDistance1 = student1.getTransgressions();
        int teleportDistance2 = student2.getTransgressions();

        if (magicalPower1 > magicalPower2) {
            System.out.println(student1.getName() + " превосходит " + student2.getName() + " по силе магии.");
        } else if (magicalPower1 < magicalPower2) {
            System.out.println(student2.getName() + " превосходит " + student1.getName() + " по силе магии.");
        } else {
            System.out.println("Сравнение между " + student1.getName() + " и " + student2.getName() + " невозможно, так как их силы равны.");
        }
        if (teleportDistance1 > teleportDistance2) {
            System.out.println(student1.getName() + " превосходит " + student2.getName() + " по телепортации.");
        } else if (teleportDistance1 < teleportDistance2) {
            System.out.println(student2.getName() + " превосходит " + student1.getName() + " по телепортации.");
        } else {
            System.out.println("Сравнение между " + student1.getName() + " и " + student2.getName() + " невозможно, так как их силы равны.");

        }
    }

}
