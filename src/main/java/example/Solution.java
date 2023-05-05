package example;


import java.util.ArrayList;

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
}
