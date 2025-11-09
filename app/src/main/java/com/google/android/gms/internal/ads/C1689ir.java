package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.ads.ir */
/* loaded from: classes2.dex */
public final class C1689ir implements InterfaceC2024ru, InterfaceC1656hv, InterfaceC1399av, zza, InterfaceC2283yu, InterfaceC2211ww {

    /* renamed from: OooOo, reason: collision with root package name */
    public final Executor f20092OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final Context f20093OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final cq0 f20094OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public final rd0 f20095OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final ScheduledExecutorService f20096OooOoO0;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public final kd0 f20097OooOoOO;

    /* renamed from: OooOoo, reason: collision with root package name */
    public final zd0 f20098OooOoo;

    /* renamed from: OooOoo0, reason: collision with root package name */
    public final fg0 f20099OooOoo0;

    /* renamed from: OooOooO, reason: collision with root package name */
    public final C1663i1 f20100OooOooO;

    /* renamed from: OooOooo, reason: collision with root package name */
    public final C2075t7 f20101OooOooo;

    /* renamed from: Oooo0, reason: collision with root package name */
    public boolean f20102Oooo0;

    /* renamed from: Oooo000, reason: collision with root package name */
    public final WeakReference f20103Oooo000;

    /* renamed from: Oooo00O, reason: collision with root package name */
    public final WeakReference f20104Oooo00O;

    /* renamed from: Oooo00o, reason: collision with root package name */
    public final de0 f20105Oooo00o;

    /* renamed from: Oooo0O0, reason: collision with root package name */
    public final AtomicBoolean f20106Oooo0O0 = new AtomicBoolean();

    public C1689ir(Context context, cq0 cq0Var, Executor executor, ScheduledExecutorService scheduledExecutorService, rd0 rd0Var, kd0 kd0Var, fg0 fg0Var, zd0 zd0Var, View view, InterfaceC1722jo interfaceC1722jo, C1663i1 c1663i1, C2075t7 c2075t7, de0 de0Var) {
        this.f20093OooOo0O = context;
        this.f20094OooOo0o = cq0Var;
        this.f20092OooOo = executor;
        this.f20096OooOoO0 = scheduledExecutorService;
        this.f20095OooOoO = rd0Var;
        this.f20097OooOoOO = kd0Var;
        this.f20099OooOoo0 = fg0Var;
        this.f20098OooOoo = zd0Var;
        this.f20100OooOooO = c1663i1;
        this.f20103Oooo000 = new WeakReference(view);
        this.f20104Oooo00O = new WeakReference(interfaceC1722jo);
        this.f20101OooOooo = c2075t7;
        this.f20105Oooo00o = de0Var;
    }

