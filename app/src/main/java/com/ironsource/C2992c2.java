package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ironsource.c2 */
/* loaded from: classes2.dex */
public class C2992c2 {

    /* renamed from: p */
    private static final int f7678p = -1;

    /* renamed from: a */
    private final IronSource.AD_UNIT f7679a;

    /* renamed from: b */
    private final b f7680b;

    /* renamed from: c */
    private InterfaceC2957b2 f7681c;

    /* renamed from: d */
    private final AbstractC3724u7 f7682d;

    /* renamed from: e */
    public C3665si f7683e;

    /* renamed from: f */
    public C2978bn f7684f;

    /* renamed from: g */
    public C3167gw f7685g;

    /* renamed from: h */
    public C3546q4 f7686h;

    /* renamed from: i */
    public C3348m0 f7687i;

    /* renamed from: j */
    public C3345lw f7688j;

    /* renamed from: k */
    public C3845xp f7689k;

    /* renamed from: l */
    private Map<EnumC3889z1, a> f7690l;

    /* renamed from: m */
    private Map<EnumC3889z1, a> f7691m;

    /* renamed from: n */
    private Map<EnumC3889z1, a> f7692n;

    /* renamed from: o */
    private Map<EnumC3889z1, a> f7693o;

    /* renamed from: com.ironsource.c2$a */
    public static class a {

        /* renamed from: a */
        private final int f7694a;

        /* renamed from: b */
        private final int f7695b;

        public a(EnumC2638ac enumC2638ac, EnumC2638ac enumC2638ac2) {
            if (enumC2638ac != null) {
                this.f7694a = enumC2638ac.m4887b();
            } else {
                this.f7694a = -1;
            }
            if (enumC2638ac2 != null) {
                this.f7695b = enumC2638ac2.m4887b();
            } else {
                this.f7695b = -1;
            }
        }

        /* renamed from: a */
        public int m8081a(b bVar) {
            return b.MEDIATION.equals(bVar) ? this.f7694a : this.f7695b;
        }
    }

    /* renamed from: com.ironsource.c2$b */
    public enum b {
        MEDIATION,
        PROVIDER
    }

    public C2992c2(IronSource.AD_UNIT ad_unit, b bVar, InterfaceC2957b2 interfaceC2957b2) {
        this(ad_unit, bVar, interfaceC2957b2, m8072a(ad_unit));
    }

    /* renamed from: a */
    private int m8071a(EnumC3889z1 enumC3889z1) {
        a aVar;
        b bVar;
        try {
            if (IronSource.AD_UNIT.INTERSTITIAL.equals(this.f7679a) && this.f7690l.containsKey(enumC3889z1)) {
                aVar = this.f7690l.get(enumC3889z1);
                bVar = this.f7680b;
            } else if (IronSource.AD_UNIT.REWARDED_VIDEO.equals(this.f7679a) && this.f7691m.containsKey(enumC3889z1)) {
                aVar = this.f7691m.get(enumC3889z1);
                bVar = this.f7680b;
            } else if (IronSource.AD_UNIT.BANNER.equals(this.f7679a) && this.f7692n.containsKey(enumC3889z1)) {
                aVar = this.f7692n.get(enumC3889z1);
                bVar = this.f7680b;
            } else {
                if (!IronSource.AD_UNIT.NATIVE_AD.equals(this.f7679a) || !this.f7693o.containsKey(enumC3889z1)) {
                    return -1;
                }
                aVar = this.f7693o.get(enumC3889z1);
                bVar = this.f7680b;
            }
            return aVar.m8081a(bVar);
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error(e.toString());
            return -1;
        }
    }

