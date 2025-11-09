package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zzs;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.pm */
/* loaded from: classes2.dex */
public final class C1942pm {

    /* renamed from: OooO0O0 */
    public long f23373OooO0O0;

    /* renamed from: OooO00o */
    public final long f23372OooO00o = TimeUnit.MILLISECONDS.toNanos(((Long) zzbe.zzc().OooO00o(AbstractC1448c7.f17751OoooO00)).longValue());

    /* renamed from: OooO0OO */
    public boolean f23374OooO0OO = true;

    public final void OooO00o(SurfaceTexture surfaceTexture, C1831mm c1831mm) {
        if (c1831mm == null) {
            return;
        }
        long timestamp = surfaceTexture.getTimestamp();
        if (!this.f23374OooO0OO) {
            long j = timestamp - this.f23373OooO0O0;
            if (Math.abs(j) < this.f23372OooO00o) {
                return;
            }
        }
        this.f23374OooO0OO = false;
        this.f23373OooO0O0 = timestamp;
        zzs.zza.post(new RunnableC1757km(c1831mm, 3));
    }
}
