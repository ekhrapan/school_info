package academy.belhard.db;

import academy.belhard.entity.School;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SchoolConnector {

    private static final String ADD = "INSERT INTO schools (id, title, city) VALUES(?, ?, ?)";

    public static void add(School school) throws SQLException {
        Connection connection = CommonDbConnector.getConnection();

        try (
                PreparedStatement statement = connection.prepareStatement(ADD)
        ) {

            statement.setInt(1, school.getId());
            statement.setString(2, school.getTitle());
            statement.setString(3, school.getCity());

            statement.executeUpdate();
        }
    }
}
