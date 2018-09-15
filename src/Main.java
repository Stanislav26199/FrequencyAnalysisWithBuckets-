import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<ArrayList<Integer> > arrayListArrayList = new ArrayList<ArrayList<Integer>>();
        arrayListArrayList.ensureCapacity(arrayList.size());



        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(3);
        arrayList.add(3);

//        FrequencyAnalysisWithBuckets.initCollection(arrayListArrayList,arrayList.size());
//        arrayListArrayList.set(2,arrayList);


       // System.out.println( FrequencyAnalysisWithBuckets.containsAllObject(arrayList,2));
//        System.out.println(FrequencyAnalysisWithBuckets.removeAllObject(arrayList,1));
//        System.out.println(FrequencyAnalysisWithBuckets.containsAllObject(arrayList,1));
//        System.out.println(arrayListArrayList.toArray());

        final int [] arr = {8,8,4,4};
        System.out.println(FrequencyAnalysisWithBuckets.bucketize(arr));
    }
}
