package programmers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class NewsClusteringTest {

    final NewsClustering newsClustering = new NewsClustering();

    @Test
    @DisplayName("NewsClusteringTest1")
    public void test1() {
        int result = newsClustering.solution("FRANCE", "french");
        Assertions.assertEquals(16384, result);
    }

    @Test
    @DisplayName("NewsClusteringTest2")
    public void test2() {
        int result = newsClustering.solution("handshake", "shake hands");
        Assertions.assertEquals(65536, result);
    }

    @Test
    @DisplayName("NewsClusteringTest3")
    public void test3() {
        int result = newsClustering.solution("aa1+aa2", "AAAA12");
        Assertions.assertEquals(43690, result);
    }

    @Test
    @DisplayName("NewsClusteringTest4")
    public void test4() {
        int result = newsClustering.solution("E=M*C^2", "e=m*c^2");
        Assertions.assertEquals(65536, result);
    }

    @Test
    @DisplayName("NewsClusteringTest5")
    public void test5() {
        int result = newsClustering.solution("AAbbaa_AA", "BBB");
        Assertions.assertEquals(9362, result);
    }
}
