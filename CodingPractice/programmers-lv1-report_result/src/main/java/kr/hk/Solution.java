package kr.hk;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    private Map<String, Integer> reportedCntMap = new HashMap<>();
    private Map<String, List<String>> reportMap = new HashMap<>();
    private List<String> enforcedList = new ArrayList<>();
    private Map<String, Integer> mailMap = new HashMap<>();

    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        // 유저별로 신고당한 횟수
        for(String item : report) {
            String[] splittedItem = item.split(" ");
            String reporter = splittedItem[0];
            String reportee = splittedItem[1];
            if( reportIsDuplicated(reporter, reportee) == false) {
                logReport(reporter, reportee);
                increaseReported(reportee);
            }
            if(reportedCntMap.get(reportee) == k || reportedCntMap.get(reportee) > k) {
                if(enforcedList.contains(reportee) == false) enforcedList.add(reportee);
            }
        }

        // 유저가 신고한 ID중 정지된 id
        for(String key : reportMap.keySet()) {
            int cnt = 0;
            List<String> reporteeList = reportMap.get(key);

            for(String reportee : reporteeList) {
                if(enforcedList.contains(reportee)) cnt += 1;
            }

            mailMap.put(key, cnt);
        }

        makeDefaultToMailMap(id_list);

        for(int i = 0; i < id_list.length; i++) {
            answer[i] = mailMap.get(id_list[i]);
        }

        return answer;
    }

    private boolean reportIsDuplicated(String reporter, String reportee) {
        List<String> reporteeList = reportMap.get(reporter);
        boolean result = false;

        if( reporteeList == null ) return result;

        for(String reporteeFromList : reporteeList) {
            if(reporteeFromList.equals(reportee)) result = true;
        }
        return result;
    }

    private void makeDefaultToMailMap(String[] id_list) {
        for (String id : id_list) {
            if (mailMap.containsKey(id) == false) {
                mailMap.put(id, 0);
            }
        }
    }

    private void logReport(String reporter, String reportee) {
        List<String> newReporteeList = null;

        if (reportMap.size() == 0 || reportMap.containsKey(reporter) == false) {
            newReporteeList = new ArrayList<>();
        } else {
            newReporteeList = reportMap.get(reporter);
        }
        newReporteeList.add(reportee);
        reportMap.put(reporter, newReporteeList);
    }

    private void increaseReported(String reportee) {
        if (reportedCntMap.size() == 0 || reportedCntMap.containsKey(reportee) == false) {
            reportedCntMap.put(reportee, 1);
        } else {
            reportedCntMap.put(reportee, reportedCntMap.get(reportee) + 1);
        }
    }
}
