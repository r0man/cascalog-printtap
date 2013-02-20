package cascalog.printtap;

import cascading.flow.hadoop.HadoopFlowProcess;
import cascading.tuple.TupleEntryIterator;
import clojure.lang.RT;
import clojure.lang.Var;
import com.twitter.maple.tap.StdoutTap;
import java.io.IOException;
import java.util.Iterator;
import org.apache.hadoop.mapred.JobConf;

public class Stdout extends StdoutTap {

    public Stdout() {
        super();
    }

    @Override
    public boolean commitResource(JobConf conf) throws IOException {
        TupleEntryIterator it = new HadoopFlowProcess(conf).openTapForRead(this);
        System.out.println("");
        System.out.println("");
        System.out.println("RESULTS");
        System.out.println("-----------------------");
        while (it.hasNext()) {
            Var pr = RT.var("clojure.core", "pr-str");
            Iterator<Object> elements = it.next().getTuple().iterator();
            while (elements.hasNext()) {
                System.out.print(pr.invoke(elements.next()));
                System.out.print("\t");
            }
            System.out.println();
        }
        System.out.println("-----------------------");
        it.close();
        return true;
    }
}
