import { Project, ProjectStatus } from "./models/project";

const project = new Project(
  "p1",
  "Learn TypeScript",
  "Complete the drag & drop project",
  1,
  ProjectStatus.Active,
);

console.log(project);
