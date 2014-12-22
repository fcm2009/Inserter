import java.io.File;
import java.util.Collection;

/**
 * Created by Mohammed Alshehry on 12/23/14.
 */
public abstract class Parser {

    private File db;

    public Parser(File db) {
        this.db = db;
    }

    public Parser(String db) {
        this.db = new File(db);
    }

    public abstract Collection<Entry> parse();

}
