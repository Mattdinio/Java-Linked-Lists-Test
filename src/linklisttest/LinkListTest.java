/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linklisttest;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;


/**
 *
 * @author mattdinio
 */
public class LinkListTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] colours = {"red", "blue", "green","yellow","orange","black","white","purple"};
        List<String> list1 = new LinkedList<>();
        for (String colour : colours) {
            list1.add(colour);
        }
    
        String[] colours2 = {"brown","silver","aqua","violet","grey","titanium white","pthalo blue", "pthalo green"};
        List<String> list2 = new LinkedList<>();
        for (String colour : colours2) {
            list2.add(colour);
        }
         list1.addAll(list2);
         list2 = null;
         printList(list1);
         convertToUppercaseStrings(list1);
         printList(list1);
         System.out.printf("%nDeleting elements 4 to 6...");
         removeItems(list1,4,7);
         printList(list1);
         printReversedList(list1);
    }
    
    private static void printList(List<String> list){
        System.out.printf("%nlist:%n");
        for (String colour : list) {
            System.out.printf("%s ", colour);
                    }
        System.out.println();
    }
    
    private static void convertToUppercaseStrings(List<String> list){
        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()){
            String colour = iterator.next();
            iterator.set(colour.toUpperCase());
        }
    }

        private static void removeItems(List<String> list, int start, int end){
            list.subList(start, end).clear();
        }
        private static void printReversedList(List<String> list){
            ListIterator<String> iterator = list.listIterator(list.size());
            System.out.printf("%n Reversed List:%n");
            while (iterator.hasPrevious()){
                System.out.printf("%s ", iterator.previous());
            }
    }
}
