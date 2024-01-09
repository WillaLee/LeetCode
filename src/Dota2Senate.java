public class Dota2Senate {
    public String predictPartyVictory(String senate) {
        char firstSenate = senate.charAt(0);
        int countR = 0, countD = 0;
        for (int i = 0; i < senate.length(); i++) {
            if (senate.charAt(i) == 'R') {
                countR++;
            } else {
                countD++;
            }
        }
        if (countD > countR || (countD == countR && firstSenate == 'D')) {
            return "Dire";
        } else {
            return "Radiant";
        }
    }
}
