package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.kx */
/* loaded from: classes2.dex */
public final class C1768kx extends AbstractC1397at {

    /* renamed from: OooOO0 */
    public final Context f20704OooOO0;

    /* renamed from: OooOO0O */
    public final WeakReference f20705OooOO0O;
    public final ff0 OooOO0o;

    /* renamed from: OooOOO */
    public final C1801lt f20706OooOOO;

    /* renamed from: OooOOO0 */
    public final InterfaceC2064sx f20707OooOOO0;

    /* renamed from: OooOOOO */
    public final ki0 f20708OooOOOO;

    /* renamed from: OooOOOo */
    public final C2246xu f20709OooOOOo;

    /* renamed from: OooOOo */
    public boolean f20710OooOOo;

    /* renamed from: OooOOo0 */
    public final C2052sl f20711OooOOo0;

    public C1768kx(OooOOOo.o0ooOOo o0ooooo, Context context, InterfaceC1722jo interfaceC1722jo, ff0 ff0Var, InterfaceC2064sx interfaceC2064sx, C1801lt c1801lt, ki0 ki0Var, C2246xu c2246xu, C2052sl c2052sl) {
        super(o0ooooo);
        this.f20710OooOOo = false;
        this.f20704OooOO0 = context;
        this.f20705OooOO0O = new WeakReference(interfaceC1722jo);
        this.OooOO0o = ff0Var;
        this.f20707OooOOO0 = interfaceC2064sx;
        this.f20706OooOOO = c1801lt;
        this.f20708OooOOOO = ki0Var;
        this.f20709OooOOOo = c2246xu;
        this.f20711OooOOo0 = c2052sl;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooO0O0(Activity activity, boolean z) {
        kd0 kd0VarOooO0OO;
        int i;
        ff0 ff0Var = this.OooOO0o;
        ff0Var.o0000Ooo(new C1582fv(18));
        boolean zBooleanValue = ((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17793o0000Ooo)).booleanValue();
        Context context = this.f20704OooOO0;
        C2246xu c2246xu = this.f20709OooOOOo;
        if (zBooleanValue) {
            zzv.zzq();
            if (zzs.zzH(context)) {
                zzo.zzj("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies");
                c2246xu.zzb();
                if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17780o00000oO)).booleanValue()) {
                    this.f20708OooOOOO.OooO00o(((md0) this.f17099OooO00o.f23849OooO0O0.f24096OooOo).f21205OooO0O0);
                    return;
                }
                return;
            }
        }
        InterfaceC1722jo interfaceC1722jo = (InterfaceC1722jo) this.f20705OooOO0O.get();
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0o000)).booleanValue() && interfaceC1722jo != null && (kd0VarOooO0OO = interfaceC1722jo.OooO0OO()) != null && kd0VarOooO0OO.f20556oo000o) {
            C2052sl c2052sl = this.f20711OooOOo0;
            synchronized (c2052sl.f24102OooO00o) {
                C2015rl c2015rl = c2052sl.f24105OooO0Oo;
                synchronized (c2015rl.f23879OooO0o) {
                    i = c2015rl.f23884OooOO0O;
                }
            }
            if (kd0VarOooO0OO.f20550o00oO0o != i) {
                zzo.zzj("The interstitial consent form has been shown.");
                c2246xu.OooO0oo(af0.Oooo0O0(12, "The consent form has already been shown.", null));
                return;
            }
        }
        if (this.f20710OooOOo) {
            zzo.zzj("The interstitial ad has been shown.");
            c2246xu.OooO0oo(af0.Oooo0O0(10, null, null));
        }
        if (this.f20710OooOOo) {
            return;
        }
        if (activity == null) {
            activity = context;
        }
        try {
            this.f20707OooOOO0.OooO0o(z, activity, c2246xu);
            ff0Var.o0000Ooo(new C1582fv(19));
            this.f20710OooOOo = true;
        } catch (C2027rx e) {
            c2246xu.OoooOOo(e);
        }
    }

    public final void finalize() throws Throwable {
        try {
            InterfaceC1722jo interfaceC1722jo = (InterfaceC1722jo) this.f20705OooOO0O.get();
            if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0O00)).booleanValue()) {
                if (!this.f20710OooOOo && interfaceC1722jo != null) {
                    AbstractC2200wl.f25325OooO0o.execute(new RunnableC1911os(interfaceC1722jo, 2));
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
