package io.flutter.plugins.webviewflutter;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.webviewflutter.PigeonApiCookieManager;
import io.flutter.plugins.webviewflutter.PigeonApiWebView;
import io.flutter.plugins.webviewflutter.ResultCompat;

/* loaded from: classes3.dex */
public final /* synthetic */ class Oooo000 implements o00O0Oo.Oooo000 {

    /* renamed from: OooOo0O */
    public final /* synthetic */ int f28809OooOo0O;

    /* renamed from: OooOo0o */
    public final /* synthetic */ Object f28810OooOo0o;

    public /* synthetic */ Oooo000(Object obj, int i) {
        this.f28809OooOo0O = i;
        this.f28810OooOo0o = obj;
    }

    @Override // o00O0Oo.Oooo000
    public final Object invoke(Object obj) {
        switch (this.f28809OooOo0O) {
            case 0:
                return PigeonApiCookieManager.Companion.setUpMessageHandlers$lambda$6$lambda$5$lambda$4((BasicMessageChannel.Reply) this.f28810OooOo0o, (oo00o.OooOOO0) obj);
            case 1:
                return PigeonApiWebView.Companion.setUpMessageHandlers$lambda$28$lambda$27$lambda$26((BasicMessageChannel.Reply) this.f28810OooOo0o, (oo00o.OooOOO0) obj);
            default:
                return ResultCompat.Companion.asCompatCallback$lambda$0((o00O0Oo.Oooo000) this.f28810OooOo0o, (oo00o.OooOOO0) obj);
        }
    }
}
