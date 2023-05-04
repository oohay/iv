package example;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
public class Browser {
private List<String> urls;

public Browser() {
    urls = new ArrayList<>();
}
public void add(String url) {
    urls.add(url);
}
}
