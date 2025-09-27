package SpringBootJDBC.repository;
import SpringBootJDBC.model.Animal;

import org.springframework.jdbc.core.RowMapper;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AnimalRepository {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private RowMapper<Animal> rowMapper = (rs, column) -> 
			new Animal(rs.getString("name"), rs.getString("type"), rs.getInt("id")
			);
			
	public int create(Animal animal) {
		String sql = ("Insert into animals");
		return jdbcTemplate.update(sql, animal.getName(), animal.getType());
	}
	
	// Read
    public List<Animal> findAll() {
        String sql = "SELECT * FROM animals";
        return jdbcTemplate.query(sql, rowMapper);
    }

    public Animal findById(int id) {
        String sql = "SELECT * FROM animals WHERE id=?";
        return jdbcTemplate.queryForObject(sql, rowMapper, id);
    }

    // Update
    public int update(Animal animal) {
        String sql = "UPDATE animals SET name=?, type=? WHERE id=?";
        return jdbcTemplate.update(sql, animal.getName(), animal.getType(), animal.getID());
    }

    // Delete
    public int delete(int id) {
        String sql = "DELETE FROM animals WHERE id=?";
        return jdbcTemplate.update(sql, id);
    }
			
	

}
