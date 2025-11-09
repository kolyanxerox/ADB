package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class do0 implements FilenameFilter {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final Pattern f18277OooO00o;

    public do0(Pattern pattern) {
        pattern.getClass();
        this.f18277OooO00o = pattern;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return this.f18277OooO00o.matcher(str).matches();
    }
}
