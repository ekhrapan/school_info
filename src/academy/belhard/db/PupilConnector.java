package academy.belhard.db;

import academy.belhard.entity.Pupil;
import academy.belhard.entity.School;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PupilConnector {

    private static final String ADD = "INSERT INTO pupils (id, first_name, last_name, age, email, school_id) VALUES(?, ?, ?, ?, ?, ?)";

    public static void add(Pupil pupil) throws SQLException {
        Connection connection = CommonDbConnector.getConnection();

        try (
                PreparedStatement statement = connection.prepareStatement(ADD)
        ) {

            statement.setInt(1, pupil.getId());
            statement.setString(2, pupil.getFirstName());
            statement.setString(3, pupil.getLastName());
            statement.setInt(4, pupil.getAge());
            statement.setString(5, pupil.getEmail());
            statement.setInt(6, pupil.getSchoolId());

            statement.executeUpdate();
        }
    }
}
