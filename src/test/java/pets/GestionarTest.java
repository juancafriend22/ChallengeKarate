package pets;

import com.intuit.karate.Results;
import com.intuit.karate.Runner;
import com.intuit.karate.junit5.Karate;
import net.masterthought.cucumber.ReportBuilder;
import org.apache.commons.io.FileUtils;
import java.util.List;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import net.masterthought.cucumber.Configuration;

public class GestionarTest {

    @Karate.Test
    public void testParallel() {
        System.setProperty("karate.env", "BI");
        Results results = Runner.path("petstore.feature").outputCucumberJson(true).tags("~@ignore").parallel(4);
        generateReport(results.getReportDir());

    }

    public static void generateReport(String karateOutputPath) {
        Collection<File> jsonFiles = FileUtils.listFiles(new File(karateOutputPath), new String[]{"json"}, true);
        List<String> jsonPaths = new ArrayList(jsonFiles.size());
        jsonFiles.forEach(file -> jsonPaths.add(file.getAbsolutePath()));
        Configuration config = new Configuration(new File("build"), "ChallengeKarate");
        ReportBuilder reportBuilder = new ReportBuilder(jsonPaths, config);
        reportBuilder.generateReports();
    }
}
