package oop;

public class PoJoMain{
    public static void main(String[] args) {
        for (int i =1; i<=5;i++){
            // PoJoStudent s = new PoJoStudent("S92300" + i, 
            // switch(i){
            //     case 1 -> "Mary";
            //     case 2 -> "Anne";
            //     case 3 -> "Tim";
            //     case 4 -> "Harry";
            //     case 5 -> "Himangshu";
            //     default -> "Anonymous";
            // }, "05/11/1985", "Java Masterclass");
            RecordStudent s = new RecordStudent("S92300" + i, 
            switch(i){
                case 1 -> "Mary";
                case 2 -> "Anne";
                case 3 -> "Tim";
                case 4 -> "Harry";
                case 5 -> "Himangshu";
                default -> "Anonymous";
            }, "05/11/1985", "Java Masterclass");            
            // System.out.println(s);
        }

        PoJoStudent pojoStudent = new PoJoStudent("S923006", "Ann", "05/11/1985", "Java Masterclass");
        RecordStudent recordStudent = new RecordStudent("S923007", "Tim", "05/11/1985", "Java Masterclass");
        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        System.out.println(pojoStudent.getName() + " is taking " + pojoStudent.getClassList());
        System.out.println(recordStudent.name() + " is taking " + recordStudent.classList());

        // Adding (or setting data)
        pojoStudent.setClassList(pojoStudent.getClassList() + ", Java OCP Exam 829");
        // recordStudent.setClassList(recordStudent.classList() + ", Java OCP Exam 829");

    }
}