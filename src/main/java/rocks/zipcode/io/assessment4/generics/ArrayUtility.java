package rocks.zipcode.io.assessment4.generics;

import java.sql.Array;
import java.util.*;
import java.util.function.Function;

/**
 * @author leon on 09/12/2018.
 */
public class ArrayUtility<SomeType> {
    private final SomeType[] array;
    private  Map<SomeType, Integer> mapOfObjects = new HashMap<>();


    public ArrayUtility(SomeType[] array) {
        this.array = array;
    }

    public Map<SomeType, Integer> mappingObjects(SomeType[] array){
        for (SomeType element : array){
            if (!mapOfObjects.containsKey(element)){
                mapOfObjects.put(element, 0);
            }
        }
        return mapOfObjects;
    }

    public Map<SomeType, Integer> addingOccuranceAsValue(SomeType [] array){
        for (Map.Entry<SomeType, Integer> mapElement : mapOfObjects.entrySet()){
            SomeType key = mapElement.getKey();
                for (SomeType arrayElement : array){
                    if (key == arrayElement){
                        Integer oldValue = mapElement.getValue();
                        Integer newValue = oldValue +1;
                        mapOfObjects.put(key, newValue);
                    }

                }
        }
            return mapOfObjects;
    }


    public SomeType findOddOccurringValue() {
        mappingObjects(array);
        addingOccuranceAsValue(array);
        for (Map.Entry<SomeType, Integer> mapElement : mapOfObjects.entrySet()){
            Integer value = mapElement.getValue();
            if (value % 2 != 0){
                return mapElement.getKey();
            }
        }
        mapOfObjects.clear();
        return null;
    }

    public SomeType findEvenOccurringValue() {
        mappingObjects(array);
        addingOccuranceAsValue(array);
        for (Map.Entry<SomeType, Integer> mapElement : mapOfObjects.entrySet()){
            Integer value = mapElement.getValue();
            if (value % 2 == 0){
                return mapElement.getKey();
            }
        }
        mapOfObjects.clear();
        return null;
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {
        mappingObjects(array);
        addingOccuranceAsValue(array);
        for (Map.Entry<SomeType, Integer> mapElement : mapOfObjects.entrySet()){
            SomeType key = mapElement.getKey();
            if (key == valueToEvaluate){
                Integer value = mapElement.getValue();
                return value;
            }
        }
        return null;
    }

    public SomeType[] filter(Function<SomeType, Boolean> predicate) {
        SomeType[] arrayNew = (SomeType[]) new Array[array.length];
        int index = 0;
        for (SomeType element : array){
            if (predicate.apply(element)){
               arrayNew[index] = element;
               index++;
            }
        }

        return arrayNew;
    }
}
