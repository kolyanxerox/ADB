package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.util.client.zzf;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.mz */
/* loaded from: classes2.dex */
public final class C1844mz {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final n10 f21365OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final z00 f21366OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public ViewTreeObserverOnScrollChangedListenerC1807lz f21367OooO0OO = null;

    public C1844mz(n10 n10Var, z00 z00Var) {
        this.f21365OooO00o = n10Var;
        this.f21366OooO0O0 = z00Var;
    }

    public static final int OooO0O0(Context context, String str, int i) {
        try {
            i = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
        }
        zzbc.zzb();
        return zzf.zzx(context, i);
    }

    public final View OooO00o(FrameLayout frameLayout, WindowManager windowManager) {
        InterfaceC1722jo interfaceC1722joOooO00o = this.f21365OooO00o.OooO00o(zzs.zzc(), null, null);
        interfaceC1722joOooO00o.OooO0oO().setVisibility(4);
        interfaceC1722joOooO00o.OooO0oO().setContentDescription("policy_validator");
        interfaceC1722joOooO00o.Oooo0OO("/sendMessageToSdk", new C1709jb(this, 8));
        interfaceC1722joOooO00o.Oooo0OO("/hideValidatorOverlay", new C1733jz(this, windowManager, frameLayout));
        interfaceC1722joOooO00o.Oooo0OO("/open", new C2264yb(null, null, null, null, null));
        WeakReference weakReference = new WeakReference(interfaceC1722joOooO00o);
        C1733jz c1733jz = new C1733jz(this, frameLayout, windowManager);
        z00 z00Var = this.f21366OooO0O0;
        z00Var.OooO0OO("/loadNativeAdPolicyViolations", new y00(z00Var, weakReference, "/loadNativeAdPolicyViolations", c1733jz));
        z00Var.OooO0OO("/showValidatorOverlay", new y00(z00Var, new WeakReference(interfaceC1722joOooO00o), "/showValidatorOverlay", new C1820mb(28)));
        return interfaceC1722joOooO00o.OooO0oO();
    }
}
