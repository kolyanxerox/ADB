package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class o00oO0o {

    /* renamed from: OooO, reason: collision with root package name */
    public final int f21825OooO;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final ArrayList f21826OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final int f21827OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final int f21828OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final int f21829OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final int f21830OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final int f21831OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public final int f21832OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public final int f21833OooO0oo;

    /* renamed from: OooOO0, reason: collision with root package name */
    public final int f21834OooOO0;

    /* renamed from: OooOO0O, reason: collision with root package name */
    public final float f21835OooOO0O;
    public final String OooOO0o;

    public o00oO0o(ArrayList arrayList, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, float f, String str) {
        this.f21826OooO00o = arrayList;
        this.f21827OooO0O0 = i;
        this.f21828OooO0OO = i2;
        this.f21829OooO0Oo = i3;
        this.f21831OooO0o0 = i4;
        this.f21830OooO0o = i5;
        this.f21832OooO0oO = i6;
        this.f21833OooO0oo = i7;
        this.f21825OooO = i8;
        this.f21834OooOO0 = i9;
        this.f21835OooOO0O = f;
        this.OooOO0o = str;
    }

    public static o00oO0o OooO00o(r40 r40Var) throws C2185w6 {
        String str;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        float f;
        int i7;
        int i8;
        try {
            r40Var.OooOO0O(4);
            int iOooOo0O = r40Var.OooOo0O() & 3;
            int i9 = iOooOo0O + 1;
            if (i9 == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iOooOo0O2 = r40Var.OooOo0O() & 31;
            for (int i10 = 0; i10 < iOooOo0O2; i10++) {
                int iOooOoO = r40Var.OooOoO();
                int i11 = r40Var.f23746OooO0O0;
                r40Var.OooOO0O(iOooOoO);
                byte[] bArr = r40Var.f23745OooO00o;
                byte[] bArr2 = AbstractC1914ov.f23130OooO00o;
                byte[] bArr3 = new byte[iOooOoO + 4];
                System.arraycopy(AbstractC1914ov.f23130OooO00o, 0, bArr3, 0, 4);
                System.arraycopy(bArr, i11, bArr3, 4, iOooOoO);
                arrayList.add(bArr3);
            }
            int iOooOo0O3 = r40Var.OooOo0O();
            for (int i12 = 0; i12 < iOooOo0O3; i12++) {
                int iOooOoO2 = r40Var.OooOoO();
                int i13 = r40Var.f23746OooO0O0;
                r40Var.OooOO0O(iOooOoO2);
                byte[] bArr4 = r40Var.f23745OooO00o;
                byte[] bArr5 = AbstractC1914ov.f23130OooO00o;
                byte[] bArr6 = new byte[iOooOoO2 + 4];
                System.arraycopy(AbstractC1914ov.f23130OooO00o, 0, bArr6, 0, 4);
                System.arraycopy(bArr4, i13, bArr6, 4, iOooOoO2);
                arrayList.add(bArr6);
            }
            if (iOooOo0O2 > 0) {
                gg0 gg0VarOoooo00 = af0.Ooooo00((byte[]) arrayList.get(0), iOooOo0O + 2, ((byte[]) arrayList.get(0)).length);
                int i14 = gg0VarOoooo00.f19341OooO0o0;
                int i15 = gg0VarOoooo00.f19340OooO0o;
                int i16 = gg0VarOoooo00.f19343OooO0oo + 8;
                int i17 = gg0VarOoooo00.f19335OooO + 8;
                int i18 = gg0VarOoooo00.f19344OooOO0;
                int i19 = gg0VarOoooo00.f19345OooOO0O;
                int i20 = gg0VarOoooo00.OooOO0o;
                int i21 = gg0VarOoooo00.f19346OooOOO0;
                float f2 = gg0VarOoooo00.f19342OooO0oO;
                int i22 = gg0VarOoooo00.f19336OooO00o;
                int i23 = gg0VarOoooo00.f19337OooO0O0;
                int i24 = gg0VarOoooo00.f19338OooO0OO;
                byte[] bArr7 = AbstractC1914ov.f23130OooO00o;
                str = String.format("avc1.%02X%02X%02X", Integer.valueOf(i22), Integer.valueOf(i23), Integer.valueOf(i24));
                i4 = i19;
                i5 = i20;
                i6 = i21;
                f = f2;
                i2 = i15;
                i3 = i16;
                i7 = i17;
                i8 = i18;
                i = i14;
            } else {
                str = null;
                i = -1;
                i2 = -1;
                i3 = -1;
                i4 = -1;
                i5 = -1;
                i6 = 16;
                f = 1.0f;
                i7 = -1;
                i8 = -1;
            }
            return new o00oO0o(arrayList, i9, i, i2, i3, i7, i8, i4, i5, i6, f, str);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw C2185w6.OooO00o(e, "Error parsing AVC config");
        }
    }
}
