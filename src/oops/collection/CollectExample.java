package oops.collection;

import javax.swing.*;
import java.sql.Struct;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectExample {
  public static void main(String[] args) {
    CollectExample collectExample = new CollectExample();
//    collectExample.doLists();
    CollectExample.doMaps();
//    collectExample.doMap();
//    CollectExample.doStreams();
//    CollectExample.doLambdaFunction();
  }

  public void doLists() {
    try {
      List<String> names = new ArrayList<>();

      names.add("adnan");
      names.add("adnan");
      names.add("adnan");
      names.add("adnan");
      names.add("adnan");
      /*
       * standard loop way
       * */
      for (int i = 0; i <= names.size() - 1; i++) {
        System.out.println(names.toArray().length);
        System.out.println(names.get(i));
      }
      System.out.println("--------for loop---------");
      /*
       * foreach loop way
       * */
      for (String s : names) {
        System.out.println(s);
      }
      System.out.println("--------foreach loop---------");
      Iterator<String> iterator = names.iterator();
      if (iterator.hasNext()) {
        System.out.println("next");
      } else {
        System.out.println("not next");
      }
      while (iterator.hasNext()) {
        String next = iterator.next();
        System.out.println(next);
      }
      ListIterator<String> listIterator = names.listIterator();
      while (iterator.hasNext()) {
        String next = listIterator.next();
        System.out.println(next);
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    System.out.println("--------while loop with iterator and List-iterator---------");
  }

  public static void doSets() {
    Set set = new HashSet();
    Set treeSet = new TreeSet();
    treeSet.add("asd");

    set.add("something");
    set.add("something");
    System.out.println(set);
  }

  public static void doMaps() {
    int[] arr = new int[] {24,16,12,17,18,10,9};

    Map<Integer,String> names = new HashMap<>();
    for(int index = 0; index<arr.length; index++){
      names.put(arr[index], "user"+arr[index]);
    }

//    Map<String,Integer> names = new HashMap<>();
//    Map<Integer, String> names = new TreeMap();
//    Map<String, Integer> names = new TreeMap<>();
//    Map hasTable = new Hashtable();
//    hasTable.put(1,"sql");
//    hasTable.put(2,"sql");
//    hasTable.put(3,"sql");
//    hasTable.put(1,"sql");
//    hasTable.put(1,"sql");
//    System.out.println(hasTable);
//    names.put("core java", 1);
//    names.put("advance java", 2);
//    names.put("java framework", 3);
//    names.put("spring mvc", 4);
//    names.put("spring boot", 5);
//    names.put("angular", 6);
//    names.put(1, "core java");
//    names.put(2, "advance java");
//    names.put(3, "java framework");
//    names.put(4, "spring mvc");
//    names.put(5, "spring boot");
//    names.put(6, "angular");
//    for (int i = 1; i <= names.size(); i++) {
//      System.out.println(names);
//      System.out.println(names.get(i));
//      System.out.println(i + " =>" + names. + names.hashCode());
//    }
//    for (Map.Entry<String,Integer> el: names.entrySet()){
//      System.out.println(el.getKey());
//    }
  }

  public static void doStreams() {
    List<Integer> number1 = List.of(1, 2, 3, 4, 5, 6);
    List number = Arrays.asList(7, 8, 9, 10, 11, 12, 13);
//  List result = number.stream().map(x->x+x).collect(Collectors.toList());
//    System.out.println(result);
    List<Integer> listEven = new ArrayList<>();

    /*
      without stream api
     */
    /*try {
      for (Integer i : number1) {
        if (i % 2 == 0) {
          listEven.add(i);
        }
      }
      System.out.println(listEven);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }*/
    /*with stream api*/
    Stream<Integer> stream = number.stream();
    try {
      List<Integer> list = stream.filter(s -> s % 2 == 0).collect(Collectors.toList());

      System.out.println(list);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }

  public static void doLambdaFunction() {

    MyInteface myInteface = new MyInteface() {
      @Override
      public void doInterface() {
        System.out.println("do is something");
      }
    };
    myInteface.doInterface();
    MyInteface myInteface1 = () -> {
      System.out.println("this is lambda function");
    };
    myInteface1.doInterface();
  }

}
