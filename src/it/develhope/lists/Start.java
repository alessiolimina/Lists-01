package it.develhope.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

    public class Start {
        public static void main(String[] args) {
            System.out.println("-----------Creating a not mutable list-----------");

            String[] s1 = new String[]{"Milan", "Rome", "Turin"};
            List<String> cityNames = Arrays.asList(s1);
            System.out.println("The cities are: " + cityNames);

        /*
         * If I run these following lines of code, it throws an UnsupportedOperationException.
         * That's because I can't use '.add()' on a not mutable List:
        cityNames.add("Palermo");
        System.out.println(cityNames);
        */

            cityNames.set(1, "Telucigalpa");
            System.out.println("The updated cities are: " + cityNames);

            System.out.println("-------------Creating a mutable List------------");

            List<String> kingsOfRome = new ArrayList<>();
            kingsOfRome.add("Romolo");
            kingsOfRome.add("Numa Pompilio");
            kingsOfRome.add("Tullo Ostilio");
            kingsOfRome.add("Anco Marzio");
            kingsOfRome.add("Tarquinio Prisco");
            kingsOfRome.add("Servio Tullio");
            kingsOfRome.add("Tarquinio il Superbo");
            System.out.println("Here we have the seven kings of Rome: " + kingsOfRome);

            System.out.println("------Converting the previous list into an array-----");

            String[] kingsOfRomeArray = new String[kingsOfRome.size()];
            kingsOfRomeArray = kingsOfRome.toArray(kingsOfRomeArray);
            kingsOfRomeArray[6]= "Lucius Tarquinius Supercar";
            System.out.println("And here, the updated list of kings of Rome: " + Arrays.toString(kingsOfRomeArray));


            System.out.println("---------------------------------------------------------");

        }
    }


