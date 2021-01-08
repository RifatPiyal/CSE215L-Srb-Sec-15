 //Constructor for DBA class.
class DBA extends Employees {

    public String working_since;

    public String project_name;

    public int team_members;

    //Constructor for DBA class.

    public DBA(String name,int id,Double salary, String work_since) {

        super(name,id,salary);

        working_since = work_since;

    }

    //printing employee years.

    public void printEmployeeYears(String work_since) {

        System.out.println(work_since);

    }

    public void assignProject(String project_name,int team_members,String query_language) {

        // Write ur code according to ur choice by scanner or by giving input directly.
        project_name = "DB prokect";
        team_members = 3;
        query_language = "Sample query";

    }

    public void printAssignedProject() {

        System.out.println(project_name);

    }

}