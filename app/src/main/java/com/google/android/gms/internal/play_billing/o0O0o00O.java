package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.ads.AbstractC2183w4;
import com.google.android.gms.internal.ads.ez0;

/* loaded from: classes2.dex */
public final class o0O0o00O implements o0OO000o {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final o0O00o0 f27128OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final o0O000o0 f27129OooO0O0;

    public o0O0o00O(o0O000o0 o0o000o0, o0O00o0 o0o00o0) {
        o0O000o0 o0o000o02 = o0O000O.f27087OooO00o;
        this.f27129OooO0O0 = o0o000o0;
        this.f27128OooO00o = o0o00o0;
    }

    @Override // com.google.android.gms.internal.play_billing.o0OO000o
    public final void OooO00o(Object obj) {
        this.f27129OooO0O0.getClass();
        o0OO00o0 o0oo00o0 = ((o0OoO00O) obj).zzc;
        if (o0oo00o0.f27144OooO0o0) {
            o0oo00o0.f27144OooO0o0 = false;
        }
        o0O000o0 o0o000o0 = o0O000O.f27087OooO00o;
        throw androidx.datastore.preferences.protobuf.OooO00o.OooO0o0(obj);
    }

    @Override // com.google.android.gms.internal.play_billing.o0OO000o
    public final void OooO0O0(Object obj, Object obj2) {
        oo0oO0.OooOOOo(obj, obj2);
    }

    @Override // com.google.android.gms.internal.play_billing.o0OO000o
    public final boolean OooO0OO(Object obj) {
        throw androidx.datastore.preferences.protobuf.OooO00o.OooO0o0(obj);
    }

    @Override // com.google.android.gms.internal.play_billing.o0OO000o
    public final void OooO0Oo(Object obj, byte[] bArr, int i, int i2, ez0 ez0Var) {
        o0OoO00O o0ooo00o = (o0OoO00O) obj;
        if (o0ooo00o.zzc == o0OO00o0.f27139OooO0o) {
            o0ooo00o.zzc = o0OO00o0.OooO0O0();
        }
        throw androidx.datastore.preferences.protobuf.OooO00o.OooO0o0(obj);
    }

    @Override // com.google.android.gms.internal.play_billing.o0OO000o
    public final int OooO0o(o0OoO00O o0ooo00o) {
        return o0ooo00o.zzc.hashCode();
    }

    @Override // com.google.android.gms.internal.play_billing.o0OO000o
    public final int OooO0o0(o0OoO00O o0ooo00o) {
        o0OO00o0 o0oo00o0 = o0ooo00o.zzc;
        int i = o0oo00o0.f27143OooO0Oo;
        if (i != -1) {
            return i;
        }
        int iOooOo0o = 0;
        for (int i2 = 0; i2 < o0oo00o0.f27140OooO00o; i2++) {
            int i3 = o0oo00o0.f27141OooO0O0[i2] >>> 3;
            o0O00000 o0o00000 = (o0O00000) o0oo00o0.f27142OooO0OO[i2];
            int iOooooO0 = o0O0000O.OooooO0(8);
            int iOooooO02 = o0O0000O.OooooO0(i3) + o0O0000O.OooooO0(16);
            int iOooooO03 = o0O0000O.OooooO0(24);
            int iOooO0oO = o0o00000.OooO0oO();
            iOooOo0o += iOooooO0 + iOooooO0 + iOooooO02 + AbstractC2183w4.OooOo0o(iOooO0oO, iOooO0oO, iOooooO03);
        }
        o0oo00o0.f27143OooO0Oo = iOooOo0o;
        return iOooOo0o;
    }

    @Override // com.google.android.gms.internal.play_billing.o0OO000o
    public final void OooO0oO(Object obj, o0O0O0o0 o0o0o0o0) {
        throw androidx.datastore.preferences.protobuf.OooO00o.OooO0o0(obj);
    }

    @Override // com.google.android.gms.internal.play_billing.o0OO000o
    public final boolean OooO0oo(o0OoO00O o0ooo00o, o0OoO00O o0ooo00o2) {
        return o0ooo00o.zzc.equals(o0ooo00o2.zzc);
    }

    @Override // com.google.android.gms.internal.play_billing.o0OO000o
    public final o0OoO00O zze() {
        o0O00o0 o0o00o0 = this.f27128OooO00o;
        return o0o00o0 instanceof o0OoO00O ? (o0OoO00O) ((o0OoO00O) o0o00o0).OooO0Oo(4) : ((o0O00) ((o0OoO00O) o0o00o0).OooO0Oo(5)).OooO0OO();
    }
}
