package com.applovin.impl;

import com.applovin.impl.C1304z4;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/* renamed from: com.applovin.impl.o3 */
/* loaded from: classes.dex */
public abstract class AbstractC1144o3 extends C1268v4 {

    /* renamed from: A7 */
    public static final C1268v4 f1604A7;

    /* renamed from: B7 */
    public static final C1268v4 f1605B7;

    /* renamed from: C7 */
    public static final C1268v4 f1606C7;

    /* renamed from: D7 */
    public static final C1268v4 f1607D7;

    /* renamed from: E7 */
    public static final C1268v4 f1608E7;

    /* renamed from: F7 */
    public static final C1268v4 f1609F7;

    /* renamed from: G7 */
    public static final C1268v4 f1610G7;

    /* renamed from: H7 */
    public static final C1268v4 f1611H7;

    /* renamed from: I7 */
    public static final C1268v4 f1612I7;

    /* renamed from: J7 */
    public static final C1268v4 f1613J7;

    /* renamed from: K7 */
    public static final C1268v4 f1614K7;

    /* renamed from: L7 */
    public static final C1268v4 f1615L7;

    /* renamed from: M7 */
    public static final C1268v4 f1616M7;

    /* renamed from: N7 */
    public static final C1268v4 f1617N7;

    /* renamed from: O7 */
    public static final C1268v4 f1618O7;

    /* renamed from: P7 */
    public static final C1268v4 f1619P7;

    /* renamed from: Q7 */
    public static final C1268v4 f1620Q7;

    /* renamed from: R7 */
    public static final C1268v4 f1621R7;

    /* renamed from: S7 */
    public static final C1268v4 f1622S7;

    /* renamed from: T7 */
    public static final C1268v4 f1623T7;

    /* renamed from: U7 */
    public static final C1268v4 f1624U7;

    /* renamed from: V7 */
    public static final C1268v4 f1625V7;

    /* renamed from: W7 */
    public static final C1268v4 f1626W7;

    /* renamed from: X7 */
    public static final C1268v4 f1627X7;

    /* renamed from: Y7 */
    public static final C1268v4 f1628Y7;

    /* renamed from: Z7 */
    public static final C1268v4 f1629Z7;

    /* renamed from: a8 */
    public static final C1268v4 f1630a8;

    /* renamed from: b8 */
    public static final C1268v4 f1631b8;

    /* renamed from: c8 */
    public static final C1268v4 f1632c8;

    /* renamed from: d7 */
    public static final C1268v4 f1633d7 = C1268v4.m3549a("afi", "");

    /* renamed from: d8 */
    public static final C1268v4 f1634d8;

    /* renamed from: e7 */
    public static final C1268v4 f1635e7;

    /* renamed from: e8 */
    public static final C1268v4 f1636e8;

    /* renamed from: f7 */
    public static final C1268v4 f1637f7;

    /* renamed from: f8 */
    public static final C1268v4 f1638f8;

    /* renamed from: g7 */
    public static final C1268v4 f1639g7;

    /* renamed from: g8 */
    public static final C1268v4 f1640g8;

    /* renamed from: h7 */
    public static final C1268v4 f1641h7;

    /* renamed from: h8 */
    public static final C1268v4 f1642h8;

    /* renamed from: i7 */
    public static final C1268v4 f1643i7;

    /* renamed from: i8 */
    public static final C1268v4 f1644i8;

    /* renamed from: j7 */
    public static final C1268v4 f1645j7;

    /* renamed from: j8 */
    public static final C1268v4 f1646j8;

    /* renamed from: k7 */
    public static final C1268v4 f1647k7;

    /* renamed from: k8 */
    public static final C1268v4 f1648k8;

    /* renamed from: l7 */
    public static final C1268v4 f1649l7;

    /* renamed from: l8 */
    public static final C1268v4 f1650l8;

    /* renamed from: m7 */
    public static final C1268v4 f1651m7;

    /* renamed from: m8 */
    public static final C1268v4 f1652m8;

    /* renamed from: n7 */
    public static final C1268v4 f1653n7;

    /* renamed from: n8 */
    public static final C1268v4 f1654n8;

    /* renamed from: o7 */
    public static final C1268v4 f1655o7;

    /* renamed from: o8 */
    public static final C1268v4 f1656o8;

    /* renamed from: p7 */
    public static final C1268v4 f1657p7;

