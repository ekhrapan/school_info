package academy.belhard.util;

import academy.belhard.entity.Pupil;
import academy.belhard.entity.School;

import static academy.belhard.reader.ReaderConstants.CSV_DELIMITER;

public class PupilUtil {

    public static Pupil toObject(String line) {
        String[] pupilsFields = line.split(CSV_DELIMITER);

        int id = Integer.parseInt(pupilsFields[0]);
        String firstName = pupilsFields[1];
        String lastName = pupilsFields[2];
        int age = Integer.parseInt(pupilsFields[3]);
        String email = pupilsFields[4];
        int schoolId = Integer.parseInt(pupilsFields[5]);

        return new Pupil(id, firstName, lastName, age, email, schoolId);
    }
}
