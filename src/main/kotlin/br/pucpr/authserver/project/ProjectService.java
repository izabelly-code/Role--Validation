package br.pucpr.authserver.project;

public class ProjectService {
    private final ProjectRepository projectRepository;

    public ProjectService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    public Project create(Project project) {
        return projectRepository.save(project);
    }

    public Project findById(Long id) {
        return projectRepository.findById(id).orElseThrow(() -> new ProjectNotFoundException(id));
    }

    public List<Project> findAll() {
        return projectRepository.findAll();
    }

    public void deleteById(Long id) {
        projectRepository.deleteById(id);
    }
}
