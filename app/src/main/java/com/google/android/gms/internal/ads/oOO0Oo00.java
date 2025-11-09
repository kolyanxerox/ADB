package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class oOO0Oo00 implements Executor {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f22817OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Handler f22818OooOo0o;

    public /* synthetic */ oOO0Oo00(int i, Handler handler) {
        this.f22817OooOo0O = i;
        this.f22818OooOo0o = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f22817OooOo0O) {
            case 0:
                this.f22818OooOo0o.post(runnable);
                break;
            case 1:
                this.f22818OooOo0o.post(runnable);
                break;
            default:
                this.f22818OooOo0o.post(runnable);
                break;
        }
    }
}
