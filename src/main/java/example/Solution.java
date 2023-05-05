package example;


import java.util.*;

public class Solution {
    private List<FileData> input;

    Solution() {
        input = new ArrayList<>();
        input.add(FileData.builder().collection("dummy").size(100).build());
        input.add(FileData.builder().collection("collection1").size(200).build());
        input.add(FileData.builder().collection("collection1").size(200).build());
        input.add(FileData.builder().collection("collection2").size(300).build());
        input.add(FileData.builder().collection("dummy").size(10).build());
    }

    public HashMap<String, Integer> computeCollectionSizes() {
        HashMap<String, Integer> result = new HashMap<>();
        for (FileData fd : input) {
            String collection = fd.getCollection();
            Integer size = fd.getSize();
            if (result.containsKey(collection)) {
                Integer totalSize = size + result.get(collection);
                result.put(collection, totalSize);
            } else {
                result.put(collection, size);
            }
        }
        return result;
    }

    public List<Integer> collectionSizeDescending() {
        HashMap<String, Integer> collections = computeCollectionSizes();
        List<Integer> sizes = new ArrayList<>(collections.values());
        Collections.sort(sizes, Collections.reverseOrder());
        return sizes;

    }

    public List<Map.Entry<String, Integer>> biggestCollections() {
        HashMap<String, Integer> collections = computeCollectionSizes();
        List< Map.Entry<String, Integer>> entries = new ArrayList<>(collections.entrySet());
        Collections.sort(entries, Comparator.comparing(p -> -p.getValue()));
return entries;

    }
}
