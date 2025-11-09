package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.security.SecureRandom;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;

/* loaded from: classes2.dex */
public final class pd0 implements InterfaceC1730jw, vp0, OnCompleteListener, il0, InterfaceC1770kz, a81, o00Oo0 {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f23324OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final Object f23325OooOo0o;

    public /* synthetic */ pd0(d61 d61Var, o0OoOo0 o0oooo0, h41 h41Var) {
        this.f23324OooOo0O = 9;
        this.f23325OooOo0o = o0oooo0;
    }

    public static pd0 OooO0o0(byte[] bArr) {
        return new pd0(az0.OooO00o(bArr), 6);
    }

    public static pd0 OooO0oo(int i) {
        Oooo0oO.o00000O o00000o = uu0.f24788OooO00o;
        byte[] bArr = new byte[i];
        ((SecureRandom) uu0.f24788OooO00o.get()).nextBytes(bArr);
        return new pd0(az0.OooO00o(bArr), 6);
    }

    public s31 OooO() {
        return new s31((LinkedHashMap) this.f23325OooOo0o);
    }

    @Override // com.google.android.gms.internal.ads.a81
    public void OooO00o(int i, int i2, int i3, long j) throws MediaCodec.CryptoException {
        ((MediaCodec) this.f23325OooOo0o).queueInputBuffer(i, 0, i2, j, i3);
    }

    @Override // com.google.android.gms.internal.ads.a81
    public void OooO0O0(Bundle bundle) {
        ((MediaCodec) this.f23325OooOo0o).setParameters(bundle);
    }

    @Override // com.google.android.gms.internal.ads.a81
    public void OooO0OO(int i, h31 h31Var, long j) throws MediaCodec.CryptoException {
        ((MediaCodec) this.f23325OooOo0o).queueSecureInputBuffer(i, 0, h31Var.f19533OooO, j, 0);
    }

    public void OooO0Oo(String str, v31 v31Var) {
        ii0.OooOOO0(v31Var, IronSourceConstants.EVENTS_PROVIDER);
        ((LinkedHashMap) this.f23325OooOo0o).put(str, v31Var);
    }

    public void OooO0o(String str, v31 v31Var) {
        OooO0Oo(str, v31Var);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        boolean zIsCanceled = task.isCanceled();
        xj0 xj0Var = (xj0) this.f23325OooOo0o;
        if (zIsCanceled) {
            xj0Var.cancel(false);
            return;
        }
        if (task.isSuccessful()) {
            xj0Var.OooO0o(task.getResult());
            return;
        }
        Exception exception = task.getException();
        if (exception == null) {
            throw new IllegalStateException();
        }
        xj0Var.OooO0oO(exception);
    }

    @Override // com.google.android.gms.internal.ads.il0
    /* renamed from: zza */
    public Object mo13704zza() {
        return Boolean.valueOf(((AtomicBoolean) this.f23325OooOo0o).get());
    }

    @Override // com.google.android.gms.internal.ads.a81, com.google.android.gms.internal.ads.o00Oo0
    public void zzb() {
        switch (this.f23324OooOo0O) {
            case 12:
                break;
            default:
                pb1 pb1Var = (pb1) this.f23325OooOo0o;
                if (pb1Var.f23293o0000o0O != null) {
                    pb1Var.o0OoOo0(0, 1);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ pd0(Object obj, int i) {
        this.f23324OooOo0O = i;
        this.f23325OooOo0o = obj;
    }

    @Override // com.google.android.gms.internal.ads.o00Oo0
    public void zza() {
        pb1 pb1Var = (pb1) this.f23325OooOo0o;
        Surface surface = pb1Var.f23293o0000o0O;
        if (surface != null) {
            o00O0O o00o0o = pb1Var.f23307o000OO;
            Handler handler = o00o0o.f21767OooO00o;
            if (handler != null) {
                handler.post(new OoooOOO.oOOoOOO0(o00o0o, surface, SystemClock.elapsedRealtime()));
            }
            pb1Var.f23295o0000oO0 = true;
        }
    }

    public pd0(Matcher matcher) {
        this.f23324OooOo0O = 4;
        matcher.getClass();
        this.f23325OooOo0o = matcher;
    }

    @Override // com.google.android.gms.internal.ads.vp0
    /* renamed from: zzb */
    public void mo13705zzb(Object obj) {
        kg0 kg0Var = (kg0) this.f23325OooOo0o;
        synchronized (kg0Var) {
            try {
                kg0Var.f20600OooOO0.set(false);
                if (obj != null) {
                    lg0 lg0Var = kg0Var.f20591OooO;
                    lg0Var.f20887OooO0o0 = lg0Var.f20882OooO00o;
                    lg0Var.f20884OooO0OO = 0L;
                    kg0Var.f20603OooOOO0.set(true);
                    kg0Var.OooOO0O(obj);
                }
                kg0Var.OooO0O0(obj == null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public pd0(int i) {
        this.f23324OooOo0O = 7;
        this.f23325OooOo0o = xh0.Oooo0O0(i);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1730jw, com.google.android.gms.internal.ads.InterfaceC1770kz
    /* renamed from: zza */
    public void mo13701zza(Object obj) {
        switch (this.f23324OooOo0O) {
            case 1:
                df0 df0Var = (df0) this.f23325OooOo0o;
                ((hf0) obj).Oooo0oO((ef0) df0Var.f18245OooOo0O, df0Var.f18246OooOo0o);
                break;
            default:
                ((e61) obj).OooO0o0((o0OoOo0) this.f23325OooOo0o);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.vp0
    public void zza(Throwable th) {
        kg0 kg0Var = (kg0) this.f23325OooOo0o;
        synchronized (kg0Var) {
            try {
                kg0Var.f20600OooOO0.set(false);
                if ((th instanceof ig0) && ((ig0) th).f20043OooOo0O == 0) {
                    throw null;
                }
                kg0Var.OooO0O0(true);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void OooO0oO() {
    }

    @Override // com.google.android.gms.internal.ads.a81
    public void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.a81
    public void zzg() {
    }

    @Override // com.google.android.gms.internal.ads.a81
    public void zzh() {
    }
}
