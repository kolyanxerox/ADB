package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes2.dex */
public final class em0 extends zl0 {

    /* renamed from: OooOo */
    public final /* synthetic */ fm0 f18626OooOo;

    /* renamed from: OooOo0O */
    public final Object f18627OooOo0O;

    /* renamed from: OooOo0o */
    public int f18628OooOo0o;

    public em0(fm0 fm0Var, int i) {
        this.f18626OooOo = fm0Var;
        Object obj = fm0.f18971OooOooo;
        this.f18627OooOo0O = fm0Var.OooO0O0()[i];
        this.f18628OooOo0o = i;
    }

    public final void OooO00o() {
        int i = this.f18628OooOo0o;
        Object obj = this.f18627OooOo0O;
        fm0 fm0Var = this.f18626OooOo;
        if (i != -1 && i < fm0Var.size()) {
            if (ii0.OooOOoo(obj, fm0Var.OooO0O0()[this.f18628OooOo0o])) {
                return;
            }
        }
        Object obj2 = fm0.f18971OooOooo;
        this.f18628OooOo0o = fm0Var.OooOO0(obj);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f18627OooOo0O;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        fm0 fm0Var = this.f18626OooOo;
        Map mapOooO0o = fm0Var.OooO0o();
        if (mapOooO0o != null) {
            return mapOooO0o.get(this.f18627OooOo0O);
        }
        OooO00o();
        int i = this.f18628OooOo0o;
        if (i == -1) {
            return null;
        }
        return fm0Var.OooO0OO()[i];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        fm0 fm0Var = this.f18626OooOo;
        Map mapOooO0o = fm0Var.OooO0o();
        Object obj2 = this.f18627OooOo0O;
        if (mapOooO0o != null) {
            return mapOooO0o.put(obj2, obj);
        }
        OooO00o();
        int i = this.f18628OooOo0o;
        if (i == -1) {
            fm0Var.put(obj2, obj);
            return null;
        }
        Object obj3 = fm0Var.OooO0OO()[i];
        fm0Var.OooO0OO()[this.f18628OooOo0o] = obj;
        return obj3;
    }
}
