package com.applovin.shadow.okio;

import java.util.zip.Deflater;
import kotlin.jvm.internal.OooOo;

/* renamed from: com.applovin.shadow.okio.-DeflaterSinkExtensions, reason: invalid class name */
/* loaded from: classes2.dex */
public final class DeflaterSinkExtensions {
    public static final DeflaterSink deflate(Sink sink, Deflater deflater) {
        OooOo.OooO0o0(sink, "<this>");
        OooOo.OooO0o0(deflater, "deflater");
        return new DeflaterSink(sink, deflater);
    }

    public static /* synthetic */ DeflaterSink deflate$default(Sink sink, Deflater deflater, int i, Object obj) {
        if ((i & 1) != 0) {
            deflater = new Deflater();
        }
        OooOo.OooO0o0(sink, "<this>");
        OooOo.OooO0o0(deflater, "deflater");
        return new DeflaterSink(sink, deflater);
    }
}
