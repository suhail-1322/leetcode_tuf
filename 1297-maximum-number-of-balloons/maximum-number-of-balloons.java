class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character, Integer> counter = new HashMap<>();
        String key = "balloon";
        for (char c : text.toCharArray()) {
            if (key.contains(Character.toString(c))) {
                counter.put(c, counter.getOrDefault(c, 0) + 1);
            }
        }

        if (!counter.containsKey('b') || 
            !counter.containsKey('a') || 
            !counter.containsKey('l') || 
            !counter.containsKey('o') || 
            !counter.containsKey('n')) {
            return 0;
        } else {
            return Math.min(Math.min(counter.get('b'), counter.get('a')), 
                            Math.min(counter.get('l') / 2, 
                                     Math.min(counter.get('o') / 2, counter.get('n'))));
        }

    }
}