    /* renamed from: d */
    private void m8073d() {
        HashMap map = new HashMap();
        this.f7693o = map;
        map.put(EnumC3889z1.INIT_STARTED, new a(EnumC2638ac.NT_MANAGER_INIT_STARTED, null));
        this.f7693o.put(EnumC3889z1.INIT_ENDED, new a(EnumC2638ac.NT_MANAGER_INIT_ENDED, null));
        this.f7693o.put(EnumC3889z1.PLACEMENT_CAPPED, new a(EnumC2638ac.NT_PLACEMENT_CAPPED, null));
        this.f7693o.put(EnumC3889z1.AUCTION_REQUEST, new a(EnumC2638ac.NT_AUCTION_REQUEST, null));
        this.f7693o.put(EnumC3889z1.AUCTION_SUCCESS, new a(EnumC2638ac.NT_AUCTION_SUCCESS, null));
        Map<EnumC3889z1, a> map2 = this.f7693o;
        EnumC3889z1 enumC3889z1 = EnumC3889z1.AUCTION_FAILED;
        EnumC2638ac enumC2638ac = EnumC2638ac.NT_AUCTION_FAILED;
        map2.put(enumC3889z1, new a(enumC2638ac, null));
        this.f7693o.put(EnumC3889z1.AUCTION_FAILED_NO_CANDIDATES, new a(enumC2638ac, null));
        this.f7693o.put(EnumC3889z1.AUCTION_REQUEST_WATERFALL, new a(EnumC2638ac.NT_AUCTION_REQUEST_WATERFALL, null));
        this.f7693o.put(EnumC3889z1.AUCTION_RESULT_WATERFALL, new a(EnumC2638ac.NT_AUCTION_RESPONSE_WATERFALL, null));
        this.f7693o.put(EnumC3889z1.INIT_SUCCESS, new a(null, null));
        this.f7693o.put(EnumC3889z1.INIT_FAILED, new a(null, null));
        this.f7693o.put(EnumC3889z1.AD_OPENED, new a(EnumC2638ac.NT_CALLBACK_SHOW, EnumC2638ac.NT_INSTANCE_SHOW));
        this.f7693o.put(EnumC3889z1.AD_CLICKED, new a(EnumC2638ac.NT_CALLBACK_CLICK, EnumC2638ac.NT_INSTANCE_CLICK));
        this.f7693o.put(EnumC3889z1.LOAD_AD, new a(EnumC2638ac.NT_LOAD, EnumC2638ac.NT_INSTANCE_LOAD));
        this.f7693o.put(EnumC3889z1.LOAD_AD_SUCCESS, new a(EnumC2638ac.NT_CALLBACK_LOAD_SUCCESS, EnumC2638ac.NT_INSTANCE_LOAD_SUCCESS));
        this.f7693o.put(EnumC3889z1.LOAD_AD_FAILED_WITH_REASON, new a(EnumC2638ac.NT_CALLBACK_LOAD_ERROR, EnumC2638ac.NT_INSTANCE_LOAD_ERROR));
        this.f7693o.put(EnumC3889z1.LOAD_AD_NO_FILL, new a(null, EnumC2638ac.NT_INSTANCE_LOAD_NO_FILL));
        this.f7693o.put(EnumC3889z1.AD_FORMAT_CAPPED, new a(EnumC2638ac.NT_AD_UNIT_CAPPED, null));
        Map<EnumC3889z1, a> map3 = this.f7693o;
        EnumC3889z1 enumC3889z12 = EnumC3889z1.COLLECT_TOKEN;
        EnumC2638ac enumC2638ac2 = EnumC2638ac.NT_COLLECT_TOKENS;
        EnumC2638ac enumC2638ac3 = EnumC2638ac.NT_INSTANCE_COLLECT_TOKEN;
        map3.put(enumC3889z12, new a(enumC2638ac2, enumC2638ac3));
        this.f7693o.put(EnumC3889z1.COLLECT_TOKENS_COMPLETED, new a(EnumC2638ac.NT_COLLECT_TOKENS_COMPLETED, null));
        this.f7693o.put(EnumC3889z1.COLLECT_TOKENS_FAILED, new a(EnumC2638ac.NT_COLLECT_TOKENS_FAILED, null));
        this.f7693o.put(EnumC3889z1.INSTANCE_COLLECT_TOKEN, new a(enumC2638ac3, null));
        Map<EnumC3889z1, a> map4 = this.f7693o;
        EnumC3889z1 enumC3889z13 = EnumC3889z1.INSTANCE_COLLECT_TOKEN_SUCCESS;
        EnumC2638ac enumC2638ac4 = EnumC2638ac.NT_INSTANCE_COLLECT_TOKEN_SUCCESS;
        map4.put(enumC3889z13, new a(enumC2638ac4, enumC2638ac4));
        Map<EnumC3889z1, a> map5 = this.f7693o;
        EnumC3889z1 enumC3889z14 = EnumC3889z1.INSTANCE_COLLECT_TOKEN_FAILED;
        EnumC2638ac enumC2638ac5 = EnumC2638ac.NT_INSTANCE_COLLECT_TOKEN_FAILED;
        map5.put(enumC3889z14, new a(enumC2638ac5, enumC2638ac5));
        Map<EnumC3889z1, a> map6 = this.f7693o;
        EnumC3889z1 enumC3889z15 = EnumC3889z1.INSTANCE_COLLECT_TOKEN_TIMED_OUT;
        EnumC2638ac enumC2638ac6 = EnumC2638ac.NT_INSTANCE_COLLECT_TOKEN_TIMED_OUT;
        map6.put(enumC3889z15, new a(enumC2638ac6, enumC2638ac6));
        this.f7693o.put(EnumC3889z1.DESTROY_AD, new a(EnumC2638ac.NT_DESTROY, EnumC2638ac.NT_INSTANCE_DESTROY));
        Map<EnumC3889z1, a> map7 = this.f7693o;
        EnumC3889z1 enumC3889z16 = EnumC3889z1.TROUBLESHOOT_PROVIDER_SETTINGS_MISSING;
        EnumC2638ac enumC2638ac7 = EnumC2638ac.TROUBLESHOOTING_NT_PROVIDER_SETTINGS_MISSING;
        map7.put(enumC3889z16, new a(enumC2638ac7, enumC2638ac7));
        Map<EnumC3889z1, a> map8 = this.f7693o;
        EnumC3889z1 enumC3889z17 = EnumC3889z1.TROUBLESHOOT_UNEXPECTED_INIT_SUCCESS;
        EnumC2638ac enumC2638ac8 = EnumC2638ac.TROUBLESHOOTING_NT_UNEXPECTED_INIT_SUCCESS;
        map8.put(enumC3889z17, new a(enumC2638ac8, enumC2638ac8));
        Map<EnumC3889z1, a> map9 = this.f7693o;
        EnumC3889z1 enumC3889z18 = EnumC3889z1.TROUBLESHOOT_UNEXPECTED_INIT_FAILED;
        EnumC2638ac enumC2638ac9 = EnumC2638ac.TROUBLESHOOTING_NT_UNEXPECTED_INIT_FAILED;
        map9.put(enumC3889z18, new a(enumC2638ac9, enumC2638ac9));
        Map<EnumC3889z1, a> map10 = this.f7693o;
        EnumC3889z1 enumC3889z19 = EnumC3889z1.TROUBLESHOOT_UNEXPECTED_AUCTION_SUCCESS;
        EnumC2638ac enumC2638ac10 = EnumC2638ac.TROUBLESHOOTING_NT_UNEXPECTED_AUCTION_SUCCESS;
        map10.put(enumC3889z19, new a(enumC2638ac10, enumC2638ac10));
        Map<EnumC3889z1, a> map11 = this.f7693o;
        EnumC3889z1 enumC3889z110 = EnumC3889z1.TROUBLESHOOT_UNEXPECTED_AUCTION_FAILED;
        EnumC2638ac enumC2638ac11 = EnumC2638ac.TROUBLESHOOTING_NT_UNEXPECTED_AUCTION_FAILED;
        map11.put(enumC3889z110, new a(enumC2638ac11, enumC2638ac11));
        Map<EnumC3889z1, a> map12 = this.f7693o;
        EnumC3889z1 enumC3889z111 = EnumC3889z1.TROUBLESHOOT_UNEXPECTED_LOAD_SUCCESS;
        EnumC2638ac enumC2638ac12 = EnumC2638ac.TROUBLESHOOTING_NT_UNEXPECTED_LOAD_SUCCESS;
        map12.put(enumC3889z111, new a(enumC2638ac12, enumC2638ac12));
        Map<EnumC3889z1, a> map13 = this.f7693o;
        EnumC3889z1 enumC3889z112 = EnumC3889z1.TROUBLESHOOT_UNEXPECTED_LOAD_FAILED;
        EnumC2638ac enumC2638ac13 = EnumC2638ac.TROUBLESHOOTING_NT_UNEXPECTED_LOAD_FAILED;
        map13.put(enumC3889z112, new a(enumC2638ac13, enumC2638ac13));
        Map<EnumC3889z1, a> map14 = this.f7693o;
        EnumC3889z1 enumC3889z113 = EnumC3889z1.TROUBLESHOOT_UNEXPECTED_TIMEOUT;
        EnumC2638ac enumC2638ac14 = EnumC2638ac.TROUBLESHOOTING_NT_UNEXPECTED_TIMEOUT;
        map14.put(enumC3889z113, new a(enumC2638ac14, enumC2638ac14));
        Map<EnumC3889z1, a> map15 = this.f7693o;
        EnumC3889z1 enumC3889z114 = EnumC3889z1.TROUBLESHOOT_UNEXPECTED_OPENED;
        EnumC2638ac enumC2638ac15 = EnumC2638ac.TROUBLESHOOTING_NT_UNEXPECTED_OPENED;
        map15.put(enumC3889z114, new a(enumC2638ac15, enumC2638ac15));
        Map<EnumC3889z1, a> map16 = this.f7693o;
        EnumC3889z1 enumC3889z115 = EnumC3889z1.TROUBLESHOOT_INTERNAL_ERROR;
        EnumC2638ac enumC2638ac16 = EnumC2638ac.TROUBLESHOOTING_NT_INTERNAL_ERROR;
        map16.put(enumC3889z115, new a(enumC2638ac16, enumC2638ac16));
        Map<EnumC3889z1, a> map17 = this.f7693o;
        EnumC3889z1 enumC3889z116 = EnumC3889z1.TROUBLESHOOT_ADAPTER_REPOSITORY_INTERNAL_ERROR;
        EnumC2638ac enumC2638ac17 = EnumC2638ac.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR;
        map17.put(enumC3889z116, new a(enumC2638ac17, enumC2638ac17));
        Map<EnumC3889z1, a> map18 = this.f7693o;
        EnumC3889z1 enumC3889z117 = EnumC3889z1.TROUBLESHOOT_AUCTION_SUCCESSFUL_RECOVERY_ERROR;
        EnumC2638ac enumC2638ac18 = EnumC2638ac.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR;
        map18.put(enumC3889z117, new a(enumC2638ac18, enumC2638ac18));
        this.f7693o.put(EnumC3889z1.TROUBLESHOOT_NOTIFICATION_ERROR, new a(EnumC2638ac.TROUBLESHOOTING_NT_NOTIFICATIONS_ERROR, null));
    }

    /* renamed from: b */
    public void m8077b() {
        m8078c();
        m8079e();
        m8074a();
        m8073d();
    }

