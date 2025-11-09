package com.ironsource.mediationsdk.logger;

import OooO0oO.OooOo;
import android.os.Looper;
import android.util.Log;
import com.ironsource.C3034d9;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import org.apache.tika.utils.StringUtils;

/* renamed from: com.ironsource.mediationsdk.logger.a */
/* loaded from: classes2.dex */
public class C3396a extends IronSourceLogger {

    /* renamed from: c */
    public static final String f9893c = "console";

    /* renamed from: d */
    public static final String f9894d = "LevelPlaySDK: ";

    private C3396a() {
        super("console");
    }

    @Override // com.ironsource.mediationsdk.logger.IronSourceLogger
    public void log(IronSourceLogger.IronSourceTag ironSourceTag, String str, int i) {
        StringBuilder sb = new StringBuilder("UIThread: ");
        sb.append(Looper.getMainLooper() == Looper.myLooper());
        sb.append(StringUtils.SPACE);
        String string = sb.toString();
        StringBuilder sb2 = new StringBuilder("Activity: ");
        sb2.append(ContextProvider.getInstance().getCurrentActiveActivity() != null ? Integer.valueOf(ContextProvider.getInstance().getCurrentActiveActivity().hashCode()) : Boolean.FALSE);
        sb2.append(StringUtils.SPACE);
        String string2 = sb2.toString();
        if (i == 0) {
            Log.v(f9894d + ironSourceTag, string + string2 + str);
            return;
        }
        if (i != 1) {
            if (i == 2) {
                Log.w(f9894d + ironSourceTag, str);
                return;
            } else if (i == 3) {
                Log.e(f9894d + ironSourceTag, str);
                return;
            } else if (i != 4) {
                return;
            }
        }
        Log.i(f9894d + ironSourceTag, str);
    }

    @Override // com.ironsource.mediationsdk.logger.IronSourceLogger
    public void logException(IronSourceLogger.IronSourceTag ironSourceTag, String str, Throwable th) {
        StringBuilder sbOooOo = OooOo.OooOo(str, ":stacktrace[");
        sbOooOo.append(Log.getStackTraceString(th));
        sbOooOo.append(C3034d9.i.f8179e);
        log(ironSourceTag, sbOooOo.toString(), 3);
    }

    public C3396a(int i) {
        super("console", i);
    }
}
