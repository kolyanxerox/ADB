package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* loaded from: classes2.dex */
public final class h81 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final String f19654OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f19655OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f19656OooO0OO;

    public h81(String str, boolean z, boolean z2) {
        this.f19654OooO00o = str;
        this.f19655OooO0O0 = z;
        this.f19656OooO0OO = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != h81.class) {
            return false;
        }
        h81 h81Var = (h81) obj;
        return TextUtils.equals(this.f19654OooO00o, h81Var.f19654OooO00o) && this.f19655OooO0O0 == h81Var.f19655OooO0O0 && this.f19656OooO0OO == h81Var.f19656OooO0OO;
    }

    public final int hashCode() {
        return ((((this.f19654OooO00o.hashCode() + 31) * 31) + (true != this.f19655OooO0O0 ? 1237 : 1231)) * 31) + (true != this.f19656OooO0OO ? 1237 : 1231);
    }
}
