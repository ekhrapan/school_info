package academy.belhard.util;

import academy.belhard.entity.School;

import static academy.belhard.reader.ReaderConstants.CSV_DELIMITER;

public class SchoolUtil {

    public static School toObject(String line) {
        String[] schoolsFields = line.split(CSV_DELIMITER);

        int id = Integer.parseInt(schoolsFields[0]);
        String title = schoolsFields[1];
        String city = schoolsFields[2];

        return new School(id, title, city);
    }
}
