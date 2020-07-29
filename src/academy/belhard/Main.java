package academy.belhard;

import academy.belhard.entity.School;
import academy.belhard.reader.SchoolReader;

import java.util.List;

import static academy.belhard.reader.ReaderConstants.PUPILS_IMPORT_FILE;

public class Main {

    public static void main(String[] args) {
        SchoolReader schoolReader = new SchoolReader(PUPILS_IMPORT_FILE);
        List<School> schools = schoolReader.readSchools();

        System.out.println(schools);
    }
}
