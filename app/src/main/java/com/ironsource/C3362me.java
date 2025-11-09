package com.ironsource;

import android.util.Base64;
import com.ironsource.mediationsdk.logger.IronLog;

/* renamed from: com.ironsource.me */
/* loaded from: classes2.dex */
public class C3362me {
    /* renamed from: a */
    public static String m10024a(String str) {
        try {
            return new String(Base64.decode(str, 0), "UTF-8");
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error(e.toString());
            return "";
        }
    }

    /* renamed from: b */
    public static String m10025b(String str) {
        return Base64.encodeToString(str.getBytes(), 10);
    }
}
