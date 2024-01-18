package Queue;

import java.util.LinkedList;

public class Dota2Senate {
    public String predictPartyVictory(String senate) {
        //add all senates to queue
        int index = 0;
        LinkedList<Integer> radiant = new LinkedList<>();
        LinkedList<Integer> dire = new LinkedList<>();
        while (index < senate.length()) {
            if (senate.charAt(index) == 'R') {
                radiant.add(index);
            } else {
                dire.add(index);
            }
            index++;
        }
        //start voting
        int rVoter, dVoter;
        while (radiant.size() != 0 && dire.size() != 0) {
            rVoter = radiant.poll();
            dVoter = dire.poll();
            if (rVoter > dVoter) {
                dire.add(index);
            } else {
                radiant.add(index);
            }
            index++;
        }
        //identify the winner
        if (radiant.size() == 0) {
            return "Dire";
        } else {
            return "Radiant";
        }
    }
}
