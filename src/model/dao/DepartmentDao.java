package model.dao;

import java.util.List;
import model.entities.Department;

/**
 *
 * @author PC
 */
public interface DepartmentDao {
    void insert(Department obj);
    void update(Department obj);
    void deleteById(Integer Id);
    Department findById(Integer id);
    List<Department> findAll();
}