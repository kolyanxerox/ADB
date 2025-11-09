package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* loaded from: classes2.dex */
public class b81 extends u31 {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final int f17452OooOo0O;

    public b81(IllegalStateException illegalStateException, c81 c81Var) {
        super("Decoder failed: ".concat(String.valueOf(c81Var == null ? null : c81Var.f17958OooO00o)), illegalStateException);
        boolean z = illegalStateException instanceof MediaCodec.CodecException;
        this.f17452OooOo0O = i80.f19994OooO00o >= 23 ? z ? ((MediaCodec.CodecException) illegalStateException).getErrorCode() : 0 : i80.OooOOOo(z ? ((MediaCodec.CodecException) illegalStateException).getDiagnosticInfo() : null);
    }
}
