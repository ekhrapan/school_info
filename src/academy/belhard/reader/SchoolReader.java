package academy.belhard.reader;

import academy.belhard.entity.School;
import academy.belhard.util.SchoolUtil;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SchoolReader {
    private String filepath;

    public SchoolReader(String filepath) {
        this.filepath = filepath;
    }

    public List<School> readSchools() {
        List<School> schools = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filepath))) {
            String line = reader.readLine();

            while ((line = reader.readLine()) != null) {
                School school = SchoolUtil.toObject(line);

                schools.add(school);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return schools;
    }
}
