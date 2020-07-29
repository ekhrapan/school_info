package academy.belhard;

import academy.belhard.db.FullInfoConnector;
import academy.belhard.db.PupilConnector;
import academy.belhard.dto.FullINfoDto;
import academy.belhard.entity.Pupil;
import academy.belhard.reader.PupilReader;
import academy.belhard.writer.FullInfoWriter;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import static academy.belhard.reader.ReaderConstants.FULL_INFO_EXPORT_FILE;
import static academy.belhard.reader.ReaderConstants.PUPILS_IMPORT_FILE;

public class Main {

    public static void main(String[] args) throws SQLException, IOException {
        List<FullINfoDto> dtos = FullInfoConnector.getAll();

        System.out.println(dtos);

        FullInfoWriter writer = new FullInfoWriter(FULL_INFO_EXPORT_FILE);
        writer.writeAll(dtos);

//        for (Pupil pupil : pupils) {
//            try {
//                PupilConnector.add(pupil);
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
    }
}
