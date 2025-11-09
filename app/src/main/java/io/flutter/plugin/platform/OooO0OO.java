package io.flutter.plugin.platform;

import android.view.View;
import io.flutter.embedding.engine.systemchannels.PlatformViewsChannel;

/* loaded from: classes3.dex */
public final /* synthetic */ class OooO0OO implements View.OnFocusChangeListener {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ PlatformViewsChannel.PlatformViewCreationRequest f28718OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f28719OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ PlatformViewsController f28720OooOo0o;

    public /* synthetic */ OooO0OO(PlatformViewsController platformViewsController, PlatformViewsChannel.PlatformViewCreationRequest platformViewCreationRequest, int i) {
        this.f28719OooOo0O = i;
        this.f28720OooOo0o = platformViewsController;
        this.f28718OooOo = platformViewCreationRequest;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        switch (this.f28719OooOo0O) {
            case 0:
                this.f28720OooOo0o.lambda$configureForTextureLayerComposition$1(this.f28718OooOo, view, z);
                break;
            default:
                this.f28720OooOo0o.lambda$configureForVirtualDisplay$0(this.f28718OooOo, view, z);
                break;
        }
    }
}
