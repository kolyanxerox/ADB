package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.ironsource.C3571qt;
import com.ironsource.mediationsdk.IronSourceSegment;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.server.HttpFunctions;
import com.ironsource.mediationsdk.server.ServerURL;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceAES;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.ot */
/* loaded from: classes2.dex */
public final class C3501ot {
    /* renamed from: a */
    private final C3535ps m11235a(String str) {
        return str != null ? new C3535ps(C3535ps.f10859h, str) : new C3535ps(C3535ps.f10855d, "noServerResponse");
    }

    /* renamed from: b */
    private final C2949at m11238b(Context context, C3129ft c3129ft, C3780vs c3780vs) {
        C2949at c2949atM11234a = m11234a(context, c3129ft, c3780vs);
        if (c2949atM11234a.m7833c()) {
            return c2949atM11234a;
        }
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "Null or invalid response. Trying to get cached response", 0);
        C3571qt c3571qtM8797a = c3129ft.m8797a(context, c3780vs.m12817d());
        if (c3571qtM8797a == null) {
            return c2949atM11234a;
        }
        C2949at c2949at = new C2949at(new C3814ws(c3571qtM8797a));
        IronSourceError ironSourceErrorBuildUsingCachedConfigurationError = ErrorBuilder.buildUsingCachedConfigurationError(c3780vs.m12817d(), c3780vs.m12819f());
        IronSourceLoggerManager.getLogger().log(ironSourceTag, ironSourceErrorBuildUsingCachedConfigurationError + ": " + c2949at.m7832b(), 1);
        c3129ft.m8820g();
        return c2949at;
    }

    /* renamed from: a */
    private final String m11236a(String str, boolean z) {
        String strDecryptAndDecompress = z ? IronSourceAES.decryptAndDecompress(C3359mb.m10015b().m10017c(), str) : IronSourceAES.decode(C3359mb.m10015b().m10017c(), str);
        kotlin.jvm.internal.OooOo.OooO0Oo(strDecryptAndDecompress, "{\n      IronSourceAES.de… encryptedResponse)\n    }");
        return strDecryptAndDecompress;
    }

    /* renamed from: a */
    public final void m11239a(Context context, C3780vs request, C3129ft tools, InterfaceC3710ts listener) {
        kotlin.jvm.internal.OooOo.OooO0o0(context, "context");
        kotlin.jvm.internal.OooOo.OooO0o0(request, "request");
        kotlin.jvm.internal.OooOo.OooO0o0(tools, "tools");
        kotlin.jvm.internal.OooOo.OooO0o0(listener, "listener");
        String strM12819f = request.m12819f();
        if (strM12819f == null) {
            strM12819f = "";
        }
        tools.m8807a("userId", strM12819f);
        tools.m8807a("appKey", request.m12817d());
        tools.m8812c().m9152i(request.m12819f());
        tools.m8799a();
        C2949at c2949atM11238b = m11238b(context, tools, request);
        if (c2949atM11238b.m7832b() == null) {
            C3535ps c3535psM7831a = c2949atM11238b.m7831a();
            if (c3535psM7831a == null) {
                c3535psM7831a = new C3535ps(510, "unknown error");
            }
            listener.mo8030a(c3535psM7831a);
            return;
        }
        C3465ns c3465ns = new C3465ns(c2949atM11238b.m7832b());
        if (c2949atM11238b.m7833c()) {
            listener.mo8029a(c3465ns);
        } else {
            listener.mo8030a(new C3535ps(C3535ps.f10856e, "serverResponseIsNotValid"));
        }
    }

    /* renamed from: a */
    public static final void m11237a(kotlin.jvm.internal.o0Oo0oo reason, String errorMessage) {
        kotlin.jvm.internal.OooOo.OooO0o0(reason, "$reason");
        kotlin.jvm.internal.OooOo.OooO0o0(errorMessage, "errorMessage");
        reason.f28880OooOo0O = errorMessage;
    }

    /* renamed from: a */
    private final C2949at m11234a(Context context, C3129ft c3129ft, C3780vs c3780vs) {
        try {
            String strM8798a = c3129ft.m8798a(context);
            if (TextUtils.isEmpty(strM8798a)) {
                strM8798a = c3129ft.m8809b(context);
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "using custom identifier", 1);
            }
            String str = strM8798a;
            IronSourceSegment ironSourceSegmentM8815d = c3129ft.m8815d();
            ArrayList<Pair<String, String>> segmentData = ironSourceSegmentM8815d != null ? ironSourceSegmentM8815d.getSegmentData() : null;
            kotlin.jvm.internal.o0Oo0oo o0oo0oo = new kotlin.jvm.internal.o0Oo0oo();
            String strSendPostRequest = HttpFunctions.sendPostRequest(ServerURL.buildInitURL(context, c3780vs.m12817d(), c3780vs.m12819f(), str, null, true, segmentData, false), C3872yi.m13204a().toString(), new o000oOoO(o0oo0oo, 2));
            if (strSendPostRequest == null) {
                IronLog.INTERNAL.warning("serverResponseString is null");
                return new C2949at(m11235a((String) o0oo0oo.f28880OooOo0O));
            }
            if (c3129ft.m8818e()) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose("encrypt");
                JSONObject jSONObject = new JSONObject(strSendPostRequest);
                String encryptedResponse = jSONObject.optString(C3571qt.f11099n);
                if (TextUtils.isEmpty(encryptedResponse)) {
                    ironLog.warning("encryptedResponse is empty - return null");
                    return new C2949at(new C3535ps(C3535ps.f10858g, C3675ss.f11939h));
                }
                boolean zOptBoolean = jSONObject.optBoolean("compression", false);
                kotlin.jvm.internal.OooOo.OooO0Oo(encryptedResponse, "encryptedResponse");
                strSendPostRequest = m11236a(encryptedResponse, zOptBoolean);
                if (TextUtils.isEmpty(strSendPostRequest)) {
                    ironLog.warning("encoded response invalid - return null");
                    c3129ft.m8819f();
                    return new C2949at(new C3535ps(C3535ps.f10857f, C3675ss.f11938g));
                }
            }
            C3571qt c3571qt = new C3571qt(context, c3780vs.m12817d(), c3780vs.m12819f(), strSendPostRequest);
            c3571qt.m11634a(C3571qt.a.SERVER);
            if (c3571qt.m11644p()) {
                return new C2949at(new C3814ws(c3571qt));
            }
            IronLog.INTERNAL.warning("response invalid - return null");
            return new C2949at(new C3535ps(C3535ps.f10856e, "serverResponseIsNotValid"));
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.warning("exception = " + e);
            return new C2949at(e instanceof JSONException ? new C3535ps(C3535ps.f10856e, "serverResponseIsNotValid") : new C3535ps(510, "internal error"));
        }
    }
}
