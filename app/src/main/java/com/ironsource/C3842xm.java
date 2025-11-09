package com.ironsource;

import android.content.Context;
import android.os.Handler;
import android.view.Choreographer;
import com.ironsource.C3571qt;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.integration.IntegrationHelper;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.mediation.C4201a;
import com.unity3d.mediation.LevelPlay;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.xm */
/* loaded from: classes2.dex */
public class C3842xm {

    /* renamed from: a */
    private final C3119fj f12663a = new C3119fj(null, 1, null);

    /* renamed from: com.ironsource.xm$a */
    public static final class a extends AbstractRunnableC3302ks {

        /* renamed from: a */
        final /* synthetic */ Runnable f12664a;

        public a(Runnable runnable) {
            this.f12664a = runnable;
        }

        @Override // com.ironsource.AbstractRunnableC3302ks
        /* renamed from: a */
        public void mo8710a() {
            this.f12664a.run();
        }
    }

    /* renamed from: com.ironsource.xm$b */
    public static final class b extends AbstractRunnableC3302ks {

        /* renamed from: a */
        final /* synthetic */ o00O0Oo.OooO0O0 f12665a;

        public b(o00O0Oo.OooO0O0 oooO0O0) {
            this.f12665a = oooO0O0;
        }

        @Override // com.ironsource.AbstractRunnableC3302ks
        /* renamed from: a */
        public void mo8710a() {
            this.f12665a.invoke();
        }
    }

    /* renamed from: a */
    public final Handler m13083a() {
        return this.f12663a.m8705a();
    }

    /* renamed from: b */
    public final void m13097b(AbstractRunnableC3302ks safeRunnable) {
        kotlin.jvm.internal.OooOo.OooO0o0(safeRunnable, "safeRunnable");
        this.f12663a.m8706a(safeRunnable);
    }

    /* renamed from: c */
    public final void m13100c(Runnable runnable) {
        kotlin.jvm.internal.OooOo.OooO0o0(runnable, "runnable");
        m13080a(this, new o0000O(this, runnable, 1), 0L, 2, (Object) null);
    }

    /* renamed from: d */
    public final void m13101d(Runnable runnable) {
        kotlin.jvm.internal.OooOo.OooO0o0(runnable, "runnable");
        this.f12663a.m8709b(runnable);
    }

