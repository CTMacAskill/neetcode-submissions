// Definition for a pair
// class Pair {
//     int key;
//     String value;
//
//     Pair(int key, String value) {
//         this.key = key;
//         this.value = value;
//     }
// }
public class Solution {
    public List<List<Pair>> insertionSort(List<Pair> pairs) {
        List<List<Pair>> savedStates = new ArrayList<List<Pair>>();
        for (int i=0; i < pairs.size(); i++){
            Pair pair = pairs.get(i);
            for(int j=0; j < i; j++){
                if (pair.key < pairs.get(j).key){
                    pairs.remove(pair);
                    pairs.add(j, pair);
                    break;
                }
            }
            savedStates.add(new ArrayList<Pair>(pairs));
        }
        return savedStates;
    }
}
