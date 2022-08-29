package Company.amazon.TreesandGraphs;

import java.util.*;

class GNode {
    int inDegrees = 0;
    LinkedList<Integer> outNodes = new LinkedList<>();
}

public class CourseSchedule {

    public static void main(String[] args) {
        int numCourses = 5;
//        int[][] prerequisites = {{1, 0}};
        int[][] prerequisites = {{8, 9}, {9, 8}, {4, 3}, {3, 2}, {2, 1}};
        System.out.println(canFinish(numCourses, prerequisites));
    }

    public static GNode getCreateGNode(HashMap<Integer, GNode> graph, int course){
        GNode gNode = null;
        if (graph.containsKey(course)) {
            gNode = graph.get(course);
        } else {
            gNode = new GNode();
            graph.put(course, gNode);
        }
        return gNode;
    }

    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        if (prerequisites.length ==0) return true;
        HashMap<Integer, GNode> graph = new HashMap<>();
        for (int[] prerequisity : prerequisites) {
            GNode prevCourse = getCreateGNode(graph, prerequisity[1]);
            GNode nextCourse = getCreateGNode(graph, prerequisity[0]);
            prevCourse.outNodes.add(prerequisity[0]);
            nextCourse.inDegrees++;
        }

        System.out.println("graph : " + graph.toString());

        int totalDeps = prerequisites.length;
        LinkedList<Integer> nodepCourses = new LinkedList<>();
        for (Map.Entry<Integer, GNode> map : graph.entrySet()) {
            if (map.getValue().inDegrees == 0) {
                nodepCourses.add(map.getKey());
            }
        }

//        LinkedList<Integer> rtnCourses = new LinkedList<>();

        int removeEdges = 0;
        while (nodepCourses.size() > 0) {
            int course = nodepCourses.pop();
//            rtnCourses.add(course);
            for (int nextCourse : graph.get(course).outNodes) {
                GNode gNode = graph.get(nextCourse);
                gNode.inDegrees--;
                removeEdges++;
                if (gNode.inDegrees == 0) {
                    nodepCourses.add(nextCourse);
                }
            }
        }

//        System.out.println("rtnCourses = " + rtnCourses);
        if (removeEdges != totalDeps) {
            return false;
        } else {
            return true;
        }

    }

    /**
     * Backtracking
     * @param numCourses
     * @param prerequisites
     * @return
     */
    public static boolean canFinish2(int numCourses, int[][] prerequisites) {
//        numCourses = prerequisites.length;
        // course -> list of next courses
        HashMap<Integer, List<Integer>> courseDict = new HashMap<>();

        // build the graph first
        for (int[] relation : prerequisites) {
            // relation[0] depends on relation[1]
            if (courseDict.containsKey(relation[1])) {
                courseDict.get(relation[1]).add(relation[0]);
            } else {
                List<Integer> nextCourses = new LinkedList<>();
                nextCourses.add(relation[0]);
                courseDict.put(relation[1], nextCourses);
            }
        }

        boolean[] path = new boolean[numCourses];

        for (int currCourse = 0; currCourse < numCourses; ++currCourse) {
            if (isCycle2(currCourse, courseDict, path)) {
                return false;
            }
        }

        return true;
    }

    public static boolean isCycle2(Integer currCourse,
                                   HashMap<Integer, List<Integer>> courseDict,
                                   boolean[] path) {

        if (path[currCourse]) {
            // come across a previously visited node, i.e. detect the cycle
            return true;
        }

        // no following courses, no loop.
        if (!courseDict.containsKey(currCourse))
            return false;

        // before backtracking, mark the node in the path
        path[currCourse] = true;

        // backtracking
        boolean ret = false;
        for (Integer nextCourse : courseDict.get(currCourse)) {
            ret = isCycle2(nextCourse, courseDict, path);
            if (ret)
                break;
        }
        // after backtracking, remove the node from the path
        path[currCourse] = false;
        return ret;
    }

}
