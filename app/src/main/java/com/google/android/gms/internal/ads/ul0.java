package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Base64;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

/* loaded from: classes2.dex */
public final class ul0 extends rj0 {

    /* renamed from: OooOoO, reason: collision with root package name */
    public iq0 f24656OooOoO;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public byte[] f24657OooOoOO;

    /* renamed from: OooOoo, reason: collision with root package name */
    public int f24658OooOoo;

    /* renamed from: OooOoo0, reason: collision with root package name */
    public int f24659OooOoo0;

    @Override // com.google.android.gms.internal.ads.zm0
    public final long OooO0Oo(iq0 iq0Var) throws C2185w6, hn0 {
        OooO0oO(iq0Var);
        this.f24656OooOoO = iq0Var;
        Uri uriNormalizeScheme = iq0Var.f20087OooO00o.normalizeScheme();
        String scheme = uriNormalizeScheme.getScheme();
        af0.OoooOOo("Unsupported scheme: ".concat(String.valueOf(scheme)), "data".equals(scheme));
        String schemeSpecificPart = uriNormalizeScheme.getSchemeSpecificPart();
        int i = i80.f19994OooO00o;
        String[] strArrSplit = schemeSpecificPart.split(",", -1);
        if (strArrSplit.length != 2) {
            throw new C2185w6("Unexpected URI format: ".concat(String.valueOf(uriNormalizeScheme)), null, true, 0);
        }
        String str = strArrSplit[1];
        if (strArrSplit[0].contains(";base64")) {
            try {
                this.f24657OooOoOO = Base64.decode(str, 0);
            } catch (IllegalArgumentException e) {
                throw new C2185w6("Error while parsing Base64 encoded string: ".concat(String.valueOf(str)), e, true, 0);
            }
        } else {
            this.f24657OooOoOO = URLDecoder.decode(str, StandardCharsets.US_ASCII.name()).getBytes(StandardCharsets.UTF_8);
        }
        int length = this.f24657OooOoOO.length;
        long j = length;
        long j2 = iq0Var.f20089OooO0OO;
        if (j2 > j) {
            this.f24657OooOoOO = null;
            throw new hn0();
        }
        int i2 = (int) j2;
        this.f24659OooOoo0 = i2;
        int i3 = length - i2;
        this.f24658OooOoo = i3;
        long j3 = iq0Var.f20090OooO0Oo;
        if (j3 != -1) {
            this.f24658OooOoo = (int) Math.min(i3, j3);
        }
        OooO(iq0Var);
        return j3 != -1 ? j3 : this.f24658OooOoo;
    }

    @Override // com.google.android.gms.internal.ads.q51
    public final int OooOO0(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f24658OooOoo;
        if (i3 == 0) {
            return -1;
        }
        int iMin = Math.min(i2, i3);
        byte[] bArr2 = this.f24657OooOoOO;
        int i4 = i80.f19994OooO00o;
        System.arraycopy(bArr2, this.f24659OooOoo0, bArr, i, iMin);
        this.f24659OooOoo0 += iMin;
        this.f24658OooOoo -= iMin;
        OooO00o(iMin);
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.zm0
    public final Uri zzc() {
        iq0 iq0Var = this.f24656OooOoO;
        if (iq0Var != null) {
            return iq0Var.f20087OooO00o;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zm0
    public final void zzd() {
        if (this.f24657OooOoOO != null) {
            this.f24657OooOoOO = null;
            OooO0OO();
        }
        this.f24656OooOoO = null;
    }
}
