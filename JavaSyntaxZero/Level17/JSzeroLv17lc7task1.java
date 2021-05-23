package JavaSyntaxZero.Level17;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.TreeSet;

/*
Тренировка временных зон
*/


public class JSzeroLv17lc7task1 {

    public static void main(String[] args) {
        TreeSet<String> sortedZones = getSortedZones();
        System.out.println(sortedZones.size());
        System.out.println(sortedZones.first());
        System.out.println(sortedZones.last());

        System.out.println(getBeijingTime());
    }

    static TreeSet<String> getSortedZones() {
        TreeSet<String> treeSet = new TreeSet<>();
        for (String a : ZoneId.getAvailableZoneIds()) {
            treeSet.add(a);
        }

        return treeSet;
    }

    static ZonedDateTime getBeijingTime() {
        ZoneId zone = ZoneId.of("Asia/Shanghai");
        ZonedDateTime zone1 = ZonedDateTime.now(zone);
        return zone1;
    }
}
