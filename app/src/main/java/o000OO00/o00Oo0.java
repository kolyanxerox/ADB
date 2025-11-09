package o000oo00;

import android.app.Application;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import com.github.superadb.SplashActivity;
import com.ironsource.C3034d9;
import com.nextaix.common.helper.MdnsForegroundService;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class o00Oo0 {

    /* renamed from: OooO00o */
    public MethodChannel f31098OooO00o;

    public static void OooO00o(SplashActivity splashActivity, MethodCall methodCall, MethodChannel.Result result) {
        if ("startForegroundService".equals(methodCall.method)) {
            if (splashActivity.getApplicationContext().getClass().equals(Application.class)) {
                try {
                    String str = (String) methodCall.argument("type");
                    Intent intent = new Intent(splashActivity, (Class<?>) MdnsForegroundService.class);
                    intent.putExtra("type", str);
                    if (Build.VERSION.SDK_INT >= 26) {
                        splashActivity.startForegroundService(intent);
                    } else {
                        splashActivity.startService(intent);
                    }
                    result.success(Boolean.TRUE);
                    return;
                } catch (Exception e) {
                    Log.e("ForegroundService", "Error starting foreground service", e);
                    result.success(Boolean.FALSE);
                    return;
                }
            }
            return;
        }
        if ("stopForegroundService".equals(methodCall.method)) {
            if (splashActivity.getApplicationContext().getClass().equals(Application.class)) {
                try {
                    try {
                        splashActivity.stopService(new Intent(splashActivity, (Class<?>) MdnsForegroundService.class));
                    } catch (Exception e2) {
                        Log.e("ForegroundService", "Error stopping foreground service", e2);
                    }
                    result.success(Boolean.TRUE);
                    return;
                } catch (Exception e3) {
                    Log.e("ForegroundService", "Error stopping foreground service", e3);
                    result.success(Boolean.FALSE);
                    return;
                }
            }
            return;
        }
        if ("notification".equals(methodCall.method)) {
            String str2 = (String) methodCall.argument("type");
            String str3 = (String) methodCall.argument(C3034d9.h.f8063D0);
            String str4 = (String) methodCall.argument("content");
            o0ooOOo.f31103OooO00o.getClass();
            o0OOO0o.OooO0Oo(splashActivity, str2, str3, str4);
            result.success(Boolean.TRUE);
            return;
        }
        if (!"updateNotificationStrings".equals(methodCall.method)) {
            if ("startMdns".equals(methodCall.method)) {
                Oooo000 oooo000 = (Oooo000) o000oOoO.f31096OooO00o.f30487OooOo0o;
                if (oooo000 != null && Build.VERSION.SDK_INT >= 30) {
                    oooo000.OooO0O0();
                }
                result.success(Boolean.TRUE);
                return;
            }
            return;
        }
        String str5 = (String) methodCall.argument("data");
        o0OOO0o o0ooo0o = o0ooOOo.f31103OooO00o;
        o0ooo0o.getClass();
        try {
            HashMap map = new HashMap();
            JSONObject jSONObject = new JSONObject(str5);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, String.valueOf(jSONObject.get(next)));
            }
            o0ooo0o.f31099OooO00o = map;
            result.success(Boolean.TRUE);
        } catch (JSONException e4) {
            throw new RuntimeException(e4);
        }
    }
}
