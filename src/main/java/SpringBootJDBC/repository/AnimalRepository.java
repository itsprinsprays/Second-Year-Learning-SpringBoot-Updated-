package SpringBootJDBC.repository;
import SpringBootJDBC.model.Animal;

import org.springframework.jdbc.core.RowMapper;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AnimalRepository implements AnimalImp{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private RowMapper<Animal> rowMapper = (rs, column) -> 
			new Animal(rs.getString("name"), rs.getString("type"), rs.getInt("id")
			);
			
	//create
	
	public int createAnimal(Animal animal) {
		String sql = ("Insert into animals");
		return jdbcTemplate.update(sql, animal.getName(), animal.getType());
	}
	
	// Read
	@Override
    public List<Animal> findAll() {
        String sql = "SELECT * FROM animals";
        return jdbcTemplate.query(sql, rowMapper);
    }
	@Override
    public Animal findByID(int ID) {
        String sql = "SELECT * FROM animals WHERE id=?";
        return jdbcTemplate.queryForObject(sql, rowMapper, ID);
    }

    // Update
	@Override
    public int updateAnimal(Animal animal) {
        String sql = "UPDATE animals SET name=?, type=? WHERE id=?";
        return jdbcTemplate.update(sql, animal.getName(), animal.getType(), animal.getID());
    }

    // Delete
	@Override
    public int deleteAnimal(int ID) {
        String sql = "DELETE FROM animals WHERE id=?";
        return jdbcTemplate.update(sql, ID);
    }
			
	

}
