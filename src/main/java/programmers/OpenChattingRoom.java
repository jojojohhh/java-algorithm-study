package programmers;

import java.util.ArrayList;
import java.util.HashMap;

public class OpenChattingRoom {
    public String[] solution(String[] record) {
        ArrayList chatLog = new ArrayList();
        ArrayList<String[]> arrayList = new ArrayList();
        HashMap<String, String> map = new HashMap<>();
        for (String r : record) {
            String[] chat = r.split("\\s");
            if (!chat[0].equals("Leave") || !map.containsKey(chat[1]))
                map.put(chat[1], chat[2]);
            if (!chat[0].equals("Change")) {
                arrayList.add(new String[]{chat[0], chat[1]});
            }
        }
        for (String[] s : arrayList) {
            String behavior = s[0].equals("Enter") ? "들어왔습니다." : "나갔습니다.";
            chatLog.add(map.get(s[1]) + "님이 " + behavior);
        }
        return (String[]) chatLog.toArray(new String[chatLog.size()]);
    }
}
