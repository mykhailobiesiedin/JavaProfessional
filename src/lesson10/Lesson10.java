package lesson10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lesson10 {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {0, 1, 1, 0},
                {1, 0, 1, 1},
                {1, 1, 0, 1},
                {0, 1, 1, 0}
        };
        List<List<Integer>> dynamicMatrix = new ArrayList<>();
        dynamicMatrix.add(Arrays.asList(0, 1, 1, 0));
        dynamicMatrix.add(Arrays.asList(1, 0, 1, 1));
        dynamicMatrix.add(Arrays.asList(1, 1, 0, 1));
        dynamicMatrix.add(Arrays.asList(0, 1, 1, 0));

        Node node1 = new Node();
        node1.value = "Узел 1";

        Node node2 = new Node();
        node2.value = "Узел 2";

        Node node3 = new Node();
        node3.value = "Узел 3";

        Node node4 = new Node();
        node4.value = "Узел 4";

        node1.nodes.add(node2);
        node1.nodes.add(node3);

        node2.nodes.add(node1);
        node2.nodes.add(node3);
        node2.nodes.add(node4);

        node3.nodes.add(node1);
        node3.nodes.add(node2);
        node3.nodes.add(node4);

        node4.nodes.add(node2);
        node4.nodes.add(node3);

        node1.print();
        node2.print();
        node3.print();
        node4.print();

    }
}
