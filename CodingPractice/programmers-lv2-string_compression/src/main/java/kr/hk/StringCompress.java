package kr.hk;

import java.util.ArrayList;
import java.util.List;

public class StringCompress {

    public int solution(String s) {
        int answer = 0 ;
        int halfOfgivenStrLength = s.length() / 2;

        for(int i = 0; i < halfOfgivenStrLength; i++) {
            List<String> stringList = splitStrToListAsSize(s, i+1);
            String compressedStr = getCompressedStr(stringList);

            if(answer == 0) answer = compressedStr.length();
            else if(answer > compressedStr.length()) answer = compressedStr.length();
        }
        if(answer == 0) answer = 1;
        return answer;
    }

    String getCompressedStr(List<String> stringList) {
        int repeatedCnt = 1;
        StringBuilder stb = new StringBuilder();

        for(int j = 0; j < stringList.size(); j++) {
            if(j == 0) continue;

            String prevStr = stringList.get(j-1);
            String thisStr = stringList.get(j);
            String storedStr = prevStr;

            if(isStreak(prevStr, thisStr)){ // 연속
                repeatedCnt += 1;
                storedStr = prevStr;
                if(stringList.size() == j + 1) {
                    appendProperStrToStbByRepeatedCnt(stb, repeatedCnt, storedStr);
                    continue;
                }
            }
            else { // 불연속
                if(stringList.size() == j + 1) {
                    if(repeatedCnt != 1) stb.append(repeatedCnt);
                    stb.append(prevStr).append(thisStr);
                    continue;
                }
                appendProperStrToStbByRepeatedCnt(stb, repeatedCnt, storedStr);
                repeatedCnt = 1;
            }
        }

        return stb.toString();
    }

    StringBuilder appendProperStrToStbByRepeatedCnt(StringBuilder stb, int repeatedCnt, String storedStr) {

        if(repeatedCnt != 1) stb.append(repeatedCnt).append(storedStr);
        else stb.append(storedStr);

        return stb;
    }

    boolean isStreak(String prevStr, String thisStr) {
        return prevStr.equals(thisStr);
    }

    List<String> splitStrToListAsSize(String givenStr, int sizeOfElement) {
        List<String> stringList = new ArrayList<>();
        int substrStartingIdx = 0;

        while(true) {
            if(substrStartingIdx > givenStr.length()) break;

            String element = givenStr.substring(substrStartingIdx, Math.min(substrStartingIdx + sizeOfElement, givenStr.length()));

            if(element.isEmpty() == false) {
                stringList.add(element);
            }
                substrStartingIdx += sizeOfElement;
        }

        return stringList;
    }

}
