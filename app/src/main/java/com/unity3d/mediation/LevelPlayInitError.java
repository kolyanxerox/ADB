package com.unity3d.mediation;

import com.ironsource.C3535ps;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes3.dex */
public final class LevelPlayInitError {

    /* renamed from: a */
    private final int f13142a;

    /* renamed from: b */
    private final String f13143b;

    public LevelPlayInitError(int i, String errorMessage) {
        OooOo.OooO0o0(errorMessage, "errorMessage");
        this.f13142a = i;
        this.f13143b = errorMessage;
    }

    public final int getErrorCode() {
        return this.f13142a;
    }

    public final String getErrorMessage() {
        return this.f13143b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LevelPlayError(errorCode=");
        sb.append(this.f13142a);
        sb.append(", errorMessage='");
        return OooO0oO.OooOo.OooOOOo(sb, this.f13143b, "')");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayInitError(C3535ps sdkError) {
        this(sdkError.m11458c(), sdkError.m11459d());
        OooOo.OooO0o0(sdkError, "sdkError");
    }
}
