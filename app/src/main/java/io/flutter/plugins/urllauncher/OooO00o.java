package io.flutter.plugins.urllauncher;

import android.content.Context;
import android.content.Intent;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.urllauncher.Messages;
import io.flutter.plugins.urllauncher.UrlLauncher;

/* loaded from: classes3.dex */
public final /* synthetic */ class OooO00o implements BasicMessageChannel.MessageHandler, UrlLauncher.IntentResolver {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f28781OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f28782OooO0O0;

    public /* synthetic */ OooO00o(Object obj, int i) {
        this.f28781OooO00o = i;
        this.f28782OooO0O0 = obj;
    }

    @Override // io.flutter.plugins.urllauncher.UrlLauncher.IntentResolver
    public String getHandlerComponentName(Intent intent) {
        return UrlLauncher.lambda$new$0((Context) this.f28782OooO0O0, intent);
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
    public void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        switch (this.f28781OooO00o) {
            case 0:
                Messages.UrlLauncherApi.lambda$setUp$0((Messages.UrlLauncherApi) this.f28782OooO0O0, obj, reply);
                break;
            case 1:
                Messages.UrlLauncherApi.lambda$setUp$1((Messages.UrlLauncherApi) this.f28782OooO0O0, obj, reply);
                break;
            case 2:
                Messages.UrlLauncherApi.lambda$setUp$2((Messages.UrlLauncherApi) this.f28782OooO0O0, obj, reply);
                break;
            case 3:
                Messages.UrlLauncherApi.lambda$setUp$3((Messages.UrlLauncherApi) this.f28782OooO0O0, obj, reply);
                break;
            default:
                Messages.UrlLauncherApi.lambda$setUp$4((Messages.UrlLauncherApi) this.f28782OooO0O0, obj, reply);
                break;
        }
    }
}
