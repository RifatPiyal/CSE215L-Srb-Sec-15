import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Quiz {

    private int id;
    private int marks;

    public Quiz(int id, int marks) {
        this.id = id;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public static void main(String[] args) {


        String fileName = "quiz.txt";
        Quiz[] quizzes = new Quiz[20];
        int count = 0;
        try {
            Scanner fileReader = new Scanner(new File(fileName));
            while (fileReader.hasNextInt() && count<quizzes.length){
                int id, marks;
                id = fileReader.nextInt();
                marks = fileReader.nextInt();
                quizzes[count++]  = new Quiz(id,marks);
            }
            fileReader.close();



        } catch (FileNotFoundException e) {
            System.out.println("Error ** could not find/open file: "+ fileName);
            return;
        }

        int highest = 0;
        for(int i=0;i<count;i++){
            System.out.println("ID: "+quizzes[i].getId()+" mark: "+quizzes[i].getMarks());
            if(quizzes[i].getMarks()>quizzes[highest].getMarks())highest = i;
        }
        System.out.println("Highest marks obtained by ID: "+quizzes[highest].getId());

    }
}