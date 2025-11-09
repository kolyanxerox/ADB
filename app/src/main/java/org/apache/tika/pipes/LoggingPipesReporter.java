package org.apache.tika.pipes;

import o0oOO.OooO0O0;
import o0oOO.OooO0o;

/* loaded from: classes3.dex */
public class LoggingPipesReporter extends PipesReporter {
    OooO0O0 LOGGER = OooO0o.OooO0O0(LoggingPipesReporter.class);

    @Override // org.apache.tika.pipes.PipesReporter
    public void error(Throwable th) {
        this.LOGGER.OooOOOO("pipes error", th);
    }

    @Override // org.apache.tika.pipes.PipesReporter
    public void report(FetchEmitTuple fetchEmitTuple, PipesResult pipesResult, long j) {
        this.LOGGER.OooO0oo("{} {} {}", fetchEmitTuple, pipesResult, Long.valueOf(j));
    }

    @Override // org.apache.tika.pipes.PipesReporter
    public void error(String str) {
        this.LOGGER.OooOOo("error {}", str);
    }
}
