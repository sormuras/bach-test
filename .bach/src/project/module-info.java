module project {
  requires run.bach;

  provides run.bach.Project.Composer with
      project.ProjectInfo;
  provides run.bach.ToolOperator with
      project.CompileModules;
}
