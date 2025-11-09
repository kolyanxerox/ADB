package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class rj0 implements zm0 {

    /* renamed from: OooOo, reason: collision with root package name */
    public int f23866OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final boolean f23867OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final ArrayList f23868OooOo0o = new ArrayList(1);

    /* renamed from: OooOoO0, reason: collision with root package name */
    public iq0 f23869OooOoO0;

    public rj0(boolean z) {
        this.f23867OooOo0O = z;
    }

    public final void OooO(iq0 iq0Var) {
        this.f23869OooOoO0 = iq0Var;
        for (int i = 0; i < this.f23866OooOo; i++) {
            ((e01) this.f23868OooOo0o.get(i)).OooOO0o(this, iq0Var, this.f23867OooOo0O);
        }
    }

    public final void OooO00o(int i) {
        iq0 iq0Var = this.f23869OooOoO0;
        int i2 = i80.f19994OooO00o;
        for (int i3 = 0; i3 < this.f23866OooOo; i3++) {
            ((e01) this.f23868OooOo0o.get(i3)).OooO0o(iq0Var, this.f23867OooOo0O, i);
        }
    }

    public final void OooO0OO() {
        iq0 iq0Var = this.f23869OooOoO0;
        int i = i80.f19994OooO00o;
        for (int i2 = 0; i2 < this.f23866OooOo; i2++) {
            ((e01) this.f23868OooOo0o.get(i2)).OooO(iq0Var, this.f23867OooOo0O);
        }
        this.f23869OooOoO0 = null;
    }

    public final void OooO0oO(iq0 iq0Var) {
        for (int i = 0; i < this.f23866OooOo; i++) {
            ((e01) this.f23868OooOo0o.get(i)).getClass();
        }
    }

    @Override // com.google.android.gms.internal.ads.zm0
    public final void OooO0oo(e01 e01Var) {
        e01Var.getClass();
        ArrayList arrayList = this.f23868OooOo0o;
        if (arrayList.contains(e01Var)) {
            return;
        }
        arrayList.add(e01Var);
        this.f23866OooOo++;
    }

    @Override // com.google.android.gms.internal.ads.zm0
    public /* synthetic */ Map zze() {
        return Collections.EMPTY_MAP;
    }
}
