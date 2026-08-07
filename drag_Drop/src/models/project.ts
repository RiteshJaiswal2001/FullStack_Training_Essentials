// A project can only be Active or Finished.
export enum ProjectStatus {
  Active,

  Finished,
}

// This class represents one project.
export class Project {
  constructor(
    // Unique id
    public id: string,

    // Project title
    public title: string,

    // Project description
    public description: string,

    // Number of people assigned
    public people: number,

    // Current project status
    public status: ProjectStatus,
  ) {}
}
