//FrontEndDev inerits properties from BackEndDev.

//It inherits properties such as name,id,salary from above class.

class FrontEndDev extends BackEndDev {

    public String working_since;

    public String name;

    public int team_members;

    public String team_leader;

    //Constructor for FrontEndDev class.

    public FrontEndDev(String name,int id,Double salary,String working_since,Boolean scrum_master,String team_lead) {

        super(name,id,salary,working_since,scrum_master);

        team_leader=team_lead;

    }

    public void printEmplomentYears() {

        System.out.println(working_since);

    }

    public void assignProject(String project_name,int team_members,String front_end_framework) {

        project_name = "DB prokect";
        team_members = 3;
        front_end_framework = "java";


    }

    public void printAssignedProject(){

        System.out.println(project_name);

    }

}