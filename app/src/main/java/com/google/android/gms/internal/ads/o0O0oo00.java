package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class o0O0oo00 implements o00000O {

    /* renamed from: Oooo0O0, reason: collision with root package name */
    public static final byte[] f21978Oooo0O0 = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* renamed from: Oooo0OO, reason: collision with root package name */
    public static final o0OoOo0 f21979Oooo0OO;

    /* renamed from: OooO, reason: collision with root package name */
    public final r40 f21980OooO;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final o0oo0000 f21981OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final int f21982OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final List f21983OooO0OO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public final byte[] f21988OooO0oo;

    /* renamed from: OooOOO, reason: collision with root package name */
    public final qi0 f21991OooOOO;

    /* renamed from: OooOOOO, reason: collision with root package name */
    public gn0 f21993OooOOOO;

    /* renamed from: OooOOOo, reason: collision with root package name */
    public int f21994OooOOOo;

    /* renamed from: OooOOo, reason: collision with root package name */
    public long f21995OooOOo;

    /* renamed from: OooOOo0, reason: collision with root package name */
    public int f21996OooOOo0;

    /* renamed from: OooOOoo, reason: collision with root package name */
    public int f21997OooOOoo;

    /* renamed from: OooOo, reason: collision with root package name */
    public long f21998OooOo;
    public long OooOo0;

    /* renamed from: OooOo00, reason: collision with root package name */
    public r40 f21999OooOo00;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public int f22000OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public long f22001OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public o0oOo0O0 f22002OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public long f22003OooOoO0;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public int f22004OooOoOO;

    /* renamed from: OooOoo, reason: collision with root package name */
    public int f22005OooOoo;

    /* renamed from: OooOoo0, reason: collision with root package name */
    public int f22006OooOoo0;

    /* renamed from: OooOooO, reason: collision with root package name */
    public boolean f22007OooOooO;

    /* renamed from: OooOooo, reason: collision with root package name */
    public boolean f22008OooOooo;

    /* renamed from: Oooo0, reason: collision with root package name */
    public boolean f22009Oooo0;

    /* renamed from: Oooo000, reason: collision with root package name */
    public o0000Ooo f22010Oooo000;

    /* renamed from: Oooo00O, reason: collision with root package name */
    public o000O[] f22011Oooo00O;

    /* renamed from: Oooo00o, reason: collision with root package name */
    public o000O[] f22012Oooo00o;

    /* renamed from: OooOO0, reason: collision with root package name */
    public final C2249xx f21989OooOO0 = new C2249xx(3);

    /* renamed from: OooOO0O, reason: collision with root package name */
    public final r40 f21990OooOO0O = new r40(16);

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final r40 f21986OooO0o0 = new r40(af0.f17029OooO0O0);

    /* renamed from: OooO0o, reason: collision with root package name */
    public final r40 f21985OooO0o = new r40(5);

    /* renamed from: OooO0oO, reason: collision with root package name */
    public final r40 f21987OooO0oO = new r40();
    public final ArrayDeque OooOO0o = new ArrayDeque();

    /* renamed from: OooOOO0, reason: collision with root package name */
    public final ArrayDeque f21992OooOOO0 = new ArrayDeque();

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final SparseArray f21984OooO0Oo = new SparseArray();

    static {
        jb1 jb1Var = new jb1();
        jb1Var.OooO0OO("application/x-emsg");
        f21979Oooo0OO = new o0OoOo0(jb1Var);
    }

    public o0O0oo00(o0oo0000 o0oo0000Var, int i, rm0 rm0Var) {
        this.f21981OooO00o = o0oo0000Var;
        this.f21982OooO0O0 = i;
        this.f21983OooO0OO = Collections.unmodifiableList(rm0Var);
        byte[] bArr = new byte[16];
        this.f21988OooO0oo = bArr;
        this.f21980OooO = new r40(bArr);
        pm0 pm0Var = rm0.f23913OooOo0o;
        this.f21993OooOOOO = gn0.f19388OooOoO;
        this.f21998OooOo = -9223372036854775807L;
        this.f22001OooOo0o = -9223372036854775807L;
        this.f22003OooOoO0 = -9223372036854775807L;
        this.f22010Oooo000 = o0000Ooo.f21682OooOO0;
        this.f22011Oooo00O = new o000O[0];
        this.f22012Oooo00o = new o000O[0];
        this.f21991OooOOO = new qi0(new sj0(this, 3));
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.b91 OooO00o(java.util.ArrayList r18) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.o0O0oo00.OooO00o(java.util.ArrayList):com.google.android.gms.internal.ads.b91");
    }

    public static void OooO0Oo(r40 r40Var, int i, o0OO0 o0oo0) throws C2185w6 {
        r40Var.OooOO0(i + 8);
        int iOooOOo0 = r40Var.OooOOo0();
        byte[] bArr = oo0OOoo.f23028OooO00o;
        if ((iOooOOo0 & 1) != 0) {
            throw C2185w6.OooO0O0("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (iOooOOo0 & 2) != 0;
        int iOooOoO0 = r40Var.OooOoO0();
        if (iOooOoO0 == 0) {
            Arrays.fill(o0oo0.OooOO0o, 0, o0oo0.f22035OooO0o0, false);
            return;
        }
        int i2 = o0oo0.f22035OooO0o0;
        if (iOooOoO0 != i2) {
            throw C2185w6.OooO00o(null, "Senc sample count " + iOooOoO0 + " is different from fragment sample count" + i2);
        }
        Arrays.fill(o0oo0.OooOO0o, 0, iOooOoO0, z);
        int iOooOOOO = r40Var.OooOOOO();
        r40 r40Var2 = o0oo0.f22040OooOOO;
        r40Var2.OooO0oO(iOooOOOO);
        o0oo0.f22039OooOO0O = true;
        o0oo0.f22042OooOOOO = true;
        r40Var.OooO0o(r40Var2.f23745OooO00o, 0, r40Var2.f23747OooO0OO);
        r40Var2.OooOO0(0);
        o0oo0.f22042OooOOOO = false;
    }

    @Override // com.google.android.gms.internal.ads.o00000O
    public final void OooO0O0(long j, long j2) {
        SparseArray sparseArray = this.f21984OooO0Oo;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            ((o0oOo0O0) sparseArray.valueAt(i)).OooO0Oo();
        }
        this.f21992OooOOO0.clear();
        this.f22000OooOo0O = 0;
        this.f21991OooOOO.OooO0O0(0);
        this.f22001OooOo0o = j2;
        this.OooOO0o.clear();
        this.f21994OooOOOo = 0;
        this.f21997OooOOoo = 0;
    }

    @Override // com.google.android.gms.internal.ads.o00000O
    public final boolean OooO0OO(o00000OO o00000oo2) {
        gn0 gn0VarOooOOo0;
        o000OO0O o000oo0oOooO0OO = wz0.OooO0OO(o00000oo2, true, false);
        if (o000oo0oOooO0OO != null) {
            gn0VarOooOOo0 = rm0.OooOOo0(o000oo0oOooO0OO);
        } else {
            pm0 pm0Var = rm0.f23913OooOo0o;
            gn0VarOooOOo0 = gn0.f19388OooOoO;
        }
        this.f21993OooOOOO = gn0VarOooOOo0;
        return o000oo0oOooO0OO == null;
    }

    @Override // com.google.android.gms.internal.ads.o00000O
    public final void OooO0o(o0000Ooo o0000ooo) {
        if ((this.f21982OooO0O0 & 32) == 0) {
            o0000ooo = new de0(o0000ooo, this.f21981OooO00o);
        }
        this.f22010Oooo000 = o0000ooo;
        int i = 0;
        this.f21994OooOOOo = 0;
        this.f21997OooOOoo = 0;
        o000O[] o000oArr = new o000O[2];
        this.f22011Oooo00O = o000oArr;
        o000O[] o000oArr2 = (o000O[]) i80.OooO0o(0, o000oArr);
        this.f22011Oooo00O = o000oArr2;
        for (o000O o000o : o000oArr2) {
            o000o.OooO0o0(f21979Oooo0OO);
        }
        List list = this.f21983OooO0OO;
        this.f22012Oooo00o = new o000O[list.size()];
        int i2 = 100;
        while (i < this.f22012Oooo00o.length) {
            int i3 = i2 + 1;
            o000O o000oOooO0oO = this.f22010Oooo000.OooO0oO(i2, 3);
            o000oOooO0oO.OooO0o0((o0OoOo0) list.get(i));
            this.f22012Oooo00o[i] = o000oOooO0oO;
            i++;
            i2 = i3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01f4, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01f6, code lost:
    
        r18 = r4;
        r21 = r6;
        r6 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01ff, code lost:
    
        if (com.unity3d.services.core.device.MimeTypes.VIDEO_H265.equals(r9) == false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0209, code lost:
    
        if (((r18 & com.applovin.shadow.okhttp3.internal.p007ws.WebSocketProtocol.PAYLOAD_SHORT) >> 1) != 39) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x020c, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x020e, code lost:
    
        r21 = r6;
        r6 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0212, code lost:
    
        r33.f22008OooOooo = r4;
        r33.f22006OooOoo0 += 5;
        r33.f22004OooOoOO += r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0222, code lost:
    
        if (r33.f22007OooOooO != false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0230, code lost:
    
        if (java.util.Objects.equals(r2.f22271OooO0Oo.f22095OooO00o.f22086OooO0oO.f22222OooOOO0, com.unity3d.services.core.device.MimeTypes.VIDEO_H264) == false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x023a, code lost:
    
        if (com.google.android.gms.internal.ads.af0.o0OoOo0(r12[4]) == false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x023c, code lost:
    
        r33.f22007OooOooO = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x023f, code lost:
    
        r3 = r17;
        r6 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x024e, code lost:
    
        throw com.google.android.gms.internal.ads.C2185w6.OooO00o(null, "Invalid NAL length");
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x024f, code lost:
    
        r17 = r3;
        r21 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0256, code lost:
    
        if (r33.f22008OooOooo == false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0258, code lost:
    
        r3 = r33.f21987OooO0oO;
        r3.OooO0oO(r4);
        r32 = r2;
        r23 = r11;
        ((com.google.android.gms.internal.ads.o000000) r34).OooO0o0(r3.f23745OooO00o, 0, r33.f22005OooOoo, false);
        r5.OooO0Oo(r33.f22005OooOoo, r3);
        r2 = r33.f22005OooOoo;
        r4 = com.google.android.gms.internal.ads.af0.OooOOo0(r3.f23747OooO0OO, r3.f23745OooO00o);
        r3.OooOO0(com.unity3d.services.core.device.MimeTypes.VIDEO_H265.equals(r9.f22222OooOOO0) ? 1 : 0);
        r3.OooO(r4);
        r4 = r9.f22223OooOOOO;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x028a, code lost:
    
        if (r4 == (-1)) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x028e, code lost:
    
        if (r4 == r10.f23621OooO0o0) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0290, code lost:
    
        if (r4 < 0) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0292, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0294, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0295, code lost:
    
        com.google.android.gms.internal.ads.af0.OooooO0(r6);
        r10.f23621OooO0o0 = r4;
        r10.OooO0O0(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x029d, code lost:
    
        r10.OooO00o(r7, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x02a6, code lost:
    
        if ((r32.OooO00o() & 5) == 0) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x02a8, code lost:
    
        r10.OooO0O0(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02af, code lost:
    
        r32 = r2;
        r23 = r11;
        r2 = r5.OooO0OO(r34, r4, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02b8, code lost:
    
        r33.f22006OooOoo0 += r2;
        r33.f22005OooOoo -= r2;
        r3 = r17;
        r6 = r21;
        r11 = r23;
        r2 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02cd, code lost:
    
        r26 = r32.OooO00o();
        r0 = r32.OooO0OO();
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02d5, code lost:
    
        if (r0 == null) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02d7, code lost:
    
        r29 = r0.f22092OooO0OO;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x02dc, code lost:
    
        r29 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x02de, code lost:
    
        r24 = r7;
        r5.OooO00o(r24, r26, r33.f22004OooOoOO, 0, r29);
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02ef, code lost:
    
        if (r14.isEmpty() != false) goto L440;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02f1, code lost:
    
        r0 = (com.google.android.gms.internal.ads.o0O0o0) r14.removeFirst();
        r33.f22000OooOo0O -= r0.f21972OooO0OO;
        r2 = r0.f21971OooO0O0;
        r3 = r0.f21970OooO00o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0302, code lost:
    
        if (r2 == false) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0304, code lost:
    
        r3 = r3 + r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0306, code lost:
    
        r6 = r3;
        r2 = r33.f22011Oooo00O;
        r3 = r2.length;
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x030b, code lost:
    
        if (r4 >= r3) goto L443;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x030d, code lost:
    
        r2[r4].OooO00o(r6, 1, r0.f21972OooO0OO, r33.f22000OooOo0O, null);
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x031f, code lost:
    
        if (r32.OooO0o0() != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0321, code lost:
    
        r33.f22002OooOoO = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0326, code lost:
    
        r33.f21994OooOOOo = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x032a, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ba, code lost:
    
        r3 = r33.f21994OooOOOo;
        r5 = r2.f22268OooO00o;
        r6 = r2.f22269OooO0O0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c2, code lost:
    
        if (r3 != 3) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c6, code lost:
    
        if (r2.OooOO0o != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c8, code lost:
    
        r3 = r2.f22271OooO0Oo.f22098OooO0Oo[r2.f22272OooO0o];
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d1, code lost:
    
        r3 = r6.f22037OooO0oo[r2.f22272OooO0o];
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d7, code lost:
    
        r33.f22004OooOoOO = r3;
        r33.f22007OooOooO = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e0, code lost:
    
        if (r2.f22272OooO0o >= r2.f22267OooO) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e2, code lost:
    
        ((com.google.android.gms.internal.ads.o000000) r34).OooO(r3);
        r0 = r2.OooO0OO();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00eb, code lost:
    
        if (r0 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ee, code lost:
    
        r3 = r6.f22040OooOOO;
        r0 = r0.f22093OooO0Oo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00f2, code lost:
    
        if (r0 == 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00f4, code lost:
    
        r3.OooOO0O(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00f7, code lost:
    
        r0 = r2.f22272OooO0o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00fb, code lost:
    
        if (r6.f22039OooOO0O == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0101, code lost:
    
        if (r6.OooOO0o[r0] == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0103, code lost:
    
        r3.OooOO0O(r3.OooOoO() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x010f, code lost:
    
        if (r2.OooO0o0() != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0111, code lost:
    
        r33.f22002OooOoO = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x011d, code lost:
    
        if (r2.f22271OooO0Oo.f22095OooO00o.f22087OooO0oo != 1) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x011f, code lost:
    
        r33.f22004OooOoOO = r3 - 8;
        ((com.google.android.gms.internal.ads.o000000) r34).OooO(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0139, code lost:
    
        if ("audio/ac4".equals(r2.f22271OooO0Oo.f22095OooO00o.f22086OooO0oO.f22222OooOOO0) == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x013b, code lost:
    
        r33.f22006OooOoo0 = r2.OooO0O0(r33.f22004OooOoOO, 7);
        r3 = r33.f22004OooOoOO;
        r8 = r33.f21980OooO;
        com.google.android.gms.internal.ads.AbstractC1641hg.OooO0o0(r3, r8);
        r5.OooO0Oo(7, r8);
        r3 = r33.f22006OooOoo0 + 7;
        r33.f22006OooOoo0 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0154, code lost:
    
        r3 = r2.OooO0O0(r33.f22004OooOoOO, 0);
        r33.f22006OooOoo0 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x015c, code lost:
    
        r33.f22004OooOoOO += r3;
        r33.f21994OooOOOo = 4;
        r33.f22005OooOoo = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0166, code lost:
    
        r3 = r2.f22271OooO0Oo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x016a, code lost:
    
        if (r2.OooOO0o != false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x016c, code lost:
    
        r7 = r3.f22099OooO0o[r2.f22272OooO0o];
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0173, code lost:
    
        r7 = r6.f22029OooO[r2.f22272OooO0o];
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0179, code lost:
    
        r3 = r3.f22095OooO00o;
        r6 = r3.f22089OooOO0O;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x017d, code lost:
    
        if (r6 != 0) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x017f, code lost:
    
        r3 = r33.f22006OooOoo0;
        r4 = r33.f22004OooOoOO;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0183, code lost:
    
        if (r3 >= r4) goto L439;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0185, code lost:
    
        r33.f22006OooOoo0 += r5.OooO0OO(r34, r4 - r3, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0190, code lost:
    
        r32 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0194, code lost:
    
        r11 = r33.f21985OooO0o;
        r12 = r11.f23745OooO00o;
        r12[0] = 0;
        r12[1] = 0;
        r12[r18] = 0;
        r15 = r6 + 1;
        r6 = 4 - r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01aa, code lost:
    
        if (r33.f22006OooOoo0 >= r33.f22004OooOoOO) goto L444;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01ac, code lost:
    
        r4 = r33.f22005OooOoo;
        r9 = r3.f22086OooO0oO;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01b2, code lost:
    
        if (r4 != 0) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01b4, code lost:
    
        r17 = r3;
        ((com.google.android.gms.internal.ads.o000000) r34).OooO0o0(r12, r6, r15, false);
        r11.OooOO0(0);
        r4 = r11.OooOOo0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01c4, code lost:
    
        if (r4 <= 0) goto L445;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01c6, code lost:
    
        r33.f22005OooOoo = r4 - 1;
        r4 = r33.f21986OooO0o0;
        r4.OooOO0(0);
        r5.OooO0Oo(4, r4);
        r5.OooO0Oo(1, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01de, code lost:
    
        if (r33.f22012Oooo00o.length <= 0) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01e0, code lost:
    
        r4 = r12[4];
        r9 = r9.f22222OooOOO0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01e8, code lost:
    
        if (com.unity3d.services.core.device.MimeTypes.VIDEO_H264.equals(r9) == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01ea, code lost:
    
        r18 = r4;
        r21 = r6;
        r6 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01f1, code lost:
    
        if ((r18 & 31) == 6) goto L100;
     */
    @Override // com.google.android.gms.internal.ads.o00000O
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int OooO0o0(com.google.android.gms.internal.ads.o00000OO r34, com.google.android.gms.internal.ads.o0000O00 r35) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 2031
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.o0O0oo00.OooO0o0(com.google.android.gms.internal.ads.o00000OO, com.google.android.gms.internal.ads.o0000O00):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x02c0, code lost:
    
        r10 = (r10 * 125) / 100;
        r5.f22037OooO0oo = new int[r10];
        r5.f22029OooO = new long[r10];
        r5.f22038OooOO0 = new boolean[r10];
        r5.OooOO0o = new boolean[r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x02d4, code lost:
    
        r2 = 0;
        r4 = 0;
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x02d7, code lost:
    
        r26 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x02d9, code lost:
    
        if (r2 >= r7) goto L339;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x02db, code lost:
    
        r10 = (com.google.android.gms.internal.ads.ia0) r6.get(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x02e3, code lost:
    
        if (r10.f24281OooO0O0 != r14) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x02e5, code lost:
    
        r28 = r4 + 1;
        r10 = r10.f20006OooO0OO;
        r10.OooOO0(8);
        r13 = r10.OooOOo0();
        r14 = r12.f22271OooO0Oo;
        r29 = r2;
        r2 = r5.f22030OooO00o;
        r30 = com.google.android.gms.internal.ads.i80.f19994OooO00o;
        r30 = r3;
        r5.f22036OooO0oO[r4] = r10.OooOoO0();
        r3 = r5.f22034OooO0o;
        r31 = r4;
        r3 = r5.f22031OooO0O0;
        r3[r31] = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0314, code lost:
    
        if ((r13 & 1) == 0) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0316, code lost:
    
        r3[r31] = r3 + r10.OooOOo0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0323, code lost:
    
        if ((r13 & 4) == 0) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0325, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0327, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0328, code lost:
    
        r4 = r2.f21976OooO0Oo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x032a, code lost:
    
        if (r3 == false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x032c, code lost:
    
        r4 = r10.OooOOo0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0330, code lost:
    
        r32 = r3;
        r3 = r13 & 256;
        r3 = r13 & 512;
        r3 = r13 & 1024;
        r13 = r13 & 2048;
        r14 = r14.f22095OooO00o;
        r3 = r14.f22079OooO;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0344, code lost:
    
        if (r3 == null) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0346, code lost:
    
        r36 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x034c, code lost:
    
        if (r3.length != 1) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x034e, code lost:
    
        r3 = r14.f22088OooOO0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0350, code lost:
    
        if (r3 != null) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0354, code lost:
    
        r38 = r3[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x035a, code lost:
    
        if (r38 != 0) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x035c, code lost:
    
        r37 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x035f, code lost:
    
        r44 = java.math.RoundingMode.DOWN;
        r37 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0387, code lost:
    
        if ((com.google.android.gms.internal.ads.i80.OooOo0(r38, 1000000, r14.f22083OooO0Oo, r44) + com.google.android.gms.internal.ads.i80.OooOo0(r37[0], 1000000, r14.f22082OooO0OO, r44)) >= r14.f22085OooO0o0) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x038a, code lost:
    
        r26 = r37[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x038d, code lost:
    
        r36 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0390, code lost:
    
        r4 = r5.f22037OooO0oo;
        r13 = r5.f22029OooO;
        r3 = r5.f22038OooOO0;
        r3 = r5.f22036OooO0oO[r31] + r9;
        r39 = r9;
        r9 = r5.f22043OooOOOo;
        r4 = r39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x03a9, code lost:
    
        if (r4 >= r3) goto L340;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x03ab, code lost:
    
        if (r3 == 0) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x03ad, code lost:
    
        r31 = r3;
        r3 = r10.OooOOo0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x03b7, code lost:
    
        r39 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x03ba, code lost:
    
        r31 = r3;
        r3 = r2.f21974OooO0O0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x03c1, code lost:
    
        if (r3 < 0) goto L309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x03c3, code lost:
    
        if (r3 == 0) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x03c5, code lost:
    
        r42 = r7;
        r7 = r10.OooOOo0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x03d0, code lost:
    
        r42 = r7;
        r7 = r2.f21975OooO0OO;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x03d4, code lost:
    
        if (r7 < 0) goto L310;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x03d6, code lost:
    
        if (r3 == 0) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x03d8, code lost:
    
        r4 = r10.OooOOo0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x03dd, code lost:
    
        if (r39 != 0) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x03df, code lost:
    
        if (r32 == false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x03e1, code lost:
    
        r4 = r36;
        r39 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x03e6, code lost:
    
        r39 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x03e8, code lost:
    
        r4 = r2.f21976OooO0Oo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x03ea, code lost:
    
        if (r13 == 0) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x03ec, code lost:
    
        r43 = r2;
        r2 = r10.OooOOo0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x03f6, code lost:
    
        r44 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x03f9, code lost:
    
        r43 = r2;
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x03fd, code lost:
    
        r1 = com.google.android.gms.internal.ads.i80.OooOo0((r2 + r9) - r26, 1000000, r14.f22082OooO0OO, java.math.RoundingMode.DOWN);
        r13[r39] = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0414, code lost:
    
        if (r5.f22044OooOOo0 != false) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0416, code lost:
    
        r13[r39] = r1 + r12.f22271OooO0Oo.f22102OooO0oo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x041e, code lost:
    
        r4[r39] = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0426, code lost:
    
        if (((r4 >> 16) & 1) != 0) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0428, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x042b, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x042c, code lost:
    
        r3[r39] = r1;
        r9 = r9 + r3;
        r4 = r39 + 1;
        r3 = r31;
        r7 = r42;
        r2 = r43;
        r1 = r44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x044d, code lost:
    
        throw com.google.android.gms.internal.ads.C2185w6.OooO00o(null, "Unexpected negative value: " + r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x045f, code lost:
    
        throw com.google.android.gms.internal.ads.C2185w6.OooO00o(null, "Unexpected negative value: " + r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0460, code lost:
    
        r44 = r1;
        r42 = r7;
        r5.f22043OooOOOo = r9;
        r4 = r28;
        r9 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x046f, code lost:
    
        r44 = r1;
        r29 = r2;
        r30 = r3;
        r42 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x047c, code lost:
    
        r2 = r29 + 1;
        r3 = r30;
        r7 = r42;
        r1 = r44;
        r14 = 1953658222;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0489, code lost:
    
        r44 = r1;
        r30 = r3;
        r1 = r12.f22271OooO0Oo;
        r2 = r5.f22030OooO00o;
        r2.getClass();
        r1 = r1.f22095OooO00o.OooOO0o[r2.f21973OooO00o];
        r2 = r8.OooO0o0(1935763834);
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x04a3, code lost:
    
        if (r2 == null) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x04a5, code lost:
    
        r1.getClass();
        r2 = r2.f20006OooO0OO;
        r2.OooOO0(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x04b5, code lost:
    
        if ((r2.OooOOo0() & 1) != 1) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x04b7, code lost:
    
        r2.OooOO0O(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x04ba, code lost:
    
        r3 = r2.OooOo0O();
        r4 = r2.OooOoO0();
        r7 = r5.f22035OooO0o0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x04c4, code lost:
    
        if (r4 > r7) goto L311;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x04c6, code lost:
    
        r7 = r1.f22093OooO0Oo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x04c8, code lost:
    
        if (r3 != 0) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x04ca, code lost:
    
        r3 = r5.OooOO0o;
        r9 = 0;
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x04ce, code lost:
    
        if (r13 >= r4) goto L343;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x04d0, code lost:
    
        r10 = r2.OooOo0O();
        r9 = r9 + r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x04d5, code lost:
    
        if (r10 <= r7) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x04d7, code lost:
    
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x04d9, code lost:
    
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x04da, code lost:
    
        r3[r13] = r10;
        r13 = r13 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x04e1, code lost:
    
        r13 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x04e3, code lost:
    
        if (r3 <= r7) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x04e5, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x04e7, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x04e8, code lost:
    
        r9 = r3 * r4;
        r13 = false;
        java.util.Arrays.fill(r5.OooOO0o, 0, r4, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x04f0, code lost:
    
        java.util.Arrays.fill(r5.OooOO0o, r4, r5.f22035OooO0o0, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x04f7, code lost:
    
        if (r9 <= 0) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x04f9, code lost:
    
        r5.f22040OooOOO.OooO0oO(r9);
        r5.f22039OooOO0O = true;
        r5.f22042OooOOOO = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x051f, code lost:
    
        throw com.google.android.gms.internal.ads.C2185w6.OooO00o(null, "Saiz sample count " + r4 + " is greater than fragment sample count" + r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x0520, code lost:
    
        r2 = r8.OooO0o0(1935763823);
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0527, code lost:
    
        if (r2 == null) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x0529, code lost:
    
        r2 = r2.f20006OooO0OO;
        r2.OooOO0(8);
        r4 = r2.OooOOo0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0537, code lost:
    
        if ((r4 & 1) != 1) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x0539, code lost:
    
        r2.OooOO0O(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x053c, code lost:
    
        r3 = r2.OooOoO0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x0540, code lost:
    
        if (r3 != 1) goto L312;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x0542, code lost:
    
        r3 = com.google.android.gms.internal.ads.oo0OOoo.OooO00o(r4);
        r9 = r5.f22032OooO0OO;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x0548, code lost:
    
        if (r3 != 0) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x054a, code lost:
    
        r2 = r2.OooOooO();
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x054f, code lost:
    
        r2 = r2.OooOooo();
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0553, code lost:
    
        r5.f22032OooO0OO = r9 + r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x0556, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x056b, code lost:
    
        throw com.google.android.gms.internal.ads.C2185w6.OooO00o(null, "Unexpected saio entry count: " + r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x056c, code lost:
    
        r3 = r8.OooO0o0(1936027235);
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x0573, code lost:
    
        if (r3 == null) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x0575, code lost:
    
        OooO0Oo(r3.f20006OooO0OO, 0, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x057b, code lost:
    
        if (r1 == null) goto L216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x057d, code lost:
    
        r33 = r1.f22091OooO0O0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0582, code lost:
    
        r33 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x0584, code lost:
    
        r1 = null;
        r3 = null;
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x058b, code lost:
    
        if (r4 >= r6.size()) goto L346;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x058d, code lost:
    
        r7 = (com.google.android.gms.internal.ads.ia0) r6.get(r4);
        r8 = r7.f20006OooO0OO;
        r7 = r7.f24281OooO0O0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x059d, code lost:
    
        if (r7 != 1935828848) goto L226;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x059f, code lost:
    
        r8.OooOO0(12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x05a8, code lost:
    
        if (r8.OooOOo0() != 1936025959) goto L225;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x05aa, code lost:
    
        r1 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x05b2, code lost:
    
        if (r7 != 1936158820) goto L225;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x05b4, code lost:
    
        r8.OooOO0(12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x05bb, code lost:
    
        if (r8.OooOOo0() != 1936025959) goto L225;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x05bd, code lost:
    
        r3 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x05bf, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x05c4, code lost:
    
        if (r1 == null) goto L235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x05c6, code lost:
    
        if (r3 != null) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x05c8, code lost:
    
        r4 = r20;
        r8 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x05ce, code lost:
    
        r1.OooOO0(8);
        r7 = com.google.android.gms.internal.ads.oo0OOoo.OooO00o(r1.OooOOo0());
        r8 = r21;
        r1.OooOO0O(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x05e0, code lost:
    
        if (r7 != 1) goto L239;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x05e2, code lost:
    
        r1.OooOO0O(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x05e9, code lost:
    
        if (r1.OooOOo0() != 1) goto L313;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x05eb, code lost:
    
        r3.OooOO0(8);
        r1 = com.google.android.gms.internal.ads.oo0OOoo.OooO00o(r3.OooOOo0());
        r3.OooOO0O(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x05f9, code lost:
    
        if (r1 != 1) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x0601, code lost:
    
        if (r3.OooOooO() == 0) goto L314;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x0603, code lost:
    
        r4 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x060c, code lost:
    
        throw com.google.android.gms.internal.ads.C2185w6.OooO0O0("Variable length description in sgpd found (unsupported)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x060d, code lost:
    
        r4 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x060f, code lost:
    
        if (r1 < r4) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x0611, code lost:
    
        r3.OooOO0O(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x061c, code lost:
    
        if (r3.OooOooO() != 1) goto L315;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x061e, code lost:
    
        r3.OooOO0O(1);
        r1 = r3.OooOo0O();
        r36 = (r1 & 240) >> 4;
        r37 = r1 & 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x0630, code lost:
    
        if (r3.OooOo0O() != 1) goto L263;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x0632, code lost:
    
        r34 = r3.OooOo0O();
        r1 = r19;
        r7 = new byte[r1];
        r3.OooO0o(r7, 0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x063e, code lost:
    
        if (r34 != 0) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0640, code lost:
    
        r1 = r3.OooOo0O();
        r2 = new byte[r1];
        r3.OooO0o(r2, 0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x0649, code lost:
    
        r5.f22039OooOO0O = true;
        r5.f22041OooOOO0 = new com.google.android.gms.internal.ads.o0OO00o0(true, r33, r34, r7, r36, r37, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x0661, code lost:
    
        throw com.google.android.gms.internal.ads.C2185w6.OooO0O0("Entry count in sgpd != 1 (unsupported).");
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x0668, code lost:
    
        throw com.google.android.gms.internal.ads.C2185w6.OooO0O0("Entry count in sbgp != 1 (unsupported).");
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x0669, code lost:
    
        r1 = r6.size();
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x066e, code lost:
    
        if (r2 >= r1) goto L347;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x0670, code lost:
    
        r3 = (com.google.android.gms.internal.ads.ia0) r6.get(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x067b, code lost:
    
        if (r3.f24281OooO0O0 != 1970628964) goto L271;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x067d, code lost:
    
        r3 = r3.f20006OooO0OO;
        r3.OooOO0(8);
        r7 = r53.f21988OooO0oo;
        r3.OooO0o(r7, 0, 16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x0692, code lost:
    
        if (java.util.Arrays.equals(r7, com.google.android.gms.internal.ads.o0O0oo00.f21978Oooo0O0) == false) goto L270;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x0694, code lost:
    
        OooO0Oo(r3, 16, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x069f, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x06a2, code lost:
    
        r12 = 8;
        r14 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x06a8, code lost:
    
        r44 = r1;
        r25 = r2;
        r30 = r3;
        r12 = r4;
        r15 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x06b2, code lost:
    
        r6 = r15 + 1;
        r20 = r4;
        r21 = r8;
        r4 = r12;
        r19 = r14;
        r2 = r25;
        r3 = r30;
        r1 = r44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x06c4, code lost:
    
        r44 = r1;
        r12 = r4;
        r1 = OooO00o(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x06d2, code lost:
    
        if (r1 == null) goto L285;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x06d4, code lost:
    
        r3 = r44.size();
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x06d9, code lost:
    
        if (r5 >= r3) goto L348;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x06db, code lost:
    
        r6 = r44;
        r7 = (com.google.android.gms.internal.ads.o0oOo0O0) r6.valueAt(r5);
        r9 = r7.f22271OooO0Oo;
        r10 = r7.f22269OooO0O0.f22030OooO00o;
        r11 = com.google.android.gms.internal.ads.i80.f19994OooO00o;
        r9 = r9.f22095OooO00o.OooOO0o[r10.f21973OooO00o];
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x06f3, code lost:
    
        if (r9 == null) goto L283;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x06f5, code lost:
    
        r9 = r9.f22091OooO0O0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x06f8, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x06f9, code lost:
    
        r9 = r1.OooO0O0(r9);
        r10 = r7.f22271OooO0Oo.f22095OooO00o.f22086OooO0oO;
        r10.getClass();
        r11 = new com.google.android.gms.internal.ads.jb1(r10);
        r11.f20254OooOOOo = r9;
        r7.f22268OooO00o.OooO0o0(new com.google.android.gms.internal.ads.o0OoOo0(r11));
        r5 = r5 + 1;
        r44 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x071e, code lost:
    
        r6 = r44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x0729, code lost:
    
        if (r53.f22001OooOo0o == (-9223372036854775807L)) goto L301;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x072b, code lost:
    
        r1 = r6.size();
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x0730, code lost:
    
        if (r2 >= r1) goto L351;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x0732, code lost:
    
        r3 = (com.google.android.gms.internal.ads.o0oOo0O0) r6.valueAt(r2);
        r4 = r53.f22001OooOo0o;
        r7 = r3.f22272OooO0o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x073c, code lost:
    
        r11 = r3.f22269OooO0O0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x0740, code lost:
    
        if (r7 >= r11.f22035OooO0o0) goto L352;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x0748, code lost:
    
        if (r11.f22029OooO[r7] > r4) goto L353;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x074e, code lost:
    
        if (r11.f22038OooOO0[r7] == false) goto L355;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x0750, code lost:
    
        r3.f22267OooO = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x0752, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x0757, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x075d, code lost:
    
        r53.f22001OooOo0o = -9223372036854775807L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x0767, code lost:
    
        r12 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x0772, code lost:
    
        if (r7.isEmpty() != false) goto L318;
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x0774, code lost:
    
        ((com.google.android.gms.internal.ads.ba0) r7.peek()).f17464OooO0o0.add(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x0780, code lost:
    
        r53.f21994OooOOOo = 0;
        r53.f21997OooOOoo = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x0785, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x018c, code lost:
    
        r1 = r10;
        r19 = 16;
        r20 = 2;
        r21 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0196, code lost:
    
        if (r8 != 1836019558) goto L302;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0198, code lost:
    
        r2 = r9.f17464OooO0o0;
        r3 = r2.size();
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x019f, code lost:
    
        if (r6 >= r3) goto L335;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01a1, code lost:
    
        r8 = (com.google.android.gms.internal.ads.ba0) r2.get(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01ac, code lost:
    
        if (r8.f24281OooO0O0 != 1953653094) goto L274;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01ae, code lost:
    
        r9 = r8.OooO0o0(1952868452);
        r9.getClass();
        r9 = r9.f20006OooO0OO;
        r9.OooOO0(r4);
        r10 = r9.OooOOo0();
        r12 = com.google.android.gms.internal.ads.oo0OOoo.f23028OooO00o;
        r12 = (com.google.android.gms.internal.ads.o0oOo0O0) r1.get(r9.OooOOo0());
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01cd, code lost:
    
        if (r12 != null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01cf, code lost:
    
        r15 = r6;
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01d2, code lost:
    
        r13 = r10 & 1;
        r14 = r12.f22269OooO0O0;
        r15 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01d9, code lost:
    
        if (r13 == 0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01db, code lost:
    
        r5 = r9.OooOooo();
        r14.f22031OooO0O0 = r5;
        r14.f22032OooO0OO = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01e3, code lost:
    
        r5 = r12.f22273OooO0o0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01e7, code lost:
    
        if ((r10 & 2) == 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01e9, code lost:
    
        r6 = r9.OooOOo0() - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01f0, code lost:
    
        r6 = r5.f21973OooO00o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01f4, code lost:
    
        if ((r10 & 8) == 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01f6, code lost:
    
        r13 = r9.OooOOo0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01fd, code lost:
    
        r13 = r5.f21974OooO0O0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0201, code lost:
    
        if ((r10 & 16) == 0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0203, code lost:
    
        r7 = r9.OooOOo0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x020a, code lost:
    
        r7 = r5.f21975OooO0OO;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x020e, code lost:
    
        if ((r10 & 32) == 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0210, code lost:
    
        r5 = r9.OooOOo0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0215, code lost:
    
        r5 = r5.f21976OooO0Oo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0217, code lost:
    
        r14.f22030OooO00o = new com.google.android.gms.internal.ads.o0O0o000(r6, r13, r7, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x021e, code lost:
    
        if (r12 != null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0220, code lost:
    
        r44 = r1;
        r25 = r2;
        r30 = r3;
        r12 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0227, code lost:
    
        r14 = r19;
        r4 = r20;
        r8 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0233, code lost:
    
        r5 = r12.f22269OooO0O0;
        r6 = r5.f22043OooOOOo;
        r9 = r5.f22044OooOOo0;
        r12.OooO0Oo();
        r12.OooOO0o = true;
        r10 = r8.OooO0o0(1952867444);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0246, code lost:
    
        if (r10 == null) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0248, code lost:
    
        r6 = r10.f20006OooO0OO;
        r6.OooOO0(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0255, code lost:
    
        if (com.google.android.gms.internal.ads.oo0OOoo.OooO00o(r6.OooOOo0()) != 1) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0257, code lost:
    
        r6 = r6.OooOooo();
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x025c, code lost:
    
        r6 = r6.OooOooO();
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0260, code lost:
    
        r5.f22043OooOOOo = r6;
        r5.f22044OooOOo0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0265, code lost:
    
        r5.f22043OooOOOo = r6;
        r5.f22044OooOOo0 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0269, code lost:
    
        r6 = r8.f17463OooO0Oo;
        r7 = r6.size();
        r9 = 0;
        r10 = 0;
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0272, code lost:
    
        r14 = 1953658222;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0275, code lost:
    
        if (r13 >= r7) goto L336;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0277, code lost:
    
        r4 = (com.google.android.gms.internal.ads.ia0) r6.get(r13);
        r25 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0283, code lost:
    
        if (r4.f24281OooO0O0 != 1953658222) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0285, code lost:
    
        r2 = r4.f20006OooO0OO;
        r2.OooOO0(12);
        r2 = r2.OooOoO0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0290, code lost:
    
        if (r2 <= 0) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0292, code lost:
    
        r10 = r10 + r2;
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x029a, code lost:
    
        r13 = r13 + 1;
        r2 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x02a1, code lost:
    
        r25 = r2;
        r12.f22275OooO0oo = 0;
        r12.f22274OooO0oO = 0;
        r12.f22272OooO0o = 0;
        r5.f22033OooO0Oo = r9;
        r5.f22035OooO0o0 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x02b1, code lost:
    
        if (r5.f22036OooO0oO.length >= r9) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x02b3, code lost:
    
        r5.f22034OooO0o = new long[r9];
        r5.f22036OooO0oO = new int[r9];
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x02be, code lost:
    
        if (r5.f22037OooO0oo.length >= r10) goto L101;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooO0oO(long r54) throws com.google.android.gms.internal.ads.C2185w6 {
        /*
            Method dump skipped, instructions count: 1926
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.o0O0oo00.OooO0oO(long):void");
    }

    @Override // com.google.android.gms.internal.ads.o00000O
    public final /* synthetic */ List zzd() {
        return this.f21993OooOOOO;
    }
}
