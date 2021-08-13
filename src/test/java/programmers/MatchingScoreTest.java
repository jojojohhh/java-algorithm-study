package programmers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MatchingScoreTest {

    MatchingScore m = new MatchingScore();

    @Test
    public void test1() {
        Assertions.assertEquals(0, m.solution("blind", new String[]{
                "<html lang=\"ko\" xml:lang=\"ko\" xmlns=\"http://www.w3.org/1999/xhtml\">\n" +
                        "<head>\n  " +
                            "<meta charset=\"utf-8\">\n  " +
                            "<meta property=\"og:url\" content=\"https://a.com\"/>\n" +
                        "</head>  \n" +
                        "<body>\n" +
                            "Blind Lorem Blind ipsum dolor Blind test sit amet, consectetur adipiscing elit. \n" +
                            "<a href=\"https://b.com\"> Link to b </a>\n" +
                        "</body>\n" +
                "</html>",
                "<html lang=\"ko\" xml:lang=\"ko\" xmlns=\"http://www.w3.org/1999/xhtml\">\n" +
                        "<head>\n  " +
                            "<meta charset=\"utf-8\">\n  " +
                            "<meta property=\"og:url\" content=\"https://b.com\"/>\n" +
                        "</head>  \n" +
                        "<body>\n" +
                            "Suspendisse potenti. Vivamus venenatis tellus non turpis bibendum, \n" +
                            "<a href=\"https://a.com\"> Link to a </a>\n" +
                                "blind sed congue urna varius. Suspendisse feugiat nisl ligula, quis malesuada felis hendrerit ut.\n" +
                            "<a href=\"https://c.com\"> Link to c </a>\n" +
                        "</body>\n" +
                "</html>",
                "<html lang=\"ko\" xml:lang=\"ko\" xmlns=\"http://www.w3.org/1999/xhtml\">\n" +
                        "<head>\n  " +
                            "<meta charset=\"utf-8\">\n  " +
                            "<meta property=\"og:url\" content=\"https://c.com\"/>\n" +
                        "</head>  \n" +
                        "<body>\n" +
                            "Ut condimentum urna at felis sodales rutrum. Sed dapibus cursus diam, non interdum nulla tempor nec. Phasellus rutrum enim at orci consectetu blind\n" +
                            "<a href=\"https://a.com\"> Link to a </a>\n" +
                        "</body>\n" +
                "</html>"
        }));
    }

    @Test
    public void test2() {
        Assertions.assertEquals(1, m.solution("blind", new String[]{
                "<html lang=\"ko\" xml:lang=\"ko\" xmlns=\"http://www.w3.org/1999/xhtml\">\n" +
                        "<head>\n " +
                            "<meta charset=\"utf-8\">\n  " +
                            "<meta property=\"og:url\" content=\"https://careers.kakao.com/interview/list\"/>\n" +
                        "</head>  \n" +
                        "<body>\n" +
                            "<a href=\"https://programmers.co.kr/learn/courses/4673\"></a>#!MuziMuzi!)jayg07con&&\n\n" +
                        "</body>\n" +
                "</html>",
                "<html lang=\"ko\" xml:lang=\"ko\" xmlns=\"http://www.w3.org/1999/xhtml\">\n" +
                        "<head>\n  " +
                            "<meta charset=\"utf-8\">\n  " +
                            "<meta property=\"og:url\" content=\"https://www.kakaocorp.com\"/>\n" +
                        "</head>  \n" +
                        "<body>\n" +
                            "con%\tmuzI92apeach&2<a href=\"https://hashcode.co.kr/tos\"></a>\n\n\t^\n" +
                        "</body>\n" +
                "</html>"
        }));
    }
}
