import java.util.*;

public class Solution {

    public static List<Integer> topKFrequent(int[] nums, int k) {
        // Create an unordered map to store the frequency of each number
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Create a priority queue to store the frequency of each number in descending order
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(frequencyMap::get).reversed());
        for (int num : frequencyMap.keySet()) {
            priorityQueue.add(num);
        }

        // Create a list to store the k most frequent elements
        List<Integer> topK = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            topK.add(priorityQueue.poll());
        }

        return topK;
    }

}
