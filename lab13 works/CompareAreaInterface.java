public interface CompareAreaInterface { //Interface to compare two areas
   
    default boolean compareArea(Triangle obj1,Rectangle obj2 )
   {
       boolean flag;
       if(obj1.getArea()==obj2.getArea()) //If both areas are equal it return true
       {
           flag=true;
       }
       else
       {
           flag=false;
       }
       return flag;
   }

}