package did_she_say_hallo;

import java.util.List;

public class Kata {
    public static boolean validateHello(String greetings){
        List<String> greetingList = List.of("hello", "ciao", "salut", "hallo", "hola", "ahoj", "czesc");
        return greetingList.stream().anyMatch(i -> greetings.toLowerCase().contains(i));
    }
}
