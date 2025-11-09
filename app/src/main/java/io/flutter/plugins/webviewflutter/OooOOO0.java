package io.flutter.plugins.webviewflutter;

import android.webkit.ValueCallback;

/* loaded from: classes3.dex */
public final /* synthetic */ class OooOOO0 implements ValueCallback {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f28798OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ o00O0Oo.Oooo000 f28799OooO0O0;

    public /* synthetic */ OooOOO0(int i, o00O0Oo.Oooo000 oooo000) {
        this.f28798OooO00o = i;
        this.f28799OooO0O0 = oooo000;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        switch (this.f28798OooO00o) {
            case 0:
                ResultCompat.success((Boolean) obj, this.f28799OooO0O0);
                break;
            default:
                ResultCompat.success((String) obj, this.f28799OooO0O0);
                break;
        }
    }
}
