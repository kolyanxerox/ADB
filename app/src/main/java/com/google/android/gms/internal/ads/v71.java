package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class v71 implements a81 {

    /* renamed from: OooOo */
    public t71 f24880OooOo;

    /* renamed from: OooOo0O */
    public final MediaCodec f24881OooOo0O;

    /* renamed from: OooOo0o */
    public final HandlerThread f24882OooOo0o;

    /* renamed from: OooOoO */
    public final o0000o0.OooOOO f24883OooOoO;

    /* renamed from: OooOoO0 */
    public final AtomicReference f24884OooOoO0;

    /* renamed from: OooOoOO */
    public boolean f24885OooOoOO;

    /* renamed from: OooOoo0 */
    public static final ArrayDeque f24879OooOoo0 = new ArrayDeque();

    /* renamed from: OooOoo */
    public static final Object f24878OooOoo = new Object();

    public v71(MediaCodec mediaCodec, HandlerThread handlerThread) {
        o0000o0.OooOOO oooOOO = new o0000o0.OooOOO(2);
        this.f24881OooOo0O = mediaCodec;
        this.f24882OooOo0o = handlerThread;
        this.f24883OooOoO = oooOOO;
        this.f24884OooOoO0 = new AtomicReference();
    }

    public static u71 OooO0Oo() {
        ArrayDeque arrayDeque = f24879OooOoo0;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new u71();
                }
                return (u71) arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.a81
    public final void OooO00o(int i, int i2, int i3, long j) {
        zzc();
        u71 u71VarOooO0Oo = OooO0Oo();
        u71VarOooO0Oo.f24586OooO00o = i;
        u71VarOooO0Oo.f24587OooO0O0 = i2;
        u71VarOooO0Oo.f24589OooO0Oo = j;
        u71VarOooO0Oo.f24590OooO0o0 = i3;
        t71 t71Var = this.f24880OooOo;
        int i4 = i80.f19994OooO00o;
        t71Var.obtainMessage(1, u71VarOooO0Oo).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.a81
    public final void OooO0O0(Bundle bundle) {
        zzc();
        t71 t71Var = this.f24880OooOo;
        int i = i80.f19994OooO00o;
        t71Var.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.a81
    public final void OooO0OO(int i, h31 h31Var, long j) {
        int length;
        int length2;
        int length3;
        int length4;
        zzc();
        u71 u71VarOooO0Oo = OooO0Oo();
        u71VarOooO0Oo.f24586OooO00o = i;
        u71VarOooO0Oo.f24587OooO0O0 = 0;
        u71VarOooO0Oo.f24589OooO0Oo = j;
        u71VarOooO0Oo.f24590OooO0o0 = 0;
        int i2 = h31Var.f19538OooO0o;
        MediaCodec.CryptoInfo cryptoInfo = u71VarOooO0Oo.f24588OooO0OO;
        cryptoInfo.numSubSamples = i2;
        int[] iArr = h31Var.f19537OooO0Oo;
        int[] iArrCopyOf = cryptoInfo.numBytesOfClearData;
        if (iArr != null) {
            if (iArrCopyOf == null || iArrCopyOf.length < (length4 = iArr.length)) {
                iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            } else {
                System.arraycopy(iArr, 0, iArrCopyOf, 0, length4);
            }
        }
        cryptoInfo.numBytesOfClearData = iArrCopyOf;
        int[] iArr2 = h31Var.f19539OooO0o0;
        int[] iArrCopyOf2 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr2 != null) {
            if (iArrCopyOf2 == null || iArrCopyOf2.length < (length3 = iArr2.length)) {
                iArrCopyOf2 = Arrays.copyOf(iArr2, iArr2.length);
            } else {
                System.arraycopy(iArr2, 0, iArrCopyOf2, 0, length3);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArrCopyOf2;
        byte[] bArr = h31Var.f19535OooO0O0;
        byte[] bArrCopyOf = cryptoInfo.key;
        if (bArr != null) {
            if (bArrCopyOf == null || bArrCopyOf.length < (length2 = bArr.length)) {
                bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            } else {
                System.arraycopy(bArr, 0, bArrCopyOf, 0, length2);
            }
        }
        bArrCopyOf.getClass();
        cryptoInfo.key = bArrCopyOf;
        byte[] bArr2 = h31Var.f19534OooO00o;
        byte[] bArrCopyOf2 = cryptoInfo.iv;
        if (bArr2 != null) {
            if (bArrCopyOf2 == null || bArrCopyOf2.length < (length = bArr2.length)) {
                bArrCopyOf2 = Arrays.copyOf(bArr2, bArr2.length);
            } else {
                System.arraycopy(bArr2, 0, bArrCopyOf2, 0, length);
            }
        }
        bArrCopyOf2.getClass();
        cryptoInfo.iv = bArrCopyOf2;
        cryptoInfo.mode = h31Var.f19536OooO0OO;
        if (i80.f19994OooO00o >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(h31Var.f19540OooO0oO, h31Var.f19541OooO0oo));
        }
        this.f24880OooOo.obtainMessage(2, u71VarOooO0Oo).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.a81, com.google.android.gms.internal.ads.o00Oo0
    public final void zzb() {
        o0000o0.OooOOO oooOOO = this.f24883OooOoO;
        if (this.f24885OooOoOO) {
            try {
                t71 t71Var = this.f24880OooOo;
                if (t71Var == null) {
                    throw null;
                }
                t71Var.removeCallbacksAndMessages(null);
                synchronized (oooOOO) {
                    oooOOO.f29577OooOo0o = false;
                }
                t71 t71Var2 = this.f24880OooOo;
                if (t71Var2 == null) {
                    throw null;
                }
                t71Var2.obtainMessage(3).sendToTarget();
                synchronized (oooOOO) {
                    while (!oooOOO.f29577OooOo0o) {
                        oooOOO.wait();
                    }
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.a81
    public final void zzc() {
        RuntimeException runtimeException = (RuntimeException) this.f24884OooOoO0.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    @Override // com.google.android.gms.internal.ads.a81
    public final void zzg() {
        if (this.f24885OooOoOO) {
            zzb();
            this.f24882OooOo0o.quit();
        }
        this.f24885OooOoOO = false;
    }

    @Override // com.google.android.gms.internal.ads.a81
    public final void zzh() {
        if (this.f24885OooOoOO) {
            return;
        }
        HandlerThread handlerThread = this.f24882OooOo0o;
        handlerThread.start();
        this.f24880OooOo = new t71(this, handlerThread.getLooper());
        this.f24885OooOoOO = true;
    }
}
