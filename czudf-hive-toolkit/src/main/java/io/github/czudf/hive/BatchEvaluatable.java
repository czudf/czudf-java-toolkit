package io.github.czudf.hive;

import java.util.List;
import org.apache.hadoop.hive.ql.metadata.HiveException;

public interface BatchEvaluatable {
  List<Object> evaluate(List<Object[]> arguments) throws HiveException;
}
