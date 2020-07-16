package by.company.enteties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pet {

    private int id;
    private Category category;
    private String name;
    private Tags tags;
    private PetStatus petStatus;
    private String status;

    public Pet(int id, Category category, String name, Tags tags, String status) {
        this.id = id;
        this.category = category;
        this.name = name;
        this.tags = tags;
        this.status = status;
    }
}
