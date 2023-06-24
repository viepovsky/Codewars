package sum_mixed_array;

import java.util.List;

class MixedSum {
    public int sum(List<?> mixed) {
        return mixed.stream().map(o -> {
                    var variable = o;
                    if (variable instanceof String) return Integer.parseInt((String) o);
                    return (int) o;
                })
                .reduce(Integer::sum)
                .get();
    }
}
