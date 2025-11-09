package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.view.Surface;
import androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.work.WorkRequest;
import io.flutter.plugin.platform.PlatformPlugin;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.apache.tika.pipes.PipesConfigBase;

/* loaded from: classes2.dex */
public final class pb1 extends f81 {

    /* renamed from: o000O0o0 */
    public static final int[] f23277o000O0o0 = {1920, 1600, 1440, PlatformPlugin.DEFAULT_SYSTEM_UI, 960, 854, 640, 540, 480};

    /* renamed from: o000O0oO */
    public static boolean f23278o000O0oO;

    /* renamed from: o000O0oo */
    public static boolean f23279o000O0oo;

    /* renamed from: o000 */
    public int f23280o000;

    /* renamed from: o0000O */
    public final boolean f23281o0000O;

    /* renamed from: o0000O0 */
    public final Context f23282o0000O0;

    /* renamed from: o0000O0O */
    public final boolean f23283o0000O0O;

    /* renamed from: o0000OO */
    public final OooOO0O f23284o0000OO;

    /* renamed from: o0000OO0 */
    public final OooOOO0 f23285o0000OO0;

    /* renamed from: o0000OOO */
    public Oooo0oO.o0O0O00 f23286o0000OOO;

    /* renamed from: o0000OOo */
    public boolean f23287o0000OOo;

    /* renamed from: o0000Oo */
    public OooO0OO f23288o0000Oo;

    /* renamed from: o0000Oo0 */
    public boolean f23289o0000Oo0;

    /* renamed from: o0000OoO */
    public boolean f23290o0000OoO;

    /* renamed from: o0000o */
    public y40 f23291o0000o;

    /* renamed from: o0000o0 */
    public List f23292o0000o0;

    /* renamed from: o0000o0O */
    public Surface f23293o0000o0O;

    /* renamed from: o0000o0o */
    public rb1 f23294o0000o0o;

    /* renamed from: o0000oO0 */
    public boolean f23295o0000oO0;

    /* renamed from: o0000oOO */
    public int f23296o0000oOO;

    /* renamed from: o0000oOo */
    public int f23297o0000oOo;

    /* renamed from: o0000oo0 */
    public long f23298o0000oo0;

    /* renamed from: o0000ooO */
    public int f23299o0000ooO;
    public u41 o000O0;

    /* renamed from: o000O00 */
    public int f23300o000O00;

    /* renamed from: o000O000 */
    public int f23301o000O000;

    /* renamed from: o000O00O */
    public int f23302o000O00O;

    /* renamed from: o000O0O */
    public C1721jn f23303o000O0O;

    /* renamed from: o000O0O0 */
    public boolean f23304o000O0O0;

    /* renamed from: o000O0Oo */
    public long f23305o000O0Oo;

    /* renamed from: o000O0o */
    public int f23306o000O0o;

    /* renamed from: o000OO */
    public final o00O0O f23307o000OO;

    /* renamed from: o000OO0O */
    public long f23308o000OO0O;

    /* renamed from: o000Oo0 */
    public C1721jn f23309o000Oo0;

    /* renamed from: o000OoO */
    public long f23310o000OoO;

    /* renamed from: o000Ooo */
    public long f23311o000Ooo;

