package Q_85_127.Q117;
import java.util.ArrayList;

public class Q117 {
    /*
    >public abstract class Animal
    >public interface Hunter
    >public class Cat extends Animal implements Hunter
    >public class Tiger extends Cat
      Which answer fails to compile?
     A) ArrayList<Animal> myList=new ArrayList<>();
        myList.add(new Tiger());
     B) ArrayList<Hunter>   myList=new ArrayList<>();
     myList.add(new Cat());
     C)ArrayList<Hunter>myList=new ArrayList<>();
        myList.add(new Tiger());
      D)ArrayList<Tiger> myList=new ArrayList<>();
       myList.add(new Cat());
      E)ArrayList<Animal>myList=new ArrayList<>();
        myList.add(new Cat());
       ***********Normalde butun variable nameler myList di ayni isim verince hata verdigi icin asagida numaralandirdim.
     */
    public static void main(String[] args) {

//A)
//        ArrayList<Animal> myList=new ArrayList<>();
//        myList.add(new Tiger());
//B)
//     ArrayList<Hunter>   myList2=new ArrayList<>();
//     myList2.add(new Cat());
//C)
        ArrayList<Cat>myList3=new ArrayList<>();
        myList3.add(new Tiger());
//D)
//      ArrayList<Tiger> myList4=new ArrayList<>();
//      myList4.add(new Cat());
//E)
//        ArrayList<Animal>myList5=new ArrayList<>();
//        myList5.add(new Cat());
        /*
        A.Option A
        B.Option B
        C.Option C
        D.Option D
        E.Option E
        Answer:D
         */
    }


}
