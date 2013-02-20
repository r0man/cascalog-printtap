package ad.nugg.tap;

import cascading.flow.hadoop.HadoopFlowProcess;
import cascading.tuple.TupleEntryIterator;
import clojure.lang.RT;
import clojure.lang.Var;
import com.twitter.maple.tap.StdoutTap;
import java.io.IOException;
import org.apache.hadoop.mapred.JobConf;

public class PrintTap extends StdoutTap {

    private Var prn = RT.var("clojure.core", "prn");

    public PrintTap() {
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
            prn.invoke(it.next().getTuple());
        }
        System.out.println("-----------------------");
        it.close();
        return true;
    }
}
