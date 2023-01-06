package tn.esprit.scrumfarah.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.scrumfarah.Entities.Project;
import tn.esprit.scrumfarah.Entities.Sprint;
import tn.esprit.scrumfarah.repository.RepositoryProject;
import tn.esprit.scrumfarah.repository.RepositoySprint;

import java.util.Set;

@Service
public class ServiceSprint implements IServiceSprint {
    @Autowired
    RepositoryProject repositoryProject;
    @Autowired
    RepositoySprint repositoySprint;

    @Override
    public Project addProject(Project project) {
        Set<Sprint> sprints = project.getSprints();
        for (Sprint sprint : sprints) {
            sprint.setProject(project);

        }

        return repositoryProject.save(project);
    }
}

