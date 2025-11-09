package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.ads.internal.util.zzba;

/* renamed from: com.google.android.gms.internal.ads.u6 */
/* loaded from: classes2.dex */
public final class C2111u6 implements InterfaceC1730jw, vp0, il0 {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final Context f24565OooOo0O;

    public /* synthetic */ C2111u6(Context context, boolean z) {
        this.f24565OooOo0O = context;
    }

    public boolean OooO00o(Intent intent) {
        Oooo00O.o000000O.OooO(intent, "Intent can not be null");
        return !this.f24565OooOo0O.getPackageManager().queryIntentActivities(intent, 0).isEmpty();
    }

    @Override // com.google.android.gms.internal.ads.il0
    /* renamed from: zza */
    public Object mo13704zza() {
        return gb1.OooO00o(this.f24565OooOo0O);
    }

    @Override // com.google.android.gms.internal.ads.vp0
    /* renamed from: zzb */
    public /* bridge */ /* synthetic */ void mo13705zzb(Object obj) {
        if (((Boolean) AbstractC1413b8.f17440OooOO0.OooOOO()).booleanValue()) {
            af0.OoooOO0(this.f24565OooOo0O);
        }
    }

    public C2111u6(Context context) {
        Oooo00O.o000000O.OooO(context, "Context can not be null");
        this.f24565OooOo0O = context;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1730jw, com.google.android.gms.internal.ads.InterfaceC1770kz
    /* renamed from: zza */
    public void mo13701zza(Object obj) {
        ((InterfaceC1436bv) obj).OooOOO(this.f24565OooOo0O);
    }

    @Override // com.google.android.gms.internal.ads.vp0
    public void zza(Throwable th) {
        if (((Boolean) AbstractC1413b8.f17439OooO0oo.OooOOO()).booleanValue() && (th instanceof zzba)) {
            af0.OoooOO0(this.f24565OooOo0O);
        }
    }
}
