package Q_1_60;

import java.util.ArrayList;
import java.util.List;

public class Q48 {
    public static void main(String[] args) {
        List num = new ArrayList();
        num.add("2");
        num.add("3");
        num.add("1");
        num.remove("1");  //remove element value 1
        num.remove(0);// remove 'ndex 1
        System.out.println(num);

//        List colors = new ArrayList<>();   //type eklenmiyorsa herhangi bir type yazabiliriz. //List<Object> //List<?> de olabilir
//        colors.add("green");
//        colors.add("blue");
//        colors.add("red");
//        colors.add("yellow");
//        colors.remove(2);
//        colors.add(3,"cyan");
//
//        System.out.println(colors);


//Canvasta:
//
//        ArrayList<String> colors = new ArrayList<>();
//        colors.add("green");
//        colors.add("red");
//        colors.add("blue");
//        colors.add("yellow");
//        colors.add(3,"cyan");
//
//        System.out.println(colors);

//3. version
//        List<String> colors = new ArrayList<>();
//        colors.add("green");
//        colors.add("red");
//        colors.add("blue");
//        colors.add("yellow");
//        colors.remove(2);
//        colors.add(3,"cyan");
//
//        System.out.println(colors);


    }
}
//What is the result?
//A.	[green, red, yellow, cyan]
//B.	[green, blue, yellow, cyan]
//C.	[green, red, cyan, yellow]
//D.	An IndexOutOfBoundsException is thrown at runtime.
//Answer: D