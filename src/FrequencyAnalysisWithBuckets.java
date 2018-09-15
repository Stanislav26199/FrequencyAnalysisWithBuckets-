import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class FrequencyAnalysisWithBuckets {
    public static ArrayList<ArrayList<Integer>> bucketize(final int[] arr)
    {

        Integer[] objectArray = new Integer[arr.length];

        for(int i = 0; i < arr.length; i++) {
            objectArray[i] = Integer.valueOf(arr[i]); // returns Integer value
        }

        Arrays.sort(objectArray);

        ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(objectArray));

        ArrayList<ArrayList<Integer> > arrayListArrayList = new ArrayList<ArrayList<Integer>>();
        arrayListArrayList.ensureCapacity(arrayList.size());

        initCollection(arrayListArrayList,arr.length);

        for(int i = 0; i < objectArray.length; i++){
            int count = containsAllObject(arrayList, objectArray[i]);
            if(count != 0){
                if(arrayListArrayList.get(count) == null){
                    arrayListArrayList.set(count, new ArrayList<Integer>());
                    arrayListArrayList.get(count).add(objectArray[i]);
                    removeAllObject(arrayList,objectArray[i]);
                }else{
                    arrayListArrayList.get(count).add(objectArray[i]);
                    removeAllObject(arrayList,objectArray[i]);
                }
            }

        }


        return arrayListArrayList;
    }


    public static int containsAllObject(Collection<? extends Object> collection , Object object){

        int increment = 0;

        for (Object temp:
             collection) {
            if(object.equals(temp))
                increment++;
        }
        return increment;
    }

    public  static boolean  removeAllObject(Collection<? extends Object> collection , Object object){

        if(collection.contains(object)){
            while(collection.contains(object)){
                collection.remove(object);
            }
            return true;
        }else
            return false;
    }

    public static boolean initCollection(Collection<? extends Object> collection, int size){

        for(int i = 0; i < size+1; i++){
            collection.add(null);
        }


        if(collection.size() == size+1)
            return true;
        else
            return false;

    }

}
