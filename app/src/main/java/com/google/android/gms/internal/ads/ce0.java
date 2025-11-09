package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* loaded from: classes2.dex */
public final class ce0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final Pattern f17994OooO00o;

    public ce0() {
        Pattern patternCompile;
        try {
            patternCompile = Pattern.compile((String) zzbe.zzc().OooO00o(AbstractC1448c7.o0O00Oo));
        } catch (PatternSyntaxException unused) {
            patternCompile = null;
        }
        this.f17994OooO00o = patternCompile;
    }
}
