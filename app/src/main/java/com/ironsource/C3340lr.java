package com.ironsource;

import com.ironsource.C3611s;
import com.ironsource.InterfaceC3418mg;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Map;
import org.json.JSONException;

/* renamed from: com.ironsource.lr */
/* loaded from: classes2.dex */
public final class C3340lr {

    /* renamed from: a */
    private final C3842xm f9427a;

    /* renamed from: b */
    private final Map<String, C3611s.d> f9428b;

    /* renamed from: c */
    private final Map<String, C3611s.d> f9429c;

    public C3340lr(C3842xm tools, Map<String, C3611s.d> map, Map<String, C3611s.d> map2) {
        kotlin.jvm.internal.OooOo.OooO0o0(tools, "tools");
        this.f9427a = tools;
        this.f9428b = map;
        this.f9429c = map2;
    }

    /* renamed from: a */
    private final Object m9885a(String str, Integer num) {
        if (str != null && num != null) {
            return oo00o.OooOo.f33195OooO00o;
        }
        return o00O0.o000OOo.OooO0O0(new Exception("name - " + str + " or amount - " + num + " is not provided or invalid"));
    }

    /* renamed from: b */
    private final void m9887b(InterfaceC3418mg.a aVar, String str, String str2, Integer num) throws JSONException {
        Object objM9885a = m9885a(str2, num);
        if (!(objM9885a instanceof oo00o.OooOO0O)) {
            kotlin.jvm.internal.OooOo.OooO0O0(str2);
            kotlin.jvm.internal.OooOo.OooO0O0(num);
            aVar.mo9700a(str, str2, num.intValue());
        }
        Throwable thOooO00o = oo00o.OooOOO0.OooO00o(objM9885a);
        if (thOooO00o != null) {
            this.f9427a.m13099b(str, IronSourceError.ERROR_REWARD_VALIDATION_FAILED, thOooO00o.getMessage());
        }
    }

    /* renamed from: a */
    public final void m9888a(InterfaceC3418mg.a rewardService) {
        kotlin.jvm.internal.OooOo.OooO0o0(rewardService, "rewardService");
        Map<String, C3611s.d> map = this.f9429c;
        if (map != null && (r0 = map.entrySet().iterator()) != null) {
            for (Map.Entry<String, C3611s.d> entry : map.entrySet()) {
                String key = entry.getKey();
                C3266jr c3266jrM11793f = entry.getValue().m11793f();
                if (c3266jrM11793f != null) {
                    m9887b(rewardService, key, c3266jrM11793f.m9537b(), c3266jrM11793f.m9536a());
                }
            }
        }
        Map<String, C3611s.d> map2 = this.f9428b;
        if (map2 == null || (r0 = map2.entrySet().iterator()) == null) {
            return;
        }
        for (Map.Entry<String, C3611s.d> entry2 : map2.entrySet()) {
            String key2 = entry2.getKey();
            C3266jr c3266jrM11788a = entry2.getValue().m11788a();
            if (c3266jrM11788a != null) {
                m9886a(rewardService, key2, c3266jrM11788a.m9537b(), c3266jrM11788a.m9536a());
            }
        }
    }

    /* renamed from: a */
    private final void m9886a(InterfaceC3418mg.a aVar, String str, String str2, Integer num) throws JSONException {
        Object objM9885a = m9885a(str2, num);
        if (!(objM9885a instanceof oo00o.OooOO0O)) {
            kotlin.jvm.internal.OooOo.OooO0O0(str2);
            kotlin.jvm.internal.OooOo.OooO0O0(num);
            aVar.mo9701b(str, str2, num.intValue());
        }
        Throwable thOooO00o = oo00o.OooOOO0.OooO00o(objM9885a);
        if (thOooO00o != null) {
            this.f9427a.m13099b(str, IronSourceError.ERROR_REWARD_VALIDATION_FAILED, thOooO00o.getMessage());
        }
    }
}
