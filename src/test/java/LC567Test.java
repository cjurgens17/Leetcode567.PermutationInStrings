import static org.junit.Assert.*;

public class LC567Test {

    @org.junit.Test
    public void checkInclusion() {
        boolean actual1 = LC567.checkInclusion("ab","eidbaooo");
        boolean actual2 = LC567.checkInclusion("ab","eidboaoo");

        assertTrue(actual1);
        assertFalse(actual2);
    }
}