package io.flutter.embedding.engine.dart;

import io.flutter.embedding.engine.dart.DartMessenger;

/* loaded from: classes3.dex */
public final /* synthetic */ class OooO0O0 implements Runnable {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f28699OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ DartMessenger.SerialTaskQueue f28700OooOo0o;

    public /* synthetic */ OooO0O0(DartMessenger.SerialTaskQueue serialTaskQueue, int i) {
        this.f28699OooOo0O = i;
        this.f28700OooOo0o = serialTaskQueue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f28699OooOo0O) {
            case 0:
                this.f28700OooOo0o.lambda$dispatch$0();
                break;
            default:
                this.f28700OooOo0o.lambda$flush$1();
                break;
        }
    }
}
