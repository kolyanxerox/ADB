package com.google.android.gms.ads.internal.util;

import OooOooo.o000OO00;
import android.content.Context;
import com.google.android.gms.internal.ads.AbstractC1448c7;
import com.google.android.gms.internal.ads.C2249xx;
import com.google.android.gms.internal.ads.O0O0;
import com.google.android.gms.internal.ads.o0O;
import com.google.android.gms.internal.ads.oOOO00;
import com.google.android.gms.internal.ads.oOOO00o0;
import com.google.android.gms.internal.ads.oOOO0O0o;
import com.google.android.gms.internal.ads.oOOOoo00;
import java.io.File;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class zzaz extends C2249xx {

    /* renamed from: OooOoO0 */
    public final Context f16221OooOoO0;

    public zzaz(Context context, o0O o0o) {
        super(o0o);
        this.f16221OooOoO0 = context;
    }

    public static oOOO0O0o zzb(Context context) {
        oOOO0O0o oooo0o0o = new oOOO0O0o(new O0O0(new File(new File(context.getCacheDir(), "admob_volley").getPath())), new zzaz(context, new o0O(23)));
        oooo0o0o.OooO0OO();
        return oooo0o0o;
    }

    @Override // com.google.android.gms.internal.ads.C2249xx, com.google.android.gms.internal.ads.ooooO0O0
    public final oOOO00 zza(oOOO00o0 oooo00o0) throws oOOOoo00 {
        if (oooo00o0.zza() == 0) {
            if (Pattern.matches((String) com.google.android.gms.ads.internal.client.zzbe.zzc().OooO00o(AbstractC1448c7.o00o000), oooo00o0.zzk())) {
                com.google.android.gms.ads.internal.client.zzbc.zzb();
                Context context = this.f16221OooOoO0;
                if (com.google.android.gms.ads.internal.util.client.zzf.zzs(context, 13400000)) {
                    oOOO00 oooo00Zza = new o000OO00(context, 1).zza(oooo00o0);
                    if (oooo00Zza != null) {
                        zze.zza("Got gmscore asset response: ".concat(String.valueOf(oooo00o0.zzk())));
                        return oooo00Zza;
                    }
                    zze.zza("Failed to get gmscore asset response: ".concat(String.valueOf(oooo00o0.zzk())));
                }
            }
        }
        return super.zza(oooo00o0);
    }
}
