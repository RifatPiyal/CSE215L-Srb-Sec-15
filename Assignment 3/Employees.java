//Employees class

class Employees {

    public String name;

    public int id;

    public String email;

    public Double salary;

    //Employees constructor as given in the class diagram.

    public Employees(String name,int id, Double salary) {

        this.name = name;

        this.id=id;

        this.salary=salary;

    }

    //getname method for getting name

    public String getName() {

        return name;

    }

    //set method to store the name value

    public void setName(String name) {

        this.name = name;

    }

    //method to return id

    public int getId(){

        return id;

    }

    //method to set id

    public void setId(int id){

        this.id = id;

    }

    //method to return email

    public String getEmail() {

        return email;

    }

    //method to set email

    public void setEmail(String email) {

        this.email = email;

    }

    //verigying email using regex expression.

    public Boolean verifyEmail(String email) {

        String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";

      return email.matches(regex);

    }

    //Printing status.

    public void printStatus(){
        System.out.println("Employee name is: "+name+"\n"+"emp id: "+id+"\nsalary:"+salary);

    }

}