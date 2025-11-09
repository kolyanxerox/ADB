package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;

/* loaded from: classes2.dex */
public final class OooOOOO implements Choreographer.FrameCallback, Handler.Callback {

    /* renamed from: OooOoO */
    public static final OooOOOO f16823OooOoO = new OooOOOO();

    /* renamed from: OooOo */
    public Choreographer f16824OooOo;

    /* renamed from: OooOo0O */
    public volatile long f16825OooOo0O = -9223372036854775807L;

    /* renamed from: OooOo0o */
    public final Handler f16826OooOo0o;

    /* renamed from: OooOoO0 */
    public int f16827OooOoO0;

    public OooOOOO() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper(), this);
        this.f16826OooOo0o = handler;
        handler.sendEmptyMessage(1);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.f16825OooOo0O = j;
        Choreographer choreographer = this.f16824OooOo;
        choreographer.getClass();
        choreographer.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            try {
                this.f16824OooOo = Choreographer.getInstance();
            } catch (RuntimeException e) {
                AbstractC1641hg.OooOOoo("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e);
            }
            return true;
        }
        if (i == 2) {
            Choreographer choreographer = this.f16824OooOo;
            if (choreographer != null) {
                int i2 = this.f16827OooOoO0 + 1;
                this.f16827OooOoO0 = i2;
                if (i2 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
            return true;
        }
        if (i != 3) {
            return false;
        }
        Choreographer choreographer2 = this.f16824OooOo;
        if (choreographer2 != null) {
            int i3 = this.f16827OooOoO0 - 1;
            this.f16827OooOoO0 = i3;
            if (i3 == 0) {
                choreographer2.removeFrameCallback(this);
                this.f16825OooOo0O = -9223372036854775807L;
            }
        }
        return true;
    }
}
