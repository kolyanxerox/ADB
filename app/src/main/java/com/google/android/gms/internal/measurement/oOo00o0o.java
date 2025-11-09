package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.ads.AbstractC2183w4;
import com.google.android.gms.internal.ads.ez0;

/* loaded from: classes2.dex */
public final class oOo00o0o implements oO0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final AbstractC2346o f26885OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final oO0Oo0oo f26886OooO0O0;

    public oOo00o0o(oO0Oo0oo oo0oo0oo, AbstractC2346o abstractC2346o) {
        oO0Oo0oo oo0oo0oo2 = oO0Ooooo.f26765OooO00o;
        this.f26886OooO0O0 = oo0oo0oo;
        this.f26885OooO00o = abstractC2346o;
    }

    @Override // com.google.android.gms.internal.measurement.oO0
    public final int OooO(ooOOOOoo oooooooo) {
        return oooooooo.zzc.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.oO0
    public final boolean OooO0OO(Object obj) {
        throw androidx.datastore.preferences.protobuf.OooO00o.OooO0o0(obj);
    }

    @Override // com.google.android.gms.internal.measurement.oO0
    public final void OooO0Oo(Object obj, oO00Oo0 oo00oo0) {
        throw androidx.datastore.preferences.protobuf.OooO00o.OooO0o0(obj);
    }

    @Override // com.google.android.gms.internal.measurement.oO0
    public final int OooO0o(ooOOOOoo oooooooo) {
        oO0O00oO oo0o00oo = oooooooo.zzc;
        int i = oo0o00oo.f26741OooO0Oo;
        if (i != -1) {
            return i;
        }
        int iOooOo0 = 0;
        for (int i2 = 0; i2 < oo0o00oo.f26738OooO00o; i2++) {
            int i3 = oo0o00oo.f26739OooO0O0[i2] >>> 3;
            oO000 oo000 = (oO000) oo0o00oo.f26740OooO0OO[i2];
            int iOooOoOO = oO000O0.OooOoOO(8);
            int iOooOoOO2 = oO000O0.OooOoOO(i3) + oO000O0.OooOoOO(16);
            int iOooOoOO3 = oO000O0.OooOoOO(24);
            int iOooO0oO = oo000.OooO0oO();
            iOooOo0 += iOooOoOO + iOooOoOO + iOooOoOO2 + AbstractC2183w4.OooOo0(iOooO0oO, iOooO0oO, iOooOoOO3);
        }
        oo0o00oo.f26741OooO0Oo = iOooOo0;
        return iOooOo0;
    }

    @Override // com.google.android.gms.internal.measurement.oO0
    public final boolean OooO0o0(ooOOOOoo oooooooo, ooOOOOoo oooooooo2) {
        return oooooooo.zzc.equals(oooooooo2.zzc);
    }

    @Override // com.google.android.gms.internal.measurement.oO0
    public final void OooO0oO(Object obj, Object obj2) {
        oO0O000.OooO0O0(obj, obj2);
    }

    @Override // com.google.android.gms.internal.measurement.oO0
    public final void OooO0oo(Object obj) {
        this.f26886OooO0O0.getClass();
        oO0O00oO oo0o00oo = ((ooOOOOoo) obj).zzc;
        if (oo0o00oo.f26742OooO0o0) {
            oo0o00oo.f26742OooO0o0 = false;
        }
        oO0Oo0oo oo0oo0oo = oO0Ooooo.f26765OooO00o;
        throw androidx.datastore.preferences.protobuf.OooO00o.OooO0o0(obj);
    }

    @Override // com.google.android.gms.internal.measurement.oO0
    public final void OooOO0(Object obj, byte[] bArr, int i, int i2, ez0 ez0Var) {
        ooOOOOoo oooooooo = (ooOOOOoo) obj;
        if (oooooooo.zzc == oO0O00oO.f26737OooO0o) {
            oooooooo.zzc = oO0O00oO.OooO00o();
        }
        throw androidx.datastore.preferences.protobuf.OooO00o.OooO0o0(obj);
    }

    @Override // com.google.android.gms.internal.measurement.oO0
    public final ooOOOOoo zza() {
        AbstractC2346o abstractC2346o = this.f26885OooO00o;
        return abstractC2346o instanceof ooOOOOoo ? (ooOOOOoo) ((ooOOOOoo) abstractC2346o).OooOOOO(4) : ((oO000OOo) ((ooOOOOoo) abstractC2346o).OooOOOO(5)).OooO0Oo();
    }
}
