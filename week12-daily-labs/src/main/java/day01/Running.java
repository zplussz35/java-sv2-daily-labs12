package day01;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Running {
    private List<Run> runs= new ArrayList<>();

    public void readRunningPerformanceMonthly(String path){
        try(BufferedReader br = Files.newBufferedReader(Path.of(path))){
            String line;
            br.readLine();
            while((line=br.readLine())!=null){
                Run run= createObjectFromLine(line);
                runs.add(run);
            }

        }catch (IOException ioe){
            throw new IllegalArgumentException("Cannot open file");
        }
    }

    private Run createObjectFromLine(String line) {
        String[] data=line.split(";");
        return new Run(Double.parseDouble(data[0].split(" ")[0]), LocalDate.parse(data[1]));
    }
}
