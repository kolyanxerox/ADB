package com.applovin.shadow.okio;

import com.google.android.gms.internal.measurement.o0OO0O0;
import java.io.Closeable;
import kotlin.jvm.internal.OooOo;
import o00O0Oo.Oooo000;

/* loaded from: classes2.dex */
final /* synthetic */ class Okio__OkioKt {
    public static final Sink blackhole() {
        return new BlackholeSink();
    }

    public static final BufferedSource buffer(Source source) {
        OooOo.OooO0o0(source, "<this>");
        return new RealBufferedSource(source);
    }

    public static final <T extends Closeable, R> R use(T t, Oooo000 block) throws Throwable {
        R r;
        OooOo.OooO0o0(block, "block");
        Throwable th = null;
        try {
            r = (R) block.invoke(t);
            if (t != null) {
                try {
                    t.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (t != null) {
                try {
                    t.close();
                } catch (Throwable th4) {
                    o0OO0O0.OooO00o(th3, th4);
                }
            }
            th = th3;
            r = null;
        }
        if (th != null) {
            throw th;
        }
        OooOo.OooO0O0(r);
        return r;
    }

    public static final BufferedSink buffer(Sink sink) {
        OooOo.OooO0o0(sink, "<this>");
        return new RealBufferedSink(sink);
    }
}
