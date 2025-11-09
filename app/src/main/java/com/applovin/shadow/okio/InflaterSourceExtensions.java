package com.applovin.shadow.okio;

import java.util.zip.Inflater;
import kotlin.jvm.internal.OooOo;

/* renamed from: com.applovin.shadow.okio.-InflaterSourceExtensions, reason: invalid class name */
/* loaded from: classes2.dex */
public final class InflaterSourceExtensions {
    public static final InflaterSource inflate(Source source, Inflater inflater) {
        OooOo.OooO0o0(source, "<this>");
        OooOo.OooO0o0(inflater, "inflater");
        return new InflaterSource(source, inflater);
    }

    public static /* synthetic */ InflaterSource inflate$default(Source source, Inflater inflater, int i, Object obj) {
        if ((i & 1) != 0) {
            inflater = new Inflater();
        }
        OooOo.OooO0o0(source, "<this>");
        OooOo.OooO0o0(inflater, "inflater");
        return new InflaterSource(source, inflater);
    }
}
