package programmers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TravelRouteTest {

    TravelRoute travelRoute = new TravelRoute();

    @Test
    public void test1() {
        String[] result = travelRoute.solution(new String[][] {{"ICN", "JFK"}, {"HND", "IAD"}, {"JFK", "HND"}});
        Assertions.assertArrayEquals(new String[] {"ICN", "JFK", "HND", "IAD"}, result);
    }

    @Test
    public void test2() {
        String[] result = travelRoute.solution(new String[][] {{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL","SFO"}});
        Assertions.assertArrayEquals(new String[] {"ICN", "ATL", "ICN", "SFO", "ATL", "SFO"}, result);
    }
}
