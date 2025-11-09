package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class f10 extends AbstractC1397at {

    /* renamed from: OooOO0, reason: collision with root package name */
    public final Context f18746OooOO0;

    /* renamed from: OooOO0O, reason: collision with root package name */
    public final WeakReference f18747OooOO0O;
    public final InterfaceC2064sx OooOO0o;

    /* renamed from: OooOOO, reason: collision with root package name */
    public final C2246xu f18748OooOOO;

    /* renamed from: OooOOO0, reason: collision with root package name */
    public final ff0 f18749OooOOO0;

    /* renamed from: OooOOOO, reason: collision with root package name */
    public final C1766kv f18750OooOOOO;

    /* renamed from: OooOOOo, reason: collision with root package name */
    public final C1801lt f18751OooOOOo;

    /* renamed from: OooOOo, reason: collision with root package name */
    public final ki0 f18752OooOOo;

    /* renamed from: OooOOo0, reason: collision with root package name */
    public final BinderC1608gk f18753OooOOo0;

    /* renamed from: OooOOoo, reason: collision with root package name */
    public final td0 f18754OooOOoo;

    /* renamed from: OooOo00, reason: collision with root package name */
    public boolean f18755OooOo00;

    public f10(OooOOOo.o0ooOOo o0ooooo, Context context, InterfaceC1722jo interfaceC1722jo, InterfaceC2064sx interfaceC2064sx, ff0 ff0Var, C2246xu c2246xu, C1766kv c1766kv, C1801lt c1801lt, kd0 kd0Var, ki0 ki0Var, td0 td0Var) {
        super(o0ooooo);
        this.f18755OooOo00 = false;
        this.f18746OooOO0 = context;
        this.OooOO0o = interfaceC2064sx;
        this.f18747OooOO0O = new WeakReference(interfaceC1722jo);
        this.f18749OooOOO0 = ff0Var;
        this.f18748OooOOO = c2246xu;
        this.f18750OooOOOO = c1766kv;
        this.f18751OooOOOo = c1801lt;
        this.f18752OooOOo = ki0Var;
        C1865nj c1865nj = kd0Var.OooOO0o;
        this.f18753OooOOo0 = new BinderC1608gk(c1865nj != null ? c1865nj.zza : "", c1865nj != null ? c1865nj.zzb : 1);
        this.f18754OooOOoo = td0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooO0O0(Activity activity, boolean z) {
        boolean zBooleanValue = ((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17793o0000Ooo)).booleanValue();
        Context context = this.f18746OooOO0;
        C2246xu c2246xu = this.f18748OooOOO;
        if (zBooleanValue) {
            zzv.zzq();
            if (zzs.zzH(context)) {
                zzo.zzj("Rewarded ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://googlemobileadssdk.page.link/admob-interstitial-policies");
                c2246xu.zzb();
                if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17780o00000oO)).booleanValue()) {
                    this.f18752OooOOo.OooO00o(((md0) this.f17099OooO00o.f23849OooO0O0.f24096OooOo).f21205OooO0O0);
                    return;
                }
                return;
            }
        }
        if (this.f18755OooOo00) {
            zzo.zzj("The rewarded ad have been showed.");
            c2246xu.OooO0oo(af0.Oooo0O0(10, null, null));
            return;
        }
        this.f18755OooOo00 = true;
        C1582fv c1582fv = new C1582fv(18);
        ff0 ff0Var = this.f18749OooOOO0;
        ff0Var.o0000Ooo(c1582fv);
        if (activity == null) {
            activity = context;
        }
        try {
            this.OooOO0o.OooO0o(z, activity, c2246xu);
            ff0Var.o0000Ooo(new C1582fv(19));
        } catch (C2027rx e) {
            c2246xu.OoooOOo(e);
        }
    }

    public final void finalize() throws Throwable {
        try {
            InterfaceC1722jo interfaceC1722jo = (InterfaceC1722jo) this.f18747OooOO0O.get();
            if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0O00)).booleanValue()) {
                if (!this.f18755OooOo00 && interfaceC1722jo != null) {
                    AbstractC2200wl.f25325OooO0o.execute(new RunnableC1911os(interfaceC1722jo, 4));
                }
            } else if (interfaceC1722jo != null) {
                interfaceC1722jo.destroy();
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }
}
