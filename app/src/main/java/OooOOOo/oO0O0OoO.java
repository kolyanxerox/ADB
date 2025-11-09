package OoooOOO;

import OooO0oO.OooOOO0;
import OooOOo0.o00Ooo;
import Oooo00O.o000000O;
import Oooo0OO.oo000o;
import OoooO0O.o0000O00;
import android.app.Application;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures;
import androidx.work.WorkRequest;
import com.google.android.gms.internal.measurement.Oo0000;
import com.ironsource.C3034d9;
import com.ironsource.C3037dc;
import com.ironsource.mediationsdk.metadata.C3401a;
import com.unity3d.ads.core.data.datasource.AndroidTcfDataSource;
import com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import o00000oO.OooOOO;
import o000OOoO.OooO;
import o000Ooo0.OooOO0;

/* loaded from: classes2.dex */
public final class oO0O0OoO extends o0O000Oo {

    /* renamed from: OooOo */
    public oO0OOo0o f14725OooOo;

    /* renamed from: OooOoO */
    public final CopyOnWriteArraySet f14726OooOoO;

    /* renamed from: OooOoO0 */
    public OooOOO0 f14727OooOoO0;

    /* renamed from: OooOoOO */
    public boolean f14728OooOoOO;

    /* renamed from: OooOoo */
    public final Object f14729OooOoo;

    /* renamed from: OooOoo0 */
    public final AtomicReference f14730OooOoo0;

    /* renamed from: OooOooO */
    public boolean f14731OooOooO;

    /* renamed from: OooOooo */
    public int f14732OooOooo;

    /* renamed from: Oooo */
    public oO000o00 f14733Oooo;

    /* renamed from: Oooo0 */
    public boolean f14734Oooo0;

    /* renamed from: Oooo000 */
    public oO000O0 f14735Oooo000;

    /* renamed from: Oooo00O */
    public oO000O0 f14736Oooo00O;

    /* renamed from: Oooo00o */
    public PriorityQueue f14737Oooo00o;

    /* renamed from: Oooo0O0 */
    public oO00000o f14738Oooo0O0;

    /* renamed from: Oooo0OO */
    public final AtomicLong f14739Oooo0OO;

    /* renamed from: Oooo0o */
    public final o0OO000o f14740Oooo0o;

    /* renamed from: Oooo0o0 */
    public long f14741Oooo0o0;

    /* renamed from: Oooo0oO */
    public boolean f14742Oooo0oO;

    /* renamed from: Oooo0oo */
    public oO000O0 f14743Oooo0oo;

    /* renamed from: OoooO0 */
    public final OooOO0 f14744OoooO0;

    /* renamed from: OoooO00 */
    public oO000O0 f14745OoooO00;

    public oO0O0OoO(o0OO0oO0 o0oo0oo0) {
        super(o0oo0oo0);
        this.f14726OooOoO = new CopyOnWriteArraySet();
        this.f14729OooOoo = new Object();
        this.f14731OooOooO = false;
        this.f14732OooOooo = 1;
        this.f14742Oooo0oO = true;
        this.f14744OoooO0 = new OooOO0(this);
        this.f14730OooOoo0 = new AtomicReference();
        this.f14738Oooo0O0 = oO00000o.f14610OooO0OO;
        this.f14741Oooo0o0 = -1L;
        this.f14739Oooo0OO = new AtomicLong(0L);
        this.f14740Oooo0o = new o0OO000o(o0oo0oo0, 3);
    }

    @Override // OoooOOO.o0O000Oo
    public final boolean OooOOO() {
        return false;
    }

