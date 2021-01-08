//BackEndDev inherits properties from DBA class.

class BackEndDev extends DBA {

    public String working_since;

    public String project_name;

    public int team_members;

    public Boolean scrum_master;

    public BackEndDev(String name,int id,Double salary,String working_since,Boolean scrum) {

        //Using super keywork to inherit name,salry,id from DBA class.

        super(name,id,salary,working_since);

        scrum_master = scrum;

    }

    public void printEmplomentYears(String working_since) {

        System.out.println(working_since);

    }

    public void assignProject(String project_name,int team_members,String server_side_framework) {

        project_name = "DB prokect";
        team_members = 3;
        server_side_framework = "HTML5";



    }

    public void printAssignedProject() {

        System.out.println(project_name);

    }

}