package Service;

import entities.Project;

import java.util.List;

public interface ProjectService {
    List<Project> getAllProjectss();
     Project getProjectById(Long id);
     Project saveProject(Project project);
     List<Project> getProjectByDescription(String description);

}