    /* renamed from: c */
    public void m8078c() {
        HashMap map = new HashMap();
        this.f7690l = map;
        map.put(EnumC3889z1.INIT_STARTED, new a(EnumC2638ac.IS_MANAGER_INIT_STARTED, null));
        this.f7690l.put(EnumC3889z1.INIT_ENDED, new a(EnumC2638ac.IS_MANAGER_INIT_ENDED, null));
        this.f7690l.put(EnumC3889z1.SESSION_CAPPED, new a(null, EnumC2638ac.IS_CAP_SESSION));
        this.f7690l.put(EnumC3889z1.PLACEMENT_CAPPED, new a(EnumC2638ac.IS_CAP_PLACEMENT, null));
        this.f7690l.put(EnumC3889z1.CHECK_PLACEMENT_CAPPED, new a(EnumC2638ac.IS_CHECK_PLACEMENT_CAPPED, null));
        this.f7690l.put(EnumC3889z1.AUCTION_REQUEST, new a(EnumC2638ac.IS_AUCTION_REQUEST, null));
        this.f7690l.put(EnumC3889z1.AUCTION_SUCCESS, new a(EnumC2638ac.IS_AUCTION_SUCCESS, null));
        Map<EnumC3889z1, a> map2 = this.f7690l;
        EnumC3889z1 enumC3889z1 = EnumC3889z1.AUCTION_FAILED;
        EnumC2638ac enumC2638ac = EnumC2638ac.IS_AUCTION_FAILED;
        map2.put(enumC3889z1, new a(enumC2638ac, null));
        this.f7690l.put(EnumC3889z1.AUCTION_FAILED_NO_CANDIDATES, new a(enumC2638ac, null));
        this.f7690l.put(EnumC3889z1.AUCTION_REQUEST_WATERFALL, new a(EnumC2638ac.IS_AUCTION_REQUEST_WATERFALL, null));
        this.f7690l.put(EnumC3889z1.AUCTION_RESULT_WATERFALL, new a(EnumC2638ac.IS_RESULT_WATERFALL, null));
        this.f7690l.put(EnumC3889z1.INIT_SUCCESS, new a(null, null));
        this.f7690l.put(EnumC3889z1.INIT_FAILED, new a(null, null));
        this.f7690l.put(EnumC3889z1.SHOW_AD_SUCCESS, new a(EnumC2638ac.IS_CALLBACK_AD_DISPLAYED, EnumC2638ac.IS_INSTANCE_SHOW_SUCCESS));
        this.f7690l.put(EnumC3889z1.AD_OPENED, new a(null, EnumC2638ac.IS_INSTANCE_OPENED));
        this.f7690l.put(EnumC3889z1.AD_CLOSED, new a(EnumC2638ac.IS_CALLBACK_AD_CLOSED, EnumC2638ac.IS_INSTANCE_CLOSED));
        this.f7690l.put(EnumC3889z1.AD_CLICKED, new a(EnumC2638ac.IS_CALLBACK_AD_CLICKED, EnumC2638ac.IS_INSTANCE_CLICKED));
        this.f7690l.put(EnumC3889z1.AD_INFO_CHANGED, new a(EnumC2638ac.IS_CALLBACK_AD_INFO_CHANGED, null));
        this.f7690l.put(EnumC3889z1.LOAD_AD, new a(EnumC2638ac.IS_LOAD_CALLED, EnumC2638ac.IS_INSTANCE_LOAD));
        this.f7690l.put(EnumC3889z1.LOAD_AD_SUCCESS, new a(EnumC2638ac.IS_CALLBACK_LOAD_SUCCESS, EnumC2638ac.IS_INSTANCE_LOAD_SUCCESS));
        this.f7690l.put(EnumC3889z1.LOAD_AD_FAILED_WITH_REASON, new a(EnumC2638ac.IS_CALLBACK_LOAD_ERROR, EnumC2638ac.IS_INSTANCE_LOAD_FAILED));
        this.f7690l.put(EnumC3889z1.LOAD_AD_NO_FILL, new a(null, EnumC2638ac.IS_INSTANCE_LOAD_NO_FILL));
        this.f7690l.put(EnumC3889z1.SHOW_AD, new a(EnumC2638ac.IS_SHOW_CALLED, EnumC2638ac.IS_INSTANCE_SHOW));
        this.f7690l.put(EnumC3889z1.SHOW_AD_FAILED, new a(EnumC2638ac.IS_CALLBACK_AD_SHOW_ERROR, EnumC2638ac.IS_INSTANCE_SHOW_FAILED));
        this.f7690l.put(EnumC3889z1.AD_FORMAT_CAPPED, new a(EnumC2638ac.IS_AD_FORMAT_CAPPED, null));
        this.f7690l.put(EnumC3889z1.AD_UNIT_CAPPED, new a(EnumC2638ac.IS_AD_UNIT_CAPPED, null));
        this.f7690l.put(EnumC3889z1.COLLECT_TOKEN, new a(EnumC2638ac.IS_COLLECT_TOKENS, null));
        this.f7690l.put(EnumC3889z1.COLLECT_TOKENS_COMPLETED, new a(EnumC2638ac.IS_COLLECT_TOKENS_COMPLETED, null));
        this.f7690l.put(EnumC3889z1.COLLECT_TOKENS_FAILED, new a(EnumC2638ac.IS_COLLECT_TOKENS_FAILED, null));
        this.f7690l.put(EnumC3889z1.INSTANCE_COLLECT_TOKEN, new a(EnumC2638ac.IS_INSTANCE_COLLECT_TOKEN, null));
        this.f7690l.put(EnumC3889z1.INSTANCE_COLLECT_TOKEN_SUCCESS, new a(EnumC2638ac.IS_INSTANCE_COLLECT_TOKEN_SUCCESS, null));
        this.f7690l.put(EnumC3889z1.INSTANCE_COLLECT_TOKEN_FAILED, new a(EnumC2638ac.IS_INSTANCE_COLLECT_TOKEN_FAILED, null));
        this.f7690l.put(EnumC3889z1.INSTANCE_COLLECT_TOKEN_TIMED_OUT, new a(EnumC2638ac.IS_INSTANCE_COLLECT_TOKEN_TIMED_OUT, null));
        this.f7690l.put(EnumC3889z1.AD_READY_TRUE, new a(EnumC2638ac.IS_CHECK_READY_TRUE, null));
        this.f7690l.put(EnumC3889z1.AD_READY_FALSE, new a(EnumC2638ac.IS_CHECK_READY_FALSE, null));
        this.f7690l.put(EnumC3889z1.OPERATIONAL_LOAD_AD, new a(EnumC2638ac.IS_OPERATIONAL_LOAD_AD, null));
        this.f7690l.put(EnumC3889z1.OPERATIONAL_LOAD_SUCCESS, new a(EnumC2638ac.IS_OPERATIONAL_LOAD_SUCCESS, null));
        this.f7690l.put(EnumC3889z1.OPERATIONAL_LOAD_FAILED, new a(EnumC2638ac.IS_OPERATIONAL_LOAD_FAILED, null));
        this.f7690l.put(EnumC3889z1.OPERATIONAL_SET_CONFIGURATIONS, new a(EnumC2638ac.IS_SET_CONFIGURATION, null));
        Map<EnumC3889z1, a> map3 = this.f7690l;
        EnumC3889z1 enumC3889z12 = EnumC3889z1.TROUBLESHOOT_PROVIDER_SETTINGS_MISSING;
        EnumC2638ac enumC2638ac2 = EnumC2638ac.TROUBLESHOOTING_IS_PROVIDER_SETTINGS_MISSING;
        map3.put(enumC3889z12, new a(enumC2638ac2, enumC2638ac2));
        Map<EnumC3889z1, a> map4 = this.f7690l;
        EnumC3889z1 enumC3889z13 = EnumC3889z1.TROUBLESHOOT_UNEXPECTED_INIT_SUCCESS;
        EnumC2638ac enumC2638ac3 = EnumC2638ac.TROUBLESHOOTING_IS_UNEXPECTED_INIT_SUCCESS;
        map4.put(enumC3889z13, new a(enumC2638ac3, enumC2638ac3));
        Map<EnumC3889z1, a> map5 = this.f7690l;
        EnumC3889z1 enumC3889z14 = EnumC3889z1.TROUBLESHOOT_UNEXPECTED_INIT_FAILED;
        EnumC2638ac enumC2638ac4 = EnumC2638ac.TROUBLESHOOTING_IS_UNEXPECTED_INIT_FAILED;
        map5.put(enumC3889z14, new a(enumC2638ac4, enumC2638ac4));
        Map<EnumC3889z1, a> map6 = this.f7690l;
        EnumC3889z1 enumC3889z15 = EnumC3889z1.TROUBLESHOOT_UNEXPECTED_AUCTION_SUCCESS;
        EnumC2638ac enumC2638ac5 = EnumC2638ac.TROUBLESHOOTING_IS_UNEXPECTED_AUCTION_SUCCESS;
        map6.put(enumC3889z15, new a(enumC2638ac5, enumC2638ac5));
        Map<EnumC3889z1, a> map7 = this.f7690l;
        EnumC3889z1 enumC3889z16 = EnumC3889z1.TROUBLESHOOT_UNEXPECTED_AUCTION_FAILED;
        EnumC2638ac enumC2638ac6 = EnumC2638ac.TROUBLESHOOTING_IS_UNEXPECTED_AUCTION_FAILED;
        map7.put(enumC3889z16, new a(enumC2638ac6, enumC2638ac6));
        Map<EnumC3889z1, a> map8 = this.f7690l;
        EnumC3889z1 enumC3889z17 = EnumC3889z1.TROUBLESHOOT_UNEXPECTED_LOAD_SUCCESS;
        EnumC2638ac enumC2638ac7 = EnumC2638ac.TROUBLESHOOTING_IS_UNEXPECTED_LOAD_SUCCESS;
        map8.put(enumC3889z17, new a(enumC2638ac7, enumC2638ac7));
        Map<EnumC3889z1, a> map9 = this.f7690l;
        EnumC3889z1 enumC3889z18 = EnumC3889z1.TROUBLESHOOT_UNEXPECTED_LOAD_FAILED;
        EnumC2638ac enumC2638ac8 = EnumC2638ac.TROUBLESHOOTING_IS_UNEXPECTED_LOAD_FAILED;
        map9.put(enumC3889z18, new a(enumC2638ac8, enumC2638ac8));
        Map<EnumC3889z1, a> map10 = this.f7690l;
        EnumC3889z1 enumC3889z19 = EnumC3889z1.TROUBLESHOOT_UNEXPECTED_SHOW_FAILED;
        EnumC2638ac enumC2638ac9 = EnumC2638ac.TROUBLESHOOTING_IS_UNEXPECTED_SHOW_FAILED;
        map10.put(enumC3889z19, new a(enumC2638ac9, enumC2638ac9));
        Map<EnumC3889z1, a> map11 = this.f7690l;
        EnumC3889z1 enumC3889z110 = EnumC3889z1.TROUBLESHOOT_UNEXPECTED_CLOSED;
        EnumC2638ac enumC2638ac10 = EnumC2638ac.TROUBLESHOOTING_IS_UNEXPECTED_CLOSED;
        map11.put(enumC3889z110, new a(enumC2638ac10, enumC2638ac10));
        Map<EnumC3889z1, a> map12 = this.f7690l;
        EnumC3889z1 enumC3889z111 = EnumC3889z1.TROUBLESHOOT_UNEXPECTED_TIMEOUT;
        EnumC2638ac enumC2638ac11 = EnumC2638ac.TROUBLESHOOTING_IS_UNEXPECTED_TIMEOUT;
        map12.put(enumC3889z111, new a(enumC2638ac11, enumC2638ac11));
        Map<EnumC3889z1, a> map13 = this.f7690l;
        EnumC3889z1 enumC3889z112 = EnumC3889z1.TROUBLESHOOT_INTERNAL_ERROR;
        EnumC2638ac enumC2638ac12 = EnumC2638ac.TROUBLESHOOTING_IS_INTERNAL_ERROR;
        map13.put(enumC3889z112, new a(enumC2638ac12, enumC2638ac12));
        Map<EnumC3889z1, a> map14 = this.f7690l;
        EnumC3889z1 enumC3889z113 = EnumC3889z1.TROUBLESHOOT_ADAPTER_REPOSITORY_INTERNAL_ERROR;
        EnumC2638ac enumC2638ac13 = EnumC2638ac.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR;
        map14.put(enumC3889z113, new a(enumC2638ac13, enumC2638ac13));
        Map<EnumC3889z1, a> map15 = this.f7690l;
        EnumC3889z1 enumC3889z114 = EnumC3889z1.TROUBLESHOOT_AUCTION_SUCCESSFUL_RECOVERY_ERROR;
        EnumC2638ac enumC2638ac14 = EnumC2638ac.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR;
        map15.put(enumC3889z114, new a(enumC2638ac14, enumC2638ac14));
        this.f7690l.put(EnumC3889z1.TROUBLESHOOT_NOTIFICATION_ERROR, new a(EnumC2638ac.TROUBLESHOOTING_IS_NOTIFICATIONS_ERROR, null));
        Map<EnumC3889z1, a> map16 = this.f7690l;
        EnumC3889z1 enumC3889z115 = EnumC3889z1.TROUBLESHOOT_AD_EXPIRED;
        EnumC2638ac enumC2638ac15 = EnumC2638ac.TROUBLESHOOTING_IS_AD_EXPIRED;
        map16.put(enumC3889z115, new a(enumC2638ac15, enumC2638ac15));
        this.f7690l.put(EnumC3889z1.TROUBLESHOOT_LOAD, new a(EnumC2638ac.TROUBLESHOOTING_IS_LOAD, null));
        this.f7690l.put(EnumC3889z1.TROUBLESHOOT_LOAD_WHILE_LOADED, new a(EnumC2638ac.TROUBLESHOOTING_IS_LOAD_WHILE_LOADED, null));
        this.f7690l.put(EnumC3889z1.TROUBLESHOOT_LOAD_SUCCESS, new a(EnumC2638ac.TROUBLESHOOTING_IS_LOAD_SUCCESS, null));
        this.f7690l.put(EnumC3889z1.TROUBLESHOOT_LOAD_FAILED, new a(EnumC2638ac.TROUBLESHOOTING_IS_LOAD_FAILED, null));
        this.f7690l.put(EnumC3889z1.TROUBLESHOOT_SHOW, new a(EnumC2638ac.TROUBLESHOOTING_IS_SHOW, null));
        this.f7690l.put(EnumC3889z1.TROUBLESHOOT_SHOW_SUCCESS, new a(EnumC2638ac.TROUBLESHOOTING_IS_SHOW_SUCCESS, null));
        this.f7690l.put(EnumC3889z1.TROUBLESHOOT_SHOW_FAILED, new a(EnumC2638ac.TROUBLESHOOTING_IS_SHOW_FAILED, null));
        Map<EnumC3889z1, a> map17 = this.f7690l;
        EnumC3889z1 enumC3889z116 = EnumC3889z1.TROUBLESHOOT_ILLEGAL_STATE;
        EnumC2638ac enumC2638ac16 = EnumC2638ac.TROUBLESHOOTING_IS_ILLEGAL_STATE;
        map17.put(enumC3889z116, new a(enumC2638ac16, enumC2638ac16));
        this.f7690l.put(EnumC3889z1.TROUBLESHOOT_AD_INFO_CHANGED, new a(EnumC2638ac.TROUBLESHOOT_IS_AD_INFO_CHANGED, null));
        this.f7690l.put(EnumC3889z1.TROUBLESHOOT_DISPOSE, new a(EnumC2638ac.TROUBLESHOOTING_IS_DISPOSE, null));
    }

