package com.nag;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ClockPalindrome {

    private static List<String> reversedList = new ArrayList<>();
    public static void main(String[] args) {
        LocalTime startTime = LocalTime.of(0,00,00);
        LocalTime endTime = LocalTime.of(23,59,59);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("Hmmss");

        while(startTime.isBefore(endTime)){
            printIfPalindrome(formatter.format(startTime));
            startTime = startTime.plusSeconds(1);
        }

        System.out.println("There are: "+reversedList.size()+" palindromes between 0:00:00 and 23:59:59");

        System.out.println("All the Palindromes between 0:00:00 and 23:59:59 are: ");

        Collections.sort(reversedList,new StringLengthComparator());
        reversedList.stream().forEach(System.out::println);
    }

   static class StringLengthComparator implements Comparator<String>{

       @Override
       public int compare(String o1, String o2) {
           return Integer.compare(o1.length(), o2.length());
       }
   }

    public static void printIfPalindrome(String timeString){
    //    System.out.println("Received Time String: "+timeString);

        String reversedString ="";

        char ch;
//        String adjustedTimeString = "";
//        if(timeString.charAt(0) == '0'){
//            adjustedTimeString = timeString.substring(1);
//        }
//        else
//            adjustedTimeString = timeString;
//
//        System.out.println("Adjusted Time String: "+adjustedTimeString);
//        for (int i=0; i<adjustedTimeString.length(); i++)
//        {
//            ch= adjustedTimeString.charAt(i); //extracts each character
//            reversedString= ch+reversedString; //adds each character in front of the existing string
//        }

        for (int i=0; i<timeString.length(); i++)
       {
            ch= timeString.charAt(i); //extracts each character
            reversedString= ch+reversedString; //adds each character in front of the existing string
        }

        if(reversedString.equals(timeString)){
         //   System.out.println(adjustedTimeString);
            reversedList.add(timeString);
        }



    }

}
