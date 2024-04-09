public class Students {
    String name;
    String surname;
    int magic;
    int transgressions;

    public Students(String name, String surname, int magic, int transgressions) {
        this.name = name;
        this.surname = surname;
        this.magic = magic;
        this.transgressions = transgressions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public int getTransgressions() {
        return transgressions;
    }

    public void setTransgressions(int transgressions) {
        this.transgressions = transgressions;
    }

    public void printStudentInfo() {
        System.out.println("Студент :" + getName() + getSurname());
        System.out.println("Магия : " + getMagic() + getTransgressions());
    }
}
