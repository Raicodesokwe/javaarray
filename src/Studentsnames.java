import java.util.ArrayList;

public class Studentsnames {
    public static void main(String[] args) {
        ArrayList<Arraylist>majina;
        //Instantiate arraylist
        majina=new ArrayList<>();

        //create list items
        Arraylist std1=new Arraylist("Zara ","Mundu ","");
        Arraylist std2=new Arraylist("Liz ","Mrunde ","Gamboja");
        Arraylist std3=new Arraylist("Edwin ","Chebii ","Kibet");
        Arraylist std4=new Arraylist("Erick ","Murai ","Mburu");
        Arraylist std5=new Arraylist("Shama ","Khokho ","Musumba");
      //Add your student name to the arraylist
      majina.add(std1)  ;
      majina.add(std2)  ;
      majina.add(std3)  ;
      majina.add(std4)  ;
      majina.add(std5)  ;
      //print arraylist using the toString function and the constructor class
        System.out.println(majina.toString());
    }
}