    /* renamed from: p8 */
    public static final C1268v4 f1658p8;

    /* renamed from: q7 */
    public static final C1268v4 f1659q7;

    /* renamed from: q8 */
    public static final C1268v4 f1660q8;

    /* renamed from: r7 */
    public static final C1268v4 f1661r7;

    /* renamed from: r8 */
    public static final C1268v4 f1662r8;

    /* renamed from: s7 */
    public static final C1268v4 f1663s7;

    /* renamed from: s8 */
    public static final C1268v4 f1664s8;

    /* renamed from: t7 */
    public static final C1268v4 f1665t7;

    /* renamed from: u7 */
    public static final C1268v4 f1666u7;

    /* renamed from: v7 */
    public static final C1268v4 f1667v7;

    /* renamed from: w7 */
    public static final C1268v4 f1668w7;

    /* renamed from: x7 */
    public static final C1268v4 f1669x7;

    /* renamed from: y7 */
    public static final C1268v4 f1670y7;

    /* renamed from: z7 */
    public static final C1268v4 f1671z7;

    static {
        Boolean bool = Boolean.FALSE;
        f1635e7 = C1268v4.m3549a("iafiwaa", bool);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f1637f7 = androidx.datastore.preferences.protobuf.OooO00o.OooO0Oo("afi_ms", 5L, timeUnit);
        f1639g7 = C1268v4.m3549a("mediation_endpoint", "https://ms.applovin.com/");
        f1641h7 = C1268v4.m3549a("mediation_backup_endpoint", "https://ms.applvn.com/");
        f1643i7 = androidx.datastore.preferences.protobuf.OooO00o.OooO0Oo("fetch_next_ad_retry_delay_ms", 2L, timeUnit);
        f1645j7 = androidx.datastore.preferences.protobuf.OooO00o.OooO0Oo("fetch_next_ad_timeout_ms", 30L, timeUnit);
        f1647k7 = androidx.datastore.preferences.protobuf.OooO00o.OooO0Oo("fetch_mediation_debugger_info_timeout_ms", 7L, timeUnit);
        Boolean bool2 = Boolean.TRUE;
        f1649l7 = C1268v4.m3549a("auto_init_mediation_debugger", bool2);
        f1651m7 = C1268v4.m3549a("postback_macros", "{\"{MCODE}\":\"mcode\",\"{BCODE}\":\"bcode\",\"{ICODE}\":\"icode\",\"{SCODE}\":\"scode\"}");
        f1653n7 = androidx.datastore.preferences.protobuf.OooO00o.OooO0Oo("max_signal_provider_latency_ms", 30L, timeUnit);
        f1655o7 = androidx.datastore.preferences.protobuf.OooO00o.OooO0Oo("default_adapter_timeout_ms", 10L, timeUnit);
        f1657p7 = androidx.datastore.preferences.protobuf.OooO00o.OooO0Oo("ad_refresh_ms", 30L, timeUnit);
        f1659q7 = androidx.datastore.preferences.protobuf.OooO00o.OooO0Oo("ad_load_failure_refresh_ms", 30L, timeUnit);
        f1661r7 = C1268v4.m3549a("ad_load_failure_refresh_ignore_error_codes", "204");
        f1663s7 = C1268v4.m3549a("refresh_ad_on_app_resume_elapsed_threshold_ms", 0L);
        f1665t7 = C1268v4.m3549a("refresh_ad_view_timer_responds_to_background", bool2);
        f1666u7 = C1268v4.m3549a("refresh_ad_view_timer_responds_to_store_kit", bool2);
        f1667v7 = C1268v4.m3549a("refresh_ad_view_timer_responds_to_window_visibility_changed", bool);
        f1668w7 = C1268v4.m3549a("avrsponse", bool);
        f1669x7 = C1268v4.m3549a("allow_pause_auto_refresh_immediately", bool);
        f1670y7 = C1268v4.m3549a("ad_view_race_condition_fix_enabled", bool);
        f1671z7 = C1268v4.m3549a("always_destroy_ad_view_on_ui_thread", bool);
        f1604A7 = C1268v4.m3549a("fullscreen_display_delay_ms", 0L);
        f1605B7 = C1268v4.m3549a("susaode", bool);
        f1606C7 = C1268v4.m3549a("ahdm", 500L);
        f1607D7 = C1268v4.m3549a("ad_view_refresh_precache_request_viewability_undesired_flags", 246L);
        f1608E7 = C1268v4.m3549a("ad_view_refresh_precache_request_enabled", bool2);
        f1609F7 = C1268v4.m3549a("famttl_ms", 0L);
        f1610G7 = C1268v4.m3549a("signal_expiration_ms", -1L);
        f1611H7 = C1268v4.m3549a("signal_cache_level", Integer.valueOf(C1304z4.b.AD_FORMAT.ordinal()));
        TimeUnit timeUnit2 = TimeUnit.HOURS;
        f1612I7 = androidx.datastore.preferences.protobuf.OooO00o.OooO0Oo("ad_expiration_ms", 4L, timeUnit2);
        f1613J7 = androidx.datastore.preferences.protobuf.OooO00o.OooO0Oo("native_ad_expiration_ms", 4L, timeUnit2);
        f1614K7 = C1268v4.m3549a("rena", bool2);
        f1615L7 = C1268v4.m3549a("fullscreen_ad_displayed_timeout_ms", -1L);
        f1616M7 = C1268v4.m3549a("freast_ms", -1L);
        f1617N7 = C1268v4.m3549a("ad_hidden_timeout_ms", -1L);
        f1618O7 = C1268v4.m3549a("schedule_ad_hidden_on_ad_dismiss", bool);
        f1619P7 = C1268v4.m3549a("schedule_ad_hidden_on_single_task_app_relaunch", bool);
        f1620Q7 = androidx.datastore.preferences.protobuf.OooO00o.OooO0Oo("ad_hidden_on_ad_dismiss_callback_delay_ms", 1L, timeUnit);
        f1621R7 = C1268v4.m3549a("proe", bool);
        f1622S7 = C1268v4.m3549a("mute_state", 2);
        f1623T7 = C1268v4.m3549a("saf", "");
        f1624U7 = C1268v4.m3549a("saui", "");
        f1625V7 = C1268v4.m3549a("malm_v2_e", bool);
        f1626W7 = C1268v4.m3549a("mspc", 1);
        f1627X7 = C1268v4.m3549a("mra", -1);
        f1628Y7 = C1268v4.m3549a("mra_af", "INTER,REWARDED,BANNER,LEADER,MREC");
        f1629Z7 = C1268v4.m3549a("fadiafase", bool2);
        f1630a8 = C1268v4.m3549a("fadwvcv", bool2);
        f1631b8 = C1268v4.m3549a("bfarud", bool);
        f1632c8 = C1268v4.m3549a("inacc", Boolean.valueOf(AbstractC1078k7.m1219b(Arrays.asList("com.textmeinc.textme", "com.textmeinc.freetone", "com.textmeinc.textme3", "com.jaumo", "com.jaumo.casual", "com.pinkapp", "com.jaumo.mature", "com.jaumo.prime", "com.jaumo.gay", "com.jaumo.lesbian"))));
        f1634d8 = C1268v4.m3549a("adiets_sec", Long.valueOf(TimeUnit.MINUTES.toSeconds(1L)));
        f1636e8 = C1268v4.m3549a("faomq", bool);
        f1638f8 = C1268v4.m3549a("rahcnct_sec", -1);
        f1640g8 = C1268v4.m3549a("paslbaf", JsonUtils.EMPTY_JSON);
        f1642h8 = C1268v4.m3549a("msbl", "{\"ad\":[\"ttdasi_ms\"]}");
        f1644i8 = C1268v4.m3549a("siarni", bool);
        f1646j8 = C1268v4.m3549a("spims", bool);
        f1648k8 = C1268v4.m3549a("uabta", bool);
        f1650l8 = C1268v4.m3549a("use_initialization_spec_during_init", bool);
        f1652m8 = C1268v4.m3549a("report_cimp_after_ierr", bool);
        f1654n8 = C1268v4.m3549a("fail_collection_for_empty_signal", bool);
        f1656o8 = C1268v4.m3549a("fetch_mediated_ad_gzip", bool2);
        f1658p8 = C1268v4.m3549a("max_postback_gzip", bool2);
        f1660q8 = C1268v4.m3549a("md_endpoint", "https://md.applovin.com/");
        f1662r8 = C1268v4.m3549a("md_backup_endpoint", "https://md.applvn.com/");
        f1664s8 = C1268v4.m3549a("md_v2", bool);
    }
}