    public pb1(Context context, nh0 nh0Var, Handler handler, t41 t41Var) {
        super(2, nh0Var, 30.0f);
        Context applicationContext = context.getApplicationContext();
        this.f23282o0000O0 = applicationContext;
        this.f23288o0000Oo = null;
        this.f23307o000OO = new o00O0O(handler, t41Var);
        this.f23283o0000O0O = true;
        this.f23285o0000OO0 = new OooOOO0(applicationContext, this);
        this.f23284o0000OO = new OooOO0O(0);
        this.f23281o0000O = "NVIDIA".equals(i80.f19996OooO0OO);
        this.f23291o0000o = y40.f25844OooO0OO;
        this.f23296o0000oOO = 1;
        this.f23297o0000oOo = 0;
        this.f23303o000O0O = C1721jn.f20337OooO0Oo;
        this.f23302o000O00O = 0;
        this.f23309o000Oo0 = null;
        this.f23300o000O00 = -1000;
        this.f23305o000O0Oo = -9223372036854775807L;
        this.f23308o000OO0O = -9223372036854775807L;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:1031:0x0789  */
    /* JADX WARN: Removed duplicated region for block: B:562:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:565:0x0080 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:568:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:604:0x00fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean o00O0O(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 2924
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.pb1.o00O0O(java.lang.String):boolean");
    }

    public static List o00Ooo(Context context, o0O o0o, o0OoOo0 o0oooo0, boolean z, boolean z2) {
        List listOooO0O0;
        String str = o0oooo0.f22222OooOOO0;
        if (str == null) {
            return gn0.f19388OooOoO;
        }
        if (i80.f19994OooO00o >= 26 && "video/dolby-vision".equals(str) && !xh0.OooOo0o(context)) {
            String strOooO00o = m81.OooO00o(o0oooo0);
            if (strOooO00o == null) {
                listOooO0O0 = gn0.f19388OooOoO;
            } else {
                o0o.getClass();
                listOooO0O0 = m81.OooO0O0(strOooO00o, z, z2);
            }
            if (!listOooO0O0.isEmpty()) {
                return listOooO0O0;
            }
        }
        return m81.OooO0OO(o0o, o0oooo0, z, z2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int o00o0O(com.google.android.gms.internal.ads.c81 r10, com.google.android.gms.internal.ads.o0OoOo0 r11) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.pb1.o00o0O(com.google.android.gms.internal.ads.c81, com.google.android.gms.internal.ads.o0OoOo0):int");
    }

    public static int o00ooo(c81 c81Var, o0OoOo0 o0oooo0) {
        if (o0oooo0.f22221OooOOO == -1) {
            return o00o0O(c81Var, o0oooo0);
        }
        List list = o0oooo0.f22224OooOOOo;
        int size = list.size();
        int length = 0;
        for (int i = 0; i < size; i++) {
            length += ((byte[]) list.get(i)).length;
        }
        return o0oooo0.f22221OooOOO + length;
    }

    @Override // com.google.android.gms.internal.ads.f81
    public final void OooO(float f, float f2) throws l41, d81 {
        super.OooO(f, f2);
        OooO0OO oooO0OO = this.f23288o0000Oo;
        if (oooO0OO != null) {
            oooO0OO.OooO0oO(f);
        } else {
            this.f23285o0000OO0.OooO0Oo(f);
        }
    }

    @Override // com.google.android.gms.internal.ads.u51
    public final void OooO0O0(int i, Object obj) throws l41, d81 {
        Handler handler;
        OooOOO0 oooOOO0 = this.f23285o0000OO0;
        if (i == 1) {
            Surface surface = obj instanceof Surface ? (Surface) obj : null;
            Surface surface2 = this.f23293o0000o0O;
            o00O0O o00o0o = this.f23307o000OO;
            if (surface2 == surface) {
                if (surface != null) {
                    C1721jn c1721jn = this.f23309o000Oo0;
                    if (c1721jn != null) {
                        o00o0o.OooO00o(c1721jn);
                    }
                    Surface surface3 = this.f23293o0000o0O;
                    if (surface3 == null || !this.f23295o0000oO0 || (handler = o00o0o.f21767OooO00o) == null) {
                        return;
                    }
                    handler.post(new OoooOOO.oOOoOOO0(o00o0o, surface3, SystemClock.elapsedRealtime()));
                    return;
                }
                return;
            }
            this.f23293o0000o0O = surface;
            if (this.f23288o0000Oo == null) {
                OooOo00 oooOo00 = oooOOO0.f16814OooO0O0;
                if (oooOo00.f16844OooO0o0 != surface) {
                    oooOo00.OooO0O0();
                    oooOo00.f16844OooO0o0 = surface;
                    oooOo00.OooO0Oo(true);
                }
                oooOOO0.OooO0o(1);
            }
            this.f23295o0000oO0 = false;
            int i2 = this.f18822OooOoo;
            z71 z71Var = this.f18847Ooooo00;
            if (z71Var != null && this.f23288o0000Oo == null) {
                c81 c81Var = this.f18854OoooooO;
                c81Var.getClass();
                Surface surface4 = this.f23293o0000o0O;
                boolean z = (surface4 != null && surface4.isValid()) || (i80.f19994OooO00o >= 35 && c81Var.f17965OooO0oo) || o00oO0o(c81Var);
                int i3 = i80.f19994OooO00o;
                if (i3 < 23 || !z || this.f23287o0000OOo) {
                    OooOo0O();
                    OooOOo();
                } else {
                    Surface surfaceO00Oo0 = o00Oo0(c81Var);
                    if (i3 >= 23 && surfaceO00Oo0 != null) {
                        z71Var.OooO0OO(surfaceO00Oo0);
                    } else {
                        if (i3 < 35) {
                            throw new IllegalStateException();
                        }
                        z71Var.zzi();
                    }
                }
            }
            if (surface == null) {
                this.f23309o000Oo0 = null;
                OooO0OO oooO0OO = this.f23288o0000Oo;
                if (oooO0OO != null) {
                    OooOO0 oooOO0 = oooO0OO.f16793OooOOO0;
                    oooOO0.getClass();
                    y40.f25844OooO0OO.getClass();
                    oooOO0.f16806OooOO0O = null;
                    return;
                }
                return;
            }
            C1721jn c1721jn2 = this.f23309o000Oo0;
            if (c1721jn2 != null) {
                o00o0o.OooO00o(c1721jn2);
            }
            if (i2 == 2) {
                OooO0OO oooO0OO2 = this.f23288o0000Oo;
                if (oooO0OO2 != null) {
                    oooO0OO2.OooO0Oo(true);
                    return;
                } else {
                    oooOOO0.f16812OooO = true;
                    oooOOO0.f16820OooO0oo = -9223372036854775807L;
                    return;
                }
            }
            return;
        }
        if (i == 7) {
            obj.getClass();
            u41 u41Var = (u41) obj;
            this.o000O0 = u41Var;
            OooO0OO oooO0OO3 = this.f23288o0000Oo;
            if (oooO0OO3 != null) {
                oooO0OO3.f16793OooOOO0.f16796OooO = u41Var;
                return;
            }
            return;
        }
        if (i == 10) {
            obj.getClass();
            int iIntValue = ((Integer) obj).intValue();
            if (this.f23302o000O00O != iIntValue) {
                this.f23302o000O00O = iIntValue;
                return;
            }
            return;
        }
        if (i == 16) {
            obj.getClass();
            this.f23300o000O00 = ((Integer) obj).intValue();
            z71 z71Var2 = this.f18847Ooooo00;
            if (z71Var2 == null || i80.f19994OooO00o < 35) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("importance", Math.max(0, -this.f23300o000O00));
            z71Var2.OooOOO0(bundle);
            return;
        }
        if (i == 4) {
            obj.getClass();
            int iIntValue2 = ((Integer) obj).intValue();
            this.f23296o0000oOO = iIntValue2;
            z71 z71Var3 = this.f18847Ooooo00;
            if (z71Var3 != null) {
                z71Var3.OooOO0(iIntValue2);
                return;
            }
            return;
        }
        if (i == 5) {
            obj.getClass();
            int iIntValue3 = ((Integer) obj).intValue();
            this.f23297o0000oOo = iIntValue3;
            OooO0OO oooO0OO4 = this.f23288o0000Oo;
            if (oooO0OO4 != null) {
                oooO0OO4.OooO0o0(iIntValue3);
                return;
            }
            OooOo00 oooOo002 = oooOOO0.f16814OooO0O0;
            if (oooOo002.f16847OooOO0 == iIntValue3) {
                return;
            }
            oooOo002.f16847OooOO0 = iIntValue3;
            oooOo002.OooO0Oo(true);
            return;
        }
        if (i == 13) {
            obj.getClass();
            List list = (List) obj;
            this.f23292o0000o0 = list;
            OooO0OO oooO0OO5 = this.f23288o0000Oo;
            if (oooO0OO5 != null) {
                oooO0OO5.OooO(list);
                return;
            }
            return;
        }
        if (i != 14) {
            if (i == 11) {
                this.f18844OoooOo0 = (x41) obj;
                return;
            }
            return;
        }
        obj.getClass();
        y40 y40Var = (y40) obj;
        if (y40Var.f25845OooO00o == 0 || y40Var.f25846OooO0O0 == 0) {
            return;
        }
        this.f23291o0000o = y40Var;
        OooO0OO oooO0OO6 = this.f23288o0000Oo;
        if (oooO0OO6 != null) {
            Surface surface5 = this.f23293o0000o0O;
            af0.OooOo0O(surface5);
            oooO0OO6.OooO0o(surface5, y40Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.f81
    public final void OooO0OO() {
        OooO0OO oooO0OO = this.f23288o0000Oo;
        if (oooO0OO == null || !this.f23283o0000O0O) {
            return;
        }
        OooOO0 oooOO0 = oooO0OO.f16793OooOOO0;
        if (oooOO0.f16807OooOOO0 == 2) {
            return;
        }
        m60 m60Var = oooOO0.f16805OooOO0;
        if (m60Var != null) {
            m60Var.f21095OooO00o.removeCallbacksAndMessages(null);
        }
        oooOO0.f16806OooOO0O = null;
        oooOO0.f16807OooOOO0 = 2;
    }

    @Override // com.google.android.gms.internal.ads.f81
    public final void OooO0Oo() {
        try {
            try {
                Oooo0O0();
                OooOo0O();
            } finally {
                this.f18870o0000oo = null;
            }
        } finally {
            this.f23290o0000OoO = false;
            this.f23305o000O0Oo = -9223372036854775807L;
            rb1 rb1Var = this.f23294o0000o0o;
            if (rb1Var != null) {
                rb1Var.release();
                this.f23294o0000o0o = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.f81
    public final void OooO0o() {
        int i = this.f23299o0000ooO;
        o00O0O o00o0o = this.f23307o000OO;
        if (i > 0) {
            this.f18823OooOoo0.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = jElapsedRealtime - this.f23298o0000oo0;
            int i2 = this.f23299o0000ooO;
            Handler handler = o00o0o.f21767OooO00o;
            if (handler != null) {
                handler.post(new Oooo0(o00o0o, i2, j, 0));
            }
            this.f23299o0000ooO = 0;
            this.f23298o0000oo0 = jElapsedRealtime;
        }
        int i3 = this.f23306o000O0o;
        if (i3 != 0) {
            long j2 = this.f23310o000OoO;
            Handler handler2 = o00o0o.f21767OooO00o;
            if (handler2 != null) {
                handler2.post(new Oooo000(o00o0o, j2, i3));
            }
            this.f23310o000OoO = 0L;
            this.f23306o000O0o = 0;
        }
        OooO0OO oooO0OO = this.f23288o0000Oo;
        if (oooO0OO != null) {
            ((OooOOO0) oooO0OO.f16793OooOOO0.f16801OooO0o.f17509OooOo0o).OooO0OO();
        } else {
            this.f23285o0000OO0.OooO0OO();
        }
    }

    @Override // com.google.android.gms.internal.ads.f81
    public final void OooO0o0() {
        this.f23299o0000ooO = 0;
        this.f18823OooOoo0.getClass();
        this.f23298o0000oo0 = SystemClock.elapsedRealtime();
        this.f23310o000OoO = 0L;
        this.f23306o000O0o = 0;
        OooO0OO oooO0OO = this.f23288o0000Oo;
        if (oooO0OO != null) {
            ((OooOOO0) oooO0OO.f16793OooOOO0.f16801OooO0o.f17509OooOo0o).OooO0O0();
        } else {
            this.f23285o0000OO0.OooO0O0();
        }
    }

    @Override // com.google.android.gms.internal.ads.f81
    public final void OooO0oO(o0OoOo0[] o0oooo0Arr, long j, long j2, h91 h91Var) {
        super.OooO0oO(o0oooo0Arr, j, j2, h91Var);
        if (this.f23305o000O0Oo == -9223372036854775807L) {
            this.f23305o000O0Oo = j;
        }
        AbstractC1787lf abstractC1787lf = this.f18832Oooo0OO;
        if (abstractC1787lf.OooOOOO()) {
            this.f23308o000OO0O = -9223372036854775807L;
        } else {
            this.f23308o000OO0O = abstractC1787lf.OooOOO(h91Var.f19657OooO00o, new C1528ee()).f18577OooO0Oo;
        }
    }

    @Override // com.google.android.gms.internal.ads.f81
    public final String OooOO0O() {
        return "MediaCodecVideoRenderer";
    }

    @Override // com.google.android.gms.internal.ads.f81
    public final void OooOO0o(long j, long j2) throws l41 {
        super.OooOO0o(j, j2);
        OooO0OO oooO0OO = this.f23288o0000Oo;
        if (oooO0OO != null) {
            try {
                OooOO0.OooO00o(oooO0OO.f16793OooOOO0, j, j2);
            } catch (o00Ooo e) {
                throw OoooOoo(e, e.f21824OooOo0O, false, 7001);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.f81
    public final boolean OooOOO() {
        boolean zOooOOO = super.OooOOO();
        OooO0OO oooO0OO = this.f23288o0000Oo;
        if (oooO0OO != null) {
            return ((OooOOO0) oooO0OO.f16793OooOOO0.f16801OooO0o.f17509OooOo0o).OooO0o0(false);
        }
        if (zOooOOO && (this.f18847Ooooo00 == null || this.f23293o0000o0O == null)) {
            return true;
        }
        return this.f23285o0000OO0.OooO0o0(zOooOOO);
    }

    @Override // com.google.android.gms.internal.ads.f81
    public final boolean OooOOO0() {
        return this.f18864o00000Oo && this.f23288o0000Oo == null;
    }

    @Override // com.google.android.gms.internal.ads.f81
    public final float OooOOOo(float f, o0OoOo0[] o0oooo0Arr) {
        float fMax = -1.0f;
        for (o0OoOo0 o0oooo0 : o0oooo0Arr) {
            float f2 = o0oooo0.f22230OooOo0O;
            if (f2 != -1.0f) {
                fMax = Math.max(fMax, f2);
            }
        }
        if (fMax == -1.0f) {
            return -1.0f;
        }
        return fMax * f;
    }

    @Override // com.google.android.gms.internal.ads.f81
    public final b81 OooOOo0(IllegalStateException illegalStateException, c81 c81Var) {
        Surface surface = this.f23293o0000o0O;
        ob1 ob1Var = new ob1(illegalStateException, c81Var);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return ob1Var;
    }

    @Override // com.google.android.gms.internal.ads.f81
    public final void OooOOoo(long j) {
        super.OooOOoo(j);
        this.f23301o000O000--;
    }

    @Override // com.google.android.gms.internal.ads.f81
    public final void OooOo0(o0OoOo0 o0oooo0) throws l41 {
        OooO0OO oooO0OO = this.f23288o0000Oo;
        if (oooO0OO == null) {
            return;
        }
        try {
            oooO0OO.OooO0OO(o0oooo0);
            throw null;
        } catch (o00Ooo e) {
            throw OoooOoo(e, o0oooo0, false, 7000);
        }
    }

    @Override // com.google.android.gms.internal.ads.f81
    public final void OooOo00() {
        this.f23301o000O000++;
        int i = i80.f19994OooO00o;
    }

    @Override // com.google.android.gms.internal.ads.f81
    public final void OooOo0o() {
        super.OooOo0o();
        this.f23301o000O000 = 0;
    }

    @Override // com.google.android.gms.internal.ads.f81
    public final boolean OooOoO(c81 c81Var) {
        Surface surface = this.f23293o0000o0O;
        if (surface == null || !surface.isValid()) {
            return (i80.f19994OooO00o >= 35 && c81Var.f17965OooO0oo) || o00oO0o(c81Var);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.f81
    public final boolean OooOoOO(c41 c41Var) {
        if (!c41Var.OooO00o(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) || OooOO0() || c41Var.OooO00o(536870912)) {
            return false;
        }
        long j = this.f23308o000OO0O;
        return j != -9223372036854775807L && j - (c41Var.f17683OooO0oO - this.f18866o00000oO.f18522OooO0OO) > PipesConfigBase.DEFAULT_MAX_FOR_EMIT_BATCH && !c41Var.OooO00o(BasicMeasure.EXACTLY) && c41Var.f17683OooO0oO < this.f18829Oooo00O;
    }

    @Override // com.google.android.gms.internal.ads.f81
    public final void Oooo(c41 c41Var) {
        if (this.f23289o0000Oo0) {
            ByteBuffer byteBuffer = c41Var.f17684OooO0oo;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                byteBuffer.position(0);
                if (b == -75 && s == 60 && s2 == 1 && b2 == 4) {
                    if (b3 == 0 || b3 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        z71 z71Var = this.f18847Ooooo00;
                        z71Var.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        z71Var.OooOOO0(bundle);
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.f81
    public final h41 Oooo0(dx0 dx0Var) throws l41, d81 {
        h41 h41VarOooo0 = super.Oooo0(dx0Var);
        o0OoOo0 o0oooo0 = (o0OoOo0) dx0Var.f18419OooOo0o;
        o0oooo0.getClass();
        o00O0O o00o0o = this.f23307o000OO;
        Handler handler = o00o0o.f21767OooO00o;
        if (handler != null) {
            handler.post(new o000oOoO(o00o0o, o0oooo0, h41VarOooo0, 0));
        }
        return h41VarOooo0;
    }

    @Override // com.google.android.gms.internal.ads.f81
    public final int Oooo00O(o0O o0o, o0OoOo0 o0oooo0) {
        boolean z;
        if (!AbstractC1813m4.OooO0oO(o0oooo0.f22222OooOOO0)) {
            return 128;
        }
        int i = 0;
        boolean z2 = o0oooo0.f22226OooOOo0 != null;
        Context context = this.f23282o0000O0;
        List listO00Ooo = o00Ooo(context, o0o, o0oooo0, z2, false);
        if (z2 && listO00Ooo.isEmpty()) {
            listO00Ooo = o00Ooo(context, o0o, o0oooo0, false, false);
        }
        if (listO00Ooo.isEmpty()) {
            return 129;
        }
        if (o0oooo0.f22239Oooo0 != 0) {
            return 130;
        }
        c81 c81Var = (c81) listO00Ooo.get(0);
        boolean zOooO0OO = c81Var.OooO0OO(o0oooo0);
        if (zOooO0OO) {
            z = true;
        } else {
            for (int i2 = 1; i2 < listO00Ooo.size(); i2++) {
                c81 c81Var2 = (c81) listO00Ooo.get(i2);
                if (c81Var2.OooO0OO(o0oooo0)) {
                    zOooO0OO = true;
                    z = false;
                    c81Var = c81Var2;
                    break;
                }
            }
            z = true;
        }
        int i3 = true != zOooO0OO ? 3 : 4;
        int i4 = true != c81Var.OooO0Oo(o0oooo0) ? 8 : 16;
        int i5 = true != c81Var.f17964OooO0oO ? 0 : 64;
        int i6 = true != z ? 0 : 128;
        if (i80.f19994OooO00o >= 26 && "video/dolby-vision".equals(o0oooo0.f22222OooOOO0) && !xh0.OooOo0o(context)) {
            i6 = 256;
        }
        if (zOooO0OO) {
            List listO00Ooo2 = o00Ooo(context, o0o, o0oooo0, z2, true);
            if (!listO00Ooo2.isEmpty()) {
                HashMap map = m81.f21145OooO00o;
                ArrayList arrayList = new ArrayList(listO00Ooo2);
                Collections.sort(arrayList, new g81(new ni0(o0oooo0, 10)));
                c81 c81Var3 = (c81) arrayList.get(0);
                if (c81Var3.OooO0OO(o0oooo0) && c81Var3.OooO0Oo(o0oooo0)) {
                    i = 32;
                }
            }
        }
        return i3 | i4 | i | i5 | i6;
    }

    @Override // com.google.android.gms.internal.ads.f81
    public final h41 Oooo00o(c81 c81Var, o0OoOo0 o0oooo0, o0OoOo0 o0oooo02) {
        int i;
        int i2;
        h41 h41VarOooO00o = c81Var.OooO00o(o0oooo0, o0oooo02);
        Oooo0oO.o0O0O00 o0o0o00 = this.f23286o0000OOO;
        o0o0o00.getClass();
        int i3 = o0oooo02.f22229OooOo00;
        int i4 = o0o0o00.f13885OooO00o;
        int i5 = h41VarOooO00o.f19552OooO0o0;
        if (i3 > i4 || o0oooo02.OooOo0 > o0o0o00.f13886OooO0O0) {
            i5 |= 256;
        }
        if (o00ooo(c81Var, o0oooo02) > o0o0o00.f13887OooO0OO) {
            i5 |= 64;
        }
        if (i5 != 0) {
            i = 0;
            i2 = i5;
        } else {
            i = h41VarOooO00o.f19551OooO0Oo;
            i2 = 0;
        }
        return new h41(c81Var.f17958OooO00o, o0oooo0, o0oooo02, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.f81
    public final ArrayList Oooo0o(o0O o0o, o0OoOo0 o0oooo0) {
        List listO00Ooo = o00Ooo(this.f23282o0000O0, o0o, o0oooo0, false, false);
        HashMap map = m81.f21145OooO00o;
        ArrayList arrayList = new ArrayList(listO00Ooo);
        Collections.sort(arrayList, new g81(new ni0(o0oooo0, 10)));
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:155:0x00dc, code lost:
    
        r1 = null;
     */
    @Override // com.google.android.gms.internal.ads.f81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final OooOOo0.o0OOO0o Oooo0o0(com.google.android.gms.internal.ads.c81 r25, com.google.android.gms.internal.ads.o0OoOo0 r26, float r27) {
        /*
            Method dump skipped, instructions count: 587
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.pb1.Oooo0o0(com.google.android.gms.internal.ads.c81, com.google.android.gms.internal.ads.o0OoOo0, float):OooOOo0.o0OOO0o");
    }

    @Override // com.google.android.gms.internal.ads.f81
    public final void OoooO(o0OoOo0 o0oooo0, MediaFormat mediaFormat) {
        z71 z71Var = this.f18847Ooooo00;
        if (z71Var != null) {
            z71Var.OooOO0(this.f23296o0000oOO);
        }
        mediaFormat.getClass();
        boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        int integer = z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
        int integer2 = z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        float integer3 = o0oooo0.f22228OooOo;
        if (i80.f19994OooO00o >= 30 && mediaFormat.containsKey("sar-width") && mediaFormat.containsKey("sar-height")) {
            integer3 = mediaFormat.getInteger("sar-width") / mediaFormat.getInteger("sar-height");
        }
        int i = o0oooo0.f22231OooOo0o;
        if (i == 90 || i == 270) {
            integer3 = 1.0f / integer3;
            int i2 = integer2;
            integer2 = integer;
            integer = i2;
        }
        this.f23303o000O0O = new C1721jn(integer, integer2, integer3);
        OooO0OO oooO0OO = this.f23288o0000Oo;
        if (oooO0OO == null || !this.f23304o000O0O0) {
            OooOOO0 oooOOO0 = this.f23285o0000OO0;
            float f = o0oooo0.f22230OooOo0O;
            OooOo00 oooOo00 = oooOOO0.f16814OooO0O0;
            oooOo00.f16843OooO0o = f;
            nb1 nb1Var = oooOo00.f16839OooO00o;
            nb1Var.f21464OooO00o.OooO0O0();
            nb1Var.f21465OooO0O0.OooO0O0();
            nb1Var.f21466OooO0OO = false;
            nb1Var.f21467OooO0Oo = -9223372036854775807L;
            nb1Var.f21468OooO0o0 = 0;
            oooOo00.OooO0OO();
        } else {
            jb1 jb1Var = new jb1(o0oooo0);
            jb1Var.f20257OooOOoo = integer;
            jb1Var.f20259OooOo00 = integer2;
            jb1Var.f20261OooOo0o = integer3;
            o0OoOo0 o0oooo02 = new o0OoOo0(jb1Var);
            af0.OooooO0(false);
            oooO0OO.f16785OooO0OO = o0oooo02;
            if (oooO0OO.f16790OooO0oo) {
                af0.OooooO0(oooO0OO.f16789OooO0oO != -9223372036854775807L);
                oooO0OO.f16782OooO = true;
                oooO0OO.f16791OooOO0 = oooO0OO.f16789OooO0oO;
            } else {
                oooO0OO.OooO00o();
                oooO0OO.f16790OooO0oo = true;
                oooO0OO.f16782OooO = false;
                oooO0OO.f16791OooOO0 = -9223372036854775807L;
            }
        }
        this.f23304o000O0O0 = false;
    }

    @Override // com.google.android.gms.internal.ads.f81
    public final void OoooO0(long j, long j2, String str) {
        String str2;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        o00O0O o00o0o = this.f23307o000OO;
        Handler handler = o00o0o.f21767OooO00o;
        if (handler != null) {
            str2 = str;
            handler.post(new Oooo000(o00o0o, str2, j, j2));
        } else {
            str2 = str;
        }
        this.f23287o0000OOo = o00O0O(str2);
        c81 c81Var = this.f18854OoooooO;
        c81Var.getClass();
        boolean z = false;
        if (i80.f19994OooO00o >= 29 && "video/x-vnd.on2.vp9".equals(c81Var.f17959OooO0O0)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = c81Var.f17961OooO0Oo;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            int length = codecProfileLevelArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (codecProfileLevelArr[i].profile == 16384) {
                    z = true;
                    break;
                }
                i++;
            }
        }
        this.f23289o0000Oo0 = z;
    }

    @Override // com.google.android.gms.internal.ads.f81
    public final void OoooO00(Exception exc) {
        AbstractC1641hg.OooOOO0("MediaCodecVideoRenderer", "Video codec error", exc);
        o00O0O o00o0o = this.f23307o000OO;
        Handler handler = o00o0o.f21767OooO00o;
        if (handler != null) {
            handler.post(new Oooo000(o00o0o, exc, 2));
        }
    }

    @Override // com.google.android.gms.internal.ads.f81
    public final void OoooO0O(String str) {
        o00O0O o00o0o = this.f23307o000OO;
        Handler handler = o00o0o.f21767OooO00o;
        if (handler != null) {
            handler.post(new Oooo000(o00o0o, str, 4));
        }
    }

    @Override // com.google.android.gms.internal.ads.f81
    public final void OoooOO0() {
        OooO0OO oooO0OO = this.f23288o0000Oo;
        if (oooO0OO != null) {
            e81 e81Var = this.f18866o00000oO;
            oooO0OO.OooO0oo(e81Var.f18521OooO0O0, e81Var.f18522OooO0OO, -this.f23305o000O0Oo, this.f18829Oooo00O);
        } else {
            this.f23285o0000OO0.OooO0o(2);
        }
        this.f23304o000O0O0 = true;
    }

    @Override // com.google.android.gms.internal.ads.f81
    public final boolean OoooOOO(long j, long j2, z71 z71Var, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, o0OoOo0 o0oooo0) throws l41, d81 {
        z71Var.getClass();
        e81 e81Var = this.f18866o00000oO;
        long j4 = j3 - e81Var.f18522OooO0OO;
        OooO0OO oooO0OO = this.f23288o0000Oo;
        if (oooO0OO != null) {
            try {
                return oooO0OO.OooOO0(j3 + (-this.f23305o000O0Oo), z2, j, j2, new oOo0o00(this, z71Var, i, j4));
            } catch (o00Ooo e) {
                throw OoooOoo(e, e.f21824OooOo0O, false, 7001);
            }
        }
        int iOooO00o = this.f23285o0000OO0.OooO00o(j3, j, j2, e81Var.f18521OooO0O0, z2, this.f23284o0000OO);
        if (iOooO00o != 4) {
            if (z && !z2) {
                Ooooooo(z71Var, i);
                return true;
            }
            Surface surface = this.f23293o0000o0O;
            OooOO0O oooOO0O = this.f23284o0000OO;
            if (surface == null) {
                if (oooOO0O.f16808OooO00o < WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) {
                    Ooooooo(z71Var, i);
                    ooOO(oooOO0O.f16808OooO00o);
                    return true;
                }
            } else {
                if (iOooO00o == 0) {
                    this.f18823OooOoo0.getClass();
                    oo000o(z71Var, i, System.nanoTime());
                    ooOO(oooOO0O.f16808OooO00o);
                    return true;
                }
                if (iOooO00o == 1) {
                    long j5 = oooOO0O.f16809OooO0O0;
                    long j6 = oooOO0O.f16808OooO00o;
                    if (j5 == this.f23311o000Ooo) {
                        Ooooooo(z71Var, i);
                    } else {
                        oo000o(z71Var, i, j5);
                    }
                    ooOO(j6);
                    this.f23311o000Ooo = j5;
                    return true;
                }
                if (iOooO00o == 2) {
                    Trace.beginSection("dropVideoBuffer");
                    z71Var.OooOO0o(i);
                    Trace.endSection();
                    o0OoOo0(0, 1);
                    ooOO(oooOO0O.f16808OooO00o);
                    return true;
                }
                if (iOooO00o == 3) {
                    Ooooooo(z71Var, i);
                    ooOO(oooOO0O.f16808OooO00o);
                    return true;
                }
                if (iOooO00o != 5) {
                    throw new IllegalStateException(String.valueOf(iOooO00o));
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.f81
    public final void OoooOo0() {
        int i = i80.f19994OooO00o;
    }

    @Override // com.google.android.gms.internal.ads.f81
    public final void OooooOo() {
        OooO0OO oooO0OO = this.f23288o0000Oo;
        if (oooO0OO != null) {
            OooOOO0 oooOOO0 = (OooOOO0) oooO0OO.f16793OooOOO0.f16801OooO0o.f17509OooOo0o;
            if (oooOOO0.f16816OooO0Oo == 0) {
                oooOOO0.f16816OooO0Oo = 1;
                return;
            }
            return;
        }
        OooOOO0 oooOOO02 = this.f23285o0000OO0;
        if (oooOOO02.f16816OooO0Oo == 0) {
            oooOOO02.f16816OooO0Oo = 1;
        }
    }

    @Override // com.google.android.gms.internal.ads.f81
    public final void Oooooo(boolean z, boolean z2) {
        this.f18869o0000Ooo = new g41();
        OooooO0();
        g41 g41Var = this.f18869o0000Ooo;
        o00O0O o00o0o = this.f23307o000OO;
        Handler handler = o00o0o.f21767OooO00o;
        if (handler != null) {
            handler.post(new Oooo000(o00o0o, g41Var, 3));
        }
        boolean z3 = this.f23290o0000OoO;
        OooOOO0 oooOOO0 = this.f23285o0000OO0;
        if (!z3) {
            if (this.f23292o0000o0 != null && this.f23288o0000Oo == null) {
                OooO0oO.o0OoOo0 o0oooo0 = new OooO0oO.o0OoOo0(this.f23282o0000O0, oooOOO0);
                k50 k50Var = this.f18823OooOoo0;
                k50Var.getClass();
                o0oooo0.f13298OooO0oO = k50Var;
                af0.OooooO0(!o0oooo0.f13293OooO0O0);
                if (((OooO) o0oooo0.f13297OooO0o0) == null) {
                    if (((OooO0o) o0oooo0.f13295OooO0Oo) == null) {
                        o0oooo0.f13295OooO0Oo = new OooO0o();
                    }
                    o0oooo0.f13297OooO0o0 = new OooO((OooO0o) o0oooo0.f13295OooO0Oo);
                }
                OooOO0 oooOO0 = new OooOO0(o0oooo0);
                o0oooo0.f13293OooO0O0 = true;
                this.f23288o0000Oo = oooOO0.f16797OooO00o;
            }
            this.f23290o0000OoO = true;
        }
        OooO0OO oooO0OO = this.f23288o0000Oo;
        if (oooO0OO == null) {
            k50 k50Var2 = this.f18823OooOoo0;
            k50Var2.getClass();
            oooOOO0.f16822OooOO0O = k50Var2;
            oooOOO0.f16816OooO0Oo = z2 ? 1 : 0;
            return;
        }
        pd0 pd0Var = new pd0(this, 13);
        qp0 qp0Var = qp0.f23673OooOo0O;
        oooO0OO.f16792OooOO0O = pd0Var;
        oooO0OO.OooOO0o = qp0Var;
        u41 u41Var = this.o000O0;
        if (u41Var != null) {
            oooO0OO.f16793OooOOO0.f16796OooO = u41Var;
        }
        if (this.f23293o0000o0O != null && !this.f23291o0000o.equals(y40.f25844OooO0OO)) {
            this.f23288o0000Oo.OooO0o(this.f23293o0000o0O, this.f23291o0000o);
        }
        this.f23288o0000Oo.OooO0o0(this.f23297o0000oOo);
        this.f23288o0000Oo.OooO0oO(this.f18845OoooOoO);
        List list = this.f23292o0000o0;
        if (list != null) {
            this.f23288o0000Oo.OooO(list);
        }
        ((OooOOO0) this.f23288o0000Oo.f16793OooOOO0.f16801OooO0o.f17509OooOo0o).f16816OooO0Oo = z2 ? 1 : 0;
    }

    @Override // com.google.android.gms.internal.ads.f81
    public final void Oooooo0() {
        o00O0O o00o0o = this.f23307o000OO;
        this.f23309o000Oo0 = null;
        this.f23308o000OO0O = -9223372036854775807L;
        OooO0OO oooO0OO = this.f23288o0000Oo;
        if (oooO0OO != null) {
            ((OooOOO0) oooO0OO.f16793OooOOO0.f16801OooO0o.f17509OooOo0o).OooO0o(0);
        } else {
            this.f23285o0000OO0.OooO0o(0);
        }
        this.f23295o0000oO0 = false;
        try {
            super.Oooooo0();
            g41 g41Var = this.f18869o0000Ooo;
            o00o0o.getClass();
            synchronized (g41Var) {
            }
            Handler handler = o00o0o.f21767OooO00o;
            if (handler != null) {
                handler.post(new wp0(2, o00o0o, g41Var));
            }
            o00o0o.OooO00o(C1721jn.f20337OooO0Oo);
        } catch (Throwable th) {
            g41 g41Var2 = this.f18869o0000Ooo;
            o00o0o.getClass();
            synchronized (g41Var2) {
                Handler handler2 = o00o0o.f21767OooO00o;
                if (handler2 != null) {
                    handler2.post(new wp0(2, o00o0o, g41Var2));
                }
                o00o0o.OooO00o(C1721jn.f20337OooO0Oo);
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.f81
    public final void OoooooO(long j, boolean z) throws l41, d81 {
        OooO0OO oooO0OO = this.f23288o0000Oo;
        if (oooO0OO != null) {
            oooO0OO.OooO0O0(true);
            OooO0OO oooO0OO2 = this.f23288o0000Oo;
            e81 e81Var = this.f18866o00000oO;
            oooO0OO2.OooO0oo(e81Var.f18521OooO0O0, e81Var.f18522OooO0OO, -this.f23305o000O0Oo, this.f18829Oooo00O);
            this.f23304o000O0O0 = true;
        }
        super.OoooooO(j, z);
        OooO0OO oooO0OO3 = this.f23288o0000Oo;
        OooOOO0 oooOOO0 = this.f23285o0000OO0;
        if (oooO0OO3 == null) {
            OooOo00 oooOo00 = oooOOO0.f16814OooO0O0;
            oooOo00.f16850OooOOO0 = 0L;
            oooOo00.f16852OooOOOo = -1L;
            oooOo00.f16849OooOOO = -1L;
            oooOOO0.f16819OooO0oO = -9223372036854775807L;
            oooOOO0.f16818OooO0o0 = -9223372036854775807L;
            oooOOO0.OooO0o(1);
            oooOOO0.f16820OooO0oo = -9223372036854775807L;
        }
        if (z) {
            OooO0OO oooO0OO4 = this.f23288o0000Oo;
            if (oooO0OO4 != null) {
                oooO0OO4.OooO0Oo(false);
            } else {
                oooOOO0.f16812OooO = false;
                oooOOO0.f16820OooO0oo = -9223372036854775807L;
            }
        }
        this.f23280o000 = 0;
    }

    public final void Ooooooo(z71 z71Var, int i) {
        Trace.beginSection("skipVideoBuffer");
        z71Var.OooOO0o(i);
        Trace.endSection();
        this.f18869o0000Ooo.f19233OooO0o++;
    }

    public final Surface o00Oo0(c81 c81Var) {
        if (this.f23288o0000Oo != null) {
            af0.OooooO0(false);
            af0.OooOo0O(null);
            throw null;
        }
        Surface surface = this.f23293o0000o0O;
        if (surface != null) {
            return surface;
        }
        if (i80.f19994OooO00o >= 35 && c81Var.f17965OooO0oo) {
            return null;
        }
        af0.OooooO0(o00oO0o(c81Var));
        rb1 rb1Var = this.f23294o0000o0o;
        if (rb1Var != null) {
            if (rb1Var.zza != c81Var.f17962OooO0o && rb1Var != null) {
                rb1Var.release();
                this.f23294o0000o0o = null;
            }
        }
        if (this.f23294o0000o0o == null) {
            this.f23294o0000o0o = rb1.OooO00o(this.f23282o0000O0, c81Var.f17962OooO0o);
        }
        return this.f23294o0000o0o;
    }

    public final boolean o00oO0o(c81 c81Var) {
        if (i80.f19994OooO00o < 23 || o00O0O(c81Var.f17958OooO00o)) {
            return false;
        }
        return !c81Var.f17962OooO0o || rb1.OooO0O0(this.f23282o0000O0);
    }

    public final void o0OoOo0(int i, int i2) {
        g41 g41Var = this.f18869o0000Ooo;
        g41Var.f19236OooO0oo += i;
        int i3 = i + i2;
        g41Var.f19235OooO0oO += i3;
        this.f23299o0000ooO += i3;
        int i4 = this.f23280o000 + i3;
        this.f23280o000 = i4;
        g41Var.f19228OooO = Math.max(i4, g41Var.f19228OooO);
    }

    public final void oo000o(z71 z71Var, int i, long j) {
        Surface surface;
        Trace.beginSection("releaseOutputBuffer");
        z71Var.OooO0oo(i, j);
        Trace.endSection();
        this.f18869o0000Ooo.f19234OooO0o0++;
        this.f23280o000 = 0;
        if (this.f23288o0000Oo == null) {
            C1721jn c1721jn = this.f23303o000O0O;
            boolean zEquals = c1721jn.equals(C1721jn.f20337OooO0Oo);
            o00O0O o00o0o = this.f23307o000OO;
            if (!zEquals && !c1721jn.equals(this.f23309o000Oo0)) {
                this.f23309o000Oo0 = c1721jn;
                o00o0o.OooO00o(c1721jn);
            }
            OooOOO0 oooOOO0 = this.f23285o0000OO0;
            int i2 = oooOOO0.f16816OooO0Oo;
            oooOOO0.f16816OooO0Oo = 3;
            oooOOO0.f16822OooOO0O.getClass();
            oooOOO0.f16817OooO0o = i80.OooOOoo(SystemClock.elapsedRealtime());
            if (i2 == 3 || (surface = this.f23293o0000o0O) == null) {
                return;
            }
            Handler handler = o00o0o.f21767OooO00o;
            if (handler != null) {
                handler.post(new OoooOOO.oOOoOOO0(o00o0o, surface, SystemClock.elapsedRealtime()));
            }
            this.f23295o0000oO0 = true;
        }
    }

    public final void ooOO(long j) {
        g41 g41Var = this.f18869o0000Ooo;
        g41Var.f19238OooOO0O += j;
        g41Var.OooOO0o++;
        this.f23310o000OoO += j;
        this.f23306o000O0o++;
    }
}
