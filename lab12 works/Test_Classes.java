
package lab12;

//Answer

import java.util.ArrayList;

public class Test_Classes {

    //main method
    public static void main(String[] args) {
        Product p1=new ElectronicDevice("Phone",100,"M1","W1");
        ClothingItem p2=new ClothingItem("Shirt",10,"Silk");
        ElectronicDevice p3=new ElectronicDevice("Computer",1000,"C1","W2");
        p3.changePrice(10/100);
        p2.changePrice(-20/100);
        //type cast
        ((ElectronicDevice) p1).setWarranty("6 months");
        ArrayList<Product> lis=new ArrayList<>();
        lis.add(p1);
        lis.add(p2);
        lis.add(p3);

        for(Product i : lis)
            System.out.println(i.toString());
    }
}