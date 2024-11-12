package testFunctionPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class App {
    public static final List<Unit> unitList = new ArrayList<>();

    public static void main(String[] args) {
        Predicate<String> test1 = s -> s.length() == 5;

        // 테스트 1
        String stringA = "12345";
        String stringB = "1234";
        int intA = 12345;
        System.out.println(test1.test(stringA));
        System.out.println(test1.test(stringB));
        // 컴파일단에서 오류 잡힘
        //  System.out.println(test1.test(intA));

        // 테스트 2
        unitList.add(new Unit("Zergling", "Zerg", 50));
        unitList.add(new Unit("Marine", "Terran", 50));
        unitList.add(new Unit("Zealot", "Protoss", 100));
        unitList.add(new Unit("UltraLisk", "Zerg", 500));
        unitList.add(new Unit("Tank", "Terran", 200));
        unitList.add(new Unit("Archon", "Protoss", 30));
        unitList.add(new Unit("Vulture", "Terran", 150));

        List<Unit> lUser1 = getUnitsBy((unit) -> unit.getHp() > 100);
        System.out.println(lUser1);

        List<Unit> lUser2 = getUnitsBy((unit) -> unit.getTribe().equals("Zerg"));
        System.out.println(lUser2);

    }

    public static List<Unit> getUnitsBy(Predicate<Unit> condition) {
        List<Unit> result = new ArrayList<>(20);
        for (Unit unit : unitList) {
            if (condition.test(unit)) {
                result.add(unit);
            }
        }
        return result;
    }
}
