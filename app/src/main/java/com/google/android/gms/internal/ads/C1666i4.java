package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.zzc;
import com.google.android.gms.ads.zzh;

/* renamed from: com.google.android.gms.internal.ads.i4 */
/* loaded from: classes2.dex */
public final class C1666i4 extends zzc {

    /* renamed from: OoooOoO */
    public final /* synthetic */ int f19939OoooOoO = 1;

    public /* synthetic */ C1666i4(int i, Oooo00O.OooO0OO oooO0OO, Oooo00O.OooO0o oooO0o, Context context, Looper looper) {
        super(i, oooO0OO, oooO0o, context, looper);
    }

    @Override // Oooo00O.OooOO0O
    public final IInterface OooO0O0(IBinder iBinder) {
        switch (this.f19939OoooOoO) {
            case 0:
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.cache.ICacheService");
                return iInterfaceQueryLocalInterface instanceof C1739k4 ? (C1739k4) iInterfaceQueryLocalInterface : new C1739k4(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
            case 1:
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface2 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
                return iInterfaceQueryLocalInterface2 instanceof C1969qc ? (C1969qc) iInterfaceQueryLocalInterface2 : new C1969qc(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
            default:
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface3 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
                return iInterfaceQueryLocalInterface3 instanceof InterfaceC1902oi ? (InterfaceC1902oi) iInterfaceQueryLocalInterface3 : new C1864ni(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
        }
    }

    @Override // Oooo00O.OooOO0O
    public final String OooO0o() {
        switch (this.f19939OoooOoO) {
            case 0:
                return "com.google.android.gms.ads.service.CACHE";
            case 1:
                return "com.google.android.gms.ads.service.HTTP";
            default:
                return "com.google.android.gms.ads.service.START";
        }
    }

    @Override // Oooo00O.OooOO0O
    public final String OooO0o0() {
        switch (this.f19939OoooOoO) {
            case 0:
                return "com.google.android.gms.ads.internal.cache.ICacheService";
            case 1:
                return "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService";
            default:
                return "com.google.android.gms.ads.internal.request.IAdRequestService";
        }
    }

    public boolean OooOO0O() {
        OooOooo.o000O00O[] availableFeatures = getAvailableFeatures();
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17942oooo00o)).booleanValue()) {
            OooOooo.o000O00O o000o00o2 = zzh.zza;
            int length = availableFeatures != null ? availableFeatures.length : 0;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (!Oooo00O.o000000O.OooOO0o(availableFeatures[i], o000o00o2)) {
                    i++;
                } else if (i >= 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // Oooo00O.OooOO0O
    public OooOooo.o000O00O[] getApiFeatures() {
        switch (this.f19939OoooOoO) {
            case 0:
                return zzh.zzb;
            default:
                return super.getApiFeatures();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1666i4(Context context, Looper looper, Oooo00O.OooO0OO oooO0OO, Oooo00O.OooO0o oooO0o) {
        int i = AbstractC1497dj.f18262OooO00o;
        Context applicationContext = context.getApplicationContext();
        super(123, oooO0OO, oooO0o, applicationContext == null ? context : applicationContext, looper);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1666i4(Context context, Looper looper, o40 o40Var, o40 o40Var2) {
        int i = AbstractC1497dj.f18262OooO00o;
        Context applicationContext = context.getApplicationContext();
        super(8, o40Var, o40Var2, applicationContext == null ? context : applicationContext, looper);
    }
}
