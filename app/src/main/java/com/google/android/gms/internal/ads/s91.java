package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes2.dex */
public final class s91 {

    /* renamed from: OooO, reason: collision with root package name */
    public long f24039OooO;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final Uri f24040OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final sz0 f24041OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final bi0 f24042OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final v91 f24043OooO0Oo;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final o0000o0.OooOOO f24045OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public volatile boolean f24046OooO0oO;

    /* renamed from: OooOO0, reason: collision with root package name */
    public iq0 f24048OooOO0;

    /* renamed from: OooOO0O, reason: collision with root package name */
    public o000O f24049OooOO0O;
    public boolean OooOO0o;

    /* renamed from: OooOOO0, reason: collision with root package name */
    public final /* synthetic */ v91 f24050OooOOO0;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final o0000O00 f24044OooO0o = new o0000O00();

    /* renamed from: OooO0oo, reason: collision with root package name */
    public boolean f24047OooO0oo = true;

    public s91(v91 v91Var, Uri uri, zm0 zm0Var, bi0 bi0Var, v91 v91Var2, o0000o0.OooOOO oooOOO) {
        this.f24050OooOOO0 = v91Var;
        this.f24040OooO00o = uri;
        this.f24041OooO0O0 = new sz0(zm0Var);
        this.f24042OooO0OO = bi0Var;
        this.f24043OooO0Oo = v91Var2;
        this.f24045OooO0o0 = oooOOO;
        y81.f25871OooO00o.getAndIncrement();
        this.f24048OooOO0 = OooO0O0(0L);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(22:14|(2:16|17)|18|19|(5:21|156|22|23|(18:25|26|154|33|(1:35)(1:36)|37|(1:39)(1:40)|41|(1:43)(1:44)|45|(1:47)(1:48)|49|(4:51|160|52|(17:54|55|(1:61)|62|(1:69)(1:66)|70|(1:77)|78|(1:80)|81|(1:(3:162|83|(6:144|85|1bd|94|(6:170|96|1f0|100|101|173)(1:172)|171)(2:169|112))(1:168))|(3:115|(1:117)|118)|119|150|120|166|(2:165|177)(1:167))(6:146|56|57|(0)|62|(14:64|69|70|(3:72|75|77)|78|(0)|81|(2:(0)(0)|171)|(0)|119|150|120|166|(0)(0))(0)))(4:57|(0)|62|(0)(0))|(2:126|(1:128))|129|148|130|131)(3:27|158|28))(1:32)|29|154|33|(0)(0)|37|(0)(0)|41|(0)(0)|45|(0)(0)|49|(0)(0)|(0)|129|148|130|131) */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0174, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01b7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x024a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:167:? A[LOOP:0: B:3:0x0004->B:167:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x020f A[EDGE_INSN: B:168:0x020f->B:113:0x020f BREAK  A[LOOP:1: B:82:0x01b5->B:171:0x01b5], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b1 A[Catch: all -> 0x0174, TryCatch #8 {all -> 0x0174, blocks: (B:33:0x00a6, B:35:0x00b1, B:37:0x00bd, B:39:0x00c7, B:41:0x00d3, B:43:0x00dd, B:45:0x00e9, B:47:0x00f3, B:49:0x0105, B:51:0x010f, B:52:0x0115, B:61:0x0143, B:62:0x014a, B:64:0x0154, B:66:0x0158, B:70:0x0178, B:72:0x018f, B:75:0x0198, B:77:0x019c, B:78:0x01a0, B:80:0x01a4, B:56:0x011f, B:59:0x0135, B:28:0x0079, B:31:0x0094), top: B:154:0x00a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c7 A[Catch: all -> 0x0174, TryCatch #8 {all -> 0x0174, blocks: (B:33:0x00a6, B:35:0x00b1, B:37:0x00bd, B:39:0x00c7, B:41:0x00d3, B:43:0x00dd, B:45:0x00e9, B:47:0x00f3, B:49:0x0105, B:51:0x010f, B:52:0x0115, B:61:0x0143, B:62:0x014a, B:64:0x0154, B:66:0x0158, B:70:0x0178, B:72:0x018f, B:75:0x0198, B:77:0x019c, B:78:0x01a0, B:80:0x01a4, B:56:0x011f, B:59:0x0135, B:28:0x0079, B:31:0x0094), top: B:154:0x00a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00dd A[Catch: all -> 0x0174, TryCatch #8 {all -> 0x0174, blocks: (B:33:0x00a6, B:35:0x00b1, B:37:0x00bd, B:39:0x00c7, B:41:0x00d3, B:43:0x00dd, B:45:0x00e9, B:47:0x00f3, B:49:0x0105, B:51:0x010f, B:52:0x0115, B:61:0x0143, B:62:0x014a, B:64:0x0154, B:66:0x0158, B:70:0x0178, B:72:0x018f, B:75:0x0198, B:77:0x019c, B:78:0x01a0, B:80:0x01a4, B:56:0x011f, B:59:0x0135, B:28:0x0079, B:31:0x0094), top: B:154:0x00a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f3 A[Catch: all -> 0x0174, TryCatch #8 {all -> 0x0174, blocks: (B:33:0x00a6, B:35:0x00b1, B:37:0x00bd, B:39:0x00c7, B:41:0x00d3, B:43:0x00dd, B:45:0x00e9, B:47:0x00f3, B:49:0x0105, B:51:0x010f, B:52:0x0115, B:61:0x0143, B:62:0x014a, B:64:0x0154, B:66:0x0158, B:70:0x0178, B:72:0x018f, B:75:0x0198, B:77:0x019c, B:78:0x01a0, B:80:0x01a4, B:56:0x011f, B:59:0x0135, B:28:0x0079, B:31:0x0094), top: B:154:0x00a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010f A[Catch: all -> 0x0174, TRY_LEAVE, TryCatch #8 {all -> 0x0174, blocks: (B:33:0x00a6, B:35:0x00b1, B:37:0x00bd, B:39:0x00c7, B:41:0x00d3, B:43:0x00dd, B:45:0x00e9, B:47:0x00f3, B:49:0x0105, B:51:0x010f, B:52:0x0115, B:61:0x0143, B:62:0x014a, B:64:0x0154, B:66:0x0158, B:70:0x0178, B:72:0x018f, B:75:0x0198, B:77:0x019c, B:78:0x01a0, B:80:0x01a4, B:56:0x011f, B:59:0x0135, B:28:0x0079, B:31:0x0094), top: B:154:0x00a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0143 A[Catch: all -> 0x0174, TryCatch #8 {all -> 0x0174, blocks: (B:33:0x00a6, B:35:0x00b1, B:37:0x00bd, B:39:0x00c7, B:41:0x00d3, B:43:0x00dd, B:45:0x00e9, B:47:0x00f3, B:49:0x0105, B:51:0x010f, B:52:0x0115, B:61:0x0143, B:62:0x014a, B:64:0x0154, B:66:0x0158, B:70:0x0178, B:72:0x018f, B:75:0x0198, B:77:0x019c, B:78:0x01a0, B:80:0x01a4, B:56:0x011f, B:59:0x0135, B:28:0x0079, B:31:0x0094), top: B:154:0x00a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0154 A[Catch: all -> 0x0174, TryCatch #8 {all -> 0x0174, blocks: (B:33:0x00a6, B:35:0x00b1, B:37:0x00bd, B:39:0x00c7, B:41:0x00d3, B:43:0x00dd, B:45:0x00e9, B:47:0x00f3, B:49:0x0105, B:51:0x010f, B:52:0x0115, B:61:0x0143, B:62:0x014a, B:64:0x0154, B:66:0x0158, B:70:0x0178, B:72:0x018f, B:75:0x0198, B:77:0x019c, B:78:0x01a0, B:80:0x01a4, B:56:0x011f, B:59:0x0135, B:28:0x0079, B:31:0x0094), top: B:154:0x00a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a4 A[Catch: all -> 0x0174, TRY_LEAVE, TryCatch #8 {all -> 0x0174, blocks: (B:33:0x00a6, B:35:0x00b1, B:37:0x00bd, B:39:0x00c7, B:41:0x00d3, B:43:0x00dd, B:45:0x00e9, B:47:0x00f3, B:49:0x0105, B:51:0x010f, B:52:0x0115, B:61:0x0143, B:62:0x014a, B:64:0x0154, B:66:0x0158, B:70:0x0178, B:72:0x018f, B:75:0x0198, B:77:0x019c, B:78:0x01a0, B:80:0x01a4, B:56:0x011f, B:59:0x0135, B:28:0x0079, B:31:0x0094), top: B:154:0x00a6 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooO00o() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 587
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.s91.OooO00o():void");
    }

    public final iq0 OooO0O0(long j) {
        Map map = Collections.EMPTY_MAP;
        Map map2 = v91.f24893OoooooO;
        Uri uri = this.f24040OooO00o;
        if (uri != null) {
            return new iq0(uri, map2, j, -1L, 6);
        }
        throw new IllegalStateException("The uri must be set.");
    }
}
