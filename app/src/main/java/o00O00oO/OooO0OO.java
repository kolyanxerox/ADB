package o00O00OO;

import android.content.Intent;
import dev.fluttercommunity.plus.share.SharePlusPendingIntent;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class OooO0OO implements PluginRegistry.ActivityResultListener {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public MethodChannel.Result f31266OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public AtomicBoolean f31267OooOo0o;

    @Override // io.flutter.plugin.common.PluginRegistry.ActivityResultListener
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        MethodChannel.Result result;
        if (i != 22643) {
            return false;
        }
        String str = SharePlusPendingIntent.f28665OooO00o;
        if (this.f31267OooOo0o.compareAndSet(false, true) && (result = this.f31266OooOo0O) != null) {
            result.success(str);
            this.f31266OooOo0O = null;
        }
        return true;
    }
}