    /* renamed from: e */
    public void m8079e() {
        HashMap map = new HashMap();
        this.f7691m = map;
        map.put(EnumC3889z1.INIT_STARTED, new a(EnumC2638ac.RV_MANAGER_INIT_STARTED, null));
        this.f7691m.put(EnumC3889z1.INIT_ENDED, new a(EnumC2638ac.RV_MANAGER_INIT_ENDED, null));
        this.f7691m.put(EnumC3889z1.SESSION_CAPPED, new a(null, EnumC2638ac.RV_CAP_SESSION));
        this.f7691m.put(EnumC3889z1.PLACEMENT_CAPPED, new a(EnumC2638ac.RV_CAP_PLACEMENT, null));
        this.f7691m.put(EnumC3889z1.CHECK_PLACEMENT_CAPPED, new a(EnumC2638ac.RV_CHECK_PLACEMENT_CAPPED, null));
        this.f7691m.put(EnumC3889z1.AUCTION_REQUEST, new a(EnumC2638ac.RV_AUCTION_REQUEST, null));
        this.f7691m.put(EnumC3889z1.AUCTION_SUCCESS, new a(EnumC2638ac.RV_AUCTION_SUCCESS, null));
        Map<EnumC3889z1, a> map2 = this.f7691m;
        EnumC3889z1 enumC3889z1 = EnumC3889z1.AUCTION_FAILED;
        EnumC2638ac enumC2638ac = EnumC2638ac.RV_AUCTION_FAILED;
        map2.put(enumC3889z1, new a(enumC2638ac, null));
        this.f7691m.put(EnumC3889z1.AUCTION_FAILED_NO_CANDIDATES, new a(enumC2638ac, null));
        this.f7691m.put(EnumC3889z1.AUCTION_REQUEST_WATERFALL, new a(EnumC2638ac.RV_AUCTION_REQUEST_WATERFALL, null));
        this.f7691m.put(EnumC3889z1.AUCTION_RESULT_WATERFALL, new a(EnumC2638ac.RV_AUCTION_RESPONSE_WATERFALL, null));
        this.f7691m.put(EnumC3889z1.INIT_SUCCESS, new a(null, null));
        this.f7691m.put(EnumC3889z1.INIT_FAILED, new a(null, null));
        this.f7691m.put(EnumC3889z1.AD_VISIBLE, new a(null, EnumC2638ac.RV_INSTANCE_VISIBLE));
        this.f7691m.put(EnumC3889z1.SHOW_AD_SUCCESS, new a(EnumC2638ac.RV_CALLBACK_AD_DISPLAYED, null));
        this.f7691m.put(EnumC3889z1.AD_OPENED, new a(null, EnumC2638ac.RV_BUSINESS_INSTANCE_OPENED));
        this.f7691m.put(EnumC3889z1.AD_CLOSED, new a(null, EnumC2638ac.RV_INSTANCE_CLOSED));
        this.f7691m.put(EnumC3889z1.AD_STARTED, new a(null, EnumC2638ac.RV_INSTANCE_STARTED));
        this.f7691m.put(EnumC3889z1.AD_ENDED, new a(null, EnumC2638ac.RV_INSTANCE_ENDED));
        this.f7691m.put(EnumC3889z1.AD_CLICKED, new a(EnumC2638ac.RV_CALLBACK_AD_CLICKED, EnumC2638ac.RV_BUSINESS_INSTANCE_CLICKED));
        this.f7691m.put(EnumC3889z1.AD_INFO_CHANGED, new a(EnumC2638ac.RV_CALLBACK_AD_INFO_CHANGED, null));
        this.f7691m.put(EnumC3889z1.AD_REWARDED, new a(null, EnumC2638ac.RV_BUSINESS_INSTANCE_REWARDED));
        this.f7691m.put(EnumC3889z1.AD_AVAILABILITY_CHANGED_TRUE, new a(EnumC2638ac.RV_CALLBACK_AVAILABILITY_TRUE, EnumC2638ac.RV_INSTANCE_AVAILABILITY_TRUE));
        this.f7691m.put(EnumC3889z1.AD_AVAILABILITY_CHANGED_FALSE, new a(EnumC2638ac.RV_CALLBACK_AVAILABILITY_FALSE, EnumC2638ac.RV_INSTANCE_AVAILABILITY_FALSE));
        this.f7691m.put(EnumC3889z1.LOAD_AD, new a(EnumC2638ac.RV_BUSINESS_MEDIATION_LOAD, EnumC2638ac.RV_BUSINESS_INSTANCE_LOAD));
        this.f7691m.put(EnumC3889z1.LOAD_AD_SUCCESS, new a(EnumC2638ac.RV_BUSINESS_MEDIATION_LOAD_SUCCESS, EnumC2638ac.RV_BUSINESS_INSTANCE_LOAD_SUCCESS));
        this.f7691m.put(EnumC3889z1.LOAD_AD_FAILED, new a(null, EnumC2638ac.RV_INSTANCE_LOAD_FAILED));
        this.f7691m.put(EnumC3889z1.LOAD_AD_FAILED_WITH_REASON, new a(EnumC2638ac.RV_MEDIATION_LOAD_ERROR, EnumC2638ac.RV_INSTANCE_LOAD_FAILED_REASON));
        this.f7691m.put(EnumC3889z1.LOAD_AD_NO_FILL, new a(null, EnumC2638ac.RV_INSTANCE_LOAD_NO_FILL));
        this.f7691m.put(EnumC3889z1.SHOW_AD, new a(EnumC2638ac.RV_API_SHOW_CALLED, EnumC2638ac.RV_INSTANCE_SHOW));
        this.f7691m.put(EnumC3889z1.SHOW_AD_CHANCE, new a(null, EnumC2638ac.RV_INSTANCE_SHOW_CHANCE));
        this.f7691m.put(EnumC3889z1.SHOW_AD_FAILED, new a(EnumC2638ac.RV_CALLBACK_SHOW_FAILED, EnumC2638ac.RV_INSTANCE_SHOW_FAILED));
        this.f7691m.put(EnumC3889z1.AD_FORMAT_CAPPED, new a(EnumC2638ac.RV_AD_UNIT_CAPPED, null));
        this.f7691m.put(EnumC3889z1.COLLECT_TOKEN, new a(EnumC2638ac.RV_COLLECT_TOKENS, null));
        this.f7691m.put(EnumC3889z1.COLLECT_TOKENS_COMPLETED, new a(EnumC2638ac.RV_COLLECT_TOKENS_COMPLETED, null));
        this.f7691m.put(EnumC3889z1.COLLECT_TOKENS_FAILED, new a(EnumC2638ac.RV_COLLECT_TOKENS_FAILED, null));
        this.f7691m.put(EnumC3889z1.INSTANCE_COLLECT_TOKEN, new a(EnumC2638ac.RV_INSTANCE_COLLECT_TOKEN, null));
        Map<EnumC3889z1, a> map3 = this.f7691m;
        EnumC3889z1 enumC3889z12 = EnumC3889z1.INSTANCE_COLLECT_TOKEN_SUCCESS;
        EnumC2638ac enumC2638ac2 = EnumC2638ac.RV_INSTANCE_COLLECT_TOKEN_SUCCESS;
        map3.put(enumC3889z12, new a(enumC2638ac2, enumC2638ac2));
        Map<EnumC3889z1, a> map4 = this.f7691m;
        EnumC3889z1 enumC3889z13 = EnumC3889z1.INSTANCE_COLLECT_TOKEN_FAILED;
        EnumC2638ac enumC2638ac3 = EnumC2638ac.RV_INSTANCE_COLLECT_TOKEN_FAILED;
        map4.put(enumC3889z13, new a(enumC2638ac3, enumC2638ac3));
        Map<EnumC3889z1, a> map5 = this.f7691m;
        EnumC3889z1 enumC3889z14 = EnumC3889z1.INSTANCE_COLLECT_TOKEN_TIMED_OUT;
        EnumC2638ac enumC2638ac4 = EnumC2638ac.RV_INSTANCE_COLLECT_TOKEN_TIMED_OUT;
        map5.put(enumC3889z14, new a(enumC2638ac4, enumC2638ac4));
        this.f7691m.put(EnumC3889z1.AD_READY_TRUE, new a(EnumC2638ac.RV_CHECK_READY_TRUE, null));
        this.f7691m.put(EnumC3889z1.AD_READY_FALSE, new a(EnumC2638ac.RV_CHECK_READY_FALSE, null));
        this.f7691m.put(EnumC3889z1.OPERATIONAL_LOAD_AD, new a(EnumC2638ac.RV_OPERATIONAL_LOAD_AD, null));
        this.f7691m.put(EnumC3889z1.OPERATIONAL_LOAD_SUCCESS, new a(EnumC2638ac.RV_OPERATIONAL_LOAD_SUCCESS, null));
        this.f7691m.put(EnumC3889z1.OPERATIONAL_LOAD_FAILED, new a(EnumC2638ac.RV_OPERATIONAL_LOAD_FAILED, null));
        this.f7691m.put(EnumC3889z1.OPERATIONAL_SET_CONFIGURATIONS, new a(EnumC2638ac.RV_SET_CONFIGURATION, null));
        Map<EnumC3889z1, a> map6 = this.f7691m;
        EnumC3889z1 enumC3889z15 = EnumC3889z1.TROUBLESHOOT_PROVIDER_SETTINGS_MISSING;
        EnumC2638ac enumC2638ac5 = EnumC2638ac.TROUBLESHOOTING_RV_PROVIDER_SETTINGS_MISSING;
        map6.put(enumC3889z15, new a(enumC2638ac5, enumC2638ac5));
        Map<EnumC3889z1, a> map7 = this.f7691m;
        EnumC3889z1 enumC3889z16 = EnumC3889z1.TROUBLESHOOT_UNEXPECTED_INIT_SUCCESS;
        EnumC2638ac enumC2638ac6 = EnumC2638ac.TROUBLESHOOTING_RV_UNEXPECTED_INIT_SUCCESS;
        map7.put(enumC3889z16, new a(enumC2638ac6, enumC2638ac6));
        Map<EnumC3889z1, a> map8 = this.f7691m;
        EnumC3889z1 enumC3889z17 = EnumC3889z1.TROUBLESHOOT_UNEXPECTED_INIT_FAILED;
        EnumC2638ac enumC2638ac7 = EnumC2638ac.TROUBLESHOOTING_RV_UNEXPECTED_INIT_FAILED;
        map8.put(enumC3889z17, new a(enumC2638ac7, enumC2638ac7));
        Map<EnumC3889z1, a> map9 = this.f7691m;
        EnumC3889z1 enumC3889z18 = EnumC3889z1.TROUBLESHOOT_UNEXPECTED_AUCTION_SUCCESS;
        EnumC2638ac enumC2638ac8 = EnumC2638ac.TROUBLESHOOTING_RV_UNEXPECTED_AUCTION_SUCCESS;
        map9.put(enumC3889z18, new a(enumC2638ac8, enumC2638ac8));
        Map<EnumC3889z1, a> map10 = this.f7691m;
        EnumC3889z1 enumC3889z19 = EnumC3889z1.TROUBLESHOOT_UNEXPECTED_AUCTION_FAILED;
        EnumC2638ac enumC2638ac9 = EnumC2638ac.TROUBLESHOOTING_RV_UNEXPECTED_AUCTION_FAILED;
        map10.put(enumC3889z19, new a(enumC2638ac9, enumC2638ac9));
        Map<EnumC3889z1, a> map11 = this.f7691m;
        EnumC3889z1 enumC3889z110 = EnumC3889z1.TROUBLESHOOT_UNEXPECTED_LOAD_SUCCESS;
        EnumC2638ac enumC2638ac10 = EnumC2638ac.TROUBLESHOOTING_RV_UNEXPECTED_LOAD_SUCCESS;
        map11.put(enumC3889z110, new a(enumC2638ac10, enumC2638ac10));
        Map<EnumC3889z1, a> map12 = this.f7691m;
        EnumC3889z1 enumC3889z111 = EnumC3889z1.TROUBLESHOOT_UNEXPECTED_LOAD_FAILED;
        EnumC2638ac enumC2638ac11 = EnumC2638ac.TROUBLESHOOTING_RV_UNEXPECTED_LOAD_FAILED;
        map12.put(enumC3889z111, new a(enumC2638ac11, enumC2638ac11));
        Map<EnumC3889z1, a> map13 = this.f7691m;
        EnumC3889z1 enumC3889z112 = EnumC3889z1.TROUBLESHOOT_UNEXPECTED_SHOW_FAILED;
        EnumC2638ac enumC2638ac12 = EnumC2638ac.TROUBLESHOOTING_RV_UNEXPECTED_SHOW_FAILED;
        map13.put(enumC3889z112, new a(enumC2638ac12, enumC2638ac12));
        Map<EnumC3889z1, a> map14 = this.f7691m;
        EnumC3889z1 enumC3889z113 = EnumC3889z1.TROUBLESHOOT_UNEXPECTED_TIMEOUT;
        EnumC2638ac enumC2638ac13 = EnumC2638ac.TROUBLESHOOTING_RV_UNEXPECTED_TIMEOUT;
        map14.put(enumC3889z113, new a(enumC2638ac13, enumC2638ac13));
        Map<EnumC3889z1, a> map15 = this.f7691m;
        EnumC3889z1 enumC3889z114 = EnumC3889z1.TROUBLESHOOT_UNEXPECTED_CLOSED;
        EnumC2638ac enumC2638ac14 = EnumC2638ac.TROUBLESHOOTING_RV_UNEXPECTED_CLOSED;
        map15.put(enumC3889z114, new a(enumC2638ac14, enumC2638ac14));
        Map<EnumC3889z1, a> map16 = this.f7691m;
        EnumC3889z1 enumC3889z115 = EnumC3889z1.TROUBLESHOOT_LOAD_FAILED;
        EnumC2638ac enumC2638ac15 = EnumC2638ac.TROUBLESHOOTING_RV_LOAD_FAILED;
        map16.put(enumC3889z115, new a(enumC2638ac15, enumC2638ac15));
        Map<EnumC3889z1, a> map17 = this.f7691m;
        EnumC3889z1 enumC3889z116 = EnumC3889z1.TROUBLESHOOT_INTERNAL_ERROR;
        EnumC2638ac enumC2638ac16 = EnumC2638ac.TROUBLESHOOTING_RV_INTERNAL_ERROR;
        map17.put(enumC3889z116, new a(enumC2638ac16, enumC2638ac16));
        Map<EnumC3889z1, a> map18 = this.f7691m;
        EnumC3889z1 enumC3889z117 = EnumC3889z1.TROUBLESHOOT_ADAPTER_REPOSITORY_INTERNAL_ERROR;
        EnumC2638ac enumC2638ac17 = EnumC2638ac.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR;
        map18.put(enumC3889z117, new a(enumC2638ac17, enumC2638ac17));
        Map<EnumC3889z1, a> map19 = this.f7691m;
        EnumC3889z1 enumC3889z118 = EnumC3889z1.TROUBLESHOOT_WATERFALL_OVERHEAD;
        EnumC2638ac enumC2638ac18 = EnumC2638ac.TROUBLESHOOTING_RV_WATERFALL_OVERHEAD;
        map19.put(enumC3889z118, new a(enumC2638ac18, enumC2638ac18));
        this.f7691m.put(EnumC3889z1.TROUBLESHOOT_NOTIFICATION_ERROR, new a(EnumC2638ac.TROUBLESHOOTING_RV_NOTIFICATIONS_ERROR, null));
        Map<EnumC3889z1, a> map20 = this.f7691m;
        EnumC3889z1 enumC3889z119 = EnumC3889z1.TROUBLESHOOT_AD_EXPIRED;
        EnumC2638ac enumC2638ac19 = EnumC2638ac.TROUBLESHOOTING_RV_AD_EXPIRED;
        map20.put(enumC3889z119, new a(enumC2638ac19, enumC2638ac19));
        this.f7691m.put(EnumC3889z1.TROUBLESHOOT_LOAD, new a(EnumC2638ac.TROUBLESHOOTING_RV_LOAD, null));
        this.f7691m.put(EnumC3889z1.TROUBLESHOOT_LOAD_WHILE_LOADED, new a(EnumC2638ac.TROUBLESHOOTING_RV_LOAD_WHILE_LOADED, null));
        this.f7691m.put(EnumC3889z1.TROUBLESHOOT_LOAD_SUCCESS, new a(EnumC2638ac.TROUBLESHOOTING_RV_LOAD_SUCCESS, null));
        this.f7691m.put(EnumC3889z1.TROUBLESHOOT_SHOW, new a(EnumC2638ac.TROUBLESHOOTING_RV_SHOW, null));
        this.f7691m.put(EnumC3889z1.TROUBLESHOOT_SHOW_SUCCESS, new a(EnumC2638ac.TROUBLESHOOTING_RV_SHOW_SUCCESS, null));
        this.f7691m.put(EnumC3889z1.TROUBLESHOOT_SHOW_FAILED, new a(EnumC2638ac.TROUBLESHOOTING_RV_SHOW_FAILED, null));
        Map<EnumC3889z1, a> map21 = this.f7691m;
        EnumC3889z1 enumC3889z120 = EnumC3889z1.TROUBLESHOOT_ILLEGAL_STATE;
        EnumC2638ac enumC2638ac20 = EnumC2638ac.TROUBLESHOOTING_RV_ILLEGAL_STATE;
        map21.put(enumC3889z120, new a(enumC2638ac20, enumC2638ac20));
        this.f7691m.put(EnumC3889z1.TROUBLESHOOT_AD_INFO_CHANGED, new a(EnumC2638ac.TROUBLESHOOT_RV_AD_INFO_CHANGED, null));
        this.f7691m.put(EnumC3889z1.TROUBLESHOOT_DISPOSE, new a(EnumC2638ac.TROUBLESHOOTING_RV_DISPOSE, null));
    }

