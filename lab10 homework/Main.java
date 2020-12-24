
public class Main {

    public static void main(String[] args) {
        Patient patient1 = new Patient("aa", -1, "cold");
        Patient patient2 = new Patient("b", -23, "cough");
        Patient patient3 = new Patient("Rifat", 24, "diabetes");
        System.out.println("valid name: " + patient3.getName() + "\nvalid age: " + patient3.getAge());
    }
}
