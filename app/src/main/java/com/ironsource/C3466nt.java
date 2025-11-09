package com.ironsource;

import android.util.Log;
import com.google.android.gms.internal.ads.AbstractC2183w4;
import com.ironsource.mediationsdk.logger.C3399d;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.server.HttpFunctions;
import com.ironsource.mediationsdk.server.ServerURL;
import org.json.JSONObject;

/* renamed from: com.ironsource.nt */
/* loaded from: classes2.dex */
public class C3466nt {

    /* renamed from: com.ironsource.nt$a */
    public class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f10579a;

        /* renamed from: b */
        final /* synthetic */ boolean f10580b;

        /* renamed from: c */
        final /* synthetic */ int f10581c;

        public a(String str, boolean z, int i) {
            this.f10579a = str;
            this.f10580b = z;
            this.f10581c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3466nt.m11057c(this.f10579a, this.f10580b, this.f10581c);
        }
    }

    /* renamed from: b */
    public static void m11056b(String str, boolean z, int i) {
        Thread thread = new Thread(new a(str, z, i), "callAsyncRequestURL");
        thread.setUncaughtExceptionHandler(new C3399d());
        thread.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static void m11057c(String str, boolean z, int i) {
        try {
            new JSONObject(HttpFunctions.getStringFromURL(ServerURL.getRequestURL(str, z, i)));
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.NETWORK, "callRequestURL(reqUrl:" + str + ", hit:" + z + ")", 1);
        } catch (Throwable th) {
            StringBuilder sbOooOOO = AbstractC2183w4.OooOOO("callRequestURL(reqUrl:", th);
            if (str == null) {
                str = "null";
            }
            sbOooOOO.append(str);
            sbOooOOO.append(", hit:");
            sbOooOOO.append(z);
            sbOooOOO.append(")");
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.NETWORK, sbOooOOO.toString() + ", e:" + Log.getStackTraceString(th), 0);
        }
    }
}