    /* renamed from: f */
    public void m8080f() {
        this.f7681c = null;
        this.f7685g = null;
        this.f7686h = null;
        this.f7683e = null;
        this.f7684f = null;
        this.f7687i = null;
        this.f7688j = null;
        this.f7689k = null;
    }

    public C2992c2(IronSource.AD_UNIT ad_unit, b bVar, InterfaceC2957b2 interfaceC2957b2, AbstractC3724u7 abstractC3724u7) {
        this.f7679a = ad_unit;
        this.f7680b = bVar;
        this.f7681c = interfaceC2957b2;
        this.f7682d = abstractC3724u7 == null ? m8072a(ad_unit) : abstractC3724u7;
        m8077b();
        this.f7683e = new C3665si(this);
        this.f7684f = new C2978bn(this);
        this.f7685g = new C3167gw(this);
        this.f7686h = new C3546q4(this);
        this.f7687i = new C3348m0(this);
        this.f7688j = new C3345lw(this);
        this.f7689k = new C3845xp(this);
    }

    /* renamed from: a */
    private static AbstractC3724u7 m8072a(IronSource.AD_UNIT ad_unit) {
        return ad_unit.equals(IronSource.AD_UNIT.REWARDED_VIDEO) ? C3053ds.m8391i() : C3805wj.m12898i();
    }

