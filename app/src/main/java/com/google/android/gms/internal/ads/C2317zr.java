package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;

/* renamed from: com.google.android.gms.internal.ads.zr */
/* loaded from: classes2.dex */
public final class C2317zr extends AbstractC1397at {

    /* renamed from: OooOO0, reason: collision with root package name */
    public final InterfaceC1722jo f26361OooOO0;

    /* renamed from: OooOO0O, reason: collision with root package name */
    public final int f26362OooOO0O;
    public final Context OooOO0o;

    /* renamed from: OooOOO, reason: collision with root package name */
    public final InterfaceC2064sx f26363OooOOO;

    /* renamed from: OooOOO0, reason: collision with root package name */
    public final C2249xx f26364OooOOO0;

    /* renamed from: OooOOOO, reason: collision with root package name */
    public final ff0 f26365OooOOOO;

    /* renamed from: OooOOOo, reason: collision with root package name */
    public final C2246xu f26366OooOOOo;

    /* renamed from: OooOOo, reason: collision with root package name */
    public final C2052sl f26367OooOOo;

    /* renamed from: OooOOo0, reason: collision with root package name */
    public final boolean f26368OooOOo0;

    /* renamed from: OooOOoo, reason: collision with root package name */
    public boolean f26369OooOOoo;

    public C2317zr(OooOOOo.o0ooOOo o0ooooo, Context context, InterfaceC1722jo interfaceC1722jo, int i, C2249xx c2249xx, InterfaceC2064sx interfaceC2064sx, ff0 ff0Var, C2246xu c2246xu, C2052sl c2052sl) {
        super(o0ooooo);
        this.f26369OooOOoo = false;
        this.f26361OooOO0 = interfaceC1722jo;
        this.OooOO0o = context;
        this.f26362OooOO0O = i;
        this.f26364OooOOO0 = c2249xx;
        this.f26363OooOOO = interfaceC2064sx;
        this.f26365OooOOOO = ff0Var;
        this.f26366OooOOOo = c2246xu;
        this.f26368OooOOo0 = ((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o00oOOO0)).booleanValue();
        this.f26367OooOOo = c2052sl;
    }

    public final void OooO0O0() {
        C1472cv c1472cv = this.f17101OooO0OO;
        c1472cv.getClass();
        c1472cv.o0000Ooo(new C2150v8(null));
        InterfaceC1722jo interfaceC1722jo = this.f26361OooOO0;
        if (interfaceC1722jo != null) {
            interfaceC1722jo.destroy();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v16, types: [android.content.Context] */
    public final void OooO0OO(Activity activity, boolean z) {
        InterfaceC1722jo interfaceC1722jo;
        kd0 kd0VarOooO0OO;
        int i;
        Activity activity2 = activity;
        if (activity == null) {
            activity2 = this.OooOO0o;
        }
        ff0 ff0Var = this.f26365OooOOOO;
        boolean z2 = this.f26368OooOOo0;
        if (z2) {
            ff0Var.o0000Ooo(new C1582fv(18));
        }
        boolean zBooleanValue = ((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17793o0000Ooo)).booleanValue();
        C2246xu c2246xu = this.f26366OooOOOo;
        if (zBooleanValue) {
            zzv.zzq();
            if (zzs.zzH(activity2)) {
                zzo.zzj("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies");
                c2246xu.zzb();
                if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17780o00000oO)).booleanValue()) {
                    new ki0(activity2.getApplicationContext(), zzv.zzu().zzb()).OooO00o(((md0) this.f17099OooO00o.f23849OooO0O0.f24096OooOo).f21205OooO0O0);
                    return;
                }
                return;
            }
        }
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0o000)).booleanValue() && (interfaceC1722jo = this.f26361OooOO0) != null && (kd0VarOooO0OO = interfaceC1722jo.OooO0OO()) != null && kd0VarOooO0OO.f20556oo000o) {
            C2052sl c2052sl = this.f26367OooOOo;
            synchronized (c2052sl.f24102OooO00o) {
                C2015rl c2015rl = c2052sl.f24105OooO0Oo;
                synchronized (c2015rl.f23879OooO0o) {
                    i = c2015rl.f23884OooOO0O;
                }
            }
            if (kd0VarOooO0OO.f20550o00oO0o != i) {
                zzo.zzj("The app open consent form has been shown.");
                c2246xu.OooO0oo(af0.Oooo0O0(12, "The consent form has already been shown.", null));
                return;
            }
        }
        if (this.f26369OooOOoo) {
            zzo.zzj("App open interstitial ad is already visible.");
            c2246xu.OooO0oo(af0.Oooo0O0(10, null, null));
        }
        if (this.f26369OooOOoo) {
            return;
        }
        try {
            this.f26363OooOOO.OooO0o(z, activity2, c2246xu);
            if (z2) {
                ff0Var.o0000Ooo(new C1582fv(19));
            }
            this.f26369OooOOoo = true;
        } catch (C2027rx e) {
            c2246xu.OoooOOo(e);
        }
    }

    public final void OooO0Oo(int i, long j) {
        C2249xx c2249xx = this.f26364OooOOO0;
        C1548ey c1548eyOooO00o = ((h20) c2249xx.f25815OooOo0o).OooO00o();
        c1548eyOooO00o.OooO0oO("gqi", ((md0) ((rd0) c2249xx.f25813OooOo).f23849OooO0O0.f24096OooOo).f21205OooO0O0);
        c1548eyOooO00o.OooO0oO("action", "ad_closed");
        c1548eyOooO00o.OooO0oO("show_time", String.valueOf(j));
        c1548eyOooO00o.OooO0oO("ad_format", "app_open_ad");
        int i2 = i - 1;
        c1548eyOooO00o.OooO0oO("acr", i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "u" : "ac" : "cb" : "cc" : "bb" : "h");
        c1548eyOooO00o.OooOOO0();
    }
}
