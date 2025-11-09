package com.google.android.gms.internal.ads;

import com.applovin.shadow.okhttp3.internal.http.StatusLine;
import com.ironsource.InterfaceC3173h3;
import java.math.RoundingMode;

/* loaded from: classes2.dex */
public final class oOO0000 implements oOO000 {

    /* renamed from: OooO, reason: collision with root package name */
    public int f22765OooO;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final v91 f22766OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final o000O f22767OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final o0O0OOOo f22768OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final int f22769OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final r40 f22770OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final byte[] f22771OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public final int f22772OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public final o0OoOo0 f22773OooO0oo;

    /* renamed from: OooOO0, reason: collision with root package name */
    public long f22774OooOO0;

    /* renamed from: OooOO0O, reason: collision with root package name */
    public int f22775OooOO0O;
    public long OooOO0o;

    /* renamed from: OooOOO0, reason: collision with root package name */
    public static final int[] f22764OooOOO0 = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

    /* renamed from: OooOOO, reason: collision with root package name */
    public static final int[] f22763OooOOO = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, StatusLine.HTTP_TEMP_REDIRECT, 337, 371, InterfaceC3173h3.a.b.f8802h, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

    public oOO0000(v91 v91Var, o000O o000o, o0O0OOOo o0o0oooo) throws C2185w6 {
        this.f22766OooO00o = v91Var;
        this.f22767OooO0O0 = o000o;
        this.f22768OooO0OO = o0o0oooo;
        int i = o0o0oooo.f21967OooOo0o;
        int iMax = Math.max(1, i / 10);
        this.f22772OooO0oO = iMax;
        r40 r40Var = new r40((byte[]) o0o0oooo.f21968OooOoO);
        r40Var.OooOo00();
        int iOooOo00 = r40Var.OooOo00();
        this.f22769OooO0Oo = iOooOo00;
        int i2 = o0o0oooo.f21966OooOo0O;
        int i3 = o0o0oooo.f21965OooOo;
        int iOooO0O0 = OooO0oO.OooOo.OooO0O0(i3 - (i2 * 4), 8, o0o0oooo.f21969OooOoO0 * i2, 1);
        if (iOooOo00 != iOooO0O0) {
            throw C2185w6.OooO00o(null, "Expected frames per block: " + iOooO0O0 + "; got: " + iOooOo00);
        }
        int i4 = i80.f19994OooO00o;
        int i5 = ((iMax + iOooOo00) - 1) / iOooOo00;
        this.f22771OooO0o0 = new byte[i5 * i3];
        this.f22770OooO0o = new r40((iOooOo00 + iOooOo00) * i2 * i5);
        int i6 = ((i3 * i) * 8) / iOooOo00;
        jb1 jb1Var = new jb1();
        jb1Var.OooO0OO("audio/raw");
        jb1Var.f20247OooO0oO = i6;
        jb1Var.f20248OooO0oo = i6;
        jb1Var.f20252OooOOO0 = (iMax + iMax) * i2;
        jb1Var.f20264OooOoOO = i2;
        jb1Var.f20266OooOoo0 = i;
        jb1Var.f20265OooOoo = 2;
        this.f22773OooO0oo = new o0OoOo0(jb1Var);
    }

    @Override // com.google.android.gms.internal.ads.oOO000
    public final void OooO00o(long j) {
        this.f22765OooO = 0;
        this.f22774OooOO0 = j;
        this.f22775OooOO0O = 0;
        this.OooOO0o = 0L;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0046 A[ADDED_TO_REGION, EDGE_INSN: B:43:0x0046->B:14:0x0046 BREAK  A[LOOP:0: B:6:0x0025->B:13:0x0040], REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x003d -> B:4:0x0022). Please report as a decompilation issue!!! */
    @Override // com.google.android.gms.internal.ads.oOO000
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean OooO0O0(com.google.android.gms.internal.ads.o000000 r25, long r26) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.oOO0000.OooO0O0(com.google.android.gms.internal.ads.o000000, long):boolean");
    }

    public final void OooO0OO(int i) {
        o0O0OOOo o0o0oooo = this.f22768OooO0OO;
        long jOooOo0 = this.f22774OooOO0 + i80.OooOo0(this.OooOO0o, 1000000L, o0o0oooo.f21967OooOo0o, RoundingMode.DOWN);
        int i2 = (i + i) * o0o0oooo.f21966OooOo0O;
        this.f22767OooO0O0.OooO00o(jOooOo0, 1, i2, this.f22775OooOO0O - i2, null);
        this.OooOO0o += i;
        this.f22775OooOO0O -= i2;
    }

    @Override // com.google.android.gms.internal.ads.oOO000
    public final void zza(int i, long j) {
        this.f22766OooO00o.OooO(new oOO00OO(this.f22768OooO0OO, this.f22769OooO0Oo, i, j));
        this.f22767OooO0O0.OooO0o0(this.f22773OooO0oo);
    }
}
