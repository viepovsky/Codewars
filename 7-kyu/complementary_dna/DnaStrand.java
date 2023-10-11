package complementary_dna;

import java.util.List;

class DnaStrand {
    static String makeComplement(String dna) {
        List<Character> dnaSymbols = List.of('T', 'A', 'C', 'G', 'A', 'T', 'G', 'C');
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < dna.length(); i++) {
            char character = dna.charAt(i);
            result.append(dnaSymbols.get(dnaSymbols.indexOf(character) + 4));
        }
        return result.toString();
    }
}
