package academy.belhard;

import academy.belhard.db.PupilConnector;
import academy.belhard.entity.Pupil;
import academy.belhard.reader.PupilReader;

import java.sql.SQLException;
import java.util.List;

import static academy.belhard.reader.ReaderConstants.PUPILS_IMPORT_FILE;

public class Main {

    public static void main(String[] args) {
        PupilReader pupilReader = new PupilReader(PUPILS_IMPORT_FILE);
        List<Pupil> pupils = pupilReader.readPupils();

        System.out.println(pupils);

        for (Pupil pupil : pupils) {
            try {
                PupilConnector.add(pupil);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
