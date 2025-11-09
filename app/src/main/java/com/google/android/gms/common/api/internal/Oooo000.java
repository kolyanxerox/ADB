package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.google.android.gms.internal.ads.C1514e0;
import com.google.android.gms.internal.ads.C1548ey;
import com.google.android.gms.internal.ads.C1831mm;
import com.google.android.gms.internal.ads.C1853n7;
import com.google.android.gms.internal.ads.C2143v1;
import com.google.android.gms.internal.ads.TextureViewSurfaceTextureListenerC1647hm;
import com.google.android.gms.internal.ads.TextureViewSurfaceTextureListenerC2312zm;
import com.google.android.gms.internal.ads.b51;
import com.google.android.gms.internal.ads.e41;
import com.google.android.gms.internal.ads.f41;
import com.google.android.gms.internal.ads.f61;
import com.google.android.gms.internal.ads.f81;
import com.google.android.gms.internal.ads.h20;
import com.google.android.gms.internal.ads.h61;
import com.google.android.gms.internal.ads.ii0;
import com.google.android.gms.internal.ads.t41;
import com.google.android.gms.internal.ads.w41;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.concurrent.Future;

/* loaded from: classes2.dex */
public final class Oooo000 implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f16726OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f16727OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f16728OooOo0o;

    public /* synthetic */ Oooo000(b51 b51Var, int i, boolean z) {
        this.f16727OooOo0O = 6;
        this.f16726OooOo = b51Var;
        this.f16728OooOo0o = i;
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        C1514e0 c1514e0OooO0o0;
        switch (this.f16727OooOo0O) {
            case 0:
                ((Oooo0) this.f16726OooOo).OooO0o(this.f16728OooOo0o);
                break;
            case 1:
                int i = this.f16728OooOo0o;
                C2143v1 c2143v1 = (C2143v1) this.f16726OooOo;
                if (i > 0) {
                    try {
                        Thread.sleep(i * 1000);
                    } catch (InterruptedException unused) {
                    }
                }
                try {
                    PackageInfo packageInfo = c2143v1.f24814OooO00o.getPackageManager().getPackageInfo(c2143v1.f24814OooO00o.getPackageName(), 0);
                    Context context = c2143v1.f24814OooO00o;
                    c1514e0OooO0o0 = ii0.OooO0o0(context, context.getPackageName(), Integer.toString(packageInfo.versionCode));
                } catch (Throwable unused2) {
                    c1514e0OooO0o0 = null;
                }
                ((C2143v1) this.f16726OooOo).f24822OooOO0 = c1514e0OooO0o0;
                if (this.f16728OooOo0o < 4) {
                    if (c1514e0OooO0o0 == null || !c1514e0OooO0o0.Oooooo0() || c1514e0OooO0o0.o0ooOO0().equals("0000000000000000000000000000000000000000000000000000000000000000") || !c1514e0OooO0o0.Oooooo() || !c1514e0OooO0o0.o00oO0o().OooOoOO() || c1514e0OooO0o0.o00oO0o().OooOo0o() == -2) {
                        C2143v1 c2143v12 = (C2143v1) this.f16726OooOo;
                        int i2 = this.f16728OooOo0o + 1;
                        if (c2143v12.f24826OooOOOO) {
                            Future<?> futureSubmit = c2143v12.f24815OooO0O0.submit(new Oooo000(c2143v12, i2, 1));
                            if (i2 == 0) {
                                c2143v12.f24823OooOO0O = futureSubmit;
                                break;
                            }
                        }
                    }
                }
                break;
            case 2:
                h20 h20Var = ((C1853n7) this.f16726OooOo).f21423OooOo;
                if (h20Var != null) {
                    C1548ey c1548eyOooO00o = h20Var.OooO00o();
                    c1548eyOooO00o.OooO0oO("action", "cct_nav");
                    c1548eyOooO00o.OooO0oO("cct_navs", String.valueOf(this.f16728OooOo0o));
                    c1548eyOooO00o.OooOOO0();
                    break;
                }
                break;
            case 3:
                C1831mm c1831mm = ((TextureViewSurfaceTextureListenerC1647hm) this.f16726OooOo).f19824Oooo0OO;
                if (c1831mm != null) {
                    c1831mm.onWindowVisibilityChanged(this.f16728OooOo0o);
                    break;
                }
                break;
            case 4:
                C1831mm c1831mm2 = ((TextureViewSurfaceTextureListenerC2312zm) this.f16726OooOo).f26196OooOoOO;
                if (c1831mm2 != null) {
                    c1831mm2.onWindowVisibilityChanged(this.f16728OooOo0o);
                    break;
                }
                break;
            case 5:
                f41 f41Var = ((e41) this.f16726OooOo).f18492OooO0O0;
                int i3 = this.f16728OooOo0o;
                if (i3 != -3 && i3 != -2) {
                    if (i3 == -1) {
                        t41 t41Var = f41Var.f18781OooO0OO;
                        if (t41Var != null) {
                            w41 w41Var = t41Var.f24239OooOo0O;
                            w41Var.o0000OOO(-1, 2, w41Var.o0000o0());
                        }
                        f41Var.OooO00o();
                        f41Var.OooO0O0(1);
                        break;
                    } else if (i3 == 1) {
                        f41Var.OooO0O0(2);
                        t41 t41Var2 = f41Var.f18781OooO0OO;
                        if (t41Var2 != null) {
                            w41 w41Var2 = t41Var2.f24239OooOo0O;
                            w41Var2.o0000OOO(1, 1, w41Var2.o0000o0());
                            break;
                        }
                    } else {
                        androidx.datastore.preferences.protobuf.OooO00o.OooOo00(i3, "Unknown focus change type: ", "AudioFocusManager");
                        break;
                    }
                } else if (i3 == -2) {
                    t41 t41Var3 = f41Var.f18781OooO0OO;
                    if (t41Var3 != null) {
                        w41 w41Var3 = t41Var3.f24239OooOo0O;
                        w41Var3.o0000OOO(0, 1, w41Var3.o0000o0());
                    }
                    f41Var.OooO0O0(3);
                    break;
                } else {
                    f41Var.OooO0O0(4);
                    break;
                }
                break;
            case 6:
                b51 b51Var = (b51) this.f16726OooOo;
                int i4 = ((f81) b51Var.f17375OooOo0O[this.f16728OooOo0o].f26095OooO0OO).f18818OooOo0o;
                h61 h61Var = b51Var.f17384Oooo;
                h61Var.OooO(h61Var.OooOO0o(), IronSourceError.ERROR_RV_LOAD_FAIL_DUE_TO_INIT, new f61(16));
                break;
            case 7:
                ((com.google.android.material.datepicker.o000oOoO) this.f16726OooOo).f27561OooOoo.smoothScrollToPosition(this.f16728OooOo0o);
                break;
            default:
                ((o0OOO0o.OooO0OO) this.f16726OooOo).OooO0oO(this.f16728OooOo0o);
                break;
        }
    }

    public /* synthetic */ Oooo000(Object obj, int i, int i2) {
        this.f16727OooOo0O = i2;
        this.f16726OooOo = obj;
        this.f16728OooOo0o = i;
    }
}
