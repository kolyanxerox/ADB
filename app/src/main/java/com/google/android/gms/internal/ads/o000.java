package com.google.android.gms.internal.ads;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes2.dex */
public final class o000 implements ooo0Oo0 {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final r40 f21640OooOo0O;

    public o000(int i) {
        switch (i) {
            case 1:
                this.f21640OooOo0O = new r40();
                break;
            default:
                this.f21640OooOo0O = new r40(10);
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.gms.internal.ads.C2107u2 OooO00o(com.google.android.gms.internal.ads.o000000 r18, com.google.android.gms.internal.ads.o0O r19) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.o000.OooO00o(com.google.android.gms.internal.ads.o000000, com.google.android.gms.internal.ads.o0O):com.google.android.gms.internal.ads.u2");
    }

    @Override // com.google.android.gms.internal.ads.ooo0Oo0
    public void OooO0OO(int i, int i2, OooOOOO.OooO0O0 oooO0O0, byte[] bArr) {
        C2206wr c2206wrOooO00o;
        r40 r40Var = this.f21640OooOo0O;
        r40Var.OooO0oo(i + i2, bArr);
        r40Var.OooOO0(i);
        ArrayList arrayList = new ArrayList();
        while (r40Var.OooOOOO() > 0) {
            af0.OoooOOo("Incomplete Mp4Webvtt Top Level box header found.", r40Var.OooOOOO() >= 8);
            int iOooOOo0 = r40Var.OooOOo0() - 8;
            if (r40Var.OooOOo0() == 1987343459) {
                CharSequence charSequenceOooO00o = null;
                C2279yq c2279yqOooO00o = null;
                while (iOooOOo0 > 0) {
                    af0.OoooOOo("Incomplete vtt cue box header found.", iOooOOo0 >= 8);
                    int iOooOOo02 = r40Var.OooOOo0();
                    int iOooOOo03 = r40Var.OooOOo0();
                    int i3 = iOooOOo0 - 8;
                    int i4 = iOooOOo02 - 8;
                    byte[] bArr2 = r40Var.f23745OooO00o;
                    int i5 = r40Var.f23746OooO0O0;
                    int i6 = i80.f19994OooO00o;
                    String str = new String(bArr2, i5, i4, StandardCharsets.UTF_8);
                    r40Var.OooOO0O(i4);
                    if (iOooOOo03 == 1937011815) {
                        oO00o00 oo00o00 = new oO00o00();
                        oO0OOO00.OooO0o(str, oo00o00);
                        c2279yqOooO00o = oo00o00.OooO00o();
                    } else if (iOooOOo03 == 1885436268) {
                        charSequenceOooO00o = oO0OOO00.OooO00o(null, str.trim(), Collections.EMPTY_LIST);
                    }
                    iOooOOo0 = i3 - i4;
                }
                if (charSequenceOooO00o == null) {
                    charSequenceOooO00o = "";
                }
                if (c2279yqOooO00o != null) {
                    c2279yqOooO00o.f25994OooO00o = charSequenceOooO00o;
                    c2206wrOooO00o = c2279yqOooO00o.OooO00o();
                } else {
                    oO00o00 oo00o002 = new oO00o00();
                    oo00o002.f22526OooO0OO = charSequenceOooO00o;
                    c2206wrOooO00o = oo00o002.OooO00o().OooO00o();
                }
                arrayList.add(c2206wrOooO00o);
            } else {
                r40Var.OooOO0O(iOooOOo0);
            }
        }
        oooO0O0.mo13701zza(new o0OOo000(arrayList, -9223372036854775807L, -9223372036854775807L));
    }
}
