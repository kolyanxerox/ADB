package io.flutter.plugins.webviewflutter;

import io.flutter.plugin.common.BasicMessageChannel;

/* loaded from: classes3.dex */
public final /* synthetic */ class o000000 implements BasicMessageChannel.Reply {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f28815OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ o00O0Oo.Oooo000 f28816OooO0O0;

    public /* synthetic */ o000000(int i, o00O0Oo.Oooo000 oooo000) {
        this.f28815OooO00o = i;
        this.f28816OooO0O0 = oooo000;
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
    public final void reply(Object obj) {
        switch (this.f28815OooO00o) {
            case 0:
                PigeonApiX509Certificate.pigeon_newInstance$lambda$0(this.f28816OooO0O0, "dev.flutter.pigeon.webview_flutter_android.X509Certificate.pigeon_newInstance", obj);
                break;
            default:
                PigeonApiWebChromeClient.OooO0Oo(this.f28816OooO0O0, obj);
                break;
        }
    }
}
