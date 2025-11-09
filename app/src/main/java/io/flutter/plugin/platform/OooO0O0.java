package io.flutter.plugin.platform;

import android.view.View;

/* loaded from: classes3.dex */
public final /* synthetic */ class OooO0O0 implements View.OnFocusChangeListener {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ PlatformViewsAccessibilityDelegate f28715OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f28716OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f28717OooOo0o;

    public /* synthetic */ OooO0O0(PlatformViewsAccessibilityDelegate platformViewsAccessibilityDelegate, int i, int i2) {
        this.f28716OooOo0O = i2;
        this.f28715OooOo = platformViewsAccessibilityDelegate;
        this.f28717OooOo0o = i;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        switch (this.f28716OooOo0O) {
            case 0:
                ((PlatformViewsController) this.f28715OooOo).lambda$initializePlatformViewIfNeeded$2(this.f28717OooOo0o, view, z);
                break;
            default:
                ((PlatformViewsController2) this.f28715OooOo).lambda$initializePlatformViewIfNeeded$0(this.f28717OooOo0o, view, z);
                break;
        }
    }
}
