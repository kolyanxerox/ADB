package com.google.android.gms.internal.ads;

import android.media.AudioProfile;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class l61 {
    public static /* synthetic */ PlaybackMetrics.Builder OooO() {
        return new PlaybackMetrics.Builder();
    }

    public static /* bridge */ /* synthetic */ AudioProfile OooO0O0(Object obj) {
        return (AudioProfile) obj;
    }

    public static /* synthetic */ NetworkEvent.Builder OooO0OO() {
        return new NetworkEvent.Builder();
    }

    public static /* synthetic */ PlaybackErrorEvent.Builder OooO0Oo() {
        return new PlaybackErrorEvent.Builder();
    }

    public static /* synthetic */ PlaybackStateEvent.Builder OooOO0O() {
        return new PlaybackStateEvent.Builder();
    }

    public static /* synthetic */ TrackChangeEvent.Builder OooOO0o(int i) {
        return new TrackChangeEvent.Builder(i);
    }
}
