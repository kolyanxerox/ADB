package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;

/* loaded from: classes2.dex */
public final class t71 extends Handler {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ v71 f24266OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t71(v71 v71Var, Looper looper) {
        super(looper);
        this.f24266OooO00o = v71Var;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) throws MediaCodec.CryptoException {
        u71 u71Var;
        v71 v71Var = this.f24266OooO00o;
        int i = message.what;
        if (i == 1) {
            u71Var = (u71) message.obj;
            try {
                v71Var.f24881OooOo0O.queueInputBuffer(u71Var.f24586OooO00o, 0, u71Var.f24587OooO0O0, u71Var.f24589OooO0Oo, u71Var.f24590OooO0o0);
            } catch (RuntimeException e) {
                ii0.OooOOOo(v71Var.f24884OooOoO0, e);
            }
        } else if (i != 2) {
            u71Var = null;
            if (i == 3) {
                v71Var.f24883OooOoO.OooO0O0();
            } else if (i != 4) {
                ii0.OooOOOo(v71Var.f24884OooOoO0, new IllegalStateException(String.valueOf(message.what)));
            } else {
                try {
                    v71Var.f24881OooOo0O.setParameters((Bundle) message.obj);
                } catch (RuntimeException e2) {
                    ii0.OooOOOo(v71Var.f24884OooOoO0, e2);
                }
            }
        } else {
            u71Var = (u71) message.obj;
            int i2 = u71Var.f24586OooO00o;
            MediaCodec.CryptoInfo cryptoInfo = u71Var.f24588OooO0OO;
            long j = u71Var.f24589OooO0Oo;
            int i3 = u71Var.f24590OooO0o0;
            try {
                synchronized (v71.f24878OooOoo) {
                    v71Var.f24881OooOo0O.queueSecureInputBuffer(i2, 0, cryptoInfo, j, i3);
                }
            } catch (RuntimeException e3) {
                ii0.OooOOOo(v71Var.f24884OooOoO0, e3);
            }
        }
        if (u71Var != null) {
            ArrayDeque arrayDeque = v71.f24879OooOoo0;
            synchronized (arrayDeque) {
                arrayDeque.add(u71Var);
            }
        }
    }
}
