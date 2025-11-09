package io.flutter.embedding.engine.renderer;

import io.flutter.embedding.engine.renderer.FlutterRenderer;

/* loaded from: classes3.dex */
public final /* synthetic */ class OooO00o implements Runnable {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f28708OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Object f28709OooOo0o;

    public /* synthetic */ OooO00o(Object obj, int i) {
        this.f28708OooOo0O = i;
        this.f28709OooOo0o = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f28708OooOo0O) {
            case 0:
                ((FlutterRenderer.ImageReaderSurfaceProducer) this.f28709OooOo0o).lambda$dequeueImage$0();
                break;
            default:
                ((FlutterRenderer.SurfaceTextureRegistryEntry) this.f28709OooOo0o).lambda$new$0();
                break;
        }
    }
}
