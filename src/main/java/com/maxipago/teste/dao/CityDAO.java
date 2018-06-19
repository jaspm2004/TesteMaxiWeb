package com.maxipago.teste.dao;

import com.maxipago.teste.db.ConnectionFactory;
import com.maxipago.teste.dto.CityDTO;
import javax.inject.Inject;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jose San Pedro
 */
public class CityDAO {

    @Inject
    private ConnectionFactory connectionFactory;

    public List<CityDTO> findAll() {
        List<CityDTO> cityList = new ArrayList<>();
        String sql = "SELECT id, name, latitude, longitude FROM city";
        
        try (PreparedStatement preparedStatement = connectionFactory.getConnection().prepareStatement(sql)) {
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                CityDTO cityDTO = new CityDTO(resultSet.getLong(1)
                                            , resultSet.getString(2)
                                            , resultSet.getDouble(3)
                                            , resultSet.getDouble(4));
                cityList.add(cityDTO);
            }

            resultSet.close();
            return cityList;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return cityList;
    }
}
