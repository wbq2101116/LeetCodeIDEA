package cn.edu.nju.leetcode;

import java.util.*;

public class Test {
    public static void main(String[] args) {
/*
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(new Solution().twoSum(nums, target)));
*/
/*
        char[] tasks = {'A', 'A', 'A', 'A', 'A', 'A', 'B', 'C', 'D', 'E', 'F', 'G'};
        int n = 2;

        System.out.println(new Solution().leastInterval(tasks, n));
*/
/*
        int[] nums = {1, 6, 1};
        int k = 3;
        System.out.println(new Solution().smallestDistancePair(nums, k));
*/

    }


}

/*
class Solution {
    public int smallestDistancePair(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int[] res = new int[nums[n - 1] - nums[0] + 1];
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                res[nums[j] - nums[i]]++;
        }
        // Arrays.sort(res);
        int count = 0;
        for (int i = 0; i < res.length; i++) {
            count += res[i];
            if (count >= k)
                return i;
        }
        return 0;
    }


    public int leastInterval(char[] tasks, int n) {
        // hashmap
        Map<Character, Integer> charMap = new HashMap<>();
        for (int i = 0; i < tasks.length; i++) {
            char ch = tasks[i];
            if (charMap.containsKey(ch)) {
                charMap.replace(ch, charMap.get(ch) + 1);
            } else {
                charMap.put(ch, 1);
            }
        }

        // print
        // printHashMap(charMap);

        // priority queue
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        Set<Map.Entry<Character, Integer>> entries = charMap.entrySet();
        for (Map.Entry<Character, Integer> entry : entries) {
            priorityQueue.add(entry.getValue());
        }

        // print
        // System.out.println(Arrays.toString(priorityQueue.toArray()));

        int res = 0;

        Map<Character, Integer> charVisited = new HashMap<>();

        List<Integer> list = new ArrayList<>();

        while (priorityQueue.size() != 0) {
            // System.out.println("***");
            // System.out.println("res : " + res);
            for (int i = 0; i < n + 1; i++) {
                // System.out.println("------");
                if (priorityQueue.size() == 0) {
                    if (list.size() != 0) {
                        res += n - i + 1;
                    }
                    break;
                }

                int select = priorityQueue.poll();
                // System.out.println("select : " + select);

                Character ch = getKey(charMap, select);
                // System.out.println("ch : " + ch);

                // System.out.println(Arrays.toString(priorityQueue.toArray()));
                // printHashMap(charVisited);
                //if (null == ch) {
                //    priorityQueue.add(select);
                //    res++;
                //    continue;
                //}

                if (select - 1 != 0) {
                    list.add(select - 1);
                    // priorityQueue.add(select - 1);
                }
                // System.out.println(Arrays.toString(priorityQueue.toArray()));


                int tmp = charMap.get(ch) - 1;
                if (0 == tmp) {
                    charMap.remove(ch);
                } else {
                    charMap.remove(ch);
                    charVisited.put(ch, tmp);
                }
                res++;
            }
            priorityQueue.addAll(list);
            list.clear();
            charMap.putAll(charVisited);
            charVisited.clear();
        }
        return res;
    }

    public Character getKey(Map<Character, Integer> map, int value) {
        Set<Map.Entry<Character, Integer>> entries = map.entrySet();
        for (Map.Entry<Character, Integer> entry : entries) {
            if (entry.getValue() == value) {
                return entry.getKey();
            }
        }
        return null;
    }

    public void printHashMap(Map<Character, Integer> map) {
        Iterator iter = map.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry entry = (Map.Entry) iter.next();
            // System.out.println("key : " + entry.getKey() + " value : " + entry.getValue());
        }
    }

}
*/

/*
// 167 Two Sum II - Input array is sorted
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;
        while (i < j) {
            if (numbers[i] + numbers[j] == target) {
                return new int[] {i + 1, j + 1};
            } else if (numbers[i] + numbers[j] > target) {
                j--;
            } else {
                i++;
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
*/

/*
// 1 Two Sum
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] {i, map.get(complement)};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
*/