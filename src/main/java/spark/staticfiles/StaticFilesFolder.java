package spark.staticfiles;

import static spark.utils.StringUtils.removeLeadingAndTrailingSlashesFrom;
import java.nio.file.Paths;

/**
 * Created by Per Wendel on 2016-11-05.
 */
public class StaticFilesFolder {

    private static volatile String local;
    private static volatile String external;

    public static final void localConfiguredTo(String folder) {

        local = removeLeadingAndTrailingSlashesFrom(folder);
    }

    public static final void externalConfiguredTo(String folder) {
        
        external = removeLeadingAndTrailingSlashesFrom(
            Paths.get(folder).toAbsolutePath().toString().replace("\\", "/")
        );
    }

    public static final String local() {
        return local;
    }

    public static final String external() {
        return external;
    }


}
