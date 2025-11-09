package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzby;
import com.google.android.gms.ads.internal.util.zze;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.td */
/* loaded from: classes2.dex */
public final class C2081td implements InterfaceC2042sb {

    /* renamed from: OooOo, reason: collision with root package name */
    public final Object f24296OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f24297OooOo0O = 1;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final Object f24298OooOo0o;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final Object f24299OooOoO0;

    public C2081td(C2229xd c2229xd, C1822md c1822md, zzby zzbyVar) {
        this.f24298OooOo0o = c1822md;
        this.f24296OooOo = zzbyVar;
        this.f24299OooOoO0 = c2229xd;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2042sb
    public final void OooO0o0(Object obj, Map map) {
        switch (this.f24297OooOo0O) {
            case 0:
                zze.zza("loadJavascriptEngine > /requestReload handler: Trying to acquire lock");
                synchronized (((C2229xd) this.f24299OooOoO0).f25607OooO0Oo) {
                    try {
                        zze.zza("loadJavascriptEngine > /requestReload handler: Lock acquired");
                        zzo.zzi("JS Engine is requesting an update");
                        if (((C2229xd) this.f24299OooOoO0).f25606OooO0OO == 0) {
                            zzo.zzi("Starting reload.");
                            C2229xd c2229xd = (C2229xd) this.f24299OooOoO0;
                            c2229xd.f25606OooO0OO = 2;
                            c2229xd.OooO0Oo();
                        }
                        ((C1822md) this.f24298OooOo0o).OooOO0("/requestReload", (InterfaceC2042sb) ((zzby) this.f24296OooOo).zza());
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                zze.zza("loadJavascriptEngine > /requestReload handler: Lock released");
                return;
            default:
                String str = (String) map.get("asset");
                try {
                    ((InterfaceC1708ja) this.f24298OooOo0o).o0000OOO((InterfaceC1415ba) ((n31) this.f24299OooOoO0).zzb(), str);
                    return;
                } catch (RemoteException e) {
                    zzo.zzk("Failed to call onCustomClick for asset " + str + ".", e);
                    return;
                }
        }
    }

    public C2081td(C2213wy c2213wy, C2065sy c2065sy, z00 z00Var, n31 n31Var) {
        this.f24298OooOo0o = (InterfaceC1708ja) c2213wy.f25427OooO0oO.get(c2065sy.OooO00o());
        this.f24296OooOo = z00Var;
        this.f24299OooOoO0 = n31Var;
    }
}
