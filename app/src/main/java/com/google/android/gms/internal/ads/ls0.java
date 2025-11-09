package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class ls0 extends gr0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final or0 f20944OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final String f20945OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final tq0 f20946OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final gr0 f20947OooO0Oo;

    public ls0(or0 or0Var, String str, tq0 tq0Var, gr0 gr0Var) {
        this.f20944OooO00o = or0Var;
        this.f20945OooO0O0 = str;
        this.f20946OooO0OO = tq0Var;
        this.f20947OooO0Oo = gr0Var;
    }

    @Override // com.google.android.gms.internal.ads.yq0
    public final boolean OooO00o() {
        return this.f20944OooO00o != or0.f23095Oooo00O;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ls0)) {
            return false;
        }
        ls0 ls0Var = (ls0) obj;
        return ls0Var.f20946OooO0OO.equals(this.f20946OooO0OO) && ls0Var.f20947OooO0Oo.equals(this.f20947OooO0Oo) && ls0Var.f20945OooO0O0.equals(this.f20945OooO0O0) && ls0Var.f20944OooO00o.equals(this.f20944OooO00o);
    }

    public final int hashCode() {
        return Objects.hash(ls0.class, this.f20945OooO0O0, this.f20946OooO0OO, this.f20947OooO0Oo, this.f20944OooO00o);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f20946OooO0OO);
        String strValueOf2 = String.valueOf(this.f20947OooO0Oo);
        String strValueOf3 = String.valueOf(this.f20944OooO00o);
        StringBuilder sb = new StringBuilder("LegacyKmsEnvelopeAead Parameters (kekUri: ");
        androidx.datastore.preferences.protobuf.OooO00o.OooOooO(sb, this.f20945OooO0O0, ", dekParsingStrategy: ", strValueOf, ", dekParametersForNewKeys: ");
        return androidx.datastore.preferences.protobuf.OooO00o.OooOOO(sb, strValueOf2, ", variant: ", strValueOf3, ")");
    }
}
