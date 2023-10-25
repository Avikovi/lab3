import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;

class StringC implements StringChecker {
    public boolean checkString(String s) {
        if(s.contains("s")) {
            return true;
        }
        return false;
    }
}

public class ListTests {
    @Test 
	public void testFilter() {
        List<String> list1 = new ArrayList<String>();
        list1.add("test");
        list1.add("pest");
        list1.add("rest");
        list1.add("hello");
        StringC sc = new StringC();
        List<String> returnList = ListExamples.filter(list1, sc);
        List<String> finalList = new ArrayList<String>();
        finalList.add("test");
        finalList.add("pest");
        finalList.add("rest");

        assertEquals(finalList, returnList);
    }
}
