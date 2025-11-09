package com.google.android.gms.internal.ads;

import android.media.metrics.LogSessionId;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class o61 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final String f22351OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final n61 f22352OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final Object f22353OooO0OO;

    static {
        if (i80.f19994OooO00o < 31) {
            new o61("");
        } else {
            int i = n61.f21421OooO0O0;
        }
    }

    public o61(LogSessionId logSessionId, String str) {
        this.f22352OooO0O0 = new n61(logSessionId);
        this.f22351OooO00o = str;
        this.f22353OooO0OO = new Object();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o61)) {
            return false;
        }
        o61 o61Var = (o61) obj;
        return Objects.equals(this.f22351OooO00o, o61Var.f22351OooO00o) && Objects.equals(this.f22352OooO0O0, o61Var.f22352OooO0O0) && Objects.equals(this.f22353OooO0OO, o61Var.f22353OooO0OO);
    }

    public final int hashCode() {
        return Objects.hash(this.f22351OooO00o, this.f22352OooO0O0, this.f22353OooO0OO);
    }

    public o61(String str) {
        af0.OooooO0(i80.f19994OooO00o < 31);
        this.f22351OooO00o = str;
        this.f22352OooO0O0 = null;
        this.f22353OooO0OO = new Object();
    }
}
