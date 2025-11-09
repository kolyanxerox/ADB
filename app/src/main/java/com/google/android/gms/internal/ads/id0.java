package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;

/* loaded from: classes2.dex */
public final class id0 extends AbstractBinderC2181w2 implements InterfaceC1570fj {

    /* renamed from: OooOo */
    public final sd0 f20022OooOo;

    /* renamed from: OooOo0O */
    public final fd0 f20023OooOo0O;

    /* renamed from: OooOo0o */
    public final bd0 f20024OooOo0o;

    /* renamed from: OooOoO */
    public boolean f20025OooOoO;

    /* renamed from: OooOoO0 */
    public f10 f20026OooOoO0;

    public id0(fd0 fd0Var, bd0 bd0Var, sd0 sd0Var) {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
        this.f20025OooOoO = false;
        this.f20023OooOo0O = fd0Var;
        this.f20024OooOo0o = bd0Var;
        this.f20022OooOo = sd0Var;
    }

    public final synchronized void Oooo00O(Oooo0o.OooO0O0 oooO0O0) {
        Oooo00O.o000000O.OooO0Oo("pause must be called on the main UI thread.");
        if (this.f20026OooOoO0 != null) {
            Context context = oooO0O0 == null ? null : (Context) Oooo0o.OooO0OO.o000O0oO(oooO0O0);
            C1472cv c1472cv = this.f20026OooOoO0.f17101OooO0OO;
            c1472cv.getClass();
            c1472cv.o0000Ooo(new C2111u6(context, false));
        }
    }

    public final synchronized void o000O0O0(Oooo0o.OooO0O0 oooO0O0) {
        try {
            Oooo00O.o000000O.OooO0Oo("showAd must be called on the main UI thread.");
            if (this.f20026OooOoO0 != null) {
                Activity activity = null;
                if (oooO0O0 != null) {
                    Object objO000O0oO = Oooo0o.OooO0OO.o000O0oO(oooO0O0);
                    if (objO000O0oO instanceof Activity) {
                        activity = (Activity) objO000O0oO;
                    }
                }
                this.f20026OooOoO0.OooO0O0(activity, this.f20025OooOoO);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean o000O0o0() {
        f10 f10Var = this.f20026OooOoO0;
        if (f10Var != null) {
            if (!f10Var.f18751OooOOOo.f20950OooOo0o.get()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0215 A[Catch: all -> 0x0209, TryCatch #2 {, blocks: (B:315:0x01ea, B:319:0x0202, B:325:0x020c, B:326:0x0215, B:328:0x021b, B:332:0x022f), top: B:342:0x01ea, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:330:0x022d A[DONT_GENERATE] */
    /* JADX WARN: Type inference failed for: r1v6, types: [com.google.android.gms.internal.ads.ij] */
    @Override // com.google.android.gms.internal.ads.AbstractBinderC2181w2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean o000OO0O(int r6, android.os.Parcel r7, android.os.Parcel r8) {
        /*
            Method dump skipped, instructions count: 636
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.id0.o000OO0O(int, android.os.Parcel, android.os.Parcel):boolean");
    }

    public final synchronized void o000OoO(Oooo0o.OooO0O0 oooO0O0) {
        Oooo00O.o000000O.OooO0Oo("destroy must be called on the main UI thread.");
        Context context = null;
        this.f20024OooOo0o.f17480OooOo0o.set(null);
        if (this.f20026OooOoO0 != null) {
            if (oooO0O0 != null) {
                context = (Context) Oooo0o.OooO0OO.o000O0oO(oooO0O0);
            }
            C1472cv c1472cv = this.f20026OooOoO0.f17101OooO0OO;
            c1472cv.getClass();
            c1472cv.o0000Ooo(new C2150v8(context));
        }
    }

    public final synchronized void zzk(Oooo0o.OooO0O0 oooO0O0) {
        Oooo00O.o000000O.OooO0Oo("resume must be called on the main UI thread.");
        if (this.f20026OooOoO0 != null) {
            Context context = oooO0O0 == null ? null : (Context) Oooo0o.OooO0OO.o000O0oO(oooO0O0);
            C1472cv c1472cv = this.f20026OooOoO0.f17101OooO0OO;
            c1472cv.getClass();
            c1472cv.o0000Ooo(new C1412b7(context));
        }
    }
}
