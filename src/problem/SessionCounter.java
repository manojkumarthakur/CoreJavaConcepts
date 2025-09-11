package problem;

import java.util.*;

public class SessionCounter {

    public static int getSessionCount(int timeout, String[] userIds, int[] timestamps) {
        int totalSessionCount = 0;
        HashMap<String, List<Integer>> map = new HashMap<>();
        for(int i=0; i < userIds.length; i++) {
            if(map.containsKey(userIds[i])) {
                List<Integer> list = map.get(userIds[i]);
                list.add(timestamps[i]);
                map.put(userIds[i], list);
            } else {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(timestamps[i]);
                map.put(userIds[i], list);
            }
        }
//        System.out.println(map);
        for(Map.Entry<String, List<Integer>> entry: map.entrySet()) {
            int userSessionCount = 1;
            List<Integer> sessions = entry.getValue();
            Collections.sort(sessions);
            System.out.println(sessions);
            for(int i = 1; i<sessions.size(); i++) {
                if((sessions.get(i) - sessions.get(i-1)) > timeout){
                    userSessionCount ++;
                }
            }
            totalSessionCount += userSessionCount;
        }
        return totalSessionCount;
    }



    public static int getSessionCountOpt(int timeout, String[] userIds, int[] timestamps) {
        // Step 1: Group timestamps by user
        Map<String, List<Integer>> userEvents = new HashMap<>();

        for (int i = 0; i < userIds.length; i++) {
            String user = userIds[i];
            int time = timestamps[i];

            userEvents.computeIfAbsent(user, k -> new ArrayList<>()).add(time);
        }

        // Step 2: Count sessions per user
        int totalSessions = 0;

        for (Map.Entry<String, List<Integer>> entry : userEvents.entrySet()) {
            List<Integer> times = entry.getValue();
            Collections.sort(times);  // Sort timestamps for that user

            int sessions = 1;  // At least one session if user has events

            for (int i = 1; i < times.size(); i++) {
                if (times.get(i) - times.get(i - 1) > timeout) {
                    sessions++;
                }
            }

            totalSessions += sessions;
        }

        return totalSessions;
    }


    public static void main(String[] args) {
        // Example from the image
        int timeout = 10;
        String[] userIds = {"u1", "u1", "u1", "u2", "u2", "u2", "u2"};
        int[] timestamps = {1, 5, 17, 3, 10, 20, 35};

        int sessionCount = getSessionCount(timeout, userIds, timestamps);
        System.out.println("Total session count: " + sessionCount); // Expected output: 4

    }
}
