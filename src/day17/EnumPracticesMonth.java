package day17;

import java.util.EnumSet;

public class EnumPracticesMonth {

    public static void main(String[] args) {

        var emptyList= EnumSet.noneOf(MonthDay.class);
        var allList=EnumSet.noneOf((MonthDay.class));
        var rangeList=EnumSet.range(MonthDay.JANUARY,MonthDay.MAY);
        var specificList=EnumSet.of(MonthDay.JANUARY,MonthDay.MAY, MonthDay.OCTOBER);
        var complementList=EnumSet.complementOf((specificList));


        System.out.println(emptyList);
        System.out.println(allList);
        System.out.println(rangeList);
        System.out.println(specificList);
        System.out.println(complementList);

        System.out.println(MonthDay.JANUARY.getAbbrev());

    }
}
