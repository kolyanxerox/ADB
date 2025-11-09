package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.ads.nonagon.signalgeneration.zzaa;
import com.ironsource.C3069e9;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class a20 implements InterfaceC1437bw, zza, InterfaceC1399av, InterfaceC2172vu {

    /* renamed from: OooOo, reason: collision with root package name */
    public final h20 f16891OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final Context f16892OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final ce0 f16893OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public final kd0 f16894OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final rd0 f16895OooOoO0;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public final s50 f16896OooOoOO;

    /* renamed from: OooOoo, reason: collision with root package name */
    public Boolean f16897OooOoo;

    /* renamed from: OooOoo0, reason: collision with root package name */
    public final String f16898OooOoo0;

    /* renamed from: OooOooO, reason: collision with root package name */
    public final boolean f16899OooOooO = ((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0O00OO)).booleanValue();

    public a20(Context context, ce0 ce0Var, h20 h20Var, rd0 rd0Var, kd0 kd0Var, s50 s50Var, String str) {
        this.f16892OooOo0O = context;
        this.f16893OooOo0o = ce0Var;
        this.f16891OooOo = h20Var;
        this.f16895OooOoO0 = rd0Var;
        this.f16894OooOoO = kd0Var;
        this.f16896OooOoOO = s50Var;
        this.f16898OooOoo0 = str;
    }

    public final C1548ey OooO00o(String str) {
        rd0 rd0Var = this.f16895OooOoO0;
        C2051sk c2051sk = rd0Var.f23849OooO0O0;
        C1548ey c1548eyOooO00o = this.f16891OooOo.OooO00o();
        c1548eyOooO00o.OooO0oO("gqi", ((md0) c2051sk.f24096OooOo).f21205OooO0O0);
        kd0 kd0Var = this.f16894OooOoO;
        c1548eyOooO00o.OooOO0(kd0Var);
        c1548eyOooO00o.OooO0oO("action", str);
        c1548eyOooO00o.OooO0oO("ad_format", this.f16898OooOoo0.toUpperCase(Locale.ROOT));
        List list = kd0Var.f20505OooOo00;
        if (!list.isEmpty()) {
            c1548eyOooO00o.OooO0oO("ancn", (String) list.get(0));
        }
        if (kd0Var.OooO0O0()) {
            c1548eyOooO00o.OooO0oO("device_connectivity", true != zzv.zzp().OooO00o(this.f16892OooOo0O) ? "offline" : CustomTabsCallback.ONLINE_EXTRAS_KEY);
            ((Oooo0OO.oo000o) zzv.zzC()).getClass();
            c1548eyOooO00o.OooO0oO("event_timestamp", String.valueOf(System.currentTimeMillis()));
            c1548eyOooO00o.OooO0oO("offline_ad", "1");
        }
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0O00o0O)).booleanValue()) {
            pd0 pd0Var = rd0Var.f23848OooO00o;
            boolean z = zzaa.zzf((vd0) pd0Var.f23325OooOo0o) != 1;
            c1548eyOooO00o.OooO0oO("scar", String.valueOf(z));
            if (z) {
                zzm zzmVar = ((vd0) pd0Var.f23325OooOo0o).f24954OooO0Oo;
                c1548eyOooO00o.OooO0oO("ragent", zzmVar.zzp);
                c1548eyOooO00o.OooO0oO("rtype", zzaa.zzb(zzaa.zzc(zzmVar)));
            }
        }
        return c1548eyOooO00o;
    }

    public final boolean OooO0o() {
        String strZzq;
        if (this.f16897OooOoo == null) {
            synchronized (this) {
                if (this.f16897OooOoo == null) {
                    String str = (String) zzbe.zzc().OooO00o(AbstractC1448c7.f17813o000O0o0);
                    zzv.zzq();
                    try {
                        strZzq = zzs.zzq(this.f16892OooOo0O);
                    } catch (RemoteException unused) {
                        strZzq = null;
                    }
                    boolean zMatches = false;
                    if (str != null && strZzq != null) {
                        try {
                            zMatches = Pattern.matches(str, strZzq);
                        } catch (RuntimeException e) {
                            zzv.zzp().OooO0oo("CsiActionsListener.isPatternMatched", e);
                        }
                    }
                    this.f16897OooOoo = Boolean.valueOf(zMatches);
                }
            }
        }
        return this.f16897OooOoo.booleanValue();
    }

    public final void OooO0o0(C1548ey c1548ey) {
        if (!this.f16894OooOoO.OooO0O0()) {
            c1548ey.OooOOO0();
            return;
        }
        k20 k20Var = ((h20) c1548ey.f18706OooOo).f19525OooO00o;
        String strGenerateUrl = k20Var.f20420OooO0o.generateUrl((ConcurrentHashMap) c1548ey.f18708OooOo0o);
        ((Oooo0OO.oo000o) zzv.zzC()).getClass();
        O0O0 o0o0 = new O0O0(System.currentTimeMillis(), ((md0) this.f16895OooOoO0.f23849OooO0O0.f24096OooOo).f21205OooO0O0, strGenerateUrl, 2);
        s50 s50Var = this.f16896OooOoOO;
        s50Var.getClass();
        s50Var.OooO0O0(new C1548ey(12, s50Var, o0o0));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    @Override // com.google.android.gms.internal.ads.InterfaceC2172vu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooO0oo(com.google.android.gms.ads.internal.client.zze r6) {
        /*
            r5 = this;
            boolean r0 = r5.f16899OooOooO
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.String r0 = "ifts"
            com.google.android.gms.internal.ads.ey r0 = r5.OooO00o(r0)
            java.lang.String r1 = "reason"
            java.lang.String r2 = "adapter"
            r0.OooO0oO(r1, r2)
            int r1 = r6.zza
            java.lang.String r2 = r6.zzb
            java.lang.String r3 = r6.zzc
            java.lang.String r4 = "com.google.android.gms.ads"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L32
            com.google.android.gms.ads.internal.client.zze r3 = r6.zzd
            if (r3 == 0) goto L32
            java.lang.String r3 = r3.zzc
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L32
            com.google.android.gms.ads.internal.client.zze r6 = r6.zzd
            int r1 = r6.zza
            java.lang.String r2 = r6.zzb
        L32:
            if (r1 < 0) goto L3d
            java.lang.String r6 = "arec"
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.OooO0oO(r6, r1)
        L3d:
            com.google.android.gms.internal.ads.ce0 r6 = r5.f16893OooOo0o
            java.util.regex.Pattern r6 = r6.f17994OooO00o
            if (r6 == 0) goto L55
            if (r2 != 0) goto L46
            goto L55
        L46:
            java.util.regex.Matcher r6 = r6.matcher(r2)
            boolean r1 = r6.find()
            if (r1 == 0) goto L55
            java.lang.String r6 = r6.group()
            goto L56
        L55:
            r6 = 0
        L56:
            if (r6 == 0) goto L5d
            java.lang.String r1 = "areec"
            r0.OooO0oO(r1, r6)
        L5d:
            r0.OooOOO0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.a20.OooO0oo(com.google.android.gms.ads.internal.client.zze):void");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2172vu
    public final void OoooOOo(C2027rx c2027rx) {
        if (this.f16899OooOooO) {
            C1548ey c1548eyOooO00o = OooO00o("ifts");
            c1548eyOooO00o.OooO0oO("reason", Constants.EXCEPTION);
            if (!TextUtils.isEmpty(c2027rx.getMessage())) {
                c1548eyOooO00o.OooO0oO(NotificationCompat.CATEGORY_MESSAGE, c2027rx.getMessage());
            }
            c1548eyOooO00o.OooOOO0();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if (this.f16894OooOoO.OooO0O0()) {
            OooO0o0(OooO00o(C3069e9.f8387d));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2172vu
    public final void zzb() {
        if (this.f16899OooOooO) {
            C1548ey c1548eyOooO00o = OooO00o("ifts");
            c1548eyOooO00o.OooO0oO("reason", "blocked");
            c1548eyOooO00o.OooOOO0();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1437bw
    public final void zzi() {
        if (OooO0o()) {
            OooO00o("adapter_shown").OooOOO0();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1437bw
    public final void zzj() {
        if (OooO0o()) {
            OooO00o("adapter_impression").OooOOO0();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1399av
    public final void zzr() {
        if (OooO0o() || this.f16894OooOoO.OooO0O0()) {
            OooO0o0(OooO00o(C3069e9.f8388e));
        }
    }
}
