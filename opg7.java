package ch11;

/* Write a method countCommon that accepts two lists of integers as parameters and returns
the number of unique integers that occur in both lists.
Use one or more sets as storage to help you solve this problem.
For example, if one list contains thevalues[3, 7, 3, –1, 2, 3, 7, 2, 15, 15]
and the other list contains the values[–5, 15, 2, –1, 7, 15, 36],
your method should return 4 because the elements –1, 2, 7, and 15 occur in both lists. */

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class opg7
{
    public static void main(String[] args)
    {
        LinkedList<Integer> listOne = new LinkedList<>();
        LinkedList<Integer> listTwo = new LinkedList<>();

        listOne.add(3);
        listOne.add(7);
        listOne.add(3);
        listOne.add(-1);
        listOne.add(2);
        listOne.add(3);
        listOne.add(7);
        listOne.add(2);
        listOne.add(15);
        listOne.add(15);

        listTwo.add(-15);
        listTwo.add(15);
        listTwo.add(2);
        listTwo.add(-1);
        listTwo.add(7);
        listTwo.add(15);
        listTwo.add(36);

        System.out.println(countCommon(listOne, listTwo));

    }

    public static int countCommon (LinkedList<Integer> list1, LinkedList<Integer> list2)
    {
        Set<Integer> setTemp1 = new TreeSet<>();
        Set<Integer> setTemp2 = new TreeSet<>();

        setTemp1.addAll(list1);
        setTemp2.addAll(list2);

        setTemp1.retainAll(setTemp2);

        return setTemp1.size();
    }

}
