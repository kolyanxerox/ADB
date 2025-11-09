package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.C1452cb;
import com.google.android.gms.internal.ads.C1489db;
import com.google.android.gms.internal.ads.C1498dk;
import com.google.android.gms.internal.ads.C1752kh;
import java.util.Random;

/* loaded from: classes2.dex */
public final class zzbc {

    /* renamed from: OooO0o */
    public static final zzbc f16009OooO0o = new zzbc();
    public static final /* synthetic */ int zza = 0;

    /* renamed from: OooO00o */
    public final com.google.android.gms.ads.internal.util.client.zzf f16010OooO00o;

    /* renamed from: OooO0O0 */
    public final zzba f16011OooO0O0;

    /* renamed from: OooO0OO */
    public final String f16012OooO0OO;

    /* renamed from: OooO0Oo */
    public final VersionInfoParcel f16013OooO0Oo;

    /* renamed from: OooO0o0 */
    public final Random f16014OooO0o0;

    public zzbc() {
        com.google.android.gms.ads.internal.util.client.zzf zzfVar = new com.google.android.gms.ads.internal.util.client.zzf();
        zzba zzbaVar = new zzba(new zzk(), new zzi(), new zzfe(), new C1452cb("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl"), new C1498dk(), new C1752kh("com.google.android.gms.ads.AdOverlayCreatorImpl"), new C1489db("com.google.android.gms.ads.NativeAdViewHolderDelegateCreatorImpl"), new zzl());
        String strZze = com.google.android.gms.ads.internal.util.client.zzf.zze();
        VersionInfoParcel versionInfoParcel = new VersionInfoParcel(0, 244410000, true);
        Random random = new Random();
        this.f16010OooO00o = zzfVar;
        this.f16011OooO0O0 = zzbaVar;
        this.f16012OooO0OO = strZze;
        this.f16013OooO0Oo = versionInfoParcel;
        this.f16014OooO0o0 = random;
    }

    public static zzba zza() {
        return f16009OooO0o.f16011OooO0O0;
    }

    public static com.google.android.gms.ads.internal.util.client.zzf zzb() {
        return f16009OooO0o.f16010OooO00o;
    }

    public static VersionInfoParcel zzc() {
        return f16009OooO0o.f16013OooO0Oo;
    }

    public static String zzd() {
        return f16009OooO0o.f16012OooO0OO;
    }

    public static Random zze() {
        return f16009OooO0o.f16014OooO0o0;
    }
}
