By simply inspected loadedTestFrameworks, scalajs launches Rhino and blows up when JQuery tries to use the DOM API.

```
> show loadedTestFrameworks
[info] Updating {file:/Users/mhughes/development/loadedTestFrameworkBug/}loadedtestframeworkbug...
[info] Resolving org.eclipse.jetty#jetty-continuation;8.1.16.v20140903 ...
[info] Done updating.
[info] Compiling 1 Scala source to /Users/mhughes/development/loadedTestFrameworkBug/target/scala-2.11/classes...
[trace] Stack trace suppressed: run last test:loadedTestFrameworks for the full output.
[error] (test:loadedTestFrameworks) Exception while running JS code: TypeError: Cannot read property "defaultView" from undefined (/Users/mhughes/.ivy2/cache/org.webjars/jquery/jars/jquery-1.11.1.jar#META-INF/resources/webjars/jquery/1.11.1/jquery.js#1049)
[error] Total time: 1 s, completed Jan 21, 2015 9:46:56 PM

> last test:loadedTestFrameworks
java.lang.RuntimeException: Exception while running JS code: TypeError: Cannot read property "defaultView" from undefined (/Users/mhughes/.ivy2/cache/org.webjars/jquery/jars/jquery-1.11.1.jar#META-INF/resources/webjars/jquery/1.11.1/jquery.js#1049)
    at scala.sys.package$.error(package.scala:27)
    at org.scalajs.jsenv.rhino.RhinoJSEnv.org$scalajs$jsenv$rhino$RhinoJSEnv$$internalRunJS(RhinoJSEnv.scala:167)
    at org.scalajs.jsenv.rhino.RhinoJSEnv$Runner.run(RhinoJSEnv.scala:59)
    at org.scalajs.sbtplugin.FrameworkDetector.detect(FrameworkDetector.scala:64)
    at org.scalajs.sbtplugin.ScalaJSPluginInternal$$anonfun$40.apply(ScalaJSPluginInternal.scala:453)
    at org.scalajs.sbtplugin.ScalaJSPluginInternal$$anonfun$40.apply(ScalaJSPluginInternal.scala:438)
    at scala.Function1$$anonfun$compose$1.apply(Function1.scala:47)
    at sbt.$tilde$greater$$anonfun$$u2219$1.apply(TypeFunctions.scala:40)
    at sbt.std.Transform$$anon$4.work(System.scala:63)
    at sbt.Execute$$anonfun$submit$1$$anonfun$apply$1.apply(Execute.scala:226)
    at sbt.Execute$$anonfun$submit$1$$anonfun$apply$1.apply(Execute.scala:226)
    at sbt.ErrorHandling$.wideConvert(ErrorHandling.scala:17)
    at sbt.Execute.work(Execute.scala:235)
    at sbt.Execute$$anonfun$submit$1.apply(Execute.scala:226)
    at sbt.Execute$$anonfun$submit$1.apply(Execute.scala:226)
    at sbt.ConcurrentRestrictions$$anon$4$$anonfun$1.apply(ConcurrentRestrictions.scala:159)
    at sbt.CompletionService$$anon$2.call(CompletionService.scala:28)
    at java.util.concurrent.FutureTask.run(FutureTask.java:266)
    at java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:511)
    at java.util.concurrent.FutureTask.run(FutureTask.java:266)
    at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142)
    at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617)
    at java.lang.Thread.run(Thread.java:745)
[error] (test:loadedTestFrameworks) Exception while running JS code: TypeError: Cannot read property "defaultView" from undefined (/Users/mhughes/.ivy2/cache/org.webjars/jquery/jars/jquery-1.11.1.jar#META-INF/resources/webjars/jquery/1.11.1/jquery.js#1049)
```
