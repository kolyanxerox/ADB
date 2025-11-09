package OoooOOO;

import Oooo00O.o000000O;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.o000O0o;

/* loaded from: classes2.dex */
public final class oO0000o0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final Context f14624OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final Boolean f14625OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final long f14626OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final o000O0o f14627OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final Long f14628OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f14629OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public final String f14630OooO0oO;

    public oO0000o0(Context context, o000O0o o000o0o2, Long l) {
        this.f14629OooO0o0 = true;
        o000000O.OooO0oo(context);
        Context applicationContext = context.getApplicationContext();
        o000000O.OooO0oo(applicationContext);
        this.f14624OooO00o = applicationContext;
        this.f14628OooO0o = l;
        if (o000o0o2 != null) {
            this.f14627OooO0Oo = o000o0o2;
            this.f14629OooO0o0 = o000o0o2.zzc;
            this.f14626OooO0OO = o000o0o2.zzb;
            this.f14630OooO0oO = o000o0o2.zze;
            Bundle bundle = o000o0o2.zzd;
            if (bundle != null) {
                this.f14625OooO0O0 = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
