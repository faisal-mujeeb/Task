package Repository;

import entities.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjectRepository extends JpaRepository<Project,Long> {
    List<Project> findByID(Long Id);
    List<Project> findByDescription(String description);
    List<Project> findByProjectStatus(String projectStatus);
    List<Project> findByCreationDate(String creationDate);
    List<Project> findByCompletionDate(String completionDate);



}
