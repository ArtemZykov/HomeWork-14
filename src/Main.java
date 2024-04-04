public class Main {
    public static void main(String[] args) {
        Grifindor harryPotter = new Grifindor("Гарри",  "Поттер", 9, 85, 35,
                74, 5);
        Grifindor germionaGrange = new Grifindor("Гермиона", "Грейндж", 17, 3, 12,
                45, 1);
        Grifindor ronUizli = new Grifindor("Рон", "Уизли", 19, 22, 1,
                11, 2);

        Slizerin drakMalfloy = new Slizerin("Драк", "Малфлой", 81, 1, 12,
                3, 17,1,12);
        Slizerin grehemMontegy = new Slizerin("Грекхем", "Монтегри", 13, 22, 66,
                43, 1,11,12);
        Slizerin grigoriyLeps = new Slizerin("Григорий", "Лепс", 11, 77, 87,
                99, 67, 13,88);

        Puffenduy zahariySmit = new Puffenduy("Захария", "Смит", 12, 3, 7,
                7, 45);
        Puffenduy sedrikDiggory = new Puffenduy("Седрик", "Диггори", 76, 43, 1,
                12, 2);
        Puffenduy dzhastinFinchFlether = new Puffenduy("Джастин", "Финч-Флетчер", 12, 26,
                32, 1, 5);

        Kogtevran chgouChang = new Kogtevran("Чжоу", "Чанг", 12, 1, 11,
                34, 23);
        Kogtevran padmaPatil = new Kogtevran("Падма", "Патил", 6, 67, 54,
                2, 1);
        Kogtevran markusBelbi = new Kogtevran("Маркус", "Белби", 3, 1, 54,
                1, 9);


        System.out.println();
        harryPotter.printStudentInfo();
        harryPotter.compareWith(germionaGrange, ronUizli);
        grigoriyLeps.printStudentInfo();
        grigoriyLeps.compareWith(grigoriyLeps,grehemMontegy);
        zahariySmit.printStudentInfo();
        chgouChang.compareWith(chgouChang,markusBelbi);
        chgouChang.printStudentInfo();
        padmaPatil.compareWith(padmaPatil, markusBelbi);



    }





}