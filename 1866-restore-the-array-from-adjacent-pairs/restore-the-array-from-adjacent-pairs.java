class Solution {
  public int[] restoreArray(int[][] adjacentPairs) {
    var map = new HashMap<Integer, List<Integer>>();

    for (var pair : adjacentPairs) {
      map.putIfAbsent(pair[0], new ArrayList<>());
      map.putIfAbsent(pair[1], new ArrayList<>());

      map.get(pair[0]).add(pair[1]);
      map.get(pair[1]).add(pair[0]);
    }
    var arr = new int[adjacentPairs.length + 1];

    for (var entry : map.entrySet()) {
      if (entry.getValue().size() == 1) {
        arr[0] = entry.getKey();
        arr[1] = entry.getValue().get(0);
        break;
      }
    }
    for (var i=2; i < arr.length; i++) {
      var a = map.get(arr[i-1]);
      arr[i] = a.get(0) == arr[i-2] ? a.get(1) : a.get(0);
    }
    return arr;
  }
}