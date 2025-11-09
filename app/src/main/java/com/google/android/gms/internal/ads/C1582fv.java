package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.internal.overlay.zzr;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import java.util.Collections;

/* renamed from: com.google.android.gms.internal.ads.fv */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1582fv implements InterfaceC1730jw {

    /* renamed from: OooOo0O */
    public final /* synthetic */ int f19129OooOo0O;

    public /* synthetic */ C1582fv(int i) {
        this.f19129OooOo0O = i;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1730jw, com.google.android.gms.internal.ads.InterfaceC1770kz
    /* renamed from: zza */
    public final void mo13701zza(Object obj) {
        boolean zZzW;
        int i;
        boolean zZzW2;
        int i2;
        switch (this.f19129OooOo0O) {
            case 0:
                ((InterfaceC1656hv) obj).OoooOOO();
                return;
            case 1:
                ((OnAdMetadataChangedListener) obj).onAdMetadataChanged();
                return;
            case 2:
                ((InterfaceC1840mv) obj).zzg();
                return;
            case 3:
                ((zzr) obj).zzdp();
                return;
            case 4:
                ((zzr) obj).zzdi();
                return;
            case 5:
                ((zzr) obj).zzdo();
                return;
            case 6:
                ((zzr) obj).zzdE();
                return;
            case 7:
                ((zzr) obj).zzdr();
                return;
            case 8:
                b90 b90Var = (b90) ((InterfaceC2025rv) obj);
                synchronized (b90Var) {
                    try {
                        Object parent = b90Var.f17455OooOo0o.f20277OooO0o.getParent();
                        if (parent instanceof View) {
                            View view = (View) parent;
                            zzv.zzq();
                            zZzW = zzs.zzW(view, view.getContext());
                        } else {
                            zZzW = false;
                        }
                        if (!zZzW) {
                            jc0 jc0Var = b90Var.f17455OooOo0o;
                            C2099tv c2099tv = jc0Var.f20280OooO0oo;
                            C1509dw c1509dw = jc0Var.f20281OooOO0;
                            synchronized (c1509dw) {
                                i = c1509dw.f18415OooOo0O;
                            }
                            c2099tv.o00000oo(i);
                            return;
                        }
                        com.google.android.gms.ads.internal.client.zzs zzsVarOooO0o = b90Var.f17458OooOoOO.f24626OooO0O0;
                        AbstractC1433bs abstractC1433bs = b90Var.f17461OooOooO;
                        if (abstractC1433bs != null && abstractC1433bs.OooO0oO() != null && b90Var.f17458OooOoOO.f24640OooOOo0) {
                            zzsVarOooO0o = ze0.OooO0o(b90Var.f17454OooOo0O, Collections.singletonList(b90Var.f17461OooOooO.OooO0oO()));
                        }
                        synchronized (b90Var) {
                            ud0 ud0Var = b90Var.f17458OooOoOO;
                            ud0Var.f24626OooO0O0 = zzsVarOooO0o;
                            ud0Var.f24640OooOOo0 = b90Var.f17456OooOoO.zzn;
                            ud0Var.f24638OooOOOo = true;
                            try {
                                b90Var.o000O0O0(ud0Var.f24625OooO00o);
                            } catch (RemoteException unused) {
                                zzo.zzj("Failed to refresh the banner ad.");
                            }
                            b90Var.f17458OooOoOO.f24638OooOOOo = false;
                        }
                        return;
                    } finally {
                    }
                }
            case 9:
                b90 b90Var2 = (b90) ((InterfaceC2025rv) obj);
                synchronized (b90Var2) {
                    Object parent2 = b90Var2.f17455OooOo0o.f20277OooO0o.getParent();
                    if (parent2 instanceof View) {
                        View view2 = (View) parent2;
                        zzv.zzq();
                        zZzW2 = zzs.zzW(view2, view2.getContext());
                    } else {
                        zZzW2 = false;
                    }
                    if (zZzW2) {
                        b90Var2.f17455OooOo0o.OooO0OO();
                        return;
                    }
                    jc0 jc0Var2 = b90Var2.f17455OooOo0o;
                    C1509dw c1509dw2 = jc0Var2.f20281OooOO0;
                    C2099tv c2099tv2 = jc0Var2.f20280OooO0oo;
                    synchronized (c1509dw2) {
                        i2 = c1509dw2.f18416OooOo0o;
                    }
                    c2099tv2.o0000(i2);
                    return;
                }
            case 10:
                ((InterfaceC2321zv) obj).zza();
                return;
            case 11:
                ((InterfaceC1437bw) obj).zzi();
                return;
            case 12:
                ((InterfaceC1437bw) obj).zzj();
                return;
            case 13:
                ((InterfaceC1620gw) obj).zzh();
                return;
            case 14:
                ((InterfaceC1693iw) obj).zza();
                return;
            case 15:
                ((InterfaceC1952pw) obj).zza("MalformedJson");
                return;
            case 16:
                ((InterfaceC1952pw) obj).zzf();
                return;
            case 17:
                ((InterfaceC1952pw) obj).zze();
                return;
            case 18:
                ((InterfaceC1989qw) obj).zzl();
                return;
            case 19:
                ((InterfaceC1989qw) obj).zzk();
                return;
            case 20:
                ((InterfaceC2100tw) obj).zza();
                return;
            case 21:
                ((InterfaceC2100tw) obj).zzb();
                return;
            case 22:
                ((InterfaceC2211ww) obj).zzt();
                return;
            case 23:
                ((InterfaceC1401ax) obj).zzu();
                return;
            case 24:
                ((InterfaceC1401ax) obj).Oooo000();
                return;
            case 25:
                C1474cx c1474cx = (C1474cx) obj;
                if (c1474cx.f18068OooO0Oo) {
                    return;
                }
                c1474cx.f18066OooO0O0.OooO0OO(c1474cx.f18065OooO00o, c1474cx.f18067OooO0OO);
                c1474cx.f18068OooO0Oo = true;
                return;
            case 26:
                ((InterfaceC1417bc) obj).zzc();
                return;
            case 27:
                ((InterfaceC1417bc) obj).zzb();
                return;
            case 28:
                ((VideoController.VideoLifecycleCallbacks) obj).onVideoPause();
                return;
            default:
                ((VideoController.VideoLifecycleCallbacks) obj).onVideoEnd();
                return;
        }
    }
}
