package collectionFramework.arrayListPack;
//Write a Java program to remove the third element from an array list.


import sun.jvmstat.perfdata.monitor.PerfStringVariableMonitor;

import java.util.ArrayList;
import java.util.List;

public class RemoveThirdElementQ6 {
    public static void main(String[] args) {


        List<String> simpleList = new ArrayList<>();
        simpleList.add("Shasank1");
        simpleList.add("Shasank2");
        simpleList.add("Shasank3");
        simpleList.add("Shasank4");
        simpleList.add("Shasank5");
        simpleList.add("Shasank6");
        simpleList.add("Shasank7");
        System.out.println(simpleList);
        simpleList.remove(3);
        System.out.println(" New List: " + simpleList );

    }
}
