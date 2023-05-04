package example;

import java.util.ArrayList;
import java.util.List;

public class Browser {
    private List<String> urls;

    public Browser() {
        urls = new ArrayList<>();
    }

    void add(String url) {
        urls.add(url);
    }

    String peek() {
        return urls.get(urls.size() -1);
    }
}
