package Controller;

import Service.ProjectService;
import entities.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class ProjectController {

    @Autowired
    private ProjectService productService;

    @GetMapping
    public List<Project> getAllProducts() {
        return productService.getAllProject();
    }

    @GetMapping("/{id}")
    public Project getProductById(@PathVariable Long id) {
        return productService.getProjectById(id);
    }

    @PostMapping
    public Project createProduct(@RequestBody Project project) {
        return projectService.saveProject(project);
    }

    @PutMapping("/{id}")
    public Project updateProduct(@PathVariable Long id, @RequestBody Project projectDetails) {
        Project project = projectService.getProjectById(id);
        if (project == null) {
            return null;
        }
        project.setDescription(projectDetails.getDescription());
        project.setCreationDate(projectDetails.getCreationDate());
        project.setCompletionDate(projectDetails.getCompletionDate());
        return projectService.saveProject(project);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable Long id) {
        projectService.deleteProject(id);
        return ResponseEntity.noContent().build();
    }

}
