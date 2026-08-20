class TimeMap {
    Map<String, List<String[]>> timeMap;

    public TimeMap() {
        timeMap = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        List<String[]> valueTime = timeMap.getOrDefault(key, new ArrayList<>());
        String[] pair = new String[] {value, String.valueOf(timestamp)};
        
        valueTime.add(pair);

        timeMap.put(key, valueTime);
    }
    
    public String get(String key, int timestamp) {
        if(timeMap.get(key) == null){
            return "";
        }
        List<String[]> values = timeMap.get(key);
        int left = 0;
        int right = values.size()-1;
        String largest = "";

        while(left <= right){
            int mid = left + (right - left)/2;
            int timeOfMid = Integer.valueOf(values.get(mid)[1]);
            
            if(timeOfMid == timestamp){
                return values.get(mid)[0];
            } else if(timeOfMid > timestamp){
                right = mid - 1;
            } else {
                left = mid + 1;
                largest = values.get(mid)[0];
            }
        }

        
        return largest;
    }
}
