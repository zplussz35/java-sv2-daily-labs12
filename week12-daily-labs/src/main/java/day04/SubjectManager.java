package day04;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class SubjectManager {
    List<Subject> subjects = new ArrayList<>();

    public SubjectManager() {
    }

    public SubjectManager(List<Subject> subjects) {
        this.subjects = subjects;
    }

    public SubjectManager(String filename){
        readFromFile(filename);
    }

    private void readFromFile(String path){
        try(BufferedReader bf = Files.newBufferedReader(Path.of(path))){
            String line;
            int i=1;
            while((line= bf.readLine())!=null){
                subjects.add(new Subject(line,bf.readLine(),bf.readLine(),Integer.parseInt(bf.readLine())));
            }

        }catch (IOException ioe){
            throw new IllegalStateException("Cannot open file!");
        }
    }

    public int lessonNumber(String teacherName){
        int count=0;
        for (Subject s:subjects) {
            if(teacherName.equals(s.getTeacherName())){
                count++;
            }
        }
        return count;
    }
}
