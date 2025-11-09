package com.google.android.gms.ads.internal.util;

import OooOooo.o000O0O0;
import OooOooo.o000OO0O;
import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.io.IOException;

/* loaded from: classes2.dex */
final class zzc extends zzb {

    /* renamed from: OooO0O0 */
    public final Context f16254OooO0O0;

    public zzc(Context context) {
        this.f16254OooO0O0 = context;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        boolean isAdIdFakeForDebugLogging;
        try {
            isAdIdFakeForDebugLogging = AdvertisingIdClient.getIsAdIdFakeForDebugLogging(this.f16254OooO0O0);
        } catch (o000O0O0 | o000OO0O | IOException | IllegalStateException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Fail to get isAdIdFakeForDebugLogging", e);
            isAdIdFakeForDebugLogging = false;
        }
        com.google.android.gms.ads.internal.util.client.zzl.zzj(isAdIdFakeForDebugLogging);
        com.google.android.gms.ads.internal.util.client.zzo.zzj("Update ad debug logging enablement as " + isAdIdFakeForDebugLogging);
    }
}
