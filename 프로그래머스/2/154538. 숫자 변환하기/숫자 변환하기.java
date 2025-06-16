import java.util.*;
class Solution {
    static class State {
        int value;
        int count;

        State(int value, int count) {
            this.value = value;
            this.count = count;
        }
    }

    public int solution(int x, int y, int n) {
        Queue<State> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();

        queue.add(new State(x, 0));
        visited.add(x);

        while (!queue.isEmpty()) {
            State current = queue.poll();

            if (current.value == y) {
                return current.count;
            }

            int[] nextValues = {
                current.value + n,
                current.value * 2,
                current.value * 3
            };

            for (int next : nextValues) {
                if (next <= y && !visited.contains(next)) {
                    visited.add(next);
                    queue.add(new State(next, current.count + 1));
                }
            }
        }

        return -1; // 도달할 수 없는 경우
    }
}