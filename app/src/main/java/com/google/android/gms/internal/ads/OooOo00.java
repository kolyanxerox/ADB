package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import android.view.Surface;
import com.ironsource.C3034d9;

/* loaded from: classes2.dex */
public final class OooOo00 {

    /* renamed from: OooO, reason: collision with root package name */
    public float f16838OooO;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final nb1 f16839OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final OooOOO f16840OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final OooOOOO f16841OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f16842OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public float f16843OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public Surface f16844OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public float f16845OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public float f16846OooO0oo;

    /* renamed from: OooOO0, reason: collision with root package name */
    public int f16847OooOO0;

    /* renamed from: OooOO0O, reason: collision with root package name */
    public long f16848OooOO0O;
    public long OooOO0o;

    /* renamed from: OooOOO, reason: collision with root package name */
    public long f16849OooOOO;

    /* renamed from: OooOOO0, reason: collision with root package name */
    public long f16850OooOOO0;

    /* renamed from: OooOOOO, reason: collision with root package name */
    public long f16851OooOOOO;

    /* renamed from: OooOOOo, reason: collision with root package name */
    public long f16852OooOOOo;

    /* renamed from: OooOOo0, reason: collision with root package name */
    public long f16853OooOOo0;

    public OooOo00(Context context) {
        DisplayManager displayManager;
        nb1 nb1Var = new nb1();
        nb1Var.f21464OooO00o = new mb1();
        nb1Var.f21465OooO0O0 = new mb1();
        nb1Var.f21467OooO0Oo = -9223372036854775807L;
        this.f16839OooO00o = nb1Var;
        OooOOO oooOOO = (context == null || (displayManager = (DisplayManager) context.getSystemService(C3034d9.h.f8099d)) == null) ? null : new OooOOO(this, displayManager);
        this.f16840OooO0O0 = oooOOO;
        this.f16841OooO0OO = oooOOO != null ? OooOOOO.f16823OooOoO : null;
        this.f16848OooOO0O = -9223372036854775807L;
        this.OooOO0o = -9223372036854775807L;
        this.f16843OooO0o = -1.0f;
        this.f16838OooO = 1.0f;
        this.f16847OooOO0 = 0;
    }

    public static /* bridge */ /* synthetic */ void OooO00o(OooOo00 oooOo00, Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            oooOo00.f16848OooOO0O = refreshRate;
            oooOo00.OooOO0o = (refreshRate * 80) / 100;
        } else {
            AbstractC1641hg.OooOOo0("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            oooOo00.f16848OooOO0O = -9223372036854775807L;
            oooOo00.OooOO0o = -9223372036854775807L;
        }
    }

    public final void OooO0O0() {
        Surface surface;
        if (i80.f19994OooO00o < 30 || (surface = this.f16844OooO0o0) == null || this.f16847OooOO0 == Integer.MIN_VALUE || this.f16846OooO0oo == 0.0f) {
            return;
        }
        this.f16846OooO0oo = 0.0f;
        ze0.OooOO0O(surface, 0.0f);
    }

    public final void OooO0OO() {
        float f;
        if (i80.f19994OooO00o < 30 || this.f16844OooO0o0 == null) {
            return;
        }
        nb1 nb1Var = this.f16839OooO00o;
        if (!nb1Var.f21464OooO00o.OooO0OO()) {
            f = this.f16843OooO0o;
        } else if (nb1Var.f21464OooO00o.OooO0OO()) {
            f = (float) (1.0E9d / (nb1Var.f21464OooO00o.f21192OooO0o0 != 0 ? r2.f21191OooO0o / r4 : 0L));
        } else {
            f = -1.0f;
        }
        float f2 = this.f16845OooO0oO;
        if (f != f2) {
            if (f != -1.0f && f2 != -1.0f) {
                float f3 = 1.0f;
                if (nb1Var.f21464OooO00o.OooO0OO()) {
                    if ((nb1Var.f21464OooO00o.OooO0OO() ? nb1Var.f21464OooO00o.f21191OooO0o : -9223372036854775807L) >= 5000000000L) {
                        f3 = 0.02f;
                    }
                }
                if (Math.abs(f - this.f16845OooO0oO) < f3) {
                    return;
                }
            } else if (f == -1.0f && nb1Var.f21468OooO0o0 < 30) {
                return;
            }
            this.f16845OooO0oO = f;
            OooO0Oo(false);
        }
    }

    public final void OooO0Oo(boolean z) {
        Surface surface;
        if (i80.f19994OooO00o < 30 || (surface = this.f16844OooO0o0) == null || this.f16847OooOO0 == Integer.MIN_VALUE) {
            return;
        }
        float f = 0.0f;
        if (this.f16842OooO0Oo) {
            float f2 = this.f16845OooO0oO;
            if (f2 != -1.0f) {
                f = this.f16838OooO * f2;
            }
        }
        if (z || this.f16846OooO0oo != f) {
            this.f16846OooO0oo = f;
            ze0.OooOO0O(surface, f);
        }
    }
}
