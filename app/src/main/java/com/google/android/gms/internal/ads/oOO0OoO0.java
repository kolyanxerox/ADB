package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.ironsource.C3034d9;

/* loaded from: classes2.dex */
public final class oOO0OoO0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final String f22819OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final String f22820OooO0O0;

    public oOO0OoO0(String str, String str2) {
        this.f22819OooO00o = str;
        this.f22820OooO0O0 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && oOO0OoO0.class == obj.getClass()) {
            oOO0OoO0 ooo0ooo0 = (oOO0OoO0) obj;
            if (TextUtils.equals(this.f22819OooO00o, ooo0ooo0.f22819OooO00o) && TextUtils.equals(this.f22820OooO0O0, ooo0ooo0.f22820OooO0O0)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f22820OooO0O0.hashCode() + (this.f22819OooO00o.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Header[name=");
        sb.append(this.f22819OooO00o);
        sb.append(",value=");
        return OooO0oO.OooOo.OooOOOo(sb, this.f22820OooO0O0, C3034d9.i.f8179e);
    }
}
