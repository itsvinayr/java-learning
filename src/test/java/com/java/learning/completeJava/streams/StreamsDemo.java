package com.java.learning.completeJava.streams;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsDemo {
    @Test
    public void streamsWithList() {
        List<String> list = new ArrayList<>();
        list.add("ramam");
        list.add("bheem");
        list.add("vinay");
        list.add("rajamouli");
        list.add("sita");

        // without streams
        int count = 0;
        for (String s : list) {
            if (s.startsWith("r"))
                count++;
            System.out.println("Printing : " + s);
        }
        System.out.println("Total names starting with 'r' is : " + count);

        // with streams
        long cout = list.stream().filter(s -> s.startsWith("r")).count();
        System.out.println("Total count via streams is :" + cout);

        // print names whose length greater than 4
        list.stream().filter(s -> s.length() > 4).forEach(s -> System.out.println("Printing names with > 4 : " + s));

        // print names whose length greater than 4 with upper case
        list.stream().filter(s->s.length()>4).map(s->s.toUpperCase()).
                forEach(s-> System.out.println("printing name with > 4 and in upper case :"+s));

        // print name whose names start with r in upper case and sorted
        list.stream().filter(s->s.startsWith("r")).sorted().map(s->s.toUpperCase()).
                forEach(s-> System.out.println("printing name that starts with r, upper case and sorted "+s));

        // merge two lists
        List<String> list2 = new ArrayList<>();
        list2.add("Ganguly");
        list2.add("Sehwag");
        list2.add("Gambhir");
        list2.add("Yuvraj");
        list2.add("Dhoni");
        list2.add("Jadeja");
        Stream<String> concat = Stream.concat(list.stream(), list2.stream());
        concat.forEach(s-> System.out.println("Printing concatenated list : "+s));

        // check for value in list
        concat = Stream.concat(list.stream(), list2.stream());
        boolean flag = concat.anyMatch(s -> s.equalsIgnoreCase("Jadeja"));
        if(flag){
            System.out.println("found value");
        }else{
            System.out.println("value not found");
        }

        // collect the list
        concat = Stream.concat(list.stream(), list2.stream());
        List<String> list3 = concat.filter(s -> s.startsWith("S")).collect(Collectors.toList());
        for (String s:list3) {
            System.out.println("printing from collection : "+s);
        }

        // writing a method
        concat = Stream.concat(list.stream(), list2.stream());
        concat.filter(s->s.startsWith("G")).map(s->convertToUpper(s)).forEach(s-> System.out.println("printing custom method output : "+s));
    }

    private String convertToUpper(String s) {
        String upper = s.toUpperCase();
        return upper;
    }
}
