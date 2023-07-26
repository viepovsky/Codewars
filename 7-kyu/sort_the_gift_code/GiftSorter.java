package sort_the_gift_code;

import java.util.stream.Collectors;

class GiftSorter {
    String sortGiftCode(String code){
        return code.chars()
                .mapToObj(c -> (char) c)
                .sorted()
                .map(Object::toString)
                .collect(Collectors.joining());
    }
}
