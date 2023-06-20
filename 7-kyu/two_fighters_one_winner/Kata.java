package two_fighters_one_winner;

class Kata {
    static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        while (true) {
            if (fighter1.name.equals(firstAttacker)) {
                fighter2.health -= fighter1.damagePerAttack;
                if (fighter2.health <= 0) {
                    break;
                }
                fighter1.health -= fighter2.damagePerAttack;
                if (fighter1.health <= 0) {
                    break;
                }
            } else {
                fighter1.health -= fighter2.damagePerAttack;
                if (fighter1.health <= 0) {
                    break;
                }
                fighter2.health -= fighter1.damagePerAttack;
                if (fighter2.health <= 0) {
                    break;
                }
            }
        }
        return fighter1.health <= 0 ? fighter2.name : fighter1.name;
    }
}
