package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* loaded from: classes2.dex */
public final class OooOOO0 {

    /* renamed from: OooO */
    public boolean f16812OooO;

    /* renamed from: OooO00o */
    public final pb1 f16813OooO00o;

    /* renamed from: OooO0O0 */
    public final OooOo00 f16814OooO0O0;

    /* renamed from: OooO0OO */
    public boolean f16815OooO0OO;

    /* renamed from: OooO0o */
    public long f16817OooO0o;

    /* renamed from: OooO0Oo */
    public int f16816OooO0Oo = 0;

    /* renamed from: OooO0o0 */
    public long f16818OooO0o0 = -9223372036854775807L;

    /* renamed from: OooO0oO */
    public long f16819OooO0oO = -9223372036854775807L;

    /* renamed from: OooO0oo */
    public long f16820OooO0oo = -9223372036854775807L;

    /* renamed from: OooOO0 */
    public float f16821OooOO0 = 1.0f;

    /* renamed from: OooOO0O */
    public k50 f16822OooOO0O = k50.f20453OooO00o;

    public OooOOO0(Context context, pb1 pb1Var) {
        this.f16813OooO00o = pb1Var;
        this.f16814OooO0O0 = new OooOo00(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:199:0x0116, code lost:
    
        if (r12 > org.apache.tika.pipes.PipesConfigBase.DEFAULT_MAX_FOR_EMIT_BATCH) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x0122, code lost:
    
        if (r29 >= r33) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0128, code lost:
    
        if (r26.f16815OooO0OO != false) goto L208;
     */
    /* JADX WARN: Removed duplicated region for block: B:177:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int OooO00o(long r27, long r29, long r31, long r33, boolean r35, com.google.android.gms.internal.ads.OooOO0O r36) throws com.google.android.gms.internal.ads.l41, com.google.android.gms.internal.ads.d81 {
        /*
            Method dump skipped, instructions count: 609
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.OooOOO0.OooO00o(long, long, long, long, boolean, com.google.android.gms.internal.ads.OooOO0O):int");
    }

    public final void OooO0O0() {
        this.f16815OooO0OO = true;
        this.f16822OooOO0O.getClass();
        this.f16817OooO0o = i80.OooOOoo(SystemClock.elapsedRealtime());
        OooOo00 oooOo00 = this.f16814OooO0O0;
        oooOo00.f16842OooO0Oo = true;
        oooOo00.f16850OooOOO0 = 0L;
        oooOo00.f16852OooOOOo = -1L;
        oooOo00.f16849OooOOO = -1L;
        OooOOO oooOOO = oooOo00.f16840OooO0O0;
        if (oooOOO != null) {
            OooOOOO oooOOOO = oooOo00.f16841OooO0OO;
            oooOOOO.getClass();
            oooOOOO.f16826OooOo0o.sendEmptyMessage(2);
            Looper looperMyLooper = Looper.myLooper();
            af0.OooOo0O(looperMyLooper);
            Handler handler = new Handler(looperMyLooper, null);
            DisplayManager displayManager = oooOOO.f16810OooO00o;
            displayManager.registerDisplayListener(oooOOO, handler);
            OooOo00.OooO00o(oooOOO.f16811OooO0O0, displayManager.getDisplay(0));
        }
        oooOo00.OooO0Oo(false);
    }

    public final void OooO0OO() {
        this.f16815OooO0OO = false;
        this.f16820OooO0oo = -9223372036854775807L;
        OooOo00 oooOo00 = this.f16814OooO0O0;
        oooOo00.f16842OooO0Oo = false;
        OooOOO oooOOO = oooOo00.f16840OooO0O0;
        if (oooOOO != null) {
            oooOOO.f16810OooO00o.unregisterDisplayListener(oooOOO);
            OooOOOO oooOOOO = oooOo00.f16841OooO0OO;
            oooOOOO.getClass();
            oooOOOO.f16826OooOo0o.sendEmptyMessage(3);
        }
        oooOo00.OooO0O0();
    }

    public final void OooO0Oo(float f) {
        af0.OoooO0(f > 0.0f);
        if (f == this.f16821OooOO0) {
            return;
        }
        this.f16821OooOO0 = f;
        OooOo00 oooOo00 = this.f16814OooO0O0;
        oooOo00.f16838OooO = f;
        oooOo00.f16850OooOOO0 = 0L;
        oooOo00.f16852OooOOOo = -1L;
        oooOo00.f16849OooOOO = -1L;
        oooOo00.OooO0Oo(false);
    }

    public final void OooO0o(int i) {
        this.f16816OooO0Oo = Math.min(this.f16816OooO0Oo, i);
    }

    public final boolean OooO0o0(boolean z) {
        boolean z2 = true;
        if (z && this.f16816OooO0Oo == 3) {
            this.f16820OooO0oo = -9223372036854775807L;
        } else {
            if (this.f16820OooO0oo == -9223372036854775807L) {
                return false;
            }
            this.f16822OooOO0O.getClass();
            if (SystemClock.elapsedRealtime() >= this.f16820OooO0oo) {
                z2 = false;
                this.f16820OooO0oo = -9223372036854775807L;
            }
        }
        return z2;
    }
}
