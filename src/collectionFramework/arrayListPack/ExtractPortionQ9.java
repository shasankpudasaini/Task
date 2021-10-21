package collectionFramework.arrayListPack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ExtractPortionQ9 {
    public static void main(String[] args) {
        List<String> simpleList = new ArrayList<>();
        simpleList.add("Shasank1");
        simpleList.add("Shasank2");
        simpleList.add("Shasank3");
        simpleList.add("Shasank4");
        simpleList.add("Shasank5");
        simpleList.add("Shasank6");
        simpleList.add("Shasank7");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Begining index: ");
        int input1 = scanner.nextInt();
        System.out.println("Ending index: ");
        int input2 = scanner.nextInt();

        System.out.println(simpleList.subList(input1, input2));

    }
}
