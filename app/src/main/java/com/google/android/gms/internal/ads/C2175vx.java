package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.unity3d.services.core.fid.Constants;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.vx */
/* loaded from: classes2.dex */
public final class C2175vx implements InterfaceC2024ru, InterfaceC1989qw {

    /* renamed from: OooOo, reason: collision with root package name */
    public final C2162vk f25136OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final C2088tk f25137OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final Context f25138OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public String f25139OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final WebView f25140OooOoO0;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public final EnumC2035s4 f25141OooOoOO;

    public C2175vx(C2088tk c2088tk, Context context, C2162vk c2162vk, WebView webView, EnumC2035s4 enumC2035s4) {
        this.f25137OooOo0O = c2088tk;
        this.f25138OooOo0o = context;
        this.f25136OooOo = c2162vk;
        this.f25140OooOoO0 = webView;
        this.f25141OooOoOO = enumC2035s4;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2024ru
    public final void OooO0oo(BinderC1460cj binderC1460cj, String str, String str2) {
        Context context = this.f25138OooOo0o;
        C2162vk c2162vk = this.f25136OooOo;
        if (c2162vk.OooO0o0(context)) {
            try {
                c2162vk.OooO0Oo(context, c2162vk.OooO00o(context), this.f25137OooOo0O.f24325OooOo, binderC1460cj.f18002OooOo0O, binderC1460cj.f18003OooOo0o);
            } catch (RemoteException e) {
                zzo.zzk("Remote Exception to get reward item.", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2024ru
    public final void zza() {
        this.f25137OooOo0O.OooO00o(false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2024ru
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2024ru
    public final void zzc() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        WebView webView = this.f25140OooOoO0;
        if (webView != null && this.f25139OooOoO != null) {
            Context context = webView.getContext();
            String str = this.f25139OooOoO;
            C2162vk c2162vk = this.f25136OooOo;
            if (c2162vk.OooO0o0(context) && (context instanceof Activity)) {
                AtomicReference atomicReference = c2162vk.f24990OooO0oO;
                if (c2162vk.OooOOO0(context, Constants.FID_CLASS, atomicReference, false)) {
                    ConcurrentHashMap concurrentHashMap = c2162vk.f24991OooO0oo;
                    Method declaredMethod = (Method) concurrentHashMap.get("setCurrentScreen");
                    if (declaredMethod == null) {
                        try {
                            declaredMethod = context.getClassLoader().loadClass(Constants.FID_CLASS).getDeclaredMethod("setCurrentScreen", Activity.class, String.class, String.class);
                            concurrentHashMap.put("setCurrentScreen", declaredMethod);
                        } catch (Exception unused) {
                            c2162vk.OooOO0o("setCurrentScreen", false);
                            declaredMethod = null;
                        }
                    }
                    try {
                        declaredMethod.invoke(atomicReference.get(), (Activity) context, str, context.getPackageName());
                    } catch (Exception unused2) {
                        c2162vk.OooOO0o("setCurrentScreen", false);
                    }
                }
            }
        }
        this.f25137OooOo0O.OooO00o(true);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2024ru
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2024ru
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1989qw
    public final void zzk() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1989qw
    public final void zzl() {
        EnumC2035s4 enumC2035s4 = EnumC2035s4.APP_OPEN;
        EnumC2035s4 enumC2035s42 = this.f25141OooOoOO;
        if (enumC2035s42 == enumC2035s4) {
            return;
        }
        C2162vk c2162vk = this.f25136OooOo;
        Context context = this.f25138OooOo0o;
        String str = "";
        if (c2162vk.OooO0o0(context)) {
            AtomicReference atomicReference = c2162vk.f24988OooO0o;
            if (c2162vk.OooOOO0(context, "com.google.android.gms.measurement.AppMeasurement", atomicReference, true)) {
                try {
                    String str2 = (String) c2162vk.OooO(context, "getCurrentScreenName").invoke(atomicReference.get(), null);
                    if (str2 == null) {
                        str2 = (String) c2162vk.OooO(context, "getCurrentScreenClass").invoke(atomicReference.get(), null);
                    }
                    if (str2 != null) {
                        str = str2;
                    }
                } catch (Exception unused) {
                    c2162vk.OooOO0o("getCurrentScreenName", false);
                }
            }
        }
        this.f25139OooOoO = str;
        this.f25139OooOoO = String.valueOf(str).concat(enumC2035s42 == EnumC2035s4.REWARD_BASED_VIDEO_AD ? "/Rewarded" : "/Interstitial");
    }
}
