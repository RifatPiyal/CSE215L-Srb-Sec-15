import java.util.Scanner;

public class User {
     //instance variables
        private String name;
        private int id;
        private String email;
        
        //getters and setters
        public String getName() {
                return name;
        }
        public int getId() {
                return id;
        }
        public String getEmail() {
                return email;
        }
        public void setName(String name) {
                this.name = name;
        }
        public void setId(int id) {
                this.id = id;
        }
        public void setEmail(String email) {
                this.email = email;
        }
        
        
        public boolean verifyEmail(String email){
                return this.getEmail().equals(email);
        }
        
}

