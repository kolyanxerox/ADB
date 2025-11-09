package OooOO0;

import android.os.Build;
import android.os.Vibrator;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.List;
import o000Ooo0.OooOO0;
import org.apache.tika.mime.MimeTypesReaderMetKeys;

/* loaded from: classes2.dex */
public final class OooO00o implements MethodChannel.MethodCallHandler {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final OooOO0 f13303OooOo0O;

    public OooO00o(OooOO0 oooOO0) {
        this.f13303OooOo0O = oooOO0;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public final void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        OooOO0 oooOO0;
        Vibrator vibrator;
        String str = methodCall.method;
        str.getClass();
        oooOO0 = this.f13303OooOo0O;
        vibrator = (Vibrator) oooOO0.f30538OooOo0o;
        switch (str) {
            case "cancel":
                vibrator.cancel();
                result.success(null);
                break;
            case "hasAmplitudeControl":
                if (Build.VERSION.SDK_INT < 26) {
                    result.success(Boolean.FALSE);
                    break;
                } else {
                    result.success(Boolean.valueOf(vibrator.hasAmplitudeControl()));
                    break;
                }
            case "vibrate":
                Integer num = (Integer) methodCall.argument(IronSourceConstants.EVENTS_DURATION);
                List list = (List) methodCall.argument(MimeTypesReaderMetKeys.PATTERN_ATTR);
                Integer num2 = (Integer) methodCall.argument("repeat");
                List list2 = (List) methodCall.argument("intensities");
                Integer num3 = (Integer) methodCall.argument("amplitude");
                if (!list.isEmpty() && !list2.isEmpty()) {
                    oooOO0.OooO0oo(list, num2.intValue(), list2);
                } else if (list.size() > 0) {
                    oooOO0.OooO0oO(num2.intValue(), list);
                } else {
                    oooOO0.OooO0o(num3.intValue(), num.intValue());
                }
                result.success(null);
                break;
            case "hasCustomVibrationsSupport":
                result.success(Boolean.TRUE);
                break;
            default:
                result.notImplemented();
                break;
        }
    }
}
