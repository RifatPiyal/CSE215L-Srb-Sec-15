package lab04;
import java.util.Scanner;
import java.lang.Math;



public class lab04HW02 {
    public static void main(String[] args) {
        double degrees = 45.0; 
  
        // convert degrees to radians 
        double radians = Math.toRadians(degrees); 
  
        // sin() method to get the sine value 
        double sinValue = Math.sin(radians); 
  
        // prints the sine value 
        System.out.println("sin(" + degrees + ") = " + sinValue);
    }
    
    double degrees = 45.0; 
  
        // convert degrees to radians 
        double radians = Math.toRadians(degrees); 
  
        // cos() method to get the cosine value 
        double cosValue = Math.cos(radians); 
  
        // prints the cosine value 
        System.out.println("cos(" + degrees + ") = " + cosValue); 
    
    
}
        double degrees = 45.0; 
  
        // convert degrees to radians 
        double radians = Math.toRadians(degrees); 
  
        // cos() method to get the tangent value 
        double tanValue = Math.tan(radians); 
  
        // prints the tangent value 
        System.out.println("tan(" + degrees + ") = " + tanValue); 
    } 
      //log  
    double val1 = 39564.9;
      double val2 = 1;
      System.out.println("Math.log(" + val1 + ") = " + Math.log(val1));
      System.out.println("Math.log(" + val2 + ") = " + Math.log(val2));
   }

    //tan
double degrees = 45.0; 
  
        // convert degrees to radians 
        double radians = Math.toRadians(degrees); 
  
        // cos() method to get the tangent value 
        double tanValue = Math.tan(radians); 
  
        // prints the tangent value 
        System.out.println("tan(" + degrees + ") = " + tanValue); 
    } 
         //pow
    double a = 30; 
        double b = 2; 
        System.out.println(Math.pow(a, b)); 
  
        a = 3; 
        b = 4; 
        System.out.println(Math.pow(a, b)); 
  
        a = 2; 
        b = 6; 
        System.out.println(Math.pow(a, b)); 
    } 
        //sqrt
    double a = 30; 
  
        System.out.println(Math.sqrt(a)); 
  
        a = 45; 
  
        System.out.println(Math.sqrt(a)); 
  
        a = 60; 
  
        System.out.println(Math.sqrt(a)); 
  
        a = 90; 
  
        System.out.println(Math.sqrt(a)); 
    }
        //rounding
  // float numbers 
      float x = 4567.9874f; 
  
      // find the closest int for these floats 
      System.out.println(Math.round(x)); 
        
      float y = -3421.134f; 
  
      // find the closest int for these floats 
      System.out.println(Math.round(y));   
        
      double positiveInfinity = Double.POSITIVE_INFINITY; 
  
      // returns the Integer.MAX_VALUE value when  
      System.out.println(Math.round(positiveInfinity));
        }
        //celi
    double a = 1.878;
    System.out.println(Math.ceil(a));  // 2.0

    // value equals to 5 after decimal
    double b = 1.5;
    System.out.println(Math.ceil(b));  // 2.0

    // value less than 5 after decimal
    double c = 1.34;
    System.out.println(Math.ceil(c));  // 2.0
  }

    //floor
 double a = 1.878;
    System.out.println(Math.ceil(a));  // 2.0

    // value equals to 5 after decimal
    double b = 1.5;
    System.out.println(Math.ceil(b));  // 2.0

    // value less than 5 after decimal
    double c = 1.34;
    System.out.println(Math.ceil(c));  // 2.0
  }
    //rint

        System.out.println(Math.rint(1.878));  // 2.0

    // value less than 5 after decimal
    System.out.println(Math.rint(1.34));   // 1.0

    // value equal to 5 after decimal
    System.out.println(Math.rint(1.5));    // 2.0

    // value equal to 5 after decimal
    System.out.println(Math.rint(2.5));    // 2.0

  }
    //equals 
     Integer obj1 = new Integer(43);  
        Integer obj2 = new Integer(78);  
        System.out.print("obj1 and obj2 are equal. True or False? = ");  
        System.out.println(obj1.equals(obj2));                    
        obj1 = new Integer(55);  
        obj2 = new Integer(55);  
        System.out.print("obj1 and obj2 are equal. True or false? = ");  
        System.out.println(obj1.equals(obj2));                 
    }  
    //equlasignorecase
    String str1 = "GeeKS FOr gEEks"; 
    String str2 = "geeKs foR gEEKs"; 
    String str3 = "ksgee orF geeks"; 
  
    // if we ignore the cases both the strings are equal. 
    boolean result1 = str2.equalsIgnoreCase(str1); 
    System.out.println("str2 is equal to str1 = " + result1); 
  
    // even if ignoring the cases both the strings are not equal. 
    boolean result2 = str2.equalsIgnoreCase(str3); 
    System.out.println("str2 is equal to str3 = " + result2); 
  } 
    //compareTO
    Integer x = 5;
      
      System.out.println(x.compareTo(3));
      System.out.println(x.compareTo(5));
      System.out.println(x.compareTo(8));            
   }
    //comparetoignorecase
    String str1 = "Strings are immutable";
      String str2 = "Strings are immutable";
      String str3 = "Integers are not immutable";

      int result = str1.compareToIgnoreCase( str2 );
      System.out.println(result);

      result = str2.compareToIgnoreCase( str3 );
      System.out.println(result);

      result = str3.compareToIgnoreCase( str1 );
      System.out.println(result);
   }
    //stratswith
