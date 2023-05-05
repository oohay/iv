package example;


import java.util.ArrayList;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;

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
}
