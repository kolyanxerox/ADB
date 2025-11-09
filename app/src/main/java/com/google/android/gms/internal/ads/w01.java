package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class w01 implements g11 {

    /* renamed from: OooO00o */
    public final bz0 f25159OooO00o;

    /* renamed from: OooO0O0 */
    public final o0O f25160OooO0O0;

    public w01(o0O o0o, bz0 bz0Var) {
        qv0 qv0Var = uz0.f24794OooO00o;
        this.f25160OooO0O0 = o0o;
        this.f25159OooO00o = bz0Var;
    }

    @Override // com.google.android.gms.internal.ads.g11
    public final void OooO(Object obj, w10 w10Var, tz0 tz0Var) {
        this.f25160OooO0O0.getClass();
        o0O.OooOOOO(obj);
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // com.google.android.gms.internal.ads.g11
    public final void OooO00o(Object obj) {
        this.f25160OooO0O0.getClass();
        l11 l11Var = ((zz0) obj).zzt;
        if (l11Var.f20776OooO0o0) {
            l11Var.f20776OooO0o0 = false;
        }
        qv0 qv0Var = uz0.f24794OooO00o;
        throw androidx.datastore.preferences.protobuf.OooO00o.OooO0o0(obj);
    }

    @Override // com.google.android.gms.internal.ads.g11
    public final void OooO0O0(Object obj, Object obj2) {
        h11.OooOOoo(obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.g11
    public final void OooO0OO(Object obj, byte[] bArr, int i, int i2, ez0 ez0Var) {
        zz0 zz0Var = (zz0) obj;
        if (zz0Var.zzt == l11.f20771OooO0o) {
            zz0Var.zzt = l11.OooO0O0();
        }
        throw androidx.datastore.preferences.protobuf.OooO00o.OooO0o0(obj);
    }

    @Override // com.google.android.gms.internal.ads.g11
    public final void OooO0Oo(Object obj, rh0 rh0Var) {
        throw androidx.datastore.preferences.protobuf.OooO00o.OooO0o0(obj);
    }

    @Override // com.google.android.gms.internal.ads.g11
    public final int OooO0o(zz0 zz0Var) {
        return zz0Var.zzt.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.g11
    public final boolean OooO0o0(zz0 zz0Var, zz0 zz0Var2) {
        return zz0Var.zzt.equals(zz0Var2.zzt);
    }

    @Override // com.google.android.gms.internal.ads.g11
    public final boolean OooO0oO(Object obj) {
        throw androidx.datastore.preferences.protobuf.OooO00o.OooO0o0(obj);
    }

    @Override // com.google.android.gms.internal.ads.g11
    public final int OooO0oo(zz0 zz0Var) {
        l11 l11Var = zz0Var.zzt;
        int i = l11Var.f20775OooO0Oo;
        if (i != -1) {
            return i;
        }
        int iOooO0oo = 0;
        for (int i2 = 0; i2 < l11Var.f20772OooO00o; i2++) {
            int i3 = l11Var.f20773OooO0O0[i2] >>> 3;
            jz0 jz0Var = (jz0) l11Var.f20774OooO0OO[i2];
            int iOo000o = rz0.oo000o(8);
            int iOo000o2 = rz0.oo000o(i3) + rz0.oo000o(16);
            int iOo000o3 = rz0.oo000o(24);
            int iOooOO0 = jz0Var.OooOO0();
            iOooO0oo += iOo000o + iOo000o + iOo000o2 + AbstractC2183w4.OooO0oo(iOooOO0, iOooOO0, iOo000o3);
        }
        l11Var.f20775OooO0Oo = iOooO0oo;
        return iOooO0oo;
    }

    @Override // com.google.android.gms.internal.ads.g11
    public final zz0 zze() {
        bz0 bz0Var = this.f25159OooO00o;
        return bz0Var instanceof zz0 ? ((zz0) bz0Var).OooOOO() : ((xz0) ((zz0) bz0Var).OooOOoo(5, null)).OooO0OO();
    }
}
