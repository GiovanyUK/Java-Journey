public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            LPAStudent s = new LPAStudent("592300" + i,
                    switch (i) {
                        case 1 -> "Dragoshy";
                        case 2 -> "Glont";
                        case 3 -> "Bebe";
                        case 4 -> "Anghel";
                        case 5 -> "Tanase";
                        default -> "Anonymous";
                    },
                    "05/11/2000",
                    "Java Masterclass");
            System.out.println(s);
        }

        Student pojoStudent = new Student("S923006", "Bowgan",
                "05/11/1970", "Java Masterclass");
        LPAStudent recordStudent = new LPAStudent("S923007", "Mihai",
                "05/11/1970", "Java Masterclass");
        System.out.println(pojoStudent);
        System.out.println(recordStudent);
        pojoStudent.setClassList(pojoStudent.getClassList() + " , Java OCP Exam 829");
        System.out.println(pojoStudent.getName() + " is taking "
                + pojoStudent.getClassList());
        System.out.println(recordStudent.name() + " is taking "
                + recordStudent.classList());
    }
}
