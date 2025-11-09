package com.google.android.gms.internal.ads;

import java.util.Arrays;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes2.dex */
public final class o0OO0o extends o0OOOO00 {

    /* renamed from: OooOOO, reason: collision with root package name */
    public o0000O0 f22103OooOOO;

    /* renamed from: OooOOOO, reason: collision with root package name */
    public OoooOOO.oO0O0 f22104OooOOOO;

    @Override // com.google.android.gms.internal.ads.o0OOOO00
    public final long OooO00o(r40 r40Var) {
        byte[] bArr = r40Var.f23745OooO00o;
        if (bArr[0] != -1) {
            return -1L;
        }
        int i = (bArr[2] & ForkServer.ERROR) >> 4;
        if (i == 6) {
            r40Var.OooOO0O(4);
            r40Var.Oooo000();
        } else if (i == 7) {
            i = 7;
            r40Var.OooOO0O(4);
            r40Var.Oooo000();
        }
        int iOooO0O0 = af0.OooO0O0(i, r40Var);
        r40Var.OooOO0(0);
        return iOooO0O0;
    }

    @Override // com.google.android.gms.internal.ads.o0OOOO00
    public final void OooO0O0(boolean z) {
        super.OooO0O0(z);
        if (z) {
            this.f22103OooOOO = null;
            this.f22104OooOOOO = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.o0OOOO00
    public final boolean OooO0OO(r40 r40Var, long j, C2249xx c2249xx) {
        byte[] bArr = r40Var.f23745OooO00o;
        o0000O0 o0000o02 = this.f22103OooOOO;
        if (o0000o02 == null) {
            o0000O0 o0000o03 = new o0000O0(bArr, 17);
            this.f22103OooOOO = o0000o03;
            c2249xx.f25815OooOo0o = o0000o03.OooO0O0(Arrays.copyOfRange(bArr, 9, r40Var.f23747OooO0OO), null);
            return true;
        }
        byte b = bArr[0];
        if ((b & 127) != 3) {
            if (b != -1) {
                return true;
            }
            OoooOOO.oO0O0 oo0o0 = this.f22104OooOOOO;
            if (oo0o0 != null) {
                oo0o0.f14696OooOo0O = j;
                c2249xx.f25813OooOo = oo0o0;
            }
            ((o0OoOo0) c2249xx.f25815OooOo0o).getClass();
            return false;
        }
        C2249xx c2249xxOooOo = ze0.OooOo(r40Var);
        o0000O0 o0000o04 = new o0000O0(o0000o02.f21658OooO00o, o0000o02.f21659OooO0O0, o0000o02.f21660OooO0OO, o0000o02.f21661OooO0Oo, o0000o02.f21663OooO0o0, o0000o02.f21664OooO0oO, o0000o02.f21665OooO0oo, o0000o02.f21666OooOO0, c2249xxOooOo, o0000o02.OooOO0o);
        this.f22103OooOOO = o0000o04;
        OoooOOO.oO0O0 oo0o02 = new OoooOOO.oO0O0();
        oo0o02.f14695OooOo = o0000o04;
        oo0o02.f14698OooOoO0 = c2249xxOooOo;
        oo0o02.f14696OooOo0O = -1L;
        oo0o02.f14697OooOo0o = -1L;
        this.f22104OooOOOO = oo0o02;
        return true;
    }
}
