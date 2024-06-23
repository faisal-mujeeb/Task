package Service;

import entities.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ProjectServiceImplementation  {
    @Autowired
    private projectRepository productRepository;


    public List<Project> getAllProducts() {
        return projectRepository.findAll();
    }


    public Project getProductById(Long id) {
        return projectRepository.findById(id);
    }


    public Project saveProduct(Project project) {
        return projectRepository.save(project);
    }


    public void deleteProject(Long id) {
        projectRepository.deleteById(id);
    }


    public List<Project> getProjectByDescription(String description) {
        return productRepository.findByDescription(description);
    }
}
