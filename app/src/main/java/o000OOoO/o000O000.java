package o000oOoo;

import io.flutter.plugin.common.EventChannel;

/* loaded from: classes2.dex */
public final class o000O000 implements EventChannel.StreamHandler {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ o0000OO0 f31001OooOo0O;

    public o000O000(o0000OO0 o0000oo02) {
        this.f31001OooOo0O = o0000oo02;
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public final void onCancel(Object obj) {
        this.f31001OooOo0O.f30998OooOoo = null;
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public final void onListen(Object obj, EventChannel.EventSink eventSink) {
        this.f31001OooOo0O.f30998OooOoo = eventSink;
    }
}