    /* renamed from: e */
    public final void m13102e(Runnable callback) {
        kotlin.jvm.internal.OooOo.OooO0o0(callback, "callback");
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, callback, 0L, 2, null);
    }

    /* renamed from: b */
    public static final void m13082b(final C3842xm this$0, final Runnable runnable) {
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        kotlin.jvm.internal.OooOo.OooO0o0(runnable, "$runnable");
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: com.ironsource.o0000OO0
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                C3842xm.m13079a(this.f28535OooOo0O, runnable, j);
            }
        });
    }

    /* renamed from: a */
    public final IronSource.AD_UNIT m13084a(LevelPlay.AdFormat adFormat) {
        kotlin.jvm.internal.OooOo.OooO0o0(adFormat, "adFormat");
        return C4201a.m13452a(adFormat);
    }

    /* renamed from: a */
    private final String m13076a(String str, long j) {
        return "responseOrigin=" + str + ";delayTimeAfterInitProcess=" + j;
    }

    /* renamed from: b */
    public final void m13098b(Runnable runnable) {
        kotlin.jvm.internal.OooOo.OooO0o0(runnable, "runnable");
        m13080a(this, new o0000O(this, runnable, 0), 0L, 2, (Object) null);
    }

    /* renamed from: a */
    public final void m13085a(long j, C3571qt.a responseOrigin, long j2) throws JSONException {
        kotlin.jvm.internal.OooOo.OooO0o0(responseOrigin, "responseOrigin");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isMultipleAdUnits", 1);
        jSONObject.put(IronSourceConstants.EVENTS_DURATION, j);
        String strM11645a = responseOrigin.m11645a();
        kotlin.jvm.internal.OooOo.OooO0Oo(strM11645a, "responseOrigin.value");
        jSONObject.put(IronSourceConstants.EVENTS_EXT1, m13076a(strM11645a, j2));
        C2951av.m7842a(EnumC2638ac.SDK_INIT_SUCCESS, jSONObject);
    }

    /* renamed from: b */
    public final void m13099b(String adUnitId, int i, String str) throws JSONException {
        kotlin.jvm.internal.OooOo.OooO0o0(adUnitId, "adUnitId");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(IronSourceConstants.EVENTS_ERROR_CODE, i);
        jSONObject.putOpt("reason", str);
        jSONObject.put("mediationAdUnitId", adUnitId);
        jSONObject.put("isMultipleAdUnits", 1);
        C2951av.m7842a(EnumC2638ac.TROUBLESHOOTING_AD_UNIT_REWARD_PARSE_ERROR, jSONObject);
    }

    /* renamed from: a */
    public final void m13086a(Context context) {
        kotlin.jvm.internal.OooOo.OooO0o0(context, "context");
        IntegrationHelper.validateIntegration(context.getApplicationContext());
    }

    /* renamed from: a */
    public final void m13087a(AbstractRunnableC3302ks safeRunnable) {
        kotlin.jvm.internal.OooOo.OooO0o0(safeRunnable, "safeRunnable");
        m13077a(this, safeRunnable, 0L, 2, (Object) null);
    }

    /* renamed from: a */
    public final void m13088a(AbstractRunnableC3302ks safeRunnable, long j) {
        kotlin.jvm.internal.OooOo.OooO0o0(safeRunnable, "safeRunnable");
        this.f12663a.m8707a(safeRunnable, j);
    }

    /* renamed from: a */
    public final void m13089a(C3535ps error, long j) throws JSONException {
        kotlin.jvm.internal.OooOo.OooO0o0(error, "error");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(IronSourceConstants.EVENTS_ERROR_CODE, error.m11458c());
        jSONObject.put("reason", error.m11459d());
        jSONObject.put("isMultipleAdUnits", 1);
        jSONObject.put(IronSourceConstants.EVENTS_DURATION, j);
        C2951av.m7842a(EnumC2638ac.SDK_INIT_FAILED, jSONObject);
    }

    /* renamed from: a */
    public static /* synthetic */ void m13077a(C3842xm c3842xm, AbstractRunnableC3302ks abstractRunnableC3302ks, long j, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postTask");
        }
        if ((i & 2) != 0) {
            j = 0;
        }
        c3842xm.m13088a(abstractRunnableC3302ks, j);
    }

    /* renamed from: a */
    public static final void m13078a(C3842xm this$0, Runnable runnable) {
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        kotlin.jvm.internal.OooOo.OooO0o0(runnable, "$runnable");
        this$0.f12663a.m8709b(runnable);
    }

    /* renamed from: a */
    public static final void m13079a(C3842xm this$0, Runnable runnable, long j) {
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        kotlin.jvm.internal.OooOo.OooO0o0(runnable, "$runnable");
        this$0.m13098b(runnable);
    }

    /* renamed from: a */
    public static /* synthetic */ void m13080a(C3842xm c3842xm, Runnable runnable, long j, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postOnUIThread");
        }
        if ((i & 2) != 0) {
            j = 0;
        }
        c3842xm.m13091a(runnable, j);
    }

    /* renamed from: a */
    public static /* synthetic */ void m13081a(C3842xm c3842xm, o00O0Oo.OooO0O0 oooO0O0, long j, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postTask");
        }
        if ((i & 2) != 0) {
            j = 0;
        }
        c3842xm.m13094a(oooO0O0, j);
    }

    /* renamed from: a */
    public final void m13090a(Runnable callback) {
        kotlin.jvm.internal.OooOo.OooO0o0(callback, "callback");
        this.f12663a.m8708a(callback);
    }

    /* renamed from: a */
    public final void m13091a(Runnable runnable, long j) {
        kotlin.jvm.internal.OooOo.OooO0o0(runnable, "runnable");
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new a(runnable), j);
    }

    /* renamed from: a */
    public final void m13092a(String adUnitId, int i, String str) throws JSONException {
        kotlin.jvm.internal.OooOo.OooO0o0(adUnitId, "adUnitId");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(IronSourceConstants.EVENTS_ERROR_CODE, i);
        jSONObject.putOpt("reason", str);
        jSONObject.put("mediationAdUnitId", adUnitId);
        jSONObject.put("isMultipleAdUnits", 1);
        C2951av.m7842a(EnumC2638ac.TROUBLESHOOTING_AD_UNIT_CAPPING_PARSE_ERROR, jSONObject);
    }

    /* renamed from: a */
    public final void m13093a(String placementName, LevelPlay.AdFormat adFormat, int i, String str) throws JSONException {
        kotlin.jvm.internal.OooOo.OooO0o0(placementName, "placementName");
        kotlin.jvm.internal.OooOo.OooO0o0(adFormat, "adFormat");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(IronSourceConstants.EVENTS_ERROR_CODE, i);
        jSONObject.putOpt("reason", str);
        jSONObject.put("placement", placementName);
        jSONObject.put(C3157gm.f8745f, adFormat.getValue());
        jSONObject.put("adf", C2951av.m7846b(C4201a.m13452a(adFormat)));
        jSONObject.put("isMultipleAdUnits", 1);
        C2951av.m7842a(EnumC2638ac.TROUBLESHOOTING_PLACEMENT_CAPPING_PARSE_ERROR, jSONObject);
    }

    /* renamed from: a */
    public final void m13094a(o00O0Oo.OooO0O0 action, long j) {
        kotlin.jvm.internal.OooOo.OooO0o0(action, "action");
        m13088a((AbstractRunnableC3302ks) new b(action), j);
    }

    /* renamed from: a */
    public final boolean m13095a(AdapterBaseInterface networkAdapter, IronSource.AD_UNIT adFormat, String providerName) {
        kotlin.jvm.internal.OooOo.OooO0o0(networkAdapter, "networkAdapter");
        kotlin.jvm.internal.OooOo.OooO0o0(adFormat, "adFormat");
        kotlin.jvm.internal.OooOo.OooO0o0(providerName, "providerName");
        return C2951av.m7845a(networkAdapter, adFormat, providerName);
    }

    /* renamed from: a */
    public final IronSource.AD_UNIT[] m13096a(LevelPlay.AdFormat... adFormats) {
        kotlin.jvm.internal.OooOo.OooO0o0(adFormats, "adFormats");
        ArrayList arrayList = new ArrayList();
        for (LevelPlay.AdFormat adFormat : adFormats) {
            arrayList.add(m13084a(adFormat));
        }
        return (IronSource.AD_UNIT[]) arrayList.toArray(new IronSource.AD_UNIT[0]);
    }
}