String s = "This is just a sample string";  
		
	//checking whether the given string starts with "This"
	System.out.println(s.startsWith("This"));  
		
	//checking whether the given string starts with "Hi"
	System.out.println(s.startsWith("Hi"));  
   }
       //endswith
       String str = "Java String tutorial";
	if(str.endsWith("tutorial")) {
		System.out.println("The Given String ends with tutorial");
	}
   }
    //contains
    int[] arr = { 5, 4, 3, 2, 1 }; 
  
        int target = 3; 
  
        
        if (Ints.contains(arr, target)) 
            System.out.println("Target is present"
                               + " in the array"); 
        else
            System.out.println("Target is not present"
                               + " in the array"); 
    } 
       //substring
       public String substring(int beginIndex) {  
       if (beginIndex < 0) {  
           throw new StringIndexOutOfBoundsException(beginIndex);  
       }  
       int subLen = value.length - beginIndex;  
       if (subLen < 0) {  
           throw new StringIndexOutOfBoundsException(subLen);  
       }  
       return (beginIndex == 0) ? this : new String(value, beginIndex, subLen);  
   }  
        //substringbegainendindex
        String Str = new String("Welcome to my house");

      System.out.print("Return Value :" );
      System.out.println(Str.substring(1, 5) );
   }
     //index of s
     String Str = new String("Welcome to geeksforgeeks");
 
        // Initialising search string
        String subst = new String("geeks");
 
        // print the index of initial character
        // of Substring
        // prints 11
        System.out.print("Found geeks starting at position : ");
        System.out.print(Str.indexOf(subst));
    }
        //index of s start
        // Initialising string
        String Str = new String("Welcome to geeksforgeeks");
 
        // Initialising search string
        String subst = new String("geeks");
 
        // print the index of initial character
        // of Substring aftr 14th position
        // prints 19
        System.out.print("Found geeks(after 14th index) starting at position : ");
        System.out.print(Str.indexOf(subst, 14));
    }
        //index of s start
        // Initialising string
        String Str = new String("Welcome to geeksforgeeks");
 
        // Initialising search string
        String subst = new String("geeks");
 
        // print the index of initial character
        // of Substring aftr 14th position
        // prints 19
        System.out.print("Found geeks(after 14th index) starting at position : ");
        System.out.print(Str.indexOf(subst, 14));
    }
    //last index of ch
String Str = new String("Welcome to geeksforgeeks"); 
  
        System.out.print("Found Last Index of g at : "); 
  
        // Last index of 'g' will print 
        // prints 19 
        System.out.println(Str.lastIndexOf('g')); 
    } 

     // lastIndexOf(String str)
     String Str = new String("Welcome to geeksforgeeks"); 
  
        System.out.print("Found substring geeks at : "); 
  
        // start index of last occurrence of "geeks' 
        // prints 19 
        System.out.println(Str.lastIndexOf("geeks")); 
    } 
    //last index of s from index
    String Str = new String("Welcome to geeksforgeeks"); 
  
        System.out.print("Found substring geeks at : "); 
  
        // start index of last occurrence of "geeks' 
        // before 15 
        // prints 11 
        System.out.println(Str.lastIndexOf("geeks", 15)); 
    } 
}

