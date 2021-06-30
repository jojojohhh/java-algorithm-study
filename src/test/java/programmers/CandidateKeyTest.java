package programmers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CandidateKeyTest {

    @Test
    @DisplayName("CandidateKeyTest")
    public void test() {
        CandidateKey candidateKey = new CandidateKey();
        int result = candidateKey.solution(new String[][]{{"100", "ryan", "music", "2"},
                {"200", "apeach", "math", "2"},
                {"300", "tube", "computer", "3"},
                {"400", "con", "computer", "4"},
                {"500", "muzi", "music", "3"},
                {"600", "apeach", "music", "2"}});
        Assertions.assertEquals(2, result);

    }
}
