import com.mycompany.tvseriesmanager.Series;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SeriesTest {
    @Test
    public void TestSearchSeries_SeriesFound() {
        Series s = new Series();
        s.addSeries(); // Simulate adding "Breaking Bad"
        // You'd mock input or refactor for testability
    }

    @Test
    public void TestSearchSeries_SeriesNotFound() {
        Series s = new Series();
        s.searchSeries(); // Simulate searching for "Unknown"
    }

    @Test
    public void TestUpdateSeries() {
        Series s = new Series();
        s.updateSeries(); // Simulate update
    }

    @Test
    public void TestUpdateSeries_SeriesNotFound() {
        Series s = new Series();
        // Try updating invalid index
    }

    @Test
    public void TestUpdateSeries_InvalidData() {
        // Simulate invalid age input
    }

    @Test
    public void TestDeleteSeries() {
        Series s = new Series();
        s.deleteSeries(); // Simulate deletion
    }
}