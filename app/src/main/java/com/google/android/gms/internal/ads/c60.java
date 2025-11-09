package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzga;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final /* synthetic */ class c60 implements Runnable {

    /* renamed from: OooOo */
    public final /* synthetic */ Object f17702OooOo;

    /* renamed from: OooOo0O */
    public final /* synthetic */ int f17703OooOo0O;

    /* renamed from: OooOo0o */
    public final /* synthetic */ Object f17704OooOo0o;

    public /* synthetic */ c60(int i, Object obj, Object obj2) {
        this.f17703OooOo0O = i;
        this.f17704OooOo0o = obj;
        this.f17702OooOo = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() throws RemoteException, IOException {
        C1788lg c1788lg;
        Object zj0Var;
        bk0 bk0Var;
        long j;
        boolean z;
        long j2 = -9223372036854775807L;
        int i = 0;
        z = false;
        boolean z2 = false;
        switch (this.f17703OooOo0O) {
            case 0:
                dh0 dh0Var = (dh0) this.f17704OooOo0o;
                Iterator it = dh0Var.f18255OooO0Oo.values().iterator();
                while (it.hasNext()) {
                    ((yg0) it.next()).OooO00o();
                }
                Timer timer = new Timer();
                timer.schedule(new w50(dh0Var, (wj0) this.f17702OooOo, timer), 1000L);
                return;
            case 1:
                x60 x60Var = (x60) this.f17704OooOo0o;
                x60Var.getClass();
                InterfaceC1722jo interfaceC1722jo = (InterfaceC1722jo) this.f17702OooOo;
                interfaceC1722jo.o0ooOO0();
                BinderC2240xo binderC2240xoZzq = interfaceC1722jo.zzq();
                zzga zzgaVar = x60Var.f25532OooO0Oo.f24951OooO00o;
                if (zzgaVar != null && binderC2240xoZzq != null) {
                    binderC2240xoZzq.o000O0o0(zzgaVar);
                }
                if (!((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17812o000O0o)).booleanValue() || interfaceC1722jo.isAttachedToWindow()) {
                    return;
                }
                interfaceC1722jo.onPause();
                interfaceC1722jo.OooOo0O();
                return;
            case 2:
                ((g90) ((de0) ((s20) ((OooOOo0.o0OOO0o) this.f17704OooOo0o).f13521OooOoOO).f23979OooOoO0).f18243OooOoO0).o0OOO0o((zze) this.f17702OooOo);
                return;
            case 3:
                ((fc0) ((OooOOo0.o0OOO0o) this.f17704OooOo0o).f13521OooOoOO).f18917OooO0Oo.o0OOO0o((zze) this.f17702OooOo);
                return;
            case 4:
                ((jc0) this.f17704OooOo0o).f20276OooO0Oo.o0OOO0o((zze) this.f17702OooOo);
                return;
            case 5:
                ((fd0) ((OooOOo0.o0OOO0o) this.f17704OooOo0o).f13521OooOoOO).f18927OooO0Oo.o0OOO0o((zze) this.f17702OooOo);
                return;
            case 6:
                InputStream inputStream = (InputStream) this.f17704OooOo0o;
                try {
                    try {
                        ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream((ParcelFileDescriptor) this.f17702OooOo);
                        try {
                            Oooo0OO.o00oO0o.OooO0o0(inputStream, autoCloseOutputStream, false);
                            autoCloseOutputStream.close();
                            inputStream.close();
                            return;
                        } finally {
                        }
                    } catch (IOException unused) {
                        return;
                    }
                } finally {
                }
            case 7:
                ((gf0) ((s20) this.f17704OooOo0o).f23980OooOoOO).f19334OooO0OO.o0000Ooo(new pd0((df0) this.f17702OooOo, 1));
                return;
            case 8:
                nf0 nf0Var = (nf0) this.f17704OooOo0o;
                lf0 lf0Var = (lf0) this.f17702OooOo;
                nf0Var.getClass();
                synchronized (nf0.f21476Oooo000) {
                    try {
                        if (!nf0Var.f21484OooOoo) {
                            nf0Var.f21484OooOoo = true;
                            if (nf0.OooO00o()) {
                                try {
                                    zzv.zzq();
                                    nf0Var.f21482OooOoO0 = zzs.zzq(nf0Var.f21479OooOo0O);
                                } catch (RemoteException | RuntimeException e) {
                                    zzv.zzp().OooO0oo("CuiMonitor.gettingAppIdFromManifest", e);
                                }
                                OooOooo.o000O0Oo o000o0oo2 = OooOooo.o000O0Oo.f13671OooO0O0;
                                Context context = nf0Var.f21479OooOo0O;
                                o000o0oo2.getClass();
                                nf0Var.f21481OooOoO = OooOooo.o000O0Oo.OooO00o(context);
                                int iIntValue = ((Integer) zzbe.zzc().OooO00o(AbstractC1448c7.o0OOoooO)).intValue();
                                if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0o0000o)).booleanValue()) {
                                    long j3 = iIntValue;
                                    AbstractC2200wl.f25324OooO0Oo.scheduleWithFixedDelay(nf0Var, j3, j3, TimeUnit.MILLISECONDS);
                                } else {
                                    long j4 = iIntValue;
                                    AbstractC2200wl.f25324OooO0Oo.scheduleAtFixedRate(nf0Var, j4, j4, TimeUnit.MILLISECONDS);
                                }
                            }
                        }
                    } finally {
                    }
                }
                if (nf0.OooO00o() && lf0Var != null) {
                    synchronized (nf0.f21475OooOooo) {
                        try {
                            if (((uf0) nf0Var.f21478OooOo.f25822OooOo0o).OooOo0o() >= ((Integer) zzbe.zzc().OooO00o(AbstractC1448c7.o0OO0oOo)).intValue()) {
                                return;
                            }
                            of0 of0VarOooOo0o = qf0.OooOo0o();
                            int i2 = lf0Var.f20880OooOOO0;
                            of0VarOooOo0o.OooO0Oo();
                            ((qf0) of0VarOooOo0o.f25822OooOo0o).zzd = i2 - 2;
                            boolean z3 = lf0Var.f20870OooO0O0;
                            of0VarOooOo0o.OooO0Oo();
                            ((qf0) of0VarOooOo0o.f25822OooOo0o).zzk = z3;
                            long j5 = lf0Var.f20869OooO00o;
                            of0VarOooOo0o.OooO0Oo();
                            ((qf0) of0VarOooOo0o.f25822OooOo0o).zzl = j5;
                            of0VarOooOo0o.OooO0Oo();
                            ((qf0) of0VarOooOo0o.f25822OooOo0o).zzp = 1;
                            String str = nf0Var.f21480OooOo0o.afmaVersion;
                            of0VarOooOo0o.OooO0Oo();
                            qf0.Oooo0OO((qf0) of0VarOooOo0o.f25822OooOo0o, str);
                            String str2 = nf0Var.f21482OooOoO0;
                            of0VarOooOo0o.OooO0Oo();
                            qf0.OooOoO0((qf0) of0VarOooOo0o.f25822OooOo0o, str2);
                            String str3 = Build.VERSION.RELEASE;
                            of0VarOooOo0o.OooO0Oo();
                            qf0.Oooo00o((qf0) of0VarOooOo0o.f25822OooOo0o, str3);
                            int i3 = Build.VERSION.SDK_INT;
                            of0VarOooOo0o.OooO0Oo();
                            ((qf0) of0VarOooOo0o.f25822OooOo0o).zzA = i3;
                            int i4 = lf0Var.f20881OooOOOO;
                            of0VarOooOo0o.OooO0Oo();
                            qf0.OoooO0O((qf0) of0VarOooOo0o.f25822OooOo0o, i4);
                            int i5 = lf0Var.f20871OooO0OO;
                            of0VarOooOo0o.OooO0Oo();
                            ((qf0) of0VarOooOo0o.f25822OooOo0o).zzG = i5;
                            long j6 = nf0Var.f21481OooOoO;
                            of0VarOooOo0o.OooO0Oo();
                            ((qf0) of0VarOooOo0o.f25822OooOo0o).zzH = j6;
                            int i6 = lf0Var.f20879OooOOO;
                            of0VarOooOo0o.OooO0Oo();
                            qf0.OoooO00((qf0) of0VarOooOo0o.f25822OooOo0o, i6);
                            String str4 = lf0Var.f20872OooO0Oo;
                            of0VarOooOo0o.OooO0Oo();
                            qf0.OooOoO((qf0) of0VarOooOo0o.f25822OooOo0o, str4);
                            String str5 = lf0Var.f20874OooO0o0;
                            of0VarOooOo0o.OooO0Oo();
                            qf0.OooOoo((qf0) of0VarOooOo0o.f25822OooOo0o, str5);
                            String str6 = lf0Var.f20873OooO0o;
                            of0VarOooOo0o.OooO0Oo();
                            qf0.OooOooo((qf0) of0VarOooOo0o.f25822OooOo0o, str6);
                            r10 r10VarOooO00o = nf0Var.f21483OooOoOO.OooO00o(lf0Var.f20873OooO0o);
                            String string = (r10VarOooO00o == null || (c1788lg = r10VarOooO00o.f23727OooO0O0) == null) ? "" : c1788lg.toString();
                            of0VarOooOo0o.OooO0Oo();
                            ((qf0) of0VarOooOo0o.f25822OooOo0o).zzW = string;
                            String str7 = lf0Var.f20875OooO0oO;
                            of0VarOooOo0o.OooO0Oo();
                            qf0.Oooo0((qf0) of0VarOooOo0o.f25822OooOo0o, str7);
                            pf0 pf0Var = lf0Var.f20876OooO0oo;
                            of0VarOooOo0o.OooO0Oo();
                            ((qf0) of0VarOooOo0o.f25822OooOo0o).zzah = pf0Var.OooO00o();
                            String str8 = lf0Var.f20878OooOO0O;
                            of0VarOooOo0o.OooO0Oo();
                            qf0.OooOoOO((qf0) of0VarOooOo0o.f25822OooOo0o, str8);
                            String str9 = lf0Var.f20868OooO;
                            of0VarOooOo0o.OooO0Oo();
                            qf0.Oooo((qf0) of0VarOooOo0o.f25822OooOo0o, str9);
                            String str10 = lf0Var.f20877OooOO0;
                            of0VarOooOo0o.OooO0Oo();
                            ((qf0) of0VarOooOo0o.f25822OooOo0o).zzZ = str10;
                            long j7 = lf0Var.OooOO0o;
                            of0VarOooOo0o.OooO0Oo();
                            ((qf0) of0VarOooOo0o.f25822OooOo0o).zzm = j7;
                            if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0OO)).booleanValue()) {
                                List list = nf0Var.f21485OooOoo0;
                                of0VarOooOo0o.OooO0Oo();
                                qf0.OooOo((qf0) of0VarOooOo0o.f25822OooOo0o, list);
                            }
                            rf0 rf0Var = nf0Var.f21478OooOo;
                            sf0 sf0VarOooOo0o = tf0.OooOo0o();
                            sf0VarOooOo0o.OooO0Oo();
                            tf0.OooOo((tf0) sf0VarOooOo0o.f25822OooOo0o, (qf0) of0VarOooOo0o.OooO0O0());
                            rf0Var.OooO0Oo();
                            uf0.OooOoO0((uf0) rf0Var.f25822OooOo0o, (tf0) sf0VarOooOo0o.OooO0O0());
                            return;
                        } finally {
                        }
                    }
                }
                return;
            case 9:
                ze0.OoooOoO((WebView) this.f17704OooOo0o, (String) this.f17702OooOo);
                return;
            case 10:
                ((TaskCompletionSource) this.f17702OooOo).setResult(ij0.OooO00o((Context) this.f17704OooOo0o, "GLAS"));
                return;
            case 11:
                IBinder iBinder = (IBinder) this.f17702OooOo;
                int i7 = ak0.f17051OooOo0O;
                if (iBinder == null) {
                    zj0Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.lmd.protocol.ILmdOverlayService");
                    zj0Var = iInterfaceQueryLocalInterface instanceof bk0 ? (bk0) iInterfaceQueryLocalInterface : new zj0(iBinder, "com.google.android.play.core.lmd.protocol.ILmdOverlayService");
                }
                rk0 rk0Var = (rk0) this.f17704OooOo0o;
                C1643hi c1643hi = rk0Var.f23873OooOo0O;
                c1643hi.f19794OooOooo = zj0Var;
                ((or0) c1643hi.f19788OooOoO).OooO0OO("linkToDeath", new Object[0]);
                try {
                    bk0Var = (bk0) rk0Var.f23873OooOo0O.f19794OooOooo;
                } catch (RemoteException e2) {
                    ((or0) rk0Var.f23873OooOo0O.f19788OooOoO).OooO0O0(e2, "linkToDeath failed", new Object[0]);
                }
                if (bk0Var == null) {
                    throw null;
                }
                ((AbstractC2144v2) bk0Var).asBinder().linkToDeath((pk0) rk0Var.f23873OooOo0O.f19792OooOoo0, 0);
                C1643hi c1643hi2 = rk0Var.f23873OooOo0O;
                c1643hi2.f19785OooOo = false;
                synchronized (((ArrayList) c1643hi2.f19790OooOoOO)) {
                    try {
                        ArrayList arrayList = (ArrayList) rk0Var.f23873OooOo0O.f19790OooOoOO;
                        int size = arrayList.size();
                        while (i < size) {
                            Object obj = arrayList.get(i);
                            i++;
                            ((Runnable) obj).run();
                        }
                        ((ArrayList) rk0Var.f23873OooOo0O.f19790OooOoOO).clear();
                    } finally {
                    }
                }
                return;
            case 12:
                ((gp0) this.f17704OooOo0o).OooOOo((mm0) this.f17702OooOo);
                return;
            case 13:
                w41 w41Var = (w41) this.f17704OooOo0o;
                oOo0o0oO ooo0o0oo = (oOo0o0oO) this.f17702OooOo;
                int i8 = w41Var.f25203OoooO - ooo0o0oo.f22924OooO0O0;
                w41Var.f25203OoooO = i8;
                if (ooo0o0oo.f22925OooO0OO) {
                    w41Var.f25207OoooOO0 = ooo0o0oo.f22926OooO0Oo;
                    w41Var.o000oOoO = true;
                }
                if (i8 == 0) {
                    AbstractC1787lf abstractC1787lf = ((r51) ooo0o0oo.f22927OooO0o0).f23756OooO00o;
                    if (!w41Var.f25227ooOO.f23756OooO00o.OooOOOO() && abstractC1787lf.OooOOOO()) {
                        w41Var.f25222o00O0O = -1;
                        w41Var.f25223o00Oo0 = 0L;
                    }
                    if (!abstractC1787lf.OooOOOO()) {
                        List listAsList = Arrays.asList(((x51) abstractC1787lf).f25524OooO0oo);
                        af0.OooooO0(listAsList.size() == w41Var.f25197Oooo0O0.size());
                        for (int i9 = 0; i9 < listAsList.size(); i9++) {
                            ((v41) w41Var.f25197Oooo0O0.get(i9)).f24847OooO0O0 = (AbstractC1787lf) listAsList.get(i9);
                        }
                    }
                    if (w41Var.o000oOoO) {
                        if (((r51) ooo0o0oo.f22927OooO0o0).f23757OooO0O0.equals(w41Var.f25227ooOO.f23757OooO0O0) && ((r51) ooo0o0oo.f22927OooO0o0).f23759OooO0Oo == w41Var.f25227ooOO.f23770OooOOo) {
                            i = 0;
                        }
                        if (i != 0) {
                            if (abstractC1787lf.OooOOOO() || ((r51) ooo0o0oo.f22927OooO0o0).f23757OooO0O0.OooO0O0()) {
                                j2 = ((r51) ooo0o0oo.f22927OooO0o0).f23759OooO0Oo;
                            } else {
                                r51 r51Var = (r51) ooo0o0oo.f22927OooO0o0;
                                h91 h91Var = r51Var.f23757OooO0O0;
                                j2 = r51Var.f23759OooO0Oo;
                                abstractC1787lf.OooOOO(h91Var.f19657OooO00o, w41Var.f25193Oooo0);
                            }
                        }
                        j = j2;
                        z = i;
                    } else {
                        j = -9223372036854775807L;
                        z = 0;
                    }
                    w41Var.o000oOoO = false;
                    w41Var.o0000OOo((r51) ooo0o0oo.f22927OooO0o0, 1, z, w41Var.f25207OoooOO0, j, -1);
                    return;
                }
                return;
            case 14:
                o00O0O o00o0o = (o00O0O) this.f17704OooOo0o;
                g41 g41Var = (g41) this.f17702OooOo;
                o00o0o.getClass();
                synchronized (g41Var) {
                }
                int i10 = i80.f19994OooO00o;
                h61 h61Var = o00o0o.f21768OooO0O0.f24239OooOo0O.f25200Oooo0o0;
                h61Var.OooO(h61Var.OooOO0((h91) h61Var.f19577OooO0Oo.f23978OooOoO), 1013, new f61(20));
                return;
            case 15:
                o00O0O o00o0o2 = ((i71) ((ni0) this.f17704OooOo0o).f21493OooOo0o).f19978o0000O0O;
                Handler handler = o00o0o2.f21767OooO00o;
                if (handler != null) {
                    handler.post(new u61(o00o0o2, (v61) this.f17702OooOo, 4));
                    return;
                }
                return;
            case 16:
                ((InterfaceC1546ew) this.f17704OooOo0o).mo13701zza(this.f17702OooOo);
                return;
            default:
                v91 v91Var = (v91) this.f17704OooOo0o;
                oo0O oo0o = v91Var.f24911Oooo0OO;
                o000O00 o000o002 = (o000O00) this.f17702OooOo;
                v91Var.f24919OoooO0O = oo0o == null ? o000o002 : new o0000oo(-9223372036854775807L, 0L);
                v91Var.f24916OoooO = o000o002.zza();
                if (!v91Var.f24925OoooOoo && o000o002.zza() == -9223372036854775807L) {
                    z2 = true;
                }
                v91Var.f24920OoooOO0 = z2;
                v91Var.o000oOoO = true == z2 ? 7 : 1;
                if (v91Var.f24915Oooo0oo) {
                    v91Var.f24900OooOoOO.OooOOoo(o000o002.zzh(), v91Var.f24916OoooO, v91Var.f24920OoooOO0);
                    return;
                } else {
                    v91Var.OooOOo0();
                    return;
                }
        }
    }
}
