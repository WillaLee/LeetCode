package Graph;

import java.util.*;

public class EvaluateDivision {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        Map<String, Map<String, Double>> equationMap = new HashMap<>();
        //record the relations of strings in the map.
        for (int i = 0; i < equations.size(); i++) {
            String a = equations.get(i).get(0);
            String b = equations.get(i).get(1);
            double ratio = values[i];
            equationMap.putIfAbsent(a, new HashMap<>());
            equationMap.get(a).put(b, ratio);
            equationMap.putIfAbsent(b, new HashMap<>());
            equationMap.get(b).put(a, 1 / ratio);
        }
        //calculate the answer
        double[] result = new double[queries.size()];
        for (int i = 0; i < queries.size(); i++) {
            List<String> relation = queries.get(i);
            result[i] = help(relation.get(0), relation.get(1), new HashSet<>(), equationMap);
        }
        return result;
    }

    public double help(String c, String d, Set<String> visited, Map<String, Map<String, Double>> equationMap) {
        if (!equationMap.containsKey(c)) {
            return -1;
        }
        visited.add(c);
        if (equationMap.get(c).containsKey(d)) {
            return equationMap.get(c).get(d);
        }
        double result = -1;
        for (String relation : equationMap.get(c).keySet()) {
            if (!visited.contains(relation)) {
                result = Math.max(result, help(relation, d, visited, equationMap) * equationMap.get(c).get(relation));
                if (result < 0) { result = -1; }
            }
        }
        return result;
    }

}