    public final void OooOOOO(oO00000o oo00000o) {
        OooOO0O();
        boolean z = (oo00000o.OooO(oO00000.ANALYTICS_STORAGE) && oo00000o.OooO(oO00000.AD_STORAGE)) || ((o0OO0oO0) this.f14574OooOo0O).OooOOOo().OooOo00();
        o0OO0oO0 o0oo0oo0 = (o0OO0oO0) this.f14574OooOo0O;
        o0OO0o00 o0oo0o00 = o0oo0oo0.f14522OooOoo0;
        o0OO0oO0.OooOOO0(o0oo0o00);
        o0oo0o00.OooOO0O();
        if (z != o0oo0oo0.f14540OoooOO0) {
            o0OO0o00 o0oo0o002 = o0oo0oo0.f14522OooOoo0;
            o0OO0oO0.OooOOO0(o0oo0o002);
            o0oo0o002.OooOO0O();
            o0oo0oo0.f14540OoooOO0 = z;
            o0O o0o = ((o0OO0oO0) this.f14574OooOo0O).f14518OooOoO;
            o0OO0oO0.OooOO0O(o0o);
            o0o.OooOO0O();
            Boolean boolValueOf = o0o.OooOOOO().contains("measurement_enabled_from_api") ? Boolean.valueOf(o0o.OooOOOO().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z || boolValueOf == null || boolValueOf.booleanValue()) {
                OooOoo0(Boolean.valueOf(z), false);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:138:0x0055, code lost:
    
        if (r4 > 500) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x008c, code lost:
    
        if (r6 > 500) goto L148;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooOOOo(java.lang.String r13, java.lang.String r14, android.os.Bundle r15, boolean r16, boolean r17, long r18) {
        /*
            Method dump skipped, instructions count: 477
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: OoooOOO.oO0O0OoO.OooOOOo(java.lang.String, java.lang.String, android.os.Bundle, boolean, boolean, long):void");
    }

    public final void OooOOo(String str, Bundle bundle, String str2) {
        OooOO0O();
        ((o0OO0oO0) this.f14574OooOo0O).f14527Oooo000.getClass();
        OooOOoo(System.currentTimeMillis(), bundle, str, str2);
    }

    public final void OooOOo0() {
        o0OO0oO0 o0oo0oo0;
        String str;
        oO0O0O0o oo0o0o0o;
        oO0O0O0o oo0o0o0o2;
        oO0O0OoO oo0o0ooo;
        int i;
        String str2;
        com.google.android.gms.internal.measurement.ooo0Oo0 ooo0oo0;
        o0000Ooo.o0O000 o0o000OooO0Oo;
        OooOO0O();
        o0OO0oO0 o0oo0oo02 = (o0OO0oO0) this.f14574OooOo0O;
        o0O0O0o0 o0o0o0o0 = o0oo0oo02.f14520OooOoOO;
        o0OO0oO0.OooOOO0(o0o0o0o0);
        o0o0o0o0.f14401Oooo00o.OooO0O0("Handle tcf update.");
        o0O o0o = o0oo0oo02.f14518OooOoO;
        o0OO0oO0.OooOO0O(o0o);
        SharedPreferences sharedPreferencesOooOOOo = o0o.OooOOOo();
        HashMap map = new HashMap();
        o0O000 o0o000 = o0O000O.f14301o0000OOO;
        int i2 = 2;
        int i3 = 1;
        if (((Boolean) o0o000.OooO00o(null)).booleanValue()) {
            o0000Ooo.o0oOOo o0oooo = oO0O0Oo0.f14724OooO00o;
            com.google.android.gms.internal.measurement.o0oo0000 o0oo0000Var = com.google.android.gms.internal.measurement.o0oo0000.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE;
            oOo0oooO ooo0oooo = oOo0oooO.f14875OooOo0O;
            o0oo0oo0 = o0oo0oo02;
            AbstractMap.SimpleImmutableEntry simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(o0oo0000Var, ooo0oooo);
            com.google.android.gms.internal.measurement.o0oo0000 o0oo0000Var2 = com.google.android.gms.internal.measurement.o0oo0000.IAB_TCF_PURPOSE_SELECT_BASIC_ADS;
            oOo0oooO ooo0oooo2 = oOo0oooO.f14876OooOo0o;
            AbstractMap.SimpleImmutableEntry simpleImmutableEntry2 = new AbstractMap.SimpleImmutableEntry(o0oo0000Var2, ooo0oooo2);
            com.google.android.gms.internal.measurement.o0oo0000 o0oo0000Var3 = com.google.android.gms.internal.measurement.o0oo0000.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE;
            AbstractMap.SimpleImmutableEntry simpleImmutableEntry3 = new AbstractMap.SimpleImmutableEntry(o0oo0000Var3, ooo0oooo);
            com.google.android.gms.internal.measurement.o0oo0000 o0oo0000Var4 = com.google.android.gms.internal.measurement.o0oo0000.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS;
            AbstractMap.SimpleImmutableEntry simpleImmutableEntry4 = new AbstractMap.SimpleImmutableEntry(o0oo0000Var4, ooo0oooo);
            com.google.android.gms.internal.measurement.o0oo0000 o0oo0000Var5 = com.google.android.gms.internal.measurement.o0oo0000.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE;
            List listAsList = Arrays.asList(simpleImmutableEntry, simpleImmutableEntry2, simpleImmutableEntry3, simpleImmutableEntry4, new AbstractMap.SimpleImmutableEntry(o0oo0000Var5, ooo0oooo2), new AbstractMap.SimpleImmutableEntry(com.google.android.gms.internal.measurement.o0oo0000.IAB_TCF_PURPOSE_APPLY_MARKET_RESEARCH_TO_GENERATE_AUDIENCE_INSIGHTS, ooo0oooo2), new AbstractMap.SimpleImmutableEntry(com.google.android.gms.internal.measurement.o0oo0000.IAB_TCF_PURPOSE_DEVELOP_AND_IMPROVE_PRODUCTS, ooo0oooo2));
            o0000O00 o0000o00 = new o0000O00(listAsList != null ? listAsList.size() : 4, 3);
            o0000o00.OooO0oo(listAsList);
            o0000Ooo.o0O000 o0o000OooO0Oo2 = o0000o00.OooO0Oo();
            int i4 = o0000Ooo.o0O00o0.f29552OooOo;
            o0000Ooo.o0OoOoOo o0oooooo = new o0000Ooo.o0OoOoOo("CH");
            char[] cArr = new char[5];
            boolean zContains = sharedPreferencesOooOOOo.contains(AndroidTcfDataSource.TCF_TCSTRING_KEY);
            int iOooO0O0 = oO0O0Oo0.OooO0O0(sharedPreferencesOooOOOo, "IABTCF_CmpSdkID");
            int iOooO0O02 = oO0O0Oo0.OooO0O0(sharedPreferencesOooOOOo, "IABTCF_PolicyVersion");
            int iOooO0O03 = oO0O0Oo0.OooO0O0(sharedPreferencesOooOOOo, "IABTCF_gdprApplies");
            int iOooO0O04 = oO0O0Oo0.OooO0O0(sharedPreferencesOooOOOo, "IABTCF_PurposeOneTreatment");
            int iOooO0O05 = oO0O0Oo0.OooO0O0(sharedPreferencesOooOOOo, "IABTCF_EnableAdvertiserConsentMode");
            String strOooO00o = oO0O0Oo0.OooO00o(sharedPreferencesOooOOOo, "IABTCF_PublisherCC");
            o0000O00 o0000o002 = new o0000O00(4, 3);
            o0000Ooo.o0O00000 o0o00000 = o0o000OooO0Oo2.f29536OooOo0o;
            if (o0o00000 == null) {
                str2 = strOooO00o;
                i = iOooO0O04;
                o0000Ooo.o0O00000 o0o000002 = new o0000Ooo.o0O00000(o0o000OooO0Oo2, new o0000Ooo.o0O0000O(o0o000OooO0Oo2.f29537OooOoO, 0, o0o000OooO0Oo2.f29539OooOoOO));
                o0o000OooO0Oo2.f29536OooOo0o = o0o000002;
                o0o00000 = o0o000002;
            } else {
                i = iOooO0O04;
                str2 = strOooO00o;
            }
            o0000Ooo.o0O000Oo it = o0o00000.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                ooo0oo0 = com.google.android.gms.internal.measurement.ooo0Oo0.PURPOSE_RESTRICTION_UNDEFINED;
                if (!zHasNext) {
                    break;
                }
                com.google.android.gms.internal.measurement.o0oo0000 o0oo0000Var6 = (com.google.android.gms.internal.measurement.o0oo0000) it.next();
                int iZza = o0oo0000Var6.zza();
                o0000Ooo.o0O000Oo o0o000oo = it;
                o0000Ooo.o0O000 o0o0002 = o0o000OooO0Oo2;
                StringBuilder sb = new StringBuilder(String.valueOf(iZza).length() + 28);
                sb.append("IABTCF_PublisherRestrictions");
                sb.append(iZza);
                String strOooO00o2 = oO0O0Oo0.OooO00o(sharedPreferencesOooOOOo, sb.toString());
                if (!TextUtils.isEmpty(strOooO00o2) && strOooO00o2.length() >= 755) {
                    int iDigit = Character.digit(strOooO00o2.charAt(754), 10);
                    com.google.android.gms.internal.measurement.ooo0Oo0 ooo0oo02 = com.google.android.gms.internal.measurement.ooo0Oo0.PURPOSE_RESTRICTION_NOT_ALLOWED;
                    if (iDigit < 0 || iDigit > com.google.android.gms.internal.measurement.ooo0Oo0.values().length || iDigit == 0) {
                        ooo0oo0 = ooo0oo02;
                    } else if (iDigit == i3) {
                        ooo0oo0 = com.google.android.gms.internal.measurement.ooo0Oo0.PURPOSE_RESTRICTION_REQUIRE_CONSENT;
                    } else if (iDigit == i2) {
                        ooo0oo0 = com.google.android.gms.internal.measurement.ooo0Oo0.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST;
                    }
                }
                o0000o002.OooO0oO(o0oo0000Var6, ooo0oo0);
                it = o0o000oo;
                o0o000OooO0Oo2 = o0o0002;
                i2 = 2;
                i3 = 1;
            }
            o0000Ooo.o0O000 o0o0003 = o0o000OooO0Oo2;
            o0000Ooo.o0O000 o0o000OooO0Oo3 = o0000o002.OooO0Oo();
            String strOooO00o3 = oO0O0Oo0.OooO00o(sharedPreferencesOooOOOo, "IABTCF_PurposeConsents");
            String strOooO00o4 = oO0O0Oo0.OooO00o(sharedPreferencesOooOOOo, "IABTCF_VendorConsents");
            boolean z = !TextUtils.isEmpty(strOooO00o4) && strOooO00o4.length() >= 755 && strOooO00o4.charAt(754) == '1';
            String strOooO00o5 = oO0O0Oo0.OooO00o(sharedPreferencesOooOOOo, "IABTCF_PurposeLegitimateInterests");
            String strOooO00o6 = oO0O0Oo0.OooO00o(sharedPreferencesOooOOOo, "IABTCF_VendorLegitimateInterests");
            boolean z2 = !TextUtils.isEmpty(strOooO00o6) && strOooO00o6.length() >= 755 && strOooO00o6.charAt(754) == '1';
            cArr[0] = '2';
            if (zContains) {
                com.google.android.gms.internal.measurement.ooo0Oo0 ooo0oo03 = (com.google.android.gms.internal.measurement.ooo0Oo0) o0o000OooO0Oo3.get(o0oo0000Var);
                com.google.android.gms.internal.measurement.ooo0Oo0 ooo0oo04 = (com.google.android.gms.internal.measurement.ooo0Oo0) o0o000OooO0Oo3.get(o0oo0000Var3);
                com.google.android.gms.internal.measurement.ooo0Oo0 ooo0oo05 = (com.google.android.gms.internal.measurement.ooo0Oo0) o0o000OooO0Oo3.get(o0oo0000Var4);
                com.google.android.gms.internal.measurement.ooo0Oo0 ooo0oo06 = (com.google.android.gms.internal.measurement.ooo0Oo0) o0o000OooO0Oo3.get(o0oo0000Var5);
                o0000O00 o0000o003 = new o0000O00(4, 3);
                o0000o003.OooO0oO("Version", CommonGetHeaderBiddingToken.HB_TOKEN_VERSION);
                boolean z3 = z;
                o0000o003.OooO0oO("VendorConsent", true != z ? "0" : "1");
                o0000o003.OooO0oO("VendorLegitimateInterest", true != z2 ? "0" : "1");
                o0000o003.OooO0oO("gdprApplies", iOooO0O03 != 1 ? "0" : "1");
                o0000o003.OooO0oO("EnableAdvertiserConsentMode", iOooO0O05 != 1 ? "0" : "1");
                o0000o003.OooO0oO("PolicyVersion", String.valueOf(iOooO0O02));
                o0000o003.OooO0oO("CmpSdkID", String.valueOf(iOooO0O0));
                int i5 = i;
                o0000o003.OooO0oO("PurposeOneTreatment", i5 != 1 ? "0" : "1");
                String str3 = str2;
                o0000o003.OooO0oO("PublisherCC", str3);
                o0000o003.OooO0oO("PublisherRestrictions1", String.valueOf(ooo0oo03 != null ? ooo0oo03.zza() : ooo0oo0.zza()));
                o0000o003.OooO0oO("PublisherRestrictions3", String.valueOf(ooo0oo04 != null ? ooo0oo04.zza() : ooo0oo0.zza()));
                o0000o003.OooO0oO("PublisherRestrictions4", String.valueOf(ooo0oo05 != null ? ooo0oo05.zza() : ooo0oo0.zza()));
                o0000o003.OooO0oO("PublisherRestrictions7", String.valueOf(ooo0oo06 != null ? ooo0oo06.zza() : ooo0oo0.zza()));
                String strOooO0o0 = oO0O0Oo0.OooO0o0(o0oo0000Var, strOooO00o3, strOooO00o5);
                String strOooO0o02 = oO0O0Oo0.OooO0o0(o0oo0000Var3, strOooO00o3, strOooO00o5);
                String strOooO0o03 = oO0O0Oo0.OooO0o0(o0oo0000Var4, strOooO00o3, strOooO00o5);
                String strOooO0o04 = oO0O0Oo0.OooO0o0(o0oo0000Var5, strOooO00o3, strOooO00o5);
                com.google.android.gms.internal.measurement.o0OO0O0.OooO0o0("Purpose1", strOooO0o0);
                com.google.android.gms.internal.measurement.o0OO0O0.OooO0o0("Purpose3", strOooO0o02);
                com.google.android.gms.internal.measurement.o0OO0O0.OooO0o0("Purpose4", strOooO0o03);
                com.google.android.gms.internal.measurement.o0OO0O0.OooO0o0("Purpose7", strOooO0o04);
                o0000o003.OooO0oo(o0000Ooo.o0O000.OooO00o(4, new Object[]{"Purpose1", strOooO0o0, "Purpose3", strOooO0o02, "Purpose4", strOooO0o03, "Purpose7", strOooO0o04}, null).entrySet());
                boolean z4 = z2;
                o0000o003.OooO0oo(o0000Ooo.o0O000.OooO00o(5, new Object[]{"AuthorizePurpose1", true != oO0O0Oo0.OooO0OO(o0oo0000Var, o0o0003, o0o000OooO0Oo3, o0oooooo, cArr, iOooO0O05, iOooO0O03, i5, str3, strOooO00o3, strOooO00o5, z3, z4) ? "0" : "1", "AuthorizePurpose3", true != oO0O0Oo0.OooO0OO(o0oo0000Var3, o0o0003, o0o000OooO0Oo3, o0oooooo, cArr, iOooO0O05, iOooO0O03, i5, str3, strOooO00o3, strOooO00o5, z3, z4) ? "0" : "1", "AuthorizePurpose4", true != oO0O0Oo0.OooO0OO(o0oo0000Var4, o0o0003, o0o000OooO0Oo3, o0oooooo, cArr, iOooO0O05, iOooO0O03, i5, str3, strOooO00o3, strOooO00o5, z3, z4) ? "0" : "1", "AuthorizePurpose7", true != oO0O0Oo0.OooO0OO(o0oo0000Var5, o0o0003, o0o000OooO0Oo3, o0oooooo, cArr, iOooO0O05, iOooO0O03, i5, str3, strOooO00o3, strOooO00o5, z3, z4) ? "0" : "1", "PurposeDiagnostics", new String(cArr)}, null).entrySet());
                o0o000OooO0Oo = o0000o003.OooO0Oo();
            } else {
                o0o000OooO0Oo = o0000Ooo.o0O000.f29533OooOoo0;
            }
            oo0o0o0o = new oO0O0O0o(o0o000OooO0Oo);
            str = "";
        } else {
            o0oo0oo0 = o0oo0oo02;
            String strOooO00o7 = oO0O0Oo0.OooO00o(sharedPreferencesOooOOOo, "IABTCF_VendorConsents");
            str = "";
            if (!str.equals(strOooO00o7) && strOooO00o7.length() > 754) {
                map.put("GoogleConsent", String.valueOf(strOooO00o7.charAt(754)));
            }
            int iOooO0O06 = oO0O0Oo0.OooO0O0(sharedPreferencesOooOOOo, "IABTCF_gdprApplies");
            if (iOooO0O06 != -1) {
                map.put("gdprApplies", String.valueOf(iOooO0O06));
            }
            int iOooO0O07 = oO0O0Oo0.OooO0O0(sharedPreferencesOooOOOo, "IABTCF_EnableAdvertiserConsentMode");
            if (iOooO0O07 != -1) {
                map.put("EnableAdvertiserConsentMode", String.valueOf(iOooO0O07));
            }
            int iOooO0O08 = oO0O0Oo0.OooO0O0(sharedPreferencesOooOOOo, "IABTCF_PolicyVersion");
            if (iOooO0O08 != -1) {
                map.put("PolicyVersion", String.valueOf(iOooO0O08));
            }
            String strOooO00o8 = oO0O0Oo0.OooO00o(sharedPreferencesOooOOOo, "IABTCF_PurposeConsents");
            if (!str.equals(strOooO00o8)) {
                map.put("PurposeConsents", strOooO00o8);
            }
            int iOooO0O09 = oO0O0Oo0.OooO0O0(sharedPreferencesOooOOOo, "IABTCF_CmpSdkID");
            if (iOooO0O09 != -1) {
                map.put("CmpSdkID", String.valueOf(iOooO0O09));
            }
            oo0o0o0o = new oO0O0O0o(map);
        }
        o0OO0oO0 o0oo0oo03 = o0oo0oo0;
        o0O0O0o0 o0o0o0o02 = o0oo0oo03.f14520OooOoOO;
        o0OO0oO0.OooOOO0(o0o0o0o02);
        o0O0oo0o o0o0oo0o = o0o0o0o02.f14398Oooo0;
        o0o0oo0o.OooO0OO(oo0o0o0o, "Tcf preferences read");
        boolean zOooOo0 = o0oo0oo03.f14519OooOoO0.OooOo0(null, o0o000);
        oo000o oo000oVar = o0oo0oo03.f14527Oooo000;
        if (!zOooOo0) {
            if (o0o.OooOOoo(oo0o0o0o)) {
                Bundle bundleOooO0O0 = oo0o0o0o.OooO0O0();
                o0OO0oO0.OooOOO0(o0o0o0o02);
                o0o0oo0o.OooO0OO(bundleOooO0O0, "Consent generated from Tcf");
                if (bundleOooO0O0 != Bundle.EMPTY) {
                    oo000oVar.getClass();
                    OooOooo(bundleOooO0O0, -30, System.currentTimeMillis());
                }
                Bundle bundle = new Bundle();
                bundle.putString("_tcfd", oo0o0o0o.OooO0OO());
                OooOOo("auto", bundle, "_tcf");
                return;
            }
            return;
        }
        o0o.OooOO0O();
        String string = o0o.OooOOOO().getString("stored_tcf_param", str);
        HashMap map2 = new HashMap();
        if (TextUtils.isEmpty(string)) {
            oo0o0o0o2 = new oO0O0O0o(map2);
        } else {
            for (String str4 : string.split(";")) {
                String[] strArrSplit = str4.split(C3034d9.i.f8173b);
                if (strArrSplit.length >= 2 && oO0O0Oo0.f14724OooO00o.contains(strArrSplit[0])) {
                    map2.put(strArrSplit[0], strArrSplit[1]);
                }
            }
            oo0o0o0o2 = new oO0O0O0o(map2);
        }
        if (o0o.OooOOoo(oo0o0o0o)) {
            Bundle bundleOooO0O02 = oo0o0o0o.OooO0O0();
            o0OO0oO0.OooOOO0(o0o0o0o02);
            o0o0oo0o.OooO0OO(bundleOooO0O02, "Consent generated from Tcf");
            if (bundleOooO0O02 != Bundle.EMPTY) {
                oo000oVar.getClass();
                oo0o0ooo = this;
                oo0o0ooo.OooOooo(bundleOooO0O02, -30, System.currentTimeMillis());
            } else {
                oo0o0ooo = this;
            }
            Bundle bundle2 = new Bundle();
            HashMap map3 = oo0o0o0o2.f14723OooO00o;
            String str5 = (map3.isEmpty() || ((String) map3.get("Version")) != null) ? "0" : "1";
            Bundle bundleOooO0O03 = oo0o0o0o.OooO0O0();
            Bundle bundleOooO0O04 = oo0o0o0o2.OooO0O0();
            bundle2.putString("_tcfm", str5.concat((bundleOooO0O03.size() == bundleOooO0O04.size() && Objects.equals(bundleOooO0O03.getString("ad_storage"), bundleOooO0O04.getString("ad_storage")) && Objects.equals(bundleOooO0O03.getString("ad_personalization"), bundleOooO0O04.getString("ad_personalization")) && Objects.equals(bundleOooO0O03.getString("ad_user_data"), bundleOooO0O04.getString("ad_user_data"))) ? "0" : "1"));
            String str6 = (String) oo0o0o0o.f14723OooO00o.get("PurposeDiagnostics");
            if (TextUtils.isEmpty(str6)) {
                str6 = "200000";
            }
            bundle2.putString("_tcfd2", str6);
            bundle2.putString("_tcfd", oo0o0o0o.OooO0OO());
            oo0o0ooo.OooOOo("auto", bundle2, "_tcf");
        }
    }

    public final void OooOOoo(long j, Bundle bundle, String str, String str2) {
        OooOO0O();
        boolean z = true;
        if (this.f14727OooOoO0 != null && !oOO00OO.Oooo00o(str2)) {
            z = false;
        }
        OooOo00(str, str2, j, bundle, true, z, true);
    }

    public final void OooOo(Bundle bundle, long j) {
        o000000O.OooO0oo(bundle);
        Bundle bundle2 = new Bundle(bundle);
        boolean zIsEmpty = TextUtils.isEmpty(bundle2.getString("app_id"));
        o0OO0oO0 o0oo0oo0 = (o0OO0oO0) this.f14574OooOo0O;
        if (!zIsEmpty) {
            o0O0O0o0 o0o0o0o0 = o0oo0oo0.f14520OooOoOO;
            o0OO0oO0.OooOOO0(o0o0o0o0);
            o0o0o0o0.f14396OooOooO.OooO0O0("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        oO0000O.OooO0o0(bundle2, "app_id", String.class, null);
        oO0000O.OooO0o0(bundle2, C3037dc.f8261p, String.class, null);
        oO0000O.OooO0o0(bundle2, "name", String.class, null);
        oO0000O.OooO0o0(bundle2, "value", Object.class, null);
        oO0000O.OooO0o0(bundle2, "trigger_event_name", String.class, null);
        oO0000O.OooO0o0(bundle2, "trigger_timeout", Long.class, 0L);
        oO0000O.OooO0o0(bundle2, "timed_out_event_name", String.class, null);
        oO0000O.OooO0o0(bundle2, "timed_out_event_params", Bundle.class, null);
        oO0000O.OooO0o0(bundle2, "triggered_event_name", String.class, null);
        oO0000O.OooO0o0(bundle2, "triggered_event_params", Bundle.class, null);
        oO0000O.OooO0o0(bundle2, "time_to_live", Long.class, 0L);
        oO0000O.OooO0o0(bundle2, "expired_event_name", String.class, null);
        oO0000O.OooO0o0(bundle2, "expired_event_params", Bundle.class, null);
        o000000O.OooO0o0(bundle2.getString("name"));
        o000000O.OooO0o0(bundle2.getString(C3037dc.f8261p));
        o000000O.OooO0oo(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        oOO00OO ooo00oo = o0oo0oo0.f14523OooOooO;
        o0OO0oO0.OooOO0O(ooo00oo);
        int iO00Ooo = ooo00oo.o00Ooo(string);
        o0O00o00 o0o00o00 = o0oo0oo0.f14524OooOooo;
        o0O0O0o0 o0o0o0o02 = o0oo0oo0.f14520OooOoOO;
        if (iO00Ooo != 0) {
            o0OO0oO0.OooOOO0(o0o0o0o02);
            o0o0o0o02.f14393OooOoOO.OooO0OO(o0o00o00.OooO0OO(string), "Invalid conditional user property name");
            return;
        }
        oOO00OO ooo00oo2 = o0oo0oo0.f14523OooOooO;
        o0OO0oO0.OooOO0O(ooo00oo2);
        if (ooo00oo2.OooOo(obj, string) != 0) {
            o0OO0oO0.OooOOO0(o0o0o0o02);
            o0o0o0o02.f14393OooOoOO.OooO0Oo(o0o00o00.OooO0OO(string), "Invalid conditional user property value", obj);
            return;
        }
        Object objOooOoO0 = ooo00oo2.OooOoO0(obj, string);
        if (objOooOoO0 == null) {
            o0OO0oO0.OooOOO0(o0o0o0o02);
            o0o0o0o02.f14393OooOoOO.OooO0Oo(o0o00o00.OooO0OO(string), "Unable to normalize conditional user property value", obj);
            return;
        }
        oO0000O.OooO0Oo(bundle2, objOooOoO0);
        long j2 = bundle2.getLong("trigger_timeout");
        if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name")) && (j2 > 15552000000L || j2 < 1)) {
            o0OO0oO0.OooOOO0(o0o0o0o02);
            o0o0o0o02.f14393OooOoOO.OooO0Oo(o0o00o00.OooO0OO(string), "Invalid conditional user property timeout", Long.valueOf(j2));
            return;
        }
        long j3 = bundle2.getLong("time_to_live");
        if (j3 <= 15552000000L && j3 >= 1) {
            o0OO0o00 o0oo0o00 = o0oo0oo0.f14522OooOoo0;
            o0OO0oO0.OooOOO0(o0oo0o00);
            o0oo0o00.OooOo00(new oO000OOo(this, bundle2, 0));
        } else {
            o0OO0oO0.OooOOO0(o0o0o0o02);
            o0o0o0o02.f14393OooOoOO.OooO0Oo(o0o00o00.OooO0OO(string), "Invalid conditional user property time to live", Long.valueOf(j3));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooOo0(java.lang.String r12, java.lang.String r13, java.lang.Object r14, boolean r15, long r16) {
        /*
            Method dump skipped, instructions count: 213
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: OoooOOO.oO0O0OoO.OooOo0(java.lang.String, java.lang.String, java.lang.Object, boolean, long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:292:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:409:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooOo00(java.lang.String r32, java.lang.String r33, long r34, android.os.Bundle r36, boolean r37, boolean r38, boolean r39) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 1261
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: OoooOOO.oO0O0OoO.OooOo00(java.lang.String, java.lang.String, long, android.os.Bundle, boolean, boolean, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooOo0O(long r20, java.lang.Object r22, java.lang.String r23, java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: OoooOOO.oO0O0OoO.OooOo0O(long, java.lang.Object, java.lang.String, java.lang.String):void");
    }

    public final void OooOo0o() {
        OooOO0O();
        OooOO0o();
        o0OO0oO0 o0oo0oo0 = (o0OO0oO0) this.f14574OooOo0O;
        if (o0oo0oo0.OooO0oo()) {
            o00O0OO o00o0oo = o0oo0oo0.f14519OooOoO0;
            ((o0OO0oO0) o00o0oo.f14574OooOo0O).getClass();
            Boolean boolOooOo0o = o00o0oo.OooOo0o("google_analytics_deferred_deep_link_enabled");
            if (boolOooOo0o != null && boolOooOo0o.booleanValue()) {
                o0O0O0o0 o0o0o0o0 = o0oo0oo0.f14520OooOoOO;
                o0OO0oO0.OooOOO0(o0o0o0o0);
                o0o0o0o0.f14401Oooo00o.OooO0O0("Deferred Deep Link feature enabled.");
                o0OO0o00 o0oo0o00 = o0oo0oo0.f14522OooOoo0;
                o0OO0oO0.OooOOO0(o0oo0o00);
                o0oo0o00.OooOo00(new oO000(this, 2));
            }
            oOo000o0 ooo000o0OooOOOo = o0oo0oo0.OooOOOo();
            ooo000o0OooOOOo.OooOO0O();
            ooo000o0OooOOOo.OooOO0o();
            oOO0 ooo0OooOoOO = ooo000o0OooOOOo.OooOoOO(true);
            ooo000o0OooOOOo.OooOo0o();
            o0OO0oO0 o0oo0oo02 = (o0OO0oO0) ooo000o0OooOOOo.f14574OooOo0O;
            o0oo0oo02.f14519OooOoO0.OooOo0(null, o0O000O.f14304o0000Oo0);
            o0oo0oo02.OooOOOO().OooOOo(3, new byte[0]);
            ooo000o0OooOOOo.OooOoO0(new oOo00o0o(ooo000o0OooOOOo, ooo0OooOoOO, 1));
            this.f14742Oooo0oO = false;
            o0O o0o = o0oo0oo0.f14518OooOoO;
            o0OO0oO0.OooOO0O(o0o);
            o0o.OooOO0O();
            String string = o0o.OooOOOO().getString("previous_os_version", null);
            ((o0OO0oO0) o0o.f14574OooOo0O).OooOOo0().OooOOO0();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor editorEdit = o0o.OooOOOO().edit();
                editorEdit.putString("previous_os_version", str);
                editorEdit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            o0oo0oo0.OooOOo0().OooOOO0();
            if (string.equals(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            OooOOo("auto", bundle, "_ou");
        }
    }

    public final String OooOoO() {
        o0OO0oO0 o0oo0oo0 = (o0OO0oO0) this.f14574OooOo0O;
        try {
            return oO0000O.OooO0O0(o0oo0oo0.f14516OooOo0O, o0oo0oo0.f14531Oooo0OO);
        } catch (IllegalStateException e) {
            o0O0O0o0 o0o0o0o0 = o0oo0oo0.f14520OooOoOO;
            o0OO0oO0.OooOOO0(o0o0o0o0);
            o0o0o0o0.f14393OooOoOO.OooO0OO(e, "getGoogleAppId failed with exception");
            return null;
        }
    }

    public final void OooOoO0(String str, Bundle bundle, String str2) {
        o0OO0oO0 o0oo0oo0 = (o0OO0oO0) this.f14574OooOo0O;
        o0oo0oo0.f14527Oooo000.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        o000000O.OooO0o0(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", jCurrentTimeMillis);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        o0OO0o00 o0oo0o00 = o0oo0oo0.f14522OooOoo0;
        o0OO0oO0.OooOOO0(o0oo0o00);
        o0oo0o00.OooOo00(new oO000OOo(this, bundle2, 1));
    }

    public final void OooOoOO(oO00000o oo00000o, long j, boolean z) {
        OooOO0O();
        OooOO0o();
        o0OO0oO0 o0oo0oo0 = (o0OO0oO0) this.f14574OooOo0O;
        o0O o0o = o0oo0oo0.f14518OooOoO;
        o0OO0oO0.OooOO0O(o0o);
        oO00000o oo00000oOooOOo = o0o.OooOOo();
        long j2 = this.f14741Oooo0o0;
        int i = oo00000o.f14612OooO0O0;
        o0O0O0o0 o0o0o0o0 = o0oo0oo0.f14520OooOoOO;
        if (j <= j2 && oO00000o.OooOO0o(oo00000oOooOOo.f14612OooO0O0, i)) {
            o0OO0oO0.OooOOO0(o0o0o0o0);
            o0o0o0o0.f14400Oooo00O.OooO0OO(oo00000o, "Dropped out-of-date consent setting, proposed settings");
            return;
        }
        o0O o0o2 = o0oo0oo0.f14518OooOoO;
        o0OO0oO0.OooOO0O(o0o2);
        o0o2.OooOO0O();
        if (!oO00000o.OooOO0o(i, o0o2.OooOOOO().getInt("consent_source", 100))) {
            o0OO0oO0.OooOOO0(o0o0o0o0);
            o0o0o0o0.f14400Oooo00O.OooO0OO(Integer.valueOf(i), "Lower precedence consent source ignored, proposed source");
            return;
        }
        SharedPreferences.Editor editorEdit = o0o2.OooOOOO().edit();
        editorEdit.putString("consent_settings", oo00000o.OooO0oO());
        editorEdit.putInt("consent_source", i);
        editorEdit.apply();
        o0OO0oO0.OooOOO0(o0o0o0o0);
        o0o0o0o0.f14398Oooo0.OooO0OO(oo00000o, "Setting storage consent(FE)");
        this.f14741Oooo0o0 = j;
        if (o0oo0oo0.OooOOOo().OooOo0()) {
            oOo000o0 ooo000o0OooOOOo = o0oo0oo0.OooOOOo();
            ooo000o0OooOOOo.OooOO0O();
            ooo000o0OooOOOo.OooOO0o();
            ooo000o0OooOOOo.OooOoO0(new oOo000Oo(ooo000o0OooOOOo, 2));
        } else {
            oOo000o0 ooo000o0OooOOOo2 = o0oo0oo0.OooOOOo();
            ooo000o0OooOOOo2.OooOO0O();
            ooo000o0OooOOOo2.OooOO0o();
            if (ooo000o0OooOOOo2.OooOo00()) {
                ooo000o0OooOOOo2.OooOoO0(new oOo00o0o(ooo000o0OooOOOo2, ooo000o0OooOOOo2.OooOoOO(false)));
            }
        }
        if (z) {
            o0oo0oo0.OooOOOo().OooOOOO(new AtomicReference());
        }
    }

    public final void OooOoo() {
        OooOO0O();
        o0OO0oO0 o0oo0oo0 = (o0OO0oO0) this.f14574OooOo0O;
        o0O o0o = o0oo0oo0.f14518OooOoO;
        o0OO0oO0.OooOO0O(o0o);
        String strOooO0Oo = o0o.f14195Oooo00o.OooO0Oo();
        if (strOooO0Oo != null) {
            boolean zEquals = "unset".equals(strOooO0Oo);
            oo000o oo000oVar = o0oo0oo0.f14527Oooo000;
            if (zEquals) {
                oo000oVar.getClass();
                OooOo0O(System.currentTimeMillis(), null, "app", "_npa");
            } else {
                Long lValueOf = Long.valueOf(true != C3401a.f9920g.equals(strOooO0Oo) ? 0L : 1L);
                oo000oVar.getClass();
                OooOo0O(System.currentTimeMillis(), lValueOf, "app", "_npa");
            }
        }
        boolean zOooO0o = o0oo0oo0.OooO0o();
        o0O0O0o0 o0o0o0o0 = o0oo0oo0.f14520OooOoOO;
        if (!zOooO0o || !this.f14742Oooo0oO) {
            o0OO0oO0.OooOOO0(o0o0o0o0);
            o0o0o0o0.f14401Oooo00o.OooO0O0("Updating Scion state (FE)");
            oOo000o0 ooo000o0OooOOOo = o0oo0oo0.OooOOOo();
            ooo000o0OooOOOo.OooOO0O();
            ooo000o0OooOOOo.OooOO0o();
            ooo000o0OooOOOo.OooOoO0(new oOo00o0o(ooo000o0OooOOOo, ooo000o0OooOOOo.OooOoOO(true), 3));
            return;
        }
        o0OO0oO0.OooOOO0(o0o0o0o0);
        o0o0o0o0.f14401Oooo00o.OooO0O0("Recording app launch after enabling measurement for the first time (FE)");
        OooOo0o();
        oO0O0O00 oo0o0o00 = o0oo0oo0.f14521OooOoo;
        o0OO0oO0.OooOO0o(oo0o0o00);
        oo0o0o00.f14719OooOoO.OooO();
        o0OO0o00 o0oo0o00 = o0oo0oo0.f14522OooOoo0;
        o0OO0oO0.OooOOO0(o0oo0o00);
        o0oo0o00.OooOo00(new oO000(this));
    }

    public final void OooOoo0(Boolean bool, boolean z) {
        OooOO0O();
        OooOO0o();
        o0OO0oO0 o0oo0oo0 = (o0OO0oO0) this.f14574OooOo0O;
        o0O0O0o0 o0o0o0o0 = o0oo0oo0.f14520OooOoOO;
        o0OO0oO0.OooOOO0(o0o0o0o0);
        o0o0o0o0.f14401Oooo00o.OooO0OO(bool, "Setting app measurement enabled (FE)");
        o0O o0o = o0oo0oo0.f14518OooOoO;
        o0OO0oO0.OooOO0O(o0o);
        o0o.OooOO0O();
        SharedPreferences.Editor editorEdit = o0o.OooOOOO().edit();
        if (bool != null) {
            editorEdit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            editorEdit.remove("measurement_enabled");
        }
        editorEdit.apply();
        if (z) {
            o0o.OooOO0O();
            SharedPreferences.Editor editorEdit2 = o0o.OooOOOO().edit();
            if (bool != null) {
                editorEdit2.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                editorEdit2.remove("measurement_enabled_from_api");
            }
            editorEdit2.apply();
        }
        o0OO0o00 o0oo0o00 = o0oo0oo0.f14522OooOoo0;
        o0OO0oO0.OooOOO0(o0oo0o00);
        o0oo0o00.OooOO0O();
        if (o0oo0oo0.f14540OoooOO0 || !(bool == null || bool.booleanValue())) {
            OooOoo();
        }
    }

    public final void OooOooO() {
        o0OO0oO0 o0oo0oo0 = (o0OO0oO0) this.f14574OooOo0O;
        if (!(o0oo0oo0.f14516OooOo0O.getApplicationContext() instanceof Application) || this.f14725OooOo == null) {
            return;
        }
        ((Application) o0oo0oo0.f14516OooOo0O.getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f14725OooOo);
    }

    public final void OooOooo(Bundle bundle, int i, long j) {
        Boolean bool;
        String string;
        ooo0Oo0 ooo0oo0;
        OooOO0o();
        oO00000o oo00000o = oO00000o.f14610OooO0OO;
        oO00000[] oo00000Arr = EnumC0000o.STORAGE.f14082OooOo0O;
        int length = oo00000Arr.length;
        int i2 = 0;
        while (true) {
            bool = null;
            if (i2 >= length) {
                string = null;
                break;
            }
            String str = oo00000Arr[i2].f14609OooOo0O;
            if (bundle.containsKey(str) && (string = bundle.getString(str)) != null) {
                if ((string.equals("granted") ? Boolean.TRUE : string.equals("denied") ? Boolean.FALSE : null) == null) {
                    break;
                }
            }
            i2++;
        }
        o0OO0oO0 o0oo0oo0 = (o0OO0oO0) this.f14574OooOo0O;
        if (string != null) {
            o0O0O0o0 o0o0o0o0 = o0oo0oo0.f14520OooOoOO;
            o0OO0oO0.OooOOO0(o0o0o0o0);
            o0o0o0o0.f14399Oooo000.OooO0OO(string, "Ignoring invalid consent setting");
            o0O0O0o0 o0o0o0o02 = o0oo0oo0.f14520OooOoOO;
            o0OO0oO0.OooOOO0(o0o0o0o02);
            o0o0o0o02.f14399Oooo000.OooO0O0("Valid consent values are 'granted', 'denied'");
        }
        o0OO0o00 o0oo0o00 = o0oo0oo0.f14522OooOoo0;
        o0OO0oO0.OooOOO0(o0oo0o00);
        boolean zOooOOo0 = o0oo0o00.OooOOo0();
        oO00000o oo00000oOooO0O0 = oO00000o.OooO0O0(i, bundle);
        Iterator it = oo00000oOooO0O0.f14611OooO00o.values().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            ooo0oo0 = ooo0Oo0.UNINITIALIZED;
            if (!zHasNext) {
                break;
            } else if (((ooo0Oo0) it.next()) != ooo0oo0) {
                Oooo00O(oo00000oOooO0O0, zOooOOo0);
                break;
            }
        }
        o00OO o00ooOooO0OO = o00OO.OooO0OO(i, bundle);
        Iterator it2 = o00ooOooO0OO.f14140OooO0o0.values().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            } else if (((ooo0Oo0) it2.next()) != ooo0oo0) {
                Oooo000(o00ooOooO0OO, zOooOOo0);
                break;
            }
        }
        if (bundle != null) {
            int iOrdinal = oO00000o.OooO0Oo(bundle.getString("ad_personalization")).ordinal();
            if (iOrdinal == 2) {
                bool = Boolean.FALSE;
            } else if (iOrdinal == 3) {
                bool = Boolean.TRUE;
            }
        }
        if (bool != null) {
            String str2 = i == -30 ? "tcf" : "app";
            if (zOooOOo0) {
                OooOo0O(j, bool.toString(), str2, "allow_personalized_ads");
            } else {
                OooOo0(str2, "allow_personalized_ads", bool.toString(), false, j);
            }
        }
    }

    public final PriorityQueue Oooo0() {
        if (this.f14737Oooo00o == null) {
            this.f14737Oooo00o = new PriorityQueue(Comparator.comparing(oO000Oo0.f14641OooO00o, oO000Oo.f14639OooOo0o));
        }
        return this.f14737Oooo00o;
    }

    public final void Oooo000(o00OO o00oo, boolean z) {
        o00000oO.OooOOO0 oooOOO0 = new o00000oO.OooOOO0(this, o00oo);
        if (z) {
            OooOO0O();
            oooOOO0.run();
        } else {
            o0OO0o00 o0oo0o00 = ((o0OO0oO0) this.f14574OooOo0O).f14522OooOoo0;
            o0OO0oO0.OooOOO0(o0oo0o00);
            o0oo0o00.OooOo00(oooOOO0);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:153:0x0116
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1178)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public final void Oooo00O(OoooOOO.oO00000o r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: OoooOOO.oO0O0OoO.Oooo00O(OoooOOO.oO00000o, boolean):void");
    }

    public final void Oooo00o() {
        Oo0000.OooO00o();
        o0OO0oO0 o0oo0oo0 = (o0OO0oO0) this.f14574OooOo0O;
        if (o0oo0oo0.f14519OooOoO0.OooOo0(null, o0O000O.f14297o0000O00)) {
            o0OO0o00 o0oo0o00 = o0oo0oo0.f14522OooOoo0;
            o0OO0oO0.OooOOO0(o0oo0o00);
            boolean zOooOOo0 = o0oo0o00.OooOOo0();
            o0O0O0o0 o0o0o0o0 = o0oo0oo0.f14520OooOoOO;
            if (zOooOOo0) {
                o0OO0oO0.OooOOO0(o0o0o0o0);
                o0o0o0o0.f14393OooOoOO.OooO0O0("Cannot get trigger URIs from analytics worker thread");
                return;
            }
            if (OooO.OooO0o0()) {
                o0OO0oO0.OooOOO0(o0o0o0o0);
                o0o0o0o0.f14393OooOoOO.OooO0O0("Cannot get trigger URIs from main thread");
                return;
            }
            OooOO0o();
            o0OO0oO0.OooOOO0(o0o0o0o0);
            o0o0o0o0.f14398Oooo0.OooO0O0("Getting trigger URIs (FE)");
            AtomicReference atomicReference = new AtomicReference();
            o0OO0oO0.OooOOO0(o0oo0o00);
            o0oo0o00.OooOo0(atomicReference, WorkRequest.MIN_BACKOFF_MILLIS, "get trigger URIs", new oO0Oo0oo(this, atomicReference, 5, false));
            List list = (List) atomicReference.get();
            if (list == null) {
                o0OO0oO0.OooOOO0(o0o0o0o0);
                o0o0o0o0.f14394OooOoo.OooO0O0("Timed out waiting for get trigger URIs");
            } else {
                o0OO0oO0.OooOOO0(o0oo0o00);
                o0oo0o00.OooOo00(new o00000oO.OooOOO0(12, this, list));
            }
        }
    }

    public final void Oooo0O0() {
        oOo0o0oO ooo0o0oo;
        OooOO0O();
        this.f14734Oooo0 = false;
        if (Oooo0().isEmpty() || this.f14731OooOooO || (ooo0o0oo = (oOo0o0oO) Oooo0().poll()) == null) {
            return;
        }
        o0OO0oO0 o0oo0oo0 = (o0OO0oO0) this.f14574OooOo0O;
        oOO00OO ooo00oo = o0oo0oo0.f14523OooOooO;
        o0OO0oO0.OooOO0O(ooo00oo);
        if (ooo00oo.f14835OooOoOO == null) {
            ooo00oo.f14835OooOoOO = MeasurementManagerFutures.from(((o0OO0oO0) ooo00oo.f14574OooOo0O).f14516OooOo0O);
        }
        MeasurementManagerFutures measurementManagerFutures = ooo00oo.f14835OooOoOO;
        if (measurementManagerFutures != null) {
            this.f14731OooOooO = true;
            o0O0O0o0 o0o0o0o0 = o0oo0oo0.f14520OooOoOO;
            o0OO0oO0.OooOOO0(o0o0o0o0);
            String str = ooo0o0oo.zza;
            o0o0o0o0.f14398Oooo0.OooO0OO(str, "Registering trigger URI");
            OooOOO oooOOORegisterTriggerAsync = measurementManagerFutures.registerTriggerAsync(Uri.parse(str));
            if (oooOOORegisterTriggerAsync != null) {
                oooOOORegisterTriggerAsync.addListener(new o00000oO.OooOOO0(0, oooOOORegisterTriggerAsync, new OooOOO0(this, ooo0o0oo)), new o00Ooo(this));
            } else {
                this.f14731OooOooO = false;
                Oooo0().add(ooo0o0oo);
            }
        }
    }
}
