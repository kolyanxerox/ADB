package com.ironsource;

/* renamed from: com.ironsource.ks */
/* loaded from: classes2.dex */
public abstract class AbstractRunnableC3302ks implements Runnable {
    /* renamed from: a */
    public abstract void mo8710a() throws Exception;

    /* renamed from: a */
    public void mo9702a(Throwable t) {
        kotlin.jvm.internal.OooOo.OooO0o0(t, "t");
        C2951av.m7844a(t);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            mo8710a();
        } catch (Throwable th) {
            C3551q9.m11517d().m11519a(th);
            try {
                mo9702a(th);
            } catch (Throwable th2) {
                C3551q9.m11517d().m11519a(th2);
            }
        }
    }
}
