package com.google.android.gms.internal.ads;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes2.dex */
public final class oO00OO0O implements ooo0Oo0 {

    /* renamed from: OooOo, reason: collision with root package name */
    public final int f22477OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final r40 f22478OooOo0O = new r40();

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final boolean f22479OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public final String f22480OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final int f22481OooOoO0;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public final float f22482OooOoOO;

    /* renamed from: OooOoo0, reason: collision with root package name */
    public final int f22483OooOoo0;

    public oO00OO0O(List list) {
        if (list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.f22477OooOo = 0;
            this.f22481OooOoO0 = -1;
            this.f22480OooOoO = "sans-serif";
            this.f22479OooOo0o = false;
            this.f22482OooOoOO = 0.85f;
            this.f22483OooOoo0 = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.f22477OooOo = bArr[24];
        this.f22481OooOoO0 = ((bArr[26] & ForkServer.ERROR) << 24) | ((bArr[27] & ForkServer.ERROR) << 16) | ((bArr[28] & ForkServer.ERROR) << 8) | (bArr[29] & ForkServer.ERROR);
        this.f22480OooOoO = true == "Serif".equals(new String(bArr, 43, bArr.length + (-43), StandardCharsets.UTF_8)) ? "serif" : "sans-serif";
        int i = bArr[25] * 20;
        this.f22483OooOoo0 = i;
        boolean z = (bArr[0] & 32) != 0;
        this.f22479OooOo0o = z;
        if (z) {
            this.f22482OooOoOO = Math.max(0.0f, Math.min(((bArr[11] & ForkServer.ERROR) | ((bArr[10] & ForkServer.ERROR) << 8)) / i, 0.95f));
        } else {
            this.f22482OooOoOO = 0.85f;
        }
    }

    public static void OooO00o(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & 255) << 24)), i3, i4, i5 | 33);
        }
    }

    public static void OooO0O0(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            int i6 = i5 | 33;
            int i7 = i & 1;
            int i8 = i & 2;
            boolean z = true;
            if (i7 != 0) {
                if (i8 != 0) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i3, i4, i6);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i3, i4, i6);
                    z = false;
                }
            } else if (i8 != 0) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i3, i4, i6);
            } else {
                z = false;
            }
            if ((i & 4) != 0) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i4, i6);
            } else {
                if (i7 != 0 || z) {
                    return;
                }
                spannableStringBuilder.setSpan(new StyleSpan(0), i3, i4, i6);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.ooo0Oo0
    public final void OooO0OO(int i, int i2, OooOOOO.OooO0O0 oooO0O0, byte[] bArr) {
        String strOooO0O0;
        float f;
        int i3;
        int i4;
        float f2;
        int i5;
        r40 r40Var = this.f22478OooOo0O;
        r40Var.OooO0oo(i + i2, bArr);
        r40Var.OooOO0(i);
        int i6 = 0;
        int i7 = 1;
        int i8 = 2;
        af0.OoooO0(r40Var.OooOOOO() >= 2);
        int iOooOoO = r40Var.OooOoO();
        if (iOooOoO == 0) {
            strOooO0O0 = "";
        } else {
            int i9 = r40Var.f23746OooO0O0;
            Charset charsetOooO0OO = r40Var.OooO0OO();
            int i10 = r40Var.f23746OooO0O0 - i9;
            if (charsetOooO0OO == null) {
                charsetOooO0OO = StandardCharsets.UTF_8;
            }
            strOooO0O0 = r40Var.OooO0O0(iOooOoO - i10, charsetOooO0OO);
        }
        if (strOooO0O0.isEmpty()) {
            pm0 pm0Var = rm0.f23913OooOo0o;
            oooO0O0.mo13701zza(new o0OOo000(gn0.f19388OooOoO, -9223372036854775807L, -9223372036854775807L));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strOooO0O0);
        OooO0O0(spannableStringBuilder, this.f22477OooOo, 0, 0, spannableStringBuilder.length(), 16711680);
        OooO00o(spannableStringBuilder, this.f22481OooOoO0, -1, 0, spannableStringBuilder.length(), 16711680);
        int length = spannableStringBuilder.length();
        String str = this.f22480OooOoO;
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float fMax = this.f22482OooOoOO;
        while (r40Var.OooOOOO() >= 8) {
            int i11 = r40Var.f23746OooO0O0;
            int iOooOOo0 = r40Var.OooOOo0();
            int iOooOOo02 = r40Var.OooOOo0();
            if (iOooOOo02 == 1937013100) {
                af0.OoooO0(r40Var.OooOOOO() >= i8 ? i7 : i6);
                int iOooOoO2 = r40Var.OooOoO();
                int i12 = i6;
                while (i12 < iOooOoO2) {
                    af0.OoooO0(r40Var.OooOOOO() >= 12 ? i7 : i6);
                    int iOooOoO3 = r40Var.OooOoO();
                    int iOooOoO4 = r40Var.OooOoO();
                    r40Var.OooOO0O(i8);
                    int i13 = i12;
                    int iOooOo0O = r40Var.OooOo0O();
                    r40Var.OooOO0O(i7);
                    int iOooOOo03 = r40Var.OooOOo0();
                    int i14 = i7;
                    if (iOooOoO4 > spannableStringBuilder.length()) {
                        f2 = fMax;
                        AbstractC1641hg.OooOOo0("Tx3gParser", OooO0oO.OooOo.OooO("Truncating styl end (", iOooOoO4, ") to cueText.length() (", spannableStringBuilder.length(), ")."));
                        iOooOoO4 = spannableStringBuilder.length();
                    } else {
                        f2 = fMax;
                    }
                    if (iOooOoO3 >= iOooOoO4) {
                        AbstractC1641hg.OooOOo0("Tx3gParser", OooO0oO.OooOo.OooO("Ignoring styl with start (", iOooOoO3, ") >= end (", iOooOoO4, ")."));
                        i5 = i13;
                    } else {
                        i5 = i13;
                        int i15 = iOooOoO4;
                        OooO0O0(spannableStringBuilder, iOooOo0O, this.f22477OooOo, iOooOoO3, i15, 0);
                        OooO00o(spannableStringBuilder, iOooOOo03, this.f22481OooOoO0, iOooOoO3, i15, 0);
                    }
                    i12 = i5 + 1;
                    i7 = i14;
                    fMax = f2;
                    i6 = 0;
                    i8 = 2;
                }
                f = fMax;
                i3 = i7;
                i4 = i8;
            } else {
                f = fMax;
                i3 = i7;
                if (iOooOOo02 == 1952608120 && this.f22479OooOo0o) {
                    i4 = 2;
                    af0.OoooO0(r40Var.OooOOOO() >= 2 ? i3 : 0);
                    fMax = Math.max(0.0f, Math.min(r40Var.OooOoO() / this.f22483OooOoo0, 0.95f));
                    r40Var.OooOO0(i11 + iOooOOo0);
                    i7 = i3;
                    i8 = i4;
                    i6 = 0;
                } else {
                    i4 = 2;
                }
            }
            fMax = f;
            r40Var.OooOO0(i11 + iOooOOo0);
            i7 = i3;
            i8 = i4;
            i6 = 0;
        }
        oooO0O0.mo13701zza(new o0OOo000(rm0.OooOOo0(new C2206wr(spannableStringBuilder, null, null, null, fMax, 0, 0, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, 0.0f)), -9223372036854775807L, -9223372036854775807L));
    }
}
