package ad.nugg.tap;

import cascading.flow.hadoop.HadoopFlowProcess;
import cascading.scheme.hadoop.SequenceFile;
import cascading.tap.hadoop.Lfs;
import cascading.tuple.Fields;
import cascading.tuple.TupleEntryIterator;
import org.apache.hadoop.mapred.JobConf;
import com.twitter.maple.tap.StdoutTap;

import java.io.File;
import java.io.IOException;

public class PrintTap extends StdoutTap {

    public PrintTap() {
        super();
    }

    @Override
    public boolean commitResource(JobConf conf) throws java.io.IOException {
        TupleEntryIterator it = new HadoopFlowProcess(conf).openTapForRead(this);
        System.out.println("");
        System.out.println("");
        System.out.println("RESULTS");
        System.out.println("-----------------------");
        while (it.hasNext()) {
            System.out.println(it.next().getTuple());
        }
        System.out.println("-----------------------");
        it.close();
        return true;
    }
}
