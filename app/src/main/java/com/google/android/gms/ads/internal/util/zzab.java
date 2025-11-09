package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.media.AudioManager;
import com.unity3d.services.core.device.MimeTypes;

/* loaded from: classes2.dex */
public final class zzab {

    /* renamed from: OooO00o, reason: collision with root package name */
    public boolean f16195OooO00o = false;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public float f16196OooO0O0 = 1.0f;

    public static float zzb(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        if (audioManager == null) {
            return 0.0f;
        }
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        int streamVolume = audioManager.getStreamVolume(3);
        if (streamMaxVolume != 0) {
            return streamVolume / streamMaxVolume;
        }
        return 0.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0011 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0012 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized float zza() {
        /*
            r2 = this;
            monitor-enter(r2)
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L1a
            float r0 = r2.f16196OooO0O0     // Catch: java.lang.Throwable -> L15
            r1 = 0
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 < 0) goto Lc
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1a
            r1 = 1
            goto Le
        Lc:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1a
            r1 = 0
        Le:
            monitor-exit(r2)
            if (r1 == 0) goto L12
            return r0
        L12:
            r0 = 1065353216(0x3f800000, float:1.0)
            return r0
        L15:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L15
            throw r0     // Catch: java.lang.Throwable -> L1a
        L18:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1a
            throw r0
        L1a:
            r0 = move-exception
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.zzab.zza():float");
    }

    public final synchronized void zzc(boolean z) {
        this.f16195OooO00o = z;
    }

    public final synchronized void zzd(float f) {
        this.f16196OooO0O0 = f;
    }

    public final synchronized boolean zze() {
        return this.f16195OooO00o;
    }
}
