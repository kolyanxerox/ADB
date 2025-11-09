package com.ironsource;

import com.google.android.gms.internal.measurement.o0OOO0;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.ads.UnityAds;

/* renamed from: com.ironsource.ow */
/* loaded from: classes2.dex */
public final class C3504ow implements InterfaceC3434mw {

    /* renamed from: a */
    public static final C3504ow f10716a = new C3504ow();

    /* renamed from: b */
    private static final oo00o.OooO0OO f10717b = o0OOO0.OooO0oo(a.f10718a);

    /* renamed from: com.ironsource.ow$a */
    public static final class a extends kotlin.jvm.internal.Oooo000 implements o00O0Oo.OooO0O0 {

        /* renamed from: a */
        public static final a f10718a = new a();

        public a() {
            super(0);
        }

        @Override // o00O0Oo.OooO0O0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            try {
                UnityAds unityAds = UnityAds.INSTANCE;
                Object objInvoke = UnityAds.class.getMethod("getVersion", null).invoke(null, null);
                if (objInvoke instanceof String) {
                    return (String) objInvoke;
                }
                return null;
            } catch (Throwable th) {
                C3551q9.m11517d().m11519a(th);
                IronLog.INTERNAL.warning(th.getMessage());
                return null;
            }
        }
    }

    private C3504ow() {
    }

    @Override // com.ironsource.InterfaceC3434mw
    /* renamed from: a */
    public String mo10893a() {
        return (String) f10717b.getValue();
    }
}
