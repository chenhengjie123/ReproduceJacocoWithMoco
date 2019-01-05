# Simple Project to reproduce issue with jacoco and moco

## Usage

just `mvn test`

```
$ mvn test
[INFO] Scanning for projects...
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] Building reproduce-moco-with-jacoco 1.0-SNAPSHOT
[INFO] ------------------------------------------------------------------------
[INFO]
[INFO] --- jacoco-maven-plugin:0.7.8:prepare-agent (default) @ reproduce-moco-with-jacoco ---
[INFO] argLine set to -javaagent:/Users/hengjiechen/.m2/repository/org/jacoco/org.jacoco.agent/0.7.8/org.jacoco.agent-0.7.8-runtime.jar=destfile=/Users/hengjiechen/Develop/Java/reproducemocowithjacoco/target/jacoco.exec
[INFO]
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ reproduce-moco-with-jacoco ---
[WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] skip non existing resourceDirectory /Users/hengjiechen/Develop/Java/reproducemocowithjacoco/src/main/resources
[INFO]
[INFO] --- maven-compiler-plugin:2.5.1:compile (default-compile) @ reproduce-moco-with-jacoco ---
[INFO] Nothing to compile - all classes are up to date
[INFO]
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ reproduce-moco-with-jacoco ---
[WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] Copying 1 resource
[INFO]
[INFO] --- maven-compiler-plugin:2.5.1:testCompile (default-testCompile) @ reproduce-moco-with-jacoco ---
[INFO] Nothing to compile - all classes are up to date
[INFO]
[INFO] --- maven-surefire-plugin:2.12.4:test (default-test) @ reproduce-moco-with-jacoco ---
[INFO] Surefire report directory: /Users/hengjiechen/Develop/Java/reproducemocowithjacoco/target/surefire-reports

-------------------------------------------------------
 T E S T S
-------------------------------------------------------
objc[19337]: Class JavaLaunchHelper is implemented in both /Library/Java/JavaVirtualMachines/jdk1.8.0_25.jdk/Contents/Home/jre/bin/java (0x10ca404c0) and /Library/Java/JavaVirtualMachines/jdk1.8.0_25.jdk/Contents/Home/jre/lib/libinstrument.dylib (0x10cae74e0). One of the two will be used. Which one is undefined.
Running demo.TestForReproduceMocoWithJacoco
Tests run: 1, Failures: 0, Errors: 1, Skipped: 0, Time elapsed: 2.905 sec <<< FAILURE!
mockTest(demo.TestForReproduceMocoWithJacoco)  Time elapsed: 0.009 sec  <<< ERROR!
java.lang.IllegalArgumentException: unknown field [$jacocoData]
        at com.github.dreamhead.moco.parser.model.DynamicResponseHandlerFactory.createResponseHandler(DynamicResponseHandlerFactory.java:116)
        at com.github.dreamhead.moco.parser.model.DynamicResponseHandlerFactory.access$000(DynamicResponseHandlerFactory.java:37)
        at com.github.dreamhead.moco.parser.model.DynamicResponseHandlerFactory$1.apply(DynamicResponseHandlerFactory.java:70)
        at com.github.dreamhead.moco.parser.model.DynamicResponseHandlerFactory$1.apply(DynamicResponseHandlerFactory.java:65)
        at com.google.common.collect.Iterators$7.transform(Iterators.java:750)
        at com.google.common.collect.TransformedIterator.next(TransformedIterator.java:47)
        at com.google.common.collect.Iterators.size(Iterators.java:198)
        at com.google.common.collect.Iterables.size(Iterables.java:106)
        at com.google.common.collect.FluentIterable.size(FluentIterable.java:342)
        at com.github.dreamhead.moco.parser.model.DynamicResponseHandlerFactory.getResponseHandler(DynamicResponseHandlerFactory.java:53)
        at com.github.dreamhead.moco.parser.model.DynamicResponseHandlerFactory.createResponseHandler(DynamicResponseHandlerFactory.java:49)
        at com.github.dreamhead.moco.parser.model.ResponseSetting.getResponseHandler(ResponseSetting.java:62)
        at com.github.dreamhead.moco.parser.model.SessionSetting.getResponseHandler(SessionSetting.java:66)
        at com.github.dreamhead.moco.parser.model.SessionSetting.bindToSession(SessionSetting.java:111)
        at com.github.dreamhead.moco.parser.model.SessionSetting.bindTo(SessionSetting.java:78)
        at com.github.dreamhead.moco.parser.model.SessionSetting.newHttpServer(SessionSetting.java:144)
        at com.github.dreamhead.moco.parser.HttpServerParser.createServer(HttpServerParser.java:23)
        at com.github.dreamhead.moco.parser.HttpServerParser.createServer(HttpServerParser.java:12)
        at com.github.dreamhead.moco.parser.BaseParser.parseServer(BaseParser.java:19)
        at com.github.dreamhead.moco.MocoJsonRunner.parseHttpServer(MocoJsonRunner.java:60)
        at com.github.dreamhead.moco.MocoJsonRunner.jsonHttpServer(MocoJsonRunner.java:21)
        at com.github.dreamhead.moco.junit.MocoJunitRunner.jsonHttpRunner(MocoJunitRunner.java:37)
        at demo.TestForReproduceMocoWithJacoco.<init>(TestForReproduceMocoWithJacoco.java:14)
        at sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
        at sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)
        at sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
        at java.lang.reflect.Constructor.newInstance(Constructor.java:408)
        at org.junit.runners.BlockJUnit4ClassRunner.createTest(BlockJUnit4ClassRunner.java:217)
        at org.junit.runners.BlockJUnit4ClassRunner$1.runReflectiveCall(BlockJUnit4ClassRunner.java:266)
        at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
        at org.junit.runners.BlockJUnit4ClassRunner.methodBlock(BlockJUnit4ClassRunner.java:263)
        at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:78)
        at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:57)
        at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
        at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
        at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
        at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
        at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
        at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
        at org.apache.maven.surefire.junit4.JUnit4Provider.execute(JUnit4Provider.java:252)
        at org.apache.maven.surefire.junit4.JUnit4Provider.executeTestSet(JUnit4Provider.java:141)
        at org.apache.maven.surefire.junit4.JUnit4Provider.invoke(JUnit4Provider.java:112)
        at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
        at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
        at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
        at java.lang.reflect.Method.invoke(Method.java:483)
        at org.apache.maven.surefire.util.ReflectionUtils.invokeMethodWithArray(ReflectionUtils.java:189)
        at org.apache.maven.surefire.booter.ProviderFactory$ProviderProxy.invoke(ProviderFactory.java:165)
        at org.apache.maven.surefire.booter.ProviderFactory.invokeProvider(ProviderFactory.java:85)
        at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:115)
        at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:75)


Results :

Tests in error:
  mockTest(demo.TestForReproduceMocoWithJacoco): unknown field [$jacocoData]

Tests run: 1, Failures: 0, Errors: 1, Skipped: 0

[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 6.308s
[INFO] Finished at: Sat Jan 05 11:46:22 CST 2019
[INFO] Final Memory: 14M/981M
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-surefire-plugin:2.12.4:test (default-test) on project reproduce-moco-with-jacoco: There are test failures.
[ERROR]
[ERROR] Please refer to /Users/hengjiechen/Develop/Java/reproducemocowithjacoco/target/surefire-reports for the individual test results.
[ERROR] -> [Help 1]
[ERROR]
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR]
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException

```
