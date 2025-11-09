package com.google.android.gms.internal.ads;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class oOO0O000 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public long f22795OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public long f22796OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public long f22797OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final Object f22798OooO0Oo;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final Object f22799OooO0o0;

    public /* synthetic */ oOO0O000(ByteBuffer byteBuffer, long j, long j2, long j3, ByteBuffer byteBuffer2) {
        this.f22798OooO0Oo = byteBuffer;
        this.f22795OooO00o = j;
        this.f22796OooO0O0 = j2;
        this.f22797OooO0OO = j3;
        this.f22799OooO0o0 = byteBuffer2;
    }

    public oOO0O000(AudioTrack audioTrack) {
        this.f22798OooO0Oo = audioTrack;
        this.f22799OooO0o0 = new AudioTimestamp();
    }
}
