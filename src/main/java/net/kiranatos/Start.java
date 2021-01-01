package net.kiranatos;

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//public class Start {
//    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//    private static String theChoice;
//    public static void main(String[] args) throws IOException {
//        System.out.println("\n\n"
//                + "\n#######################################################################################"
//                + "\n#######################################################################################"
//                + "\n##### Задачі з сайту www.CodeWars.com ####"
//                + "\n#######################################################################################"
//                + "Choose section:"                
//                + "\n 1. Kata 1 kyu"
//                + "\n 2. Kata 2 kyu"
//                + "\n 3. Kata 3 kyu [НЕ РЕШЕНА - НУЖНО ИЗУЧИТЬ ГРАФЫ и поиск вглубину по лабиринту]"
//                + "\n 4. Kata 4 kyu [НЕ РЕШЕНА - НУЖНО ИЗУЧИТЬ Reflection API]"
//                + "\n 5. Kata 5 kyu"
//                + "\n 6. Kata 6 kyu"
//                + "\n 7. Kata 7 kyu"
//                + "\n 8. Kata 8 kyu"                
//                + "\n exit");
//        
//        theChoice = reader.readLine();    
//        System.out.println("Your choice: " + theChoice);        
//        
//        switch (theChoice) {
//            case "1": 
//                kata1();
//                break;
//            case "2":                
//                kata2();
//                break;
//            case "3": 
//                kata3();
//                break;
//            case "4": 
//                kata4();
//                break;
//            case "5": 
//                kata5();
//                break;
//            case "6": 
//                kata6();
//                break;
//            case "7": 
//                kata7();
//                break;
//            case "8": 
//                kata8();
//                break;            
//            case "exit": 
//                System.exit(0);
//                break;
//            default: 
//                System.out.println("Incorrect choice !!!");
//                Start.main(null);
//                break;
//        }        
//    } // end of main method
//    
//    public static void kata1() {        
//    }
//    public static void kata2() {        
//    }
//    
//    public static void kata3() throws IOException {
//        System.out.println("\n**********************************"
//                + "\n**** Choose example of Kata 3 kyu ****"
//                + "\n**********************************"
//                + "\n 1. Line Safari - Is that a line? (Autor: dinglemouse)"
//                + "\n\t\t [НЕ РЕШЕНА - НУЖНО ИЗУЧИТЬ ГРАФЫ и поиск вглубину по лабиринту]"
//                + "\n 2. "
//                + "\n 3. "
//                + "\n 4. "
//                + "\n 5. "
//                + "\n 6. "
//                + "\n 7. "
//                + "\n 8. "
//                + "\n 9. "
//                + "\n back"
//                + "\n exit");
//        
//        theChoice = reader.readLine();
//        System.out.println("Your choice: " + theChoice);
//        
//        switch (theChoice) {
//            case "1":                 
//                net.kiranatos.k3.e001.LineSafariIsThatALine.main(null);
//                break;
//            case "2":
//                System.out.println("");
//                break;
//            case "3":
//                System.out.println("");
//                break;            
//            case "back": 
//                Start.main(null);
//                break;
//            case "exit": 
//                System.exit(0);
//                break;
//            default: 
//                System.out.println("Incorrect choice !!!");
//                Start.main(null);
//                break;
//        }  
//    }
//    
//    public static void kata4() {
//    }
//    
//    public static void kata5() throws IOException {
//        System.out.println("\n**********************************"
//                + "\n**** Choose example of Kata 5 kyu ****"
//                + "\n**********************************"                
//                + "\n 1. Scramblies (Autor: joh_pot)"
//                + "\n 2. "
//                + "\n 3. "
//                + "\n 4. "
//                + "\n 5. "
//                + "\n 6. "
//                + "\n 7. "
//                + "\n 8. "
//                + "\n 9. "
//                + "\n back"
//                + "\n exit");
//        
//        theChoice = reader.readLine();
//        System.out.println("Your choice: " + theChoice);
//        System.out.println("\n\n Start solution or JUnit test? (y/n)");        
//        
//        switch (theChoice) {
//            case "1":                
//                if (reader.readLine().equalsIgnoreCase("y"))
//                    net.kiranatos.k5.e001.Scramblies.main(null);
//                else 
//                    net.kiranatos.k5.e001.K5T_Scramblies.main(null);
//                break;
//            case "2":
//                System.out.println("two");
//                break;
//            case "3":
//                System.out.println("");
//                break;            
//            case "back": 
//                Start.main(null);
//                break;
//            case "exit": 
//                System.exit(0);
//                break;
//            default: 
//                System.out.println("Incorrect choice !!!");
//                Start.main(null);
//                break;
//        }
//    }
//    
//    public static void kata6() throws IOException {
//        System.out.println("\n**********************************"
//                + "\n**** Choose example of Kata 6 kyu ****"
//                + "\n**********************************"                
//                + "\n 1. Take a Number And Sum Its Digits Raised To The Consecutive Powers And ...¡Eureka!! (Autor: raulbc777)"
//                + "\n 2. Decode the Morse code [I] (Autor: jolaf)"
//                + "\n 3. Are we alternate? (Autor: cheeze)"
//                + "\n 4. Sortable Shapes (Autor: FrankK)"
//                + "\n 5. "
//                + "\n 6. "
//                + "\n 7. "
//                + "\n 8. "
//                + "\n 9. "
//                + "\n back"
//                + "\n exit");
//        
//        theChoice = reader.readLine();
//        System.out.println("Your choice: " + theChoice);
//        System.out.println("\n\n Start solution or JUnit test? (y/n)");        
//        
//        switch (theChoice) {
//            case "1":                
//                if (reader.readLine().equalsIgnoreCase("y"))
//                    net.kiranatos.k6.e001.Eureka.main(null);
//                else 
//                    net.kiranatos.k6.e001.K6T_Eureka.main(null);
//                break;
//            case "2":
//                if (reader.readLine().equalsIgnoreCase("y"))
//                    net.kiranatos.k6.e002.MorseCodeDecoder.main(null);
//                else
//                    net.kiranatos.k6.e002.K6T_MorseCodeDecoder.main(null);
//                break;
//            case "3":
//                if (reader.readLine().equalsIgnoreCase("y"))
//                    net.kiranatos.k6.e003.AreWeAlternate.main(null);
//                else
//                    net.kiranatos.k6.e003.K6T_AreWeAlternate.main(null);
//                break;
//            case "4":
//                if (reader.readLine().equalsIgnoreCase("y"))
//                    net.kiranatos.k6.e004.SortableShapes.main(null);
//                else
//                    net.kiranatos.k6.e004.K6T_SortableShapes.main(null);
//                break;
//            case "back": 
//                Start.main(null);
//                break;
//            case "exit": 
//                System.exit(0);
//                break;
//            default: 
//                System.out.println("Incorrect choice !!!");
//                Start.main(null);
//                break;
//        }
//    }
//    
//    public static void kata7() throws IOException {
//        System.out.println("\n**********************************"
//                + "\n**** Choose example of Kata 7 kyu ****"
//                + "\n**********************************"                
//                + "\n 1. Two to One (Autor: g964)"
//                + "\n 2. "
//                + "\n 3. "
//                + "\n 4. "
//                + "\n 5. "
//                + "\n 6. "
//                + "\n 7. "
//                + "\n 8. "
//                + "\n 9. "
//                + "\n back"
//                + "\n exit");
//        
//        theChoice = reader.readLine();
//        System.out.println("Your choice: " + theChoice);
//        System.out.println("\n\n Start solution or JUnit test? (y/n)");        
//        
//        switch (theChoice) {
//            case "1":                
//                if (reader.readLine().equalsIgnoreCase("y"))
//                    net.kiranatos.k7.e001.TwoToOne.main(null);
//                else 
//                    net.kiranatos.k7.e001.K7T_TwoToOne.main(null);
//                break;
//            case "2":
//                System.out.println("two");
//                break;
//            case "3":
//                System.out.println("");
//                break;            
//            case "back": 
//                Start.main(null);
//                break;
//            case "exit": 
//                System.exit(0);
//                break;
//            default: 
//                System.out.println("Incorrect choice !!!");
//                Start.main(null);
//                break;
//        }        
//    }
//    
//    public static void kata8() throws IOException  {
//        System.out.println("\n**********************************"
//                + "\n**** Choose example of Kata 8 kyu ****"
//                + "\n**********************************"
//                + "\n 1. Circles in Polygons (Autor: Christiaanben)" 
//                + "\n 2. Reversed Words (Autor: jhoffner)"
//                + "\n 3. Subtract the sum (Autor: aryan-firouzian)"
//                + "\n 4. "
//                + "\n 5. "
//                + "\n 6. "
//                + "\n 7. "
//                + "\n 8. "
//                + "\n 9. "
//                + "\n back"
//                + "\n exit");
//                
//        theChoice = reader.readLine();
//        System.out.println("Your choice: " + theChoice);
//        System.out.println("\n\n Start solution or JUnit test? (y/n)");        
//        
//        switch (theChoice) {
//            case "1":                
//                if (reader.readLine().equalsIgnoreCase("y")) net.kiranatos.k8.e001.Polygon.main(null);
//                else net.kiranatos.k8.e001.K8T_Polygon.main(null);
//                break;
//            case "2":
//                if (reader.readLine().equalsIgnoreCase("y")) net.kiranatos.k8.e002.ReversedWords.main(null);
//                else net.kiranatos.k8.e002.K8T_ReversedWords.main(null);
//                break;
//            case "3":
//                if (reader.readLine().equalsIgnoreCase("y")) net.kiranatos.k8.e003.SubtractTheSum.main(null);
//                else net.kiranatos.k8.e003.K8T_SubtractTheSum.main(null);
//                break;            
//            case "back": 
//                Start.main(null);
//                break;
//            case "exit": 
//                System.exit(0);
//                break;
//            default: 
//                System.out.println("Incorrect choice !!!");
//                Start.main(null);
//                break;
//        }
//    }
//}
