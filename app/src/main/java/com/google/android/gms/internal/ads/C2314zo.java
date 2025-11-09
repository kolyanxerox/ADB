package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;

/* renamed from: com.google.android.gms.internal.ads.zo */
/* loaded from: classes2.dex */
public final class C2314zo {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final ViewTreeObserverOnGlobalLayoutListenerC2166vo f26232OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final C1847n1 f26233OooO0O0;

    public C2314zo(ViewTreeObserverOnGlobalLayoutListenerC2166vo viewTreeObserverOnGlobalLayoutListenerC2166vo, C1847n1 c1847n1) {
        this.f26233OooO0O0 = c1847n1;
        this.f26232OooO00o = viewTreeObserverOnGlobalLayoutListenerC2166vo;
    }

    @JavascriptInterface
    public String getClickSignals(String str) {
        if (TextUtils.isEmpty(str)) {
            zze.zza("Click string is empty, not proceeding.");
            return "";
        }
        ViewTreeObserverOnGlobalLayoutListenerC2166vo viewTreeObserverOnGlobalLayoutListenerC2166vo = this.f26232OooO00o;
        C1663i1 c1663i1 = viewTreeObserverOnGlobalLayoutListenerC2166vo.f25028OooOo0o;
        if (c1663i1 == null) {
            zze.zza("Signal utils is empty, ignoring.");
            return "";
        }
        InterfaceC1552f1 interfaceC1552f1 = c1663i1.f19893OooO0O0;
        if (interfaceC1552f1 == null) {
            zze.zza("Signals object is empty, ignoring.");
            return "";
        }
        if (viewTreeObserverOnGlobalLayoutListenerC2166vo.getContext() != null) {
            return interfaceC1552f1.zze(viewTreeObserverOnGlobalLayoutListenerC2166vo.getContext(), str, viewTreeObserverOnGlobalLayoutListenerC2166vo, viewTreeObserverOnGlobalLayoutListenerC2166vo.f25027OooOo0O.f18639OooO00o);
        }
        zze.zza("Context is null, ignoring.");
        return "";
    }

    @JavascriptInterface
    public String getViewSignals() {
        ViewTreeObserverOnGlobalLayoutListenerC2166vo viewTreeObserverOnGlobalLayoutListenerC2166vo = this.f26232OooO00o;
        C1663i1 c1663i1 = viewTreeObserverOnGlobalLayoutListenerC2166vo.f25028OooOo0o;
        if (c1663i1 == null) {
            zze.zza("Signal utils is empty, ignoring.");
            return "";
        }
        InterfaceC1552f1 interfaceC1552f1 = c1663i1.f19893OooO0O0;
        if (interfaceC1552f1 == null) {
            zze.zza("Signals object is empty, ignoring.");
            return "";
        }
        if (viewTreeObserverOnGlobalLayoutListenerC2166vo.getContext() != null) {
            return interfaceC1552f1.zzh(viewTreeObserverOnGlobalLayoutListenerC2166vo.getContext(), viewTreeObserverOnGlobalLayoutListenerC2166vo, viewTreeObserverOnGlobalLayoutListenerC2166vo.f25027OooOo0O.f18639OooO00o);
        }
        zze.zza("Context is null, ignoring.");
        return "";
    }

    @JavascriptInterface
    public void notify(String str) {
        if (TextUtils.isEmpty(str)) {
            zzo.zzj("URL is empty, ignoring message");
        } else {
            zzs.zza.post(new wp0(17, this, str));
        }
    }
}
