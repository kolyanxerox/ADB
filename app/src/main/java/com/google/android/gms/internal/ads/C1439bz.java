package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzbv;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzj;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.bz */
/* loaded from: classes2.dex */
public final class C1439bz {

    /* renamed from: OooOO0O */
    public static final ImageView.ScaleType f17616OooOO0O = ImageView.ScaleType.CENTER_INSIDE;

    /* renamed from: OooO */
    public final C1414b9 f17617OooO;

    /* renamed from: OooO00o */
    public final zzj f17618OooO00o;

    /* renamed from: OooO0O0 */
    public final vd0 f17619OooO0O0;

    /* renamed from: OooO0OO */
    public final C2139uy f17620OooO0OO;

    /* renamed from: OooO0Oo */
    public final C2065sy f17621OooO0Oo;

    /* renamed from: OooO0o */
    public final C1844mz f17622OooO0o;

    /* renamed from: OooO0o0 */
    public final C1696iz f17623OooO0o0;

    /* renamed from: OooO0oO */
    public final Executor f17624OooO0oO;

    /* renamed from: OooO0oo */
    public final cq0 f17625OooO0oo;

    /* renamed from: OooOO0 */
    public final C1991qy f17626OooOO0;

    public C1439bz(zzj zzjVar, vd0 vd0Var, C2139uy c2139uy, C2065sy c2065sy, C1696iz c1696iz, C1844mz c1844mz, Executor executor, cq0 cq0Var, C1991qy c1991qy) {
        this.f17618OooO00o = zzjVar;
        this.f17619OooO0O0 = vd0Var;
        this.f17617OooO = vd0Var.f24950OooO;
        this.f17620OooO0OO = c2139uy;
        this.f17621OooO0Oo = c2065sy;
        this.f17623OooO0o0 = c1696iz;
        this.f17622OooO0o = c1844mz;
        this.f17624OooO0oO = executor;
        this.f17625OooO0oo = cq0Var;
        this.f17626OooOO0 = c1991qy;
    }

    public static void OooO0O0(RelativeLayout.LayoutParams layoutParams, int i) {
        if (i == 0) {
            layoutParams.addRule(10);
            layoutParams.addRule(9);
        } else if (i == 2) {
            layoutParams.addRule(12);
            layoutParams.addRule(11);
        } else if (i != 3) {
            layoutParams.addRule(10);
            layoutParams.addRule(11);
        } else {
            layoutParams.addRule(12);
            layoutParams.addRule(9);
        }
    }

    public final void OooO00o(InterfaceViewOnClickListenerC1881nz interfaceViewOnClickListenerC1881nz) {
        if (interfaceViewOnClickListenerC1881nz == null) {
            return;
        }
        Context context = interfaceViewOnClickListenerC1881nz.zzf().getContext();
        if (zzbv.zzh(context, this.f17620OooO0OO.f24790OooO00o)) {
            if (!(context instanceof Activity)) {
                zzo.zze("Activity context is needed for policy validator.");
                return;
            }
            C1844mz c1844mz = this.f17622OooO0o;
            if (c1844mz == null || interfaceViewOnClickListenerC1881nz.zzh() == null) {
                return;
            }
            try {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                windowManager.addView(c1844mz.OooO00o(interfaceViewOnClickListenerC1881nz.zzh(), windowManager), zzbv.zzb());
            } catch (C2018ro e) {
                zze.zzb("web view can not be obtained", e);
            }
        }
    }

    public final boolean OooO0OO(ViewGroup viewGroup, boolean z) {
        View view;
        if (z) {
            C2065sy c2065sy = this.f17621OooO0Oo;
            synchronized (c2065sy) {
                view = c2065sy.f24191OooOOOO;
            }
        } else {
            C2065sy c2065sy2 = this.f17621OooO0Oo;
            synchronized (c2065sy2) {
                view = c2065sy2.f24192OooOOOo;
            }
        }
        if (view == null) {
            return false;
        }
        viewGroup.removeAllViews();
        if (view.getParent() instanceof ViewGroup) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        viewGroup.addView(view, ((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o00Oo0o)).booleanValue() ? new FrameLayout.LayoutParams(-1, -1, 17) : new FrameLayout.LayoutParams(-2, -2, 17));
        return true;
    }
}
