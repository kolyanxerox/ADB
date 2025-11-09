package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.util.client.zzq;
import com.google.android.gms.ads.internal.util.zzbd;
import com.google.android.gms.ads.internal.util.zze;
import java.io.ByteArrayInputStream;
import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.rd */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2007rd implements InterfaceC1390am, InterfaceC1427bm, InterfaceC1455ce, InterfaceC1492de, zzbd, zzq, InterfaceC1680ii, o0000, vp0, InterfaceC1730jw {

    /* renamed from: OooOo0O */
    public final /* synthetic */ int f23847OooOo0O;

    public /* synthetic */ C2007rd(int i) {
        this.f23847OooOo0O = i;
    }

    @Override // com.google.android.gms.internal.ads.o0000
    public o00000O[] OooO0OO(Uri uri, Map map) {
        switch (this.f23847OooOo0O) {
            case 14:
                AtomicInteger atomicInteger = C2313zn.f26210Oooo;
                return new o00000O[]{new o0OO000o(), new o0O00O0o()};
            default:
                AtomicInteger atomicInteger2 = C2313zn.f26210Oooo;
                return new o00000O[]{new o0OO000o(), new o0O00O0o(), new o0O0oo00(o0oo0000.f22278OooOO0O, 32, gn0.f19388OooOoO)};
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1455ce
    public Object OooO0Oo(JSONObject jSONObject) {
        switch (this.f23847OooOo0O) {
            case 3:
                return new ByteArrayInputStream(jSONObject.toString().getBytes(AbstractC1565fe.f18932OooO00o));
            default:
                return jSONObject;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1390am, com.google.android.gms.internal.ads.InterfaceC1502dp, com.google.android.gms.internal.ads.h90
    /* renamed from: zza */
    public void mo13707zza() {
        int i = this.f23847OooOo0O;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1492de
    public /* bridge */ /* synthetic */ JSONObject zzb(Object obj) {
        return (JSONObject) obj;
    }

    @Override // com.google.android.gms.internal.ads.vp0
    public void zza(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.vp0
    /* renamed from: zzb */
    public /* synthetic */ void mo13705zzb(Object obj) {
        ((AbstractC1397at) obj).zzr();
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzq
    public Object zza(Object obj) {
        IBinder iBinder = (IBinder) obj;
        switch (this.f23847OooOo0O) {
            case 7:
                int i = AbstractBinderC1613gp.f19394OooOo0O;
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.measurement.IMeasurementManager");
                if (iInterfaceQueryLocalInterface instanceof InterfaceC1650hp) {
                    return (InterfaceC1650hp) iInterfaceQueryLocalInterface;
                }
                return new C1576fp(iBinder, "com.google.android.gms.ads.measurement.IMeasurementManager");
            default:
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface2 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
                if (iInterfaceQueryLocalInterface2 instanceof C2198wj) {
                    return (C2198wj) iInterfaceQueryLocalInterface2;
                }
                return new C2198wj(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1427bm
    /* renamed from: zza */
    public void mo13708zza(Object obj) {
        switch (this.f23847OooOo0O) {
            case 1:
                zze.zza("Ending javascript session.");
                C2303zd c2303zd = (C2303zd) ((InterfaceC2266yd) obj);
                HashSet hashSet = c2303zd.f26148OooOo0o;
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    AbstractMap.SimpleEntry simpleEntry = (AbstractMap.SimpleEntry) it.next();
                    zze.zza("Unregistering eventhandler: ".concat(String.valueOf(((InterfaceC2042sb) simpleEntry.getValue()).toString())));
                    c2303zd.f26147OooOo0O.OooOO0((String) simpleEntry.getKey(), (InterfaceC2042sb) simpleEntry.getValue());
                }
                hashSet.clear();
                break;
            case 2:
                AbstractC2200wl.f25325OooO0o.execute(new RunnableC1897od((C1822md) obj, 2));
                break;
            case 21:
                ((zza) obj).onAdClicked();
                break;
            case 22:
                ((InterfaceC2172vu) obj).zzb();
                break;
            case 23:
                ((InterfaceC2283yu) obj).OooO0o0(af0.Oooo0O0(11, null, null));
                break;
            case 24:
                ((InterfaceC1399av) obj).zzr();
                break;
            case 25:
                ((InterfaceC2024ru) obj).zza();
                break;
            case 26:
                ((InterfaceC2024ru) obj).zzb();
                break;
            case 27:
                ((InterfaceC2024ru) obj).zzc();
                break;
            case 28:
                ((InterfaceC2024ru) obj).zzf();
                break;
            default:
                ((InterfaceC2024ru) obj).zze();
                break;
        }
    }

    private final void OooO0o() {
    }

    private final void OooO0o0() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1680ii
    public void OooO00o(String str, Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1680ii
    public void OooO0O0(Throwable th, String str, float f) {
    }
}
