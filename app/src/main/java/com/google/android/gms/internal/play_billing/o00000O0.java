package com.google.android.gms.internal.play_billing;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class o00000O0 extends OooOo implements Serializable {

    /* renamed from: OooOo, reason: collision with root package name */
    public static final o00000O0 f26976OooOo;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public static final o00000O0 f26977OooOo0o;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final transient o0000OO0 f26978OooOo0O;

    static {
        oo0o0Oo oo0o0oo = o000000.f26972OooOo0o;
        f26977OooOo0o = new o00000O0(o0000OO0.f26985OooOoO);
        Object[] objArr = {o000OO.f27020OooOo};
        for (int i = 0; i < 1; i++) {
            if (objArr[i] == null) {
                throw new NullPointerException(OooO0oO.OooOo.OooO0o(i, "at index "));
            }
        }
        f26976OooOo = new o00000O0(o000000.OooOOO(1, objArr));
    }

    public o00000O0(o0000OO0 o0000oo02) {
        this.f26978OooOo0O = o0000oo02;
    }

    @Override // com.google.android.gms.internal.play_billing.OooOo
    public final /* bridge */ /* synthetic */ o00000OO OooO00o() {
        o0000OO0 o0000oo02 = this.f26978OooOo0O;
        return o0000oo02.isEmpty() ? o000O00O.f27011OooOooO : new o000O0(o0000oo02, o0000O0.f26980OooOo);
    }
}
