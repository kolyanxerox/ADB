package OoooOOO;

import Oooo0oO.o0000Ooo;
import com.google.android.gms.internal.measurement.C2328b;
import com.google.android.gms.internal.measurement.C2339h;
import com.google.android.gms.internal.measurement.C2348oO;
import com.google.android.gms.internal.measurement.C2351r;
import com.google.android.gms.internal.measurement.C2354u;
import com.google.android.gms.internal.measurement.Oo0000;
import com.google.android.gms.internal.measurement.oOO0O00O;
import com.google.android.gms.internal.measurement.oOOo0O00;
import com.ironsource.C3034d9;
import com.unity3d.services.core.device.MimeTypes;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.util.List;
import javax.crypto.KeyAgreement;
import o0000Oo.o000oOoO;
import o000O0O0.OooO0o;
import o000O0o0.OooOO0;
import o00O0oO.o0000O00;
import o00OOOoO.o000O0Oo;
import o00OOoo.o00O0O;
import o00OoO00.OooO0OO;
import o0oOO.OooO00o;
import o0oOO.OooO0O0;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: OoooOOO.o0 */
/* loaded from: classes2.dex */
public /* synthetic */ class C0001o0 implements o00Oo00, o000oOoO, OooO0o, OooOO0, o000Oo0.OooO0o, OooO00o {

    /* renamed from: Oooo00O */
    public static C0001o0 f14093Oooo00O;

    /* renamed from: OooOo0O */
    public final /* synthetic */ int f14094OooOo0O;

    /* renamed from: OooOo0o */
    public static final /* synthetic */ C0001o0 f14084OooOo0o = new C0001o0(0);

    /* renamed from: OooOo */
    public static final /* synthetic */ C0001o0 f14083OooOo = new C0001o0(1);

    /* renamed from: OooOoO0 */
    public static final /* synthetic */ C0001o0 f14086OooOoO0 = new C0001o0(2);

    /* renamed from: OooOoO */
    public static final /* synthetic */ C0001o0 f14085OooOoO = new C0001o0(3);

    /* renamed from: OooOoOO */
    public static final /* synthetic */ C0001o0 f14087OooOoOO = new C0001o0(4);

    /* renamed from: OooOoo0 */
    public static final /* synthetic */ C0001o0 f14089OooOoo0 = new C0001o0(5);

    /* renamed from: OooOoo */
    public static final /* synthetic */ C0001o0 f14088OooOoo = new C0001o0(6);

    /* renamed from: OooOooO */
    public static final /* synthetic */ C0001o0 f14090OooOooO = new C0001o0(7);

    /* renamed from: OooOooo */
    public static final /* synthetic */ C0001o0 f14091OooOooo = new C0001o0(8);

    /* renamed from: Oooo000 */
    public static final /* synthetic */ C0001o0 f14092Oooo000 = new C0001o0(9);

    public /* synthetic */ C0001o0(int i) {
        this.f14094OooOo0O = i;
    }

    public static final String OooO(String str) {
        switch (str.hashCode()) {
            case -1349088399:
                if (str.equals("custom")) {
                    return "*/*";
                }
                return null;
            case 96748:
                if (str.equals("any")) {
                    return "*/*";
                }
                return null;
            case 99469:
                if (str.equals("dir")) {
                    return "dir";
                }
                return null;
            case 93166550:
                if (str.equals(MimeTypes.BASE_TYPE_AUDIO)) {
                    return "audio/*";
                }
                return null;
            case 100313435:
                if (str.equals("image")) {
                    return "image/*";
                }
                return null;
            case 103772132:
                if (str.equals(C3034d9.h.f8073I0)) {
                    return "image/*,video/*";
                }
                return null;
            case 112202875:
                if (str.equals(MimeTypes.BASE_TYPE_VIDEO)) {
                    return "video/*";
                }
                return null;
            default:
                return null;
        }
    }

    public static final boolean OooO0oo(o000O0Oo o000o0oo2) {
        o000O0Oo o000o0oo3 = o00O0O.f32620OooO0OO;
        return !o0000O00.OooOooo(o000o0oo2.OooO0O0(), ".class", true);
    }

    @Override // o0000Oo.o000oOoO
    public Object OooO0O0(String str, Provider provider) {
        switch (this.f14094OooOo0O) {
            case 12:
                return provider == null ? KeyAgreement.getInstance(str) : KeyAgreement.getInstance(str, provider);
            case 13:
                return provider == null ? KeyPairGenerator.getInstance(str) : KeyPairGenerator.getInstance(str, provider);
            default:
                return provider == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, provider);
        }
    }

    @Override // o0oOO.OooO00o
    public OooO0O0 OooO0OO(String str) {
        return OooO0OO.f32687OooOo0O;
    }

    @Override // o000O0O0.OooO0o
    public o000O0O0.OooO0OO OooO0Oo(C0001o0 c0001o0, JSONObject jSONObject) throws JSONException {
        jSONObject.optInt("settings_version", 0);
        int iOptInt = jSONObject.optInt("cache_duration", 3600);
        double dOptDouble = jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d);
        double dOptDouble2 = jSONObject.optDouble("on_demand_backoff_base", 1.2d);
        int iOptInt2 = jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60);
        o0000Ooo o0000ooo = jSONObject.has("session") ? new o0000Ooo(jSONObject.getJSONObject("session").optInt("max_custom_exception_events", 8), 10) : new o0000Ooo(new JSONObject().optInt("max_custom_exception_events", 8), 10);
        JSONObject jSONObject2 = jSONObject.getJSONObject("features");
        return new o000O0O0.OooO0OO(jSONObject.has("expires_at") ? jSONObject.optLong("expires_at") : (iOptInt * 1000) + System.currentTimeMillis(), o0000ooo, new com.google.android.gms.internal.ads.o0O0OO0(jSONObject2.optBoolean("collect_reports", true), jSONObject2.optBoolean("collect_anrs", false), jSONObject2.optBoolean("collect_build_ids", false)), dOptDouble, dOptDouble2, iOptInt2);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x004f  */
    @Override // o000O0o0.OooOO0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.StackTraceElement[] OooO0o(java.lang.StackTraceElement[] r15) {
        /*
            r14 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            int r1 = r15.length
            java.lang.StackTraceElement[] r1 = new java.lang.StackTraceElement[r1]
            r2 = 1
            r3 = 0
            r6 = r2
            r4 = r3
            r5 = r4
        Ld:
            int r7 = r15.length
            if (r4 >= r7) goto L61
            r7 = r15[r4]
            java.lang.Object r8 = r0.get(r7)
            java.lang.Integer r8 = (java.lang.Integer) r8
            if (r8 == 0) goto L4f
            int r9 = r8.intValue()
            int r10 = r4 - r9
            int r11 = r4 + r10
            int r12 = r15.length
            if (r11 <= r12) goto L26
            goto L4f
        L26:
            r11 = r3
        L27:
            if (r11 >= r10) goto L3b
            int r12 = r9 + r11
            r12 = r15[r12]
            int r13 = r4 + r11
            r13 = r15[r13]
            boolean r12 = r12.equals(r13)
            if (r12 != 0) goto L38
            goto L4f
        L38:
            int r11 = r11 + 1
            goto L27
        L3b:
            int r8 = r8.intValue()
            int r8 = r4 - r8
            r9 = 10
            if (r6 >= r9) goto L4b
            java.lang.System.arraycopy(r15, r4, r1, r5, r8)
            int r5 = r5 + r8
            int r6 = r6 + 1
        L4b:
            int r8 = r8 + (-1)
            int r8 = r8 + r4
            goto L57
        L4f:
            r6 = r15[r4]
            r1[r5] = r6
            int r5 = r5 + 1
            r6 = r2
            r8 = r4
        L57:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0.put(r7, r4)
            int r4 = r8 + 1
            goto Ld
        L61:
            java.lang.StackTraceElement[] r0 = new java.lang.StackTraceElement[r5]
            java.lang.System.arraycopy(r1, r3, r0, r3, r5)
            int r1 = r15.length
            if (r5 >= r1) goto L6a
            return r0
        L6a:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: OoooOOO.C0001o0.OooO0o(java.lang.StackTraceElement[]):java.lang.StackTraceElement[]");
    }

    @Override // o000Oo0.OooO0o
    public String OooO0o0() {
        return null;
    }

    public float OooOO0(float f, float f2) {
        return 1.0f;
    }

    @Override // OoooOOO.o00Oo00
    public Object zza() {
        switch (this.f14094OooOo0O) {
            case 0:
                List list = o0O000O.f14225OooO00o;
                Boolean bool = (Boolean) C2354u.f26946OooO00o.OooO0O0();
                bool.getClass();
                return bool;
            case 1:
                List list2 = o0O000O.f14225OooO00o;
                C2348oO.f26661OooOo0o.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.oOO0000.f26837o00O0O.OooO0O0()).longValue());
            case 2:
                List list3 = o0O000O.f14225OooO00o;
                Oo0000.f26410OooOo0o.get();
                Boolean bool2 = (Boolean) C2328b.f26448OooO0oo.OooO0O0();
                bool2.getClass();
                return bool2;
            case 3:
                List list4 = o0O000O.f14225OooO00o;
                Oo0000.f26410OooOo0o.get();
                Boolean bool3 = (Boolean) C2328b.f26442OooO0O0.OooO0O0();
                bool3.getClass();
                return bool3;
            case 4:
                List list5 = o0O000O.f14225OooO00o;
                Boolean bool4 = (Boolean) oOO0O00O.f26854OooO0O0.OooO0O0();
                bool4.getClass();
                return bool4;
            case 5:
                List list6 = o0O000O.f14225OooO00o;
                Boolean bool5 = (Boolean) com.google.android.gms.internal.measurement.oO0Oo0o0.f26757OooO00o.OooO0O0();
                bool5.getClass();
                return bool5;
            case 6:
                List list7 = o0O000O.f14225OooO00o;
                Boolean bool6 = (Boolean) C2339h.f26462OooO00o.OooO0O0();
                bool6.getClass();
                return bool6;
            case 7:
                List list8 = o0O000O.f14225OooO00o;
                C2348oO.f26661OooOo0o.get();
                Long l = (Long) com.google.android.gms.internal.measurement.oOO0000.f26779OooO00o.OooO0O0();
                l.getClass();
                return l;
            case 8:
                return new Boolean(((Boolean) oOOo0O00.f26871OooO00o.OooO0O0()).booleanValue());
            default:
                return new Boolean(((Boolean) C2351r.f26943OooO00o.OooO0O0()).booleanValue());
        }
    }

    @Override // o000Oo0.OooO0o
    public void OooO00o() {
    }

    @Override // o000Oo0.OooO0o
    public void OooO0oO(long j, String str) {
    }
}
