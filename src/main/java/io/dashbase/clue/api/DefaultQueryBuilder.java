package io.dashbase.clue.api;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.queryparser.classic.QueryParser;
import org.apache.lucene.search.Query;
import io.dashbase.clue.api.NewQueryParser;

public class DefaultQueryBuilder implements QueryBuilder {

  private QueryParser parser = null;
  
  @Override
  public void initialize(String defaultField, Analyzer analyzer)
      throws Exception {
    parser = new NewQueryParser(defaultField, analyzer);
    
  }

  @Override
  public Query build(String rawQuery) throws Exception {
    return parser.parse(rawQuery);
  }

}
