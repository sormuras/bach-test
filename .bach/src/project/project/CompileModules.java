package project;

import run.bach.ToolCall;
import run.bach.project.CompileModulesTool;

public class CompileModules extends CompileModulesTool {
  @Override
  protected ToolCall jarWithTargetedClassesAndResources(ToolCall jar, OperationContext context) {
    context.bach().info("TODO Here be a better implemenation...");
    return super.jarWithTargetedClassesAndResources(jar, context);
  }
}
