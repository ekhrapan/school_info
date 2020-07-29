package academy.belhard.db;

import academy.belhard.dto.FullINfoDto;
import academy.belhard.entity.Pupil;
import academy.belhard.util.FullInfoUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FullInfoConnector {
    private static final String SELECT_ALL = "SELECT p.id id, p.first_name first_name, p.last_name last_name, p.age age, p.email email, s.title school_title, s.city school_city FROM pupils p LEFT JOIN schools s ON p.school_id=s.id ORDER BY p.first_name, p.last_name";

    public static List<FullINfoDto> getAll() throws SQLException {
        List<FullINfoDto> result = new ArrayList<>();

        Connection connection = CommonDbConnector.getConnection();

        try (
                PreparedStatement statement = connection.prepareStatement(SELECT_ALL);
                ResultSet resultSet = statement.executeQuery()
        ) {

            while (resultSet.next()) {
                FullINfoDto dto = FullInfoUtil.toDto(resultSet);
                result.add(dto);
            }
        }

        return result;
    }
}
