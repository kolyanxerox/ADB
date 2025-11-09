package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class wt0 {

    /* renamed from: OooO0O0, reason: collision with root package name */
    public static final wt0 f25407OooO0O0 = new wt0(Collections.unmodifiableMap(new HashMap()));

    /* renamed from: OooO00o, reason: collision with root package name */
    public final Map f25408OooO00o;

    public /* synthetic */ wt0(Map map) {
        this.f25408OooO00o = map;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof wt0) {
            return this.f25408OooO00o.equals(((wt0) obj).f25408OooO00o);
        }
        return false;
    }

    public final int hashCode() {
        return this.f25408OooO00o.hashCode();
    }

    public final String toString() {
        return this.f25408OooO00o.toString();
    }
}
