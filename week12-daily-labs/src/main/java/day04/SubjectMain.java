package day04;

import org.w3c.dom.ls.LSOutput;

public class SubjectMain {


    public static void main(String[] args) {
        SubjectManager subjectManager = new SubjectManager("src/main/resources/beosztas.txt");
        System.out.println("Szarvas Szamanta: "+subjectManager.lessonNumber("Szarvas Szamanta"));
        System.out.println("Puma Pongor: "+subjectManager.lessonNumber("Puma Pongor"));
        System.out.println("Albatrosz Aladin: "+subjectManager.lessonNumber("Albatrosz Aladin"));
    }

}
