package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes2.dex */
public final /* synthetic */ class p70 implements ThreadFactory {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f23239OooO00o;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f23239OooO00o) {
            case 0:
                return new Thread(runnable, "ExoPlayer:Loader:ProgressiveMediaPeriod");
            default:
                return new Thread(runnable, "ExoPlayer:AudioTrackReleaseThread");
        }
    }
}
