package by.company.storage;

import by.company.enteties.*;
import org.springframework.stereotype.Component;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/*@Component
public class PetStorage {

    Connection connection = null;
    private final String url = "jdbc:postgresql://localhost:5432/petstorage";

    private boolean addPetData(Pet pet){
        try {
            connection = DriverManager.getConnection(url);
            PreparedStatement preparedStatement = connection.prepareStatement("insert into pet_table values (?,?,?)");
            preparedStatement.setInt(1,pet.getId());
            preparedStatement.setString(2,pet.getName());
            preparedStatement.setString(3,pet.getStatus());
            preparedStatement.execute();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    private boolean addPetCategory(Pet pet){
        try {
            connection = DriverManager.getConnection(url);
            PreparedStatement preparedStatement = connection.prepareStatement("insert into category_table values (?,?)");
            preparedStatement.setInt(1,pet.getCategory().getId());
            preparedStatement.setString(2,pet.getCategory().getName());
            preparedStatement.execute();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    private boolean addPetTags(Pet pet){
        try {
            connection = DriverManager.getConnection(url);
            PreparedStatement preparedStatement = connection.prepareStatement("insert into tags_table values (?,?)");
            preparedStatement.setInt(1,pet.getTags().getId());
            preparedStatement.setString(2,pet.getTags().getName());
            preparedStatement.execute();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public void addPet(Pet pet){
        addPetData(pet);
        addPetCategory(pet);
        addPetTags(pet);
    }

    public List<Pet> getByStatus(String status){

        List<Pet> petList = new ArrayList<>();

        int id = Integer.parseInt(null);
        Category category = null;
        int categoryId = category.getId();
        String categoryName = category.getName();
        String name = null;
        Tags tags = null;
        int tagsId = tags.getId();
        String tagsName = tags.getName();

        try {
            connection = DriverManager.getConnection(url);
            PreparedStatement preparedStatement = connection.prepareStatement("select * from pet_table pt where pt.status = ?");
            preparedStatement.setString(1,status);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                id = resultSet.getInt(1);
                categoryId = resultSet.getInt(2);
                categoryName = resultSet.getString(3);
                name = resultSet.getString(4);
                tagsId = resultSet.getInt(5);
                tagsName = resultSet.getString(6);
            }
           // Pet pet = new Pet(id,category,name,tags,petStatus);  //?
            Pet pet = new Pet(id,category,name,tags,status);
            petList.add(pet);
            connection.close();
            return petList;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}*/