    public final List OooO00o() {
        boolean zBooleanValue = ((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0oOoOoo)).booleanValue();
        kd0 kd0Var = this.f20097OooOoOO;
        if (zBooleanValue) {
            zzv.zzq();
            Context context = this.f20093OooOo0O;
            if (zzs.zzC(context)) {
                zzv.zzq();
                Integer numZzt = zzs.zzt(context);
                if (numZzt != null) {
                    int iMin = Math.min(numZzt.intValue(), 20);
                    ArrayList arrayList = new ArrayList();
                    Iterator it = kd0Var.f20490OooO0Oo.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Uri.parse((String) it.next()).buildUpon().appendQueryParameter("dspct", Integer.toString(iMin)).toString());
                    }
                    return arrayList;
                }
            }
        }
        return kd0Var.f20490OooO0Oo;
    }

    public final void OooO0o() {
        int i;
        kd0 kd0Var = this.f20097OooOoOO;
        List list = kd0Var.f20490OooO0Oo;
        if (list == null || list.isEmpty()) {
            return;
        }
        String strZzh = null;
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17901o00OOOO)).booleanValue()) {
            strZzh = this.f20100OooOooO.f19893OooO0O0.zzh(this.f20093OooOo0O, (View) this.f20103Oooo000.get(), null);
        }
        String str = strZzh;
        if ((((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17925o0O0O00)).booleanValue() && ((md0) this.f20095OooOoO.f23849OooO0O0.f24096OooOo).f21211OooO0oo) || !((Boolean) AbstractC1596g8.f19267OooO0oo.OooOOO()).booleanValue()) {
            this.f20098OooOoo.OooO00o(this.f20099OooOoo0.OooO0O0(this.f20095OooOoO, this.f20097OooOoOO, false, str, null, OooO00o()));
            return;
        }
        if (((Boolean) AbstractC1596g8.f19266OooO0oO.OooOOO()).booleanValue() && ((i = kd0Var.f20488OooO0O0) == 1 || i == 2 || i == 5)) {
        }
        tp0 tp0Var = (tp0) ii0.o00Oo0(tp0.OooOOo(yp0.f25991OooOo0o), ((Long) zzbe.zzc().OooO00o(AbstractC1448c7.f17792o0000OoO)).longValue(), TimeUnit.MILLISECONDS, this.f20096OooOoO0);
        tp0Var.addListener(new wp0(0, tp0Var, new C2249xx(this, false, str, 25)), this.f20094OooOo0o);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2283yu
    public final void OooO0o0(zze zzeVar) {
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17815o000O0oo)).booleanValue()) {
            int i = zzeVar.zza;
            kd0 kd0Var = this.f20097OooOoOO;
            List list = kd0Var.f20499OooOOOO;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(fg0.OooO0OO((String) it.next(), "@gw_mpe@", "2." + i));
            }
            this.f20098OooOoo.OooO00o(this.f20099OooOoo0.OooO00o(this.f20095OooOoO, kd0Var, arrayList));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2024ru
    public final void OooO0oo(BinderC1460cj binderC1460cj, String str, String str2) {
        sd0 sd0Var;
        kd0 kd0Var = this.f20097OooOoOO;
        List list = kd0Var.f20494OooO0oo;
        fg0 fg0Var = this.f20099OooOoo0;
        fg0Var.getClass();
        ArrayList arrayList = new ArrayList();
        ((Oooo0OO.oo000o) fg0Var.f18946OooO0oo).getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            String str3 = binderC1460cj.f18002OooOo0O;
            String string = Integer.toString(binderC1460cj.f18003OooOo0o);
            boolean zBooleanValue = ((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17903o00OOOOo)).booleanValue();
            yk0 bl0Var = tk0.f24329OooOo0O;
            if (zBooleanValue) {
                td0 td0Var = fg0Var.f18945OooO0oO;
                if (td0Var != null && (sd0Var = td0Var.f24300OooO00o) != null) {
                    bl0Var = new bl0(sd0Var);
                }
            } else {
                sd0 sd0Var2 = fg0Var.f18943OooO0o;
                if (sd0Var2 != null) {
                    bl0Var = new bl0(sd0Var2);
                }
            }
            String str4 = (String) bl0Var.OooO00o(new o0O0o00O(17)).OooO0O0();
            String str5 = (String) bl0Var.OooO00o(new o0O0o00O(18)).OooO0O0();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(af0.OooOooO(fg0.OooO0OO(fg0.OooO0OO(fg0.OooO0OO(fg0.OooO0OO(fg0.OooO0OO(fg0.OooO0OO((String) it.next(), "@gw_rwd_userid@", Uri.encode(str4)), "@gw_rwd_custom_data@", Uri.encode(str5)), "@gw_tmstmp@", Long.toString(jCurrentTimeMillis)), "@gw_rwd_itm@", Uri.encode(str3)), "@gw_rwd_amt@", string), "@gw_sdkver@", fg0Var.f18940OooO0O0), fg0Var.f18944OooO0o0, kd0Var.f20531OoooOOO, kd0Var.o0ooOoO));
            }
        } catch (RemoteException e) {
            zzo.zzh("Unable to determine award type and amount.", e);
        }
        this.f20098OooOoo.OooO00o(arrayList);
    }

    public final void OooOO0(int i, int i2) {
        View view;
        if (i <= 0 || !((view = (View) this.f20103Oooo000.get()) == null || view.getHeight() == 0 || view.getWidth() == 0)) {
            OooO0o();
        } else {
            this.f20096OooOoO0.schedule(new RunnableC1652hr(this, i, i2, 0), i2, TimeUnit.MILLISECONDS);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1656hv
    public final synchronized void OoooOOO() {
        de0 de0Var;
        long j;
        try {
            if (this.f20102Oooo0) {
                ArrayList arrayList = new ArrayList(OooO00o());
                arrayList.addAll(this.f20097OooOoOO.f20491OooO0o);
                this.f20098OooOoo.OooO00o(this.f20099OooOoo0.OooO0O0(this.f20095OooOoO, this.f20097OooOoOO, true, null, null, arrayList));
            } else {
                zd0 zd0Var = this.f20098OooOoo;
                fg0 fg0Var = this.f20099OooOoo0;
                rd0 rd0Var = this.f20095OooOoO;
                kd0 kd0Var = this.f20097OooOoOO;
                zd0Var.OooO00o(fg0Var.OooO00o(rd0Var, kd0Var, kd0Var.f20498OooOOO0));
                if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17906o00OOOoO)).booleanValue() && (de0Var = this.f20105Oooo00o) != null) {
                    List list = ((kd0) de0Var.f18240OooOo).f20498OooOOO0;
                    String strOooO0O0 = ((x70) de0Var.f18243OooOoO0).OooO0O0();
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(fg0.OooO0OO((String) it.next(), "@gw_adnetstatus@", strOooO0O0));
                    }
                    x70 x70Var = (x70) this.f20105Oooo00o.f18243OooOoO0;
                    synchronized (x70Var) {
                        j = x70Var.f25547OooO0oo;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    int size = arrayList2.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList2.get(i);
                        i++;
                        arrayList3.add(fg0.OooO0OO((String) obj, "@gw_ttr@", Long.toString(j, 10)));
                    }
                    zd0 zd0Var2 = this.f20098OooOoo;
                    fg0 fg0Var2 = this.f20099OooOoo0;
                    de0 de0Var2 = this.f20105Oooo00o;
                    zd0Var2.OooO00o(fg0Var2.OooO00o((rd0) de0Var2.f18242OooOo0o, (kd0) de0Var2.f18240OooOo, arrayList3));
                }
                zd0 zd0Var3 = this.f20098OooOoo;
                fg0 fg0Var3 = this.f20099OooOoo0;
                rd0 rd0Var2 = this.f20095OooOoO;
                kd0 kd0Var2 = this.f20097OooOoOO;
                zd0Var3.OooO00o(fg0Var3.OooO00o(rd0Var2, kd0Var2, kd0Var2.f20491OooO0o));
            }
            this.f20102Oooo0 = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        boolean zBooleanValue = ((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17925o0O0O00)).booleanValue();
        rd0 rd0Var = this.f20095OooOoO;
        if ((zBooleanValue && ((md0) rd0Var.f23849OooO0O0.f24096OooOo).f21211OooO0oo) || !((Boolean) AbstractC1596g8.f19263OooO0Oo.OooOOO()).booleanValue()) {
            kd0 kd0Var = this.f20097OooOoOO;
            this.f20098OooOoo.OooO0O0(true == zzv.zzp().OooO00o(this.f20093OooOo0O) ? 2 : 1, this.f20099OooOoo0.OooO00o(rd0Var, kd0Var, kd0Var.f20489OooO0OO));
        } else {
            C2075t7 c2075t7 = this.f20101OooOooo;
            c2075t7.getClass();
            lo0 lo0VarOoooOOO = ii0.OoooOOO(tp0.OooOOo((tp0) ii0.o00Oo0(tp0.OooOOo(yp0.f25991OooOo0o), ((Long) AbstractC1596g8.f19262OooO0OO.OooOOO()).longValue(), TimeUnit.MILLISECONDS, c2075t7.f24260OooO0OO)), Throwable.class, new o0O0o00O(4), AbstractC2200wl.f25327OooO0oO);
            lo0VarOoooOOO.addListener(new wp0(0, lo0VarOoooOOO, new sj0(this, 11)), this.f20094OooOo0o);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2024ru
    public final void zza() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2024ru
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2024ru
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2024ru
    public final void zze() {
        kd0 kd0Var = this.f20097OooOoOO;
        this.f20098OooOoo.OooO00o(this.f20099OooOoo0.OooO00o(this.f20095OooOoO, kd0Var, kd0Var.f20486OooO));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2024ru
    public final void zzf() {
        kd0 kd0Var = this.f20097OooOoOO;
        this.f20098OooOoo.OooO00o(this.f20099OooOoo0.OooO00o(this.f20095OooOoO, kd0Var, kd0Var.f20493OooO0oO));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1399av
    public final void zzr() {
        if (this.f20106Oooo0O0.compareAndSet(false, true)) {
            int iIntValue = ((Integer) zzbe.zzc().OooO00o(AbstractC1448c7.f17917o00OoOoO)).intValue();
            if (iIntValue > 0) {
                OooOO0(iIntValue, ((Integer) zzbe.zzc().OooO00o(AbstractC1448c7.f17913o00Oo000)).intValue());
                return;
            }
            if (!((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17909o00OOooo)).booleanValue()) {
                OooO0o();
            } else {
                this.f20092OooOo.execute(new RunnableC1615gr(this, 0));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2211ww
    public final void zzt() {
        kd0 kd0Var = this.f20097OooOoOO;
        this.f20098OooOoo.OooO00o(this.f20099OooOoo0.OooO00o(this.f20095OooOoO, kd0Var, kd0Var.f20555o0ooOO0));
    }
}
