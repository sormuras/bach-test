package project;

import run.bach.Project;

public class ProjectInfo implements Project.Composer {
  @Override
  public Project composeProject(Project project) {
    return project.withTargetsJava(9);
  }
}
