package bowser;

import com.google.common.base.Stopwatch;

import ox.Log;

public class DefaultWebLogger implements WebLogger {

  @Override
  public void log(Request request, Response response, Stopwatch watch) {
    Log.debug("Handled request: " + request + " in " + watch);
  }

}
