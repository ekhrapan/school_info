package academy.belhard.util;

import academy.belhard.dto.FullINfoDto;

import java.sql.ResultSet;
import java.sql.SQLException;

import static academy.belhard.reader.ReaderConstants.CSV_DELIMITER;

public class FullInfoUtil {

    public static FullINfoDto toDto(ResultSet resultSet) throws SQLException {
        int id = resultSet.getInt("id");
        String firstName = resultSet.getString("first_name");
        String lastName = resultSet.getString("last_name");
        int age = resultSet.getInt("age");
        String email = resultSet.getString("email");
        String title = resultSet.getString("school_title");
        String city = resultSet.getString("school_city");

        return new FullINfoDto(id, firstName, lastName, age, email, title, city);
    }

    public static String toCsvString(FullINfoDto dto) {
        return dto.getId() + CSV_DELIMITER +
                dto.getFirstName() + CSV_DELIMITER +
                dto.getLastName() + CSV_DELIMITER +
                dto.getAge() + CSV_DELIMITER +
                dto.getEmail() + CSV_DELIMITER +
                dto.getTitle() + CSV_DELIMITER +
                dto.getCity() + "\n";
    }
}
