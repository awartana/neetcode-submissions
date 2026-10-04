class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Integer, List<Integer>> row = new HashMap<>();
        HashMap<Integer, List<Integer>> column = new HashMap<>();
        HashMap<List<Integer>, List<Integer>> box = new HashMap<>();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {

                if (board[i][j] == '.')
                    continue;

                int value = board[i][j] - '0';

                List<Integer> key = Arrays.asList(i / 3, j / 3);

                if (row.getOrDefault(i, new ArrayList<>()).contains(value)
                        || column.getOrDefault(j, new ArrayList<>()).contains(value)
                        || box.getOrDefault(key, new ArrayList<>()).contains(value)) {

                    return false;
                } else {
                    row.putIfAbsent(i, new ArrayList<>());
                    column.putIfAbsent(j, new ArrayList<>());
                    box.putIfAbsent(key, new ArrayList<>());

                    row.get(i).add(value);
                    column.get(j).add(value);
                    box.get(key).add(value);
                }
            }
        }

        return true;
    }
}
