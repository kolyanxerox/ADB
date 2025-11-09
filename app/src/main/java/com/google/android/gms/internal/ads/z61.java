package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import androidx.work.WorkRequest;

/* loaded from: classes2.dex */
public final class z61 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final oOO0O000 f26099OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public int f26100OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public long f26101OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public long f26102OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public long f26103OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public long f26104OooO0o0;

    public z61(AudioTrack audioTrack) {
        this.f26099OooO00o = new oOO0O000(audioTrack);
        OooO00o(0);
    }

    public final void OooO00o(int i) {
        this.f26100OooO0O0 = i;
        long j = WorkRequest.MIN_BACKOFF_MILLIS;
        if (i == 0) {
            this.f26104OooO0o0 = 0L;
            this.f26103OooO0o = -1L;
            this.f26101OooO0OO = System.nanoTime() / 1000;
        } else {
            if (i == 1) {
                this.f26102OooO0Oo = WorkRequest.MIN_BACKOFF_MILLIS;
                return;
            }
            j = (i == 2 || i == 3) ? 10000000L : 500000L;
        }
        this.f26102OooO0Oo = j;
    }
}
