package determine_offspring_sex_based_on_genes_xx_and_xy;

class Kata {

    static String chromosomeCheck(String chromosome) {
        return chromosome.equals("XY") ? "Congratulations! You're going to have a son." : "Congratulations! You're going to have a daughter.";
    }
}
