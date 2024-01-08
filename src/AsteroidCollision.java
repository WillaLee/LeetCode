import edu.princeton.cs.algs4.Stack;

import java.util.Arrays;

public class AsteroidCollision {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> astCollide = new Stack<>();
        for (int asteroid : asteroids) {
            if (astCollide.isEmpty()) {
                astCollide.push(asteroid);
                continue;
            }
            int astToMeet = astCollide.pop();
            if (astToMeet * asteroid > 0 || (astToMeet < 0 && asteroid > 0)) {
                astCollide.push(astToMeet);
                astCollide.push(asteroid);
            } else {
                while (astToMeet > 0 && astToMeet < Math.abs(asteroid) && !astCollide.isEmpty()) {
                    astToMeet = astCollide.pop();
                }
                if (astToMeet == Math.abs(asteroid)) {
                    continue;
                } else if (astToMeet < 0) {
                    astCollide.push(astToMeet);
                    astCollide.push(asteroid);
                } else if (astCollide.isEmpty()) {
                    if (Math.abs(astToMeet) < Math.abs(asteroid)) {
                        astCollide.push(asteroid);
                    } else if (Math.abs(astToMeet) > Math.abs(asteroid)) {
                        astCollide.push(astToMeet);
                    }
                } else {
                    astCollide.push(astToMeet);
                }
            }
        }
        int[] result = new int[astCollide.size()];
        int index = 0;
        for (int ast : astCollide) {
            result[index] = ast;
            index++;
        }
        return result;
    }
}
