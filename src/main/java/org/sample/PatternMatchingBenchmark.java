package org.sample;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * State is used to prevent constant folding by JVM.
 * Blackhole is used to prevent dead code elimination by JVM
 */
public class PatternMatchingBenchmark {

    @Benchmark
    @Fork(value = 1)
    @Warmup(iterations = 2)
    @Measurement(iterations = 5)
    public void testPatternMatch(MyState state, Blackhole blackhole) {
        Matcher matcher = Pattern.compile(state.matchRegex).matcher(state.s);
        final boolean matches = matcher.matches();
        blackhole.consume(matches);
    }

    @Benchmark
    @Fork(value = 1)
    @Warmup(iterations = 2)
    @Measurement(iterations = 5)
    public void testPatternFind(MyState state, Blackhole blackhole) {
        Matcher matcher = Pattern.compile(state.findRegex).matcher(state.s);
        final boolean matches = matcher.find();
        blackhole.consume(matches);
    }

    @State(Scope.Thread)
    public static class MyState {
        String matchRegex = "^\\s*<\\?xml[^>]*version\\s*=\\s*['\"](1.\\d)['\"][\\s\\S]*";
        String findRegex = "^\\s*<\\?xml[^>]*version\\s*=\\s*['\"](1.\\d)['\"]";
        String s = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "<note>\n" +
                "  <to>Tove</to>\n" +
                "  <from>Jani</from>\n" +
                "  <heading>Reminder</heading>\n" +
                "  <body>Don't forget me this weekend!</body>\n" +
                "</note>";
    }
}
