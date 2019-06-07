package testJava;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args){
        List<String> nameList = new ArrayList<String>();

        for(int i=0; 10 > i;i++){

            nameList.add("순번" + String.valueOf(i));
        }

        System.out.println(nameList.size());

    }

}