    /* renamed from: a */
    public void m8074a() {
        HashMap map = new HashMap();
        this.f7692n = map;
        map.put(EnumC3889z1.INIT_STARTED, new a(EnumC2638ac.BN_MANAGER_INIT_STARTED, null));
        this.f7692n.put(EnumC3889z1.INIT_ENDED, new a(EnumC2638ac.BN_MANAGER_INIT_ENDED, null));
        this.f7692n.put(EnumC3889z1.PLACEMENT_CAPPED, new a(EnumC2638ac.BN_PLACEMENT_CAPPED, null));
        this.f7692n.put(EnumC3889z1.AUCTION_REQUEST, new a(EnumC2638ac.BN_AUCTION_REQUEST, null));
        this.f7692n.put(EnumC3889z1.AUCTION_SUCCESS, new a(EnumC2638ac.BN_AUCTION_SUCCESS, null));
        Map<EnumC3889z1, a> map2 = this.f7692n;
        EnumC3889z1 enumC3889z1 = EnumC3889z1.AUCTION_FAILED;
        EnumC2638ac enumC2638ac = EnumC2638ac.BN_AUCTION_FAILED;
        map2.put(enumC3889z1, new a(enumC2638ac, null));
        this.f7692n.put(EnumC3889z1.AUCTION_FAILED_NO_CANDIDATES, new a(enumC2638ac, null));
        this.f7692n.put(EnumC3889z1.AUCTION_REQUEST_WATERFALL, new a(EnumC2638ac.BN_AUCTION_REQUEST_WATERFALL, null));
        this.f7692n.put(EnumC3889z1.AUCTION_RESULT_WATERFALL, new a(EnumC2638ac.BN_AUCTION_RESPONSE_WATERFALL, null));
        this.f7692n.put(EnumC3889z1.INIT_SUCCESS, new a(null, null));
        this.f7692n.put(EnumC3889z1.INIT_FAILED, new a(null, null));
        this.f7692n.put(EnumC3889z1.AD_OPENED, new a(EnumC2638ac.BN_CALLBACK_SHOW, EnumC2638ac.BN_INSTANCE_SHOW));
        this.f7692n.put(EnumC3889z1.AD_CLICKED, new a(EnumC2638ac.BN_CALLBACK_CLICK, EnumC2638ac.BN_INSTANCE_CLICK));
        this.f7692n.put(EnumC3889z1.LOAD_AD, new a(EnumC2638ac.BN_LOAD, EnumC2638ac.BN_INSTANCE_LOAD));
        this.f7692n.put(EnumC3889z1.RELOAD_AD, new a(EnumC2638ac.BN_RELOAD, EnumC2638ac.BN_INSTANCE_RELOAD));
        this.f7692n.put(EnumC3889z1.LOAD_AD_SUCCESS, new a(EnumC2638ac.BN_CALLBACK_LOAD_SUCCESS, EnumC2638ac.BN_INSTANCE_LOAD_SUCCESS));
        this.f7692n.put(EnumC3889z1.RELOAD_AD_SUCCESS, new a(EnumC2638ac.BN_CALLBACK_RELOAD_SUCCESS, EnumC2638ac.BN_INSTANCE_RELOAD_SUCCESS));
        this.f7692n.put(EnumC3889z1.LOAD_AD_FAILED_WITH_REASON, new a(EnumC2638ac.BN_CALLBACK_LOAD_ERROR, EnumC2638ac.BN_INSTANCE_LOAD_ERROR));
        this.f7692n.put(EnumC3889z1.RELOAD_AD_FAILED_WITH_REASON, new a(EnumC2638ac.BN_CALLBACK_RELOAD_ERROR, EnumC2638ac.BN_INSTANCE_RELOAD_ERROR));
        this.f7692n.put(EnumC3889z1.LOAD_AD_NO_FILL, new a(null, EnumC2638ac.BN_INSTANCE_LOAD_NO_FILL));
        this.f7692n.put(EnumC3889z1.RELOAD_AD_NO_FILL, new a(null, EnumC2638ac.BN_INSTANCE_RELOAD_NO_FILL));
        this.f7692n.put(EnumC3889z1.AD_FORMAT_CAPPED, new a(EnumC2638ac.BN_AD_UNIT_CAPPED, null));
        this.f7692n.put(EnumC3889z1.COLLECT_TOKEN, new a(EnumC2638ac.BN_COLLECT_TOKENS, null));
        this.f7692n.put(EnumC3889z1.COLLECT_TOKENS_COMPLETED, new a(EnumC2638ac.BN_COLLECT_TOKENS_COMPLETED, null));
        this.f7692n.put(EnumC3889z1.COLLECT_TOKENS_FAILED, new a(EnumC2638ac.BN_COLLECT_TOKENS_FAILED, null));
        this.f7692n.put(EnumC3889z1.INSTANCE_COLLECT_TOKEN, new a(EnumC2638ac.BN_INSTANCE_COLLECT_TOKEN, null));
        Map<EnumC3889z1, a> map3 = this.f7692n;
        EnumC3889z1 enumC3889z12 = EnumC3889z1.INSTANCE_COLLECT_TOKEN_SUCCESS;
        EnumC2638ac enumC2638ac2 = EnumC2638ac.BN_INSTANCE_COLLECT_TOKEN_SUCCESS;
        map3.put(enumC3889z12, new a(enumC2638ac2, enumC2638ac2));
        Map<EnumC3889z1, a> map4 = this.f7692n;
        EnumC3889z1 enumC3889z13 = EnumC3889z1.INSTANCE_COLLECT_TOKEN_FAILED;
        EnumC2638ac enumC2638ac3 = EnumC2638ac.BN_INSTANCE_COLLECT_TOKEN_FAILED;
        map4.put(enumC3889z13, new a(enumC2638ac3, enumC2638ac3));
        Map<EnumC3889z1, a> map5 = this.f7692n;
        EnumC3889z1 enumC3889z14 = EnumC3889z1.INSTANCE_COLLECT_TOKEN_TIMED_OUT;
        EnumC2638ac enumC2638ac4 = EnumC2638ac.BN_INSTANCE_COLLECT_TOKEN_TIMED_OUT;
        map5.put(enumC3889z14, new a(enumC2638ac4, enumC2638ac4));
        this.f7692n.put(EnumC3889z1.DESTROY_AD, new a(EnumC2638ac.BN_DESTROY, EnumC2638ac.BN_INSTANCE_DESTROY));
        this.f7692n.put(EnumC3889z1.SKIP_RELOAD_AD, new a(EnumC2638ac.BN_SKIP_RELOAD, null));
        this.f7692n.put(EnumC3889z1.AD_LEFT_APPLICATION, new a(EnumC2638ac.BN_CALLBACK_LEAVE_APP, EnumC2638ac.BN_INSTANCE_LEAVE_APP));
        this.f7692n.put(EnumC3889z1.AD_PRESENT_SCREEN, new a(EnumC2638ac.BN_CALLBACK_PRESENT_SCREEN, EnumC2638ac.BN_INSTANCE_PRESENT_SCREEN));
        this.f7692n.put(EnumC3889z1.AD_DISMISS_SCREEN, new a(EnumC2638ac.BN_CALLBACK_DISMISS_SCREEN, EnumC2638ac.BN_INSTANCE_DISMISS_SCREEN));
        this.f7692n.put(EnumC3889z1.AD_VIEW_BOUND, new a(EnumC2638ac.BN_BOUND, EnumC2638ac.BN_INSTANCE_BOUND));
        this.f7692n.put(EnumC3889z1.PAUSE_AD, new a(EnumC2638ac.BN_REFRESH_PAUSE, null));
        this.f7692n.put(EnumC3889z1.RESUME_AD, new a(EnumC2638ac.BN_REFRESH_RESUME, null));
        this.f7692n.put(EnumC3889z1.OPERATIONAL_SET_CONFIGURATIONS, new a(EnumC2638ac.BN_SET_CONFIGURATION, null));
        Map<EnumC3889z1, a> map6 = this.f7692n;
        EnumC3889z1 enumC3889z15 = EnumC3889z1.TROUBLESHOOT_PROVIDER_SETTINGS_MISSING;
        EnumC2638ac enumC2638ac5 = EnumC2638ac.TROUBLESHOOTING_BN_PROVIDER_SETTINGS_MISSING;
        map6.put(enumC3889z15, new a(enumC2638ac5, enumC2638ac5));
        Map<EnumC3889z1, a> map7 = this.f7692n;
        EnumC3889z1 enumC3889z16 = EnumC3889z1.TROUBLESHOOT_UNEXPECTED_INIT_SUCCESS;
        EnumC2638ac enumC2638ac6 = EnumC2638ac.TROUBLESHOOTING_BN_UNEXPECTED_INIT_SUCCESS;
        map7.put(enumC3889z16, new a(enumC2638ac6, enumC2638ac6));
        Map<EnumC3889z1, a> map8 = this.f7692n;
        EnumC3889z1 enumC3889z17 = EnumC3889z1.TROUBLESHOOT_UNEXPECTED_INIT_FAILED;
        EnumC2638ac enumC2638ac7 = EnumC2638ac.TROUBLESHOOTING_BN_UNEXPECTED_INIT_FAILED;
        map8.put(enumC3889z17, new a(enumC2638ac7, enumC2638ac7));
        Map<EnumC3889z1, a> map9 = this.f7692n;
        EnumC3889z1 enumC3889z18 = EnumC3889z1.TROUBLESHOOT_UNEXPECTED_AUCTION_SUCCESS;
        EnumC2638ac enumC2638ac8 = EnumC2638ac.TROUBLESHOOTING_BN_UNEXPECTED_AUCTION_SUCCESS;
        map9.put(enumC3889z18, new a(enumC2638ac8, enumC2638ac8));
        Map<EnumC3889z1, a> map10 = this.f7692n;
        EnumC3889z1 enumC3889z19 = EnumC3889z1.TROUBLESHOOT_UNEXPECTED_AUCTION_FAILED;
        EnumC2638ac enumC2638ac9 = EnumC2638ac.TROUBLESHOOTING_BN_UNEXPECTED_AUCTION_FAILED;
        map10.put(enumC3889z19, new a(enumC2638ac9, enumC2638ac9));
        Map<EnumC3889z1, a> map11 = this.f7692n;
        EnumC3889z1 enumC3889z110 = EnumC3889z1.TROUBLESHOOT_UNEXPECTED_LOAD_SUCCESS;
        EnumC2638ac enumC2638ac10 = EnumC2638ac.TROUBLESHOOTING_BN_UNEXPECTED_LOAD_SUCCESS;
        map11.put(enumC3889z110, new a(enumC2638ac10, enumC2638ac10));
        Map<EnumC3889z1, a> map12 = this.f7692n;
        EnumC3889z1 enumC3889z111 = EnumC3889z1.TROUBLESHOOT_UNEXPECTED_LOAD_FAILED;
        EnumC2638ac enumC2638ac11 = EnumC2638ac.TROUBLESHOOTING_BN_UNEXPECTED_LOAD_FAILED;
        map12.put(enumC3889z111, new a(enumC2638ac11, enumC2638ac11));
        Map<EnumC3889z1, a> map13 = this.f7692n;
        EnumC3889z1 enumC3889z112 = EnumC3889z1.TROUBLESHOOT_UNEXPECTED_RELOAD_SUCCESS;
        EnumC2638ac enumC2638ac12 = EnumC2638ac.TROUBLESHOOTING_BN_UNEXPECTED_RELOAD_SUCCESS;
        map13.put(enumC3889z112, new a(enumC2638ac12, enumC2638ac12));
        Map<EnumC3889z1, a> map14 = this.f7692n;
        EnumC3889z1 enumC3889z113 = EnumC3889z1.TROUBLESHOOT_UNEXPECTED_RELOAD_FAILED;
        EnumC2638ac enumC2638ac13 = EnumC2638ac.TROUBLESHOOTING_BN_UNEXPECTED_RELOAD_FAILED;
        map14.put(enumC3889z113, new a(enumC2638ac13, enumC2638ac13));
        Map<EnumC3889z1, a> map15 = this.f7692n;
        EnumC3889z1 enumC3889z114 = EnumC3889z1.TROUBLESHOOT_UNEXPECTED_TIMEOUT;
        EnumC2638ac enumC2638ac14 = EnumC2638ac.TROUBLESHOOTING_BN_UNEXPECTED_TIMEOUT;
        map15.put(enumC3889z114, new a(enumC2638ac14, enumC2638ac14));
        Map<EnumC3889z1, a> map16 = this.f7692n;
        EnumC3889z1 enumC3889z115 = EnumC3889z1.TROUBLESHOOT_UNEXPECTED_OPENED;
        EnumC2638ac enumC2638ac15 = EnumC2638ac.TROUBLESHOOTING_BN_UNEXPECTED_OPENED;
        map16.put(enumC3889z115, new a(enumC2638ac15, enumC2638ac15));
        Map<EnumC3889z1, a> map17 = this.f7692n;
        EnumC3889z1 enumC3889z116 = EnumC3889z1.TROUBLESHOOT_INTERNAL_ERROR;
        EnumC2638ac enumC2638ac16 = EnumC2638ac.TROUBLESHOOTING_BN_INTERNAL_ERROR;
        map17.put(enumC3889z116, new a(enumC2638ac16, enumC2638ac16));
        Map<EnumC3889z1, a> map18 = this.f7692n;
        EnumC3889z1 enumC3889z117 = EnumC3889z1.TROUBLESHOOT_ADAPTER_REPOSITORY_INTERNAL_ERROR;
        EnumC2638ac enumC2638ac17 = EnumC2638ac.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR;
        map18.put(enumC3889z117, new a(enumC2638ac17, enumC2638ac17));
        Map<EnumC3889z1, a> map19 = this.f7692n;
        EnumC3889z1 enumC3889z118 = EnumC3889z1.TROUBLESHOOT_AUCTION_SUCCESSFUL_RECOVERY_ERROR;
        EnumC2638ac enumC2638ac18 = EnumC2638ac.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR;
        map19.put(enumC3889z118, new a(enumC2638ac18, enumC2638ac18));
        this.f7692n.put(EnumC3889z1.TROUBLESHOOT_NOTIFICATION_ERROR, new a(EnumC2638ac.TROUBLESHOOTING_BN_NOTIFICATIONS_ERROR, null));
        this.f7692n.put(EnumC3889z1.TROUBLESHOOT_BN_RELOAD_EXCEPTION, new a(EnumC2638ac.TROUBLESHOOTING_BN_RELOAD_EXCEPTION, null));
        this.f7692n.put(EnumC3889z1.TROUBLESHOOT_IMPRESSION_TIMEOUT, new a(EnumC2638ac.TROUBLESHOOTING_BN_IMPRESSION_TIMEOUT_REACHED, null));
        this.f7692n.put(EnumC3889z1.TROUBLESHOOT_BANNER_REFRESH_PAUSED, new a(EnumC2638ac.TROUBLESHOOT_BN_BANNER_REFRESH_PAUSED, null));
        this.f7692n.put(EnumC3889z1.TROUBLESHOOT_BANNER_REFRESH_RESUMED, new a(EnumC2638ac.TROUBLESHOOT_BN_BANNER_REFRESH_RESUMED, null));
        this.f7692n.put(EnumC3889z1.TROUBLESHOOT_BANNER_REFRESH_TRIGGER_PAUSE, new a(EnumC2638ac.TROUBLESHOOT_BN_BANNER_REFRESH_TRIGGER_PAUSE, null));
        this.f7692n.put(EnumC3889z1.TROUBLESHOOT_BANNER_REFRESH_TRIGGER_RESUME, new a(EnumC2638ac.TROUBLESHOOT_BN_BANNER_REFRESH_TRIGGER_RESUME, null));
        Map<EnumC3889z1, a> map20 = this.f7692n;
        EnumC3889z1 enumC3889z119 = EnumC3889z1.TROUBLESHOOT_BANNER_REFRESH_TRANSITION;
        EnumC2638ac enumC2638ac19 = EnumC2638ac.TROUBLESHOOT_BN_BANNER_REFRESH_TRANSITION;
        map20.put(enumC3889z119, new a(enumC2638ac19, enumC2638ac19));
        Map<EnumC3889z1, a> map21 = this.f7692n;
        EnumC3889z1 enumC3889z120 = EnumC3889z1.TROUBLESHOOT_BANNER_REFRESH_ANIMATED;
        EnumC2638ac enumC2638ac20 = EnumC2638ac.TROUBLESHOOT_BN_BANNER_REFRESH_ANIMATED;
        map21.put(enumC3889z120, new a(enumC2638ac20, enumC2638ac20));
        Map<EnumC3889z1, a> map22 = this.f7692n;
        EnumC3889z1 enumC3889z121 = EnumC3889z1.TROUBLESHOOT_ILLEGAL_STATE;
        EnumC2638ac enumC2638ac21 = EnumC2638ac.TROUBLESHOOTING_BN_ILLEGAL_STATE;
        map22.put(enumC3889z121, new a(enumC2638ac21, enumC2638ac21));
        this.f7692n.put(EnumC3889z1.TROUBLESHOOT_RELOAD, new a(EnumC2638ac.TROUBLESHOOTING_BN_RELOAD, null));
        Map<EnumC3889z1, a> map23 = this.f7692n;
        EnumC3889z1 enumC3889z122 = EnumC3889z1.TROUBLESHOOT_LOAD_SKIPPED;
        EnumC2638ac enumC2638ac22 = EnumC2638ac.TROUBLESHOOTING_BN_LOAD_SKIPPED;
        map23.put(enumC3889z122, new a(enumC2638ac22, enumC2638ac22));
    }

    /* renamed from: a */
    public void m8075a(EnumC3889z1 enumC3889z1, Map<String, Object> map) {
        m8076a(enumC3889z1, map, Calendar.getInstance().getTimeInMillis());
    }

    /* renamed from: a */
    public void m8076a(EnumC3889z1 enumC3889z1, Map<String, Object> map, long j) {
        int iM8071a = m8071a(enumC3889z1);
        if (-1 == iM8071a) {
            return;
        }
        HashMap map2 = new HashMap();
        InterfaceC2957b2 interfaceC2957b2 = this.f7681c;
        if (interfaceC2957b2 != null) {
            map2.putAll(interfaceC2957b2.mo4765a(enumC3889z1));
        }
        if (map != null && !map.isEmpty()) {
            map2.putAll(map);
        }
        this.f7682d.mo12605a(new C3899zb(iM8071a, j, new JSONObject(map2)));
    }
}
