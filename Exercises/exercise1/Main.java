import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student {
    String name;
    List<Integer> quizScores;

    public Student(String name, List<Integer> quizScores) {
        this.name = name;
        this.quizScores = quizScores;
    }
}

class PartTimeStudent extends Student {
    public PartTimeStudent(String name, List<Integer> quizScores) {
        super(name, quizScores);
    }
}

class FullTimeStudent extends Student {
    List<Integer> examScores;

    public FullTimeStudent(String name, List<Integer> quizScores, List<Integer> examScores) {
        super(name, quizScores);
        this.examScores = examScores;
    }
}

class Session {
    List<Student> students;

    public Session() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void calculateAverageQuizScores() {
        for (Student student : students) {
            double sum = 0;
            for (int quiz : student.quizScores) {
                sum += quiz;
            }
            double average = sum / student.quizScores.size();
            System.out.println(student.name + "'s average quiz score: " + average);
        }
    }

    public void printQuizScoresAscending() {
        List<Integer> allQuizScores = new ArrayList<>();
        for (Student student : students) {
            allQuizScores.addAll(student.quizScores);
        }
        Collections.sort(allQuizScores);
        System.out.println("Quiz scores in ascending order: " + allQuizScores);
    }

    public void printPartTimeStudents() {
        System.out.println("Part-Time Students:");
        for (Student student : students) {
            if (student instanceof PartTimeStudent) {
                System.out.println(student.name);
            }
        }
    }

    public void printFullTimeExamScores() {
        System.out.println("Full-Time Students Exam Scores:");
        for (Student student : students) {
            if (student instanceof FullTimeStudent) {
                FullTimeStudent fullTimeStudent = (FullTimeStudent) student;
                System.out.println(student.name + "'s exam scores: " + fullTimeStudent.examScores);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Session session = new Session();

        for (int i = 1; i <= 20; i++) {
            List<Integer> quizScores = new ArrayList<>();
            for (int j = 0; j < 15; j++) {
                quizScores.add((int) (Math.random() * 101));
            }

            if (i % 2 == 0) {
                List<Integer> examScores = new ArrayList<>();
                examScores.add((int) (Math.random() * 101));
                examScores.add((int) (Math.random() * 101));
                session.addStudent(new FullTimeStudent("FullTimeStudent" + i, quizScores, examScores));
            } else {
                session.addStudent(new PartTimeStudent("PartTimeStudent" + i, quizScores));
            }
        }

        session.calculateAverageQuizScores();
        session.printQuizScoresAscending();
        session.printPartTimeStudents();
        session.printFullTimeExamScores();
    }
}
