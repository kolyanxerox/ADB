package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import com.ironsource.C3034d9;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class p61 {

    /* renamed from: OooO0Oo */
    public static final p61 f23231OooO0Oo;

    /* renamed from: OooO00o */
    public final int f23232OooO00o;

    /* renamed from: OooO0O0 */
    public final int f23233OooO0O0;

    /* renamed from: OooO0OO */
    public final um0 f23234OooO0OO;

    static {
        p61 p61Var;
        if (i80.f19994OooO00o >= 33) {
            tm0 tm0Var = new tm0(4);
            for (int i = 1; i <= 10; i++) {
                tm0Var.OooO0oo(Integer.valueOf(i80.OooOOO0(i)));
            }
            p61Var = new p61(tm0Var.OooOO0(), 2);
        } else {
            p61Var = new p61(2, 10);
        }
        f23231OooO0Oo = p61Var;
    }

    public p61(int i, int i2) {
        this.f23232OooO00o = i;
        this.f23233OooO0O0 = i2;
        this.f23234OooO0OO = null;
    }

    public final int OooO00o(int i, j50 j50Var) {
        if (this.f23234OooO0OO != null) {
            return this.f23233OooO0O0;
        }
        int i2 = i80.f19994OooO00o;
        int i3 = this.f23232OooO00o;
        if (i2 < 29) {
            Object obj = q61.f23516OooO0o0.get(Integer.valueOf(i3));
            return ((Integer) (obj != null ? obj : 0)).intValue();
        }
        for (int i4 = 10; i4 > 0; i4--) {
            int iOooOOO0 = i80.OooOOO0(i4);
            if (iOooOOO0 != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i3).setSampleRate(i).setChannelMask(iOooOOO0).build(), (AudioAttributes) j50Var.OooO00o().f25318OooOo0o)) {
                return i4;
            }
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p61)) {
            return false;
        }
        p61 p61Var = (p61) obj;
        return this.f23232OooO00o == p61Var.f23232OooO00o && this.f23233OooO0O0 == p61Var.f23233OooO0O0 && Objects.equals(this.f23234OooO0OO, p61Var.f23234OooO0OO);
    }

    public final int hashCode() {
        um0 um0Var = this.f23234OooO0OO;
        return (((this.f23232OooO00o * 31) + this.f23233OooO0O0) * 31) + (um0Var == null ? 0 : um0Var.hashCode());
    }

    public final String toString() {
        return "AudioProfile[format=" + this.f23232OooO00o + ", maxChannelCount=" + this.f23233OooO0O0 + ", channelMasks=" + String.valueOf(this.f23234OooO0OO) + C3034d9.i.f8179e;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p61(java.util.Set r2, int r3) {
        /*
            r1 = this;
            r1.<init>()
            r1.f23232OooO00o = r3
            int r3 = com.google.android.gms.internal.ads.um0.f24660OooOo
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.um0
            if (r3 == 0) goto L19
            boolean r3 = r2 instanceof java.util.SortedSet
            if (r3 != 0) goto L19
            r3 = r2
            com.google.android.gms.internal.ads.um0 r3 = (com.google.android.gms.internal.ads.um0) r3
            boolean r0 = r3.OooOO0O()
            if (r0 != 0) goto L19
            goto L22
        L19:
            java.lang.Object[] r2 = r2.toArray()
            int r3 = r2.length
            com.google.android.gms.internal.ads.um0 r3 = com.google.android.gms.internal.ads.um0.OooOOOo(r3, r2)
        L22:
            r1.f23234OooO0OO = r3
            com.google.android.gms.internal.ads.vn0 r2 = r3.OooOO0()
            r3 = 0
        L29:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L42
            java.lang.Object r0 = r2.next()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            int r0 = java.lang.Integer.bitCount(r0)
            int r3 = java.lang.Math.max(r3, r0)
            goto L29
        L42:
            r1.f23233OooO0O0 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.p61.<init>(java.util.Set, int):void");
    }
}
