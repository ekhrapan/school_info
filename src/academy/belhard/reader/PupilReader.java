package academy.belhard.reader;

import academy.belhard.entity.Pupil;
import academy.belhard.entity.School;
import academy.belhard.util.PupilUtil;
import academy.belhard.util.SchoolUtil;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PupilReader {
    private String filepath;

    public PupilReader(String filepath) {
        this.filepath = filepath;
    }

    public List<Pupil> readPupils() {
        List<Pupil> pupils = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filepath))) {
            String line = reader.readLine();

            while ((line = reader.readLine()) != null) {
                Pupil pupil = PupilUtil.toObject(line);

                pupils.add(pupil);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return pupils;
    }
}
