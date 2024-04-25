import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class BugHierarchy {

    public static void main(String[] args) {
        String filename = "bug_data.tsv"; 
        List<Bug> bugs = readBugsFromFile(filename);

    
        Map<Integer, Integer> bugOccurrences = new HashMap<>();

        for (Bug bug : bugs) {
            if (bug.isLeaf()) {
                calculateOccurrences(bugs, bug, bugOccurrences);
            }
        }

        int maxOccurrences = 0;
        int mostAbundantBug = -1;
        for (Map.Entry<Integer, Integer> entry : bugOccurrences.entrySet()) {
            int bugId = entry.getKey();
            int occurrences = entry.getValue();
            if (occurrences > maxOccurrences) {
                maxOccurrences = occurrences;
                mostAbundantBug = bugId;
            }
        }

        System.out.println("Most Abundant Root Bug: " + mostAbundantBug);
    }

    private static List<Bug> readBugsFromFile(String filename) {
        List<Bug> bugs = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("\t");


                if (parts[0].equals("edge_id")) {
                    continue;
                }

                int edgeId = Integer.parseInt(parts[0]);

            
                String bugIdStr = parts[1].replace("bug", "");
                int bugId = Integer.parseInt(bugIdStr);

                int parentBugId;
                if (parts[2].equals("null")) {
                    parentBugId = -1; 
                } else {
                    String parentBugIdStr = parts[2].replace("bug", "");
                    parentBugId = Integer.parseInt(parentBugIdStr);
                }

                Integer occurrences;
                if (parts[3].equals("null")) {
                    occurrences = null;
                } else {
                    occurrences = Integer.parseInt(parts[3]);
                }

                double percentageContribution;
                if (parts[4].equals("null")) {
                    percentageContribution = 0.0;
                } else {
                    percentageContribution = Double.parseDouble(parts[4]);
                }

                Bug bug = new Bug(edgeId, bugId, parentBugId, occurrences, percentageContribution);
                bugs.add(bug);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bugs;
    }

    private static void calculateOccurrences(List<Bug> bugs, Bug bug, Map<Integer, Integer> bugOccurrences) {
        if (bugOccurrences.containsKey(bug.bugId)) {
            return; 
        }

        if (bug.isLeaf()) {
            bugOccurrences.put(bug.bugId, bug.occurrences);
            return;
        }

        int totalOccurrences = 0;
        for (Bug child : bugs) {
            if (child.parentBugId == bug.bugId) {
                calculateOccurrences(bugs, child, bugOccurrences);
                int childOccurrences = bugOccurrences.get(child.bugId);
                totalOccurrences += (childOccurrences * child.percentageContribution) / 100.0;
            }
        }
        bugOccurrences.put(bug.bugId, totalOccurrences);
    }

    static class Bug {
        int edgeId;
        int bugId;
        int parentBugId;
        Integer occurrences;
        double percentageContribution;

        public Bug(int edgeId, int bugId, int parentBugId, Integer occurrences, double percentageContribution) {
            this.edgeId = edgeId;
            this.bugId = bugId;
            this.parentBugId = parentBugId;
            this.occurrences = occurrences;
            this.percentageContribution = percentageContribution;
        }

        public boolean isLeaf() {
            return occurrences != null;
        }
    }
}
