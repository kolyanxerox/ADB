package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* loaded from: classes2.dex */
public final class h31 {

    /* renamed from: OooO, reason: collision with root package name */
    public final MediaCodec.CryptoInfo f19533OooO;

    /* renamed from: OooO00o, reason: collision with root package name */
    public byte[] f19534OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public byte[] f19535OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public int f19536OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public int[] f19537OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public int f19538OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public int[] f19539OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public int f19540OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public int f19541OooO0oo;

    /* renamed from: OooOO0, reason: collision with root package name */
    public final dx0 f19542OooOO0;

    public h31() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f19533OooO = cryptoInfo;
        this.f19542OooOO0 = i80.f19994OooO00o >= 24 ? new dx0(cryptoInfo) : null;
    }

    public final void OooO00o(int i) {
        if (i == 0) {
            return;
        }
        if (this.f19537OooO0Oo == null) {
            int[] iArr = new int[1];
            this.f19537OooO0Oo = iArr;
            this.f19533OooO.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.f19537OooO0Oo;
        iArr2[0] = iArr2[0] + i;
    }
}
