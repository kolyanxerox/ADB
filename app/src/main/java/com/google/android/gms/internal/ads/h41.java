package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: classes2.dex */
public final class h41 {

    /* renamed from: OooO00o */
    public final String f19548OooO00o;

    /* renamed from: OooO0O0 */
    public final o0OoOo0 f19549OooO0O0;

    /* renamed from: OooO0OO */
    public final o0OoOo0 f19550OooO0OO;

    /* renamed from: OooO0Oo */
    public final int f19551OooO0Oo;

    /* renamed from: OooO0o0 */
    public final int f19552OooO0o0;

    public h41(String str, o0OoOo0 o0oooo0, o0OoOo0 o0oooo02, int i, int i2) {
        boolean z = true;
        if (i != 0) {
            if (i2 == 0) {
                i2 = 0;
            } else {
                z = false;
            }
        }
        af0.OoooO0(z);
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        this.f19548OooO00o = str;
        this.f19549OooO0O0 = o0oooo0;
        o0oooo02.getClass();
        this.f19550OooO0OO = o0oooo02;
        this.f19551OooO0Oo = i;
        this.f19552OooO0o0 = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h41.class == obj.getClass()) {
            h41 h41Var = (h41) obj;
            if (this.f19551OooO0Oo == h41Var.f19551OooO0Oo && this.f19552OooO0o0 == h41Var.f19552OooO0o0 && this.f19548OooO00o.equals(h41Var.f19548OooO00o) && this.f19549OooO0O0.equals(h41Var.f19549OooO0O0) && this.f19550OooO0OO.equals(h41Var.f19550OooO0OO)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f19550OooO0OO.hashCode() + ((this.f19549OooO0O0.hashCode() + ((this.f19548OooO00o.hashCode() + ((((this.f19551OooO0Oo + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f19552OooO0o0) * 31)) * 31)) * 31);
    }
}
