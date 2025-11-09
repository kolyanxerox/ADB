package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes2.dex */
public final class o0OOO0OO extends o0OOOO00 {

    /* renamed from: OooOOOO, reason: collision with root package name */
    public static final byte[] f22128OooOOOO = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: OooOOOo, reason: collision with root package name */
    public static final byte[] f22129OooOOOo = {79, 112, 117, 115, 84, 97, 103, 115};

    /* renamed from: OooOOO, reason: collision with root package name */
    public boolean f22130OooOOO;

    public static boolean OooO0o0(r40 r40Var, byte[] bArr) {
        if (r40Var.OooOOOO() < 8) {
            return false;
        }
        int i = r40Var.f23746OooO0O0;
        byte[] bArr2 = new byte[8];
        r40Var.OooO0o(bArr2, 0, 8);
        r40Var.OooOO0(i);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // com.google.android.gms.internal.ads.o0OOOO00
    public final long OooO00o(r40 r40Var) {
        byte[] bArr = r40Var.f23745OooO00o;
        return (this.f22139OooO * af0.OooooOO(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0)) / 1000000;
    }

    @Override // com.google.android.gms.internal.ads.o0OOOO00
    public final void OooO0O0(boolean z) {
        super.OooO0O0(z);
        if (z) {
            this.f22130OooOOO = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.o0OOOO00
    public final boolean OooO0OO(r40 r40Var, long j, C2249xx c2249xx) {
        if (OooO0o0(r40Var, f22128OooOOOO)) {
            byte[] bArrCopyOf = Arrays.copyOf(r40Var.f23745OooO00o, r40Var.f23747OooO0OO);
            int i = bArrCopyOf[9] & ForkServer.ERROR;
            ArrayList arrayListOoooO = af0.OoooO(bArrCopyOf);
            if (((o0OoOo0) c2249xx.f25815OooOo0o) == null) {
                jb1 jb1Var = new jb1();
                jb1Var.OooO0OO("audio/opus");
                jb1Var.f20264OooOoOO = i;
                jb1Var.f20266OooOoo0 = 48000;
                jb1Var.f20253OooOOOO = arrayListOoooO;
                c2249xx.f25815OooOo0o = new o0OoOo0(jb1Var);
                return true;
            }
        } else {
            if (!OooO0o0(r40Var, f22129OooOOOo)) {
                af0.OooOo0O((o0OoOo0) c2249xx.f25815OooOo0o);
                return false;
            }
            af0.OooOo0O((o0OoOo0) c2249xx.f25815OooOo0o);
            if (!this.f22130OooOOO) {
                this.f22130OooOOO = true;
                r40Var.OooOO0O(8);
                C2107u2 c2107u2OooOo0o = ze0.OooOo0o(rm0.OooOOOo((String[]) ze0.Oooo0(r40Var, false, false).f23242OooOo0o));
                if (c2107u2OooOo0o != null) {
                    o0OoOo0 o0oooo0 = (o0OoOo0) c2249xx.f25815OooOo0o;
                    o0oooo0.getClass();
                    jb1 jb1Var2 = new jb1(o0oooo0);
                    jb1Var2.f20249OooOO0 = c2107u2OooOo0o.OooO0o0(((o0OoOo0) c2249xx.f25815OooOo0o).f22220OooOO0O);
                    c2249xx.f25815OooOo0o = new o0OoOo0(jb1Var2);
                }
            }
        }
        return true;
    }
}
