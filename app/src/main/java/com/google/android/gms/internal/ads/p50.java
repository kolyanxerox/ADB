package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public final class p50 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final String f23223OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final String f23224OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final Drawable f23225OooO0OO;

    public p50(String str, String str2, Drawable drawable) {
        this.f23223OooO00o = str;
        if (str2 == null) {
            throw new NullPointerException("Null imageUrl");
        }
        this.f23224OooO0O0 = str2;
        this.f23225OooO0OO = drawable;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p50) {
            p50 p50Var = (p50) obj;
            String str = this.f23223OooO00o;
            if (str != null ? str.equals(p50Var.f23223OooO00o) : p50Var.f23223OooO00o == null) {
                if (this.f23224OooO0O0.equals(p50Var.f23224OooO0O0)) {
                    Drawable drawable = p50Var.f23225OooO0OO;
                    Drawable drawable2 = this.f23225OooO0OO;
                    if (drawable2 != null ? drawable2.equals(drawable) : drawable == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f23223OooO00o;
        int iHashCode = (((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f23224OooO0O0.hashCode();
        Drawable drawable = this.f23225OooO0OO;
        return (drawable != null ? drawable.hashCode() : 0) ^ (iHashCode * 1000003);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f23225OooO0OO);
        StringBuilder sb = new StringBuilder("OfflineAdAssets{advertiserName=");
        sb.append(this.f23223OooO00o);
        sb.append(", imageUrl=");
        return androidx.datastore.preferences.protobuf.OooO00o.OooOOO(sb, this.f23224OooO0O0, ", icon=", strValueOf, "}");
    }
}
