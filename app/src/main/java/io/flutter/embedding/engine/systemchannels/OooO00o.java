package io.flutter.embedding.engine.systemchannels;

import io.flutter.embedding.engine.systemchannels.KeyEventChannel;
import io.flutter.embedding.engine.systemchannels.PlatformViewsChannel;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.MethodChannel;
import org.json.JSONException;

/* loaded from: classes3.dex */
public final /* synthetic */ class OooO00o implements PlatformViewsChannel.PlatformViewBufferResized, BasicMessageChannel.Reply {

    /* renamed from: OooO00o */
    public final /* synthetic */ Object f28712OooO00o;

    public /* synthetic */ OooO00o(Object obj) {
        this.f28712OooO00o = obj;
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
    public void reply(Object obj) throws JSONException {
        KeyEventChannel.lambda$createReplyHandler$0((KeyEventChannel.EventResponseHandler) this.f28712OooO00o, obj);
    }

    @Override // io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewBufferResized
    public void run(PlatformViewsChannel.PlatformViewBufferSize platformViewBufferSize) {
        PlatformViewsChannel.C44141.lambda$resize$0((MethodChannel.Result) this.f28712OooO00o, platformViewBufferSize);
    }
}
