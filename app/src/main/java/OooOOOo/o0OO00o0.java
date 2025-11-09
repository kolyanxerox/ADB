package OoooOOO;

import Oooo.OooOo00;
import Oooo00O.o000000O;
import android.text.TextUtils;
import androidx.collection.ArrayMap;
import com.google.android.gms.internal.ads.C1386ai;
import com.google.android.gms.internal.measurement.o0000O;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import o000Ooo0.OooOO0;

/* loaded from: classes2.dex */
public final class o0OO00o0 extends oO0Oo0o0 implements oo0o0O0 {

    /* renamed from: OooOoO */
    public final ArrayMap f14487OooOoO;

    /* renamed from: OooOoO0 */
    public final ArrayMap f14488OooOoO0;

    /* renamed from: OooOoOO */
    public final ArrayMap f14489OooOoOO;

    /* renamed from: OooOoo */
    public final ArrayMap f14490OooOoo;

    /* renamed from: OooOoo0 */
    public final ArrayMap f14491OooOoo0;

    /* renamed from: OooOooO */
    public final ArrayMap f14492OooOooO;

    /* renamed from: OooOooo */
    public final oo0oO0 f14493OooOooo;

    /* renamed from: Oooo0 */
    public final ArrayMap f14494Oooo0;

    /* renamed from: Oooo000 */
    public final OooOO0 f14495Oooo000;

    /* renamed from: Oooo00O */
    public final ArrayMap f14496Oooo00O;

    /* renamed from: Oooo00o */
    public final ArrayMap f14497Oooo00o;

    public o0OO00o0(oOO0000 ooo0000) {
        super(ooo0000);
        this.f14488OooOoO0 = new ArrayMap();
        this.f14487OooOoO = new ArrayMap();
        this.f14489OooOoOO = new ArrayMap();
        this.f14491OooOoo0 = new ArrayMap();
        this.f14490OooOoo = new ArrayMap();
        this.f14496Oooo00O = new ArrayMap();
        this.f14497Oooo00o = new ArrayMap();
        this.f14494Oooo0 = new ArrayMap();
        this.f14492OooOooO = new ArrayMap();
        this.f14493OooOooo = new oo0oO0(this);
        this.f14495Oooo000 = new OooOO0(this);
    }

    public static final ArrayMap OooOo0(com.google.android.gms.internal.measurement.o00OOO0O o00ooo0o) {
        ArrayMap arrayMap = new ArrayMap();
        for (com.google.android.gms.internal.measurement.o00Oo00 o00oo00 : o00ooo0o.OooOo00()) {
            arrayMap.put(o00oo00.OooOOOo(), o00oo00.OooOOo0());
        }
        return arrayMap;
    }

    public static final oO00000 OooOo0O(int i) {
        int i2 = i - 1;
        if (i2 == 1) {
            return oO00000.AD_STORAGE;
        }
        if (i2 == 2) {
            return oO00000.ANALYTICS_STORAGE;
        }
        if (i2 == 3) {
            return oO00000.AD_USER_DATA;
        }
        if (i2 != 4) {
            return null;
        }
        return oO00000.AD_PERSONALIZATION;
    }

    @Override // OoooOOO.oo0o0O0
    public final String OooO0o(String str, String str2) {
        OooOO0O();
        OooOOo0(str);
        Map map = (Map) this.f14488OooOoO0.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    public final ooo0Oo0 OooOOOO(String str, oO00000 oo00000) {
        OooOO0O();
        OooOOo0(str);
        com.google.android.gms.internal.measurement.o00OO0OO o00oo0ooOooo000 = Oooo000(str);
        ooo0Oo0 ooo0oo0 = ooo0Oo0.UNINITIALIZED;
        if (o00oo0ooOooo000 != null) {
            Iterator it = o00oo0ooOooo000.OooOo0().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                com.google.android.gms.internal.measurement.o00OO000 o00oo000 = (com.google.android.gms.internal.measurement.o00OO000) it.next();
                if (OooOo0O(o00oo000.OooOOOo()) == oo00000) {
                    int iOooOOo0 = o00oo000.OooOOo0() - 1;
                    if (iOooOOo0 == 1) {
                        return ooo0Oo0.GRANTED;
                    }
                    if (iOooOOo0 == 2) {
                        return ooo0Oo0.DENIED;
                    }
                }
            }
        }
        return ooo0oo0;
    }

    public final boolean OooOOOo(String str) {
        OooOO0O();
        OooOOo0(str);
        com.google.android.gms.internal.measurement.o00OO0OO o00oo0ooOooo000 = Oooo000(str);
        if (o00oo0ooOooo000 == null) {
            return false;
        }
        for (com.google.android.gms.internal.measurement.o00OO000 o00oo000 : o00oo0ooOooo000.OooOOOo()) {
            if (o00oo000.OooOOOo() == 3 && o00oo000.OooOOo() == 3) {
                return true;
            }
        }
        return false;
    }

    public final void OooOOo(String str, com.google.android.gms.internal.measurement.o00OOO0 o00ooo0) {
        HashSet hashSet = new HashSet();
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = new ArrayMap();
        ArrayMap arrayMap3 = new ArrayMap();
        Iterator it = Collections.unmodifiableList(((com.google.android.gms.internal.measurement.o00OOO0O) o00ooo0.f26683OooOo0o).OooOoO()).iterator();
        while (it.hasNext()) {
            hashSet.add(((com.google.android.gms.internal.measurement.oo0O) it.next()).OooOOOo());
        }
        for (int i = 0; i < ((com.google.android.gms.internal.measurement.o00OOO0O) o00ooo0.f26683OooOo0o).OooOo0(); i++) {
            com.google.android.gms.internal.measurement.o00OO o00oo = (com.google.android.gms.internal.measurement.o00OO) ((com.google.android.gms.internal.measurement.o00OOO0O) o00ooo0.f26683OooOo0o).OooOo0O(i).OooO();
            boolean zIsEmpty = o00oo.OooO0oo().isEmpty();
            o0OO0oO0 o0oo0oo0 = (o0OO0oO0) this.f14574OooOo0O;
            if (zIsEmpty) {
                o0O0O0o0 o0o0o0o0 = o0oo0oo0.f14520OooOoOO;
                o0OO0oO0.OooOOO0(o0o0o0o0);
                o0o0o0o0.f14396OooOooO.OooO0O0("EventConfig contained null event name");
            } else {
                String strOooO0oo = o00oo.OooO0oo();
                String strOooO0oO = oO0000O.OooO0oO(o00oo.OooO0oo(), oO0000O.f14614OooO00o, oO0000O.f14616OooO0OO);
                if (!TextUtils.isEmpty(strOooO0oO)) {
                    o00oo.OooO0O0();
                    ((com.google.android.gms.internal.measurement.o00OOO00) o00oo.f26683OooOo0o).OooOo0o(strOooO0oO);
                    o00ooo0.OooO0O0();
                    ((com.google.android.gms.internal.measurement.o00OOO0O) o00ooo0.f26683OooOo0o).Oooo00o(i, (com.google.android.gms.internal.measurement.o00OOO00) o00oo.OooO0o0());
                }
                if (((com.google.android.gms.internal.measurement.o00OOO00) o00oo.f26683OooOo0o).OooOOo0() && ((com.google.android.gms.internal.measurement.o00OOO00) o00oo.f26683OooOo0o).OooOOo()) {
                    arrayMap.put(strOooO0oo, Boolean.TRUE);
                }
                if (((com.google.android.gms.internal.measurement.o00OOO00) o00oo.f26683OooOo0o).OooOOoo() && ((com.google.android.gms.internal.measurement.o00OOO00) o00oo.f26683OooOo0o).OooOo00()) {
                    arrayMap2.put(o00oo.OooO0oo(), Boolean.TRUE);
                }
                if (((com.google.android.gms.internal.measurement.o00OOO00) o00oo.f26683OooOo0o).OooOo0()) {
                    if (((com.google.android.gms.internal.measurement.o00OOO00) o00oo.f26683OooOo0o).OooOo0O() < 2 || ((com.google.android.gms.internal.measurement.o00OOO00) o00oo.f26683OooOo0o).OooOo0O() > 65535) {
                        o0O0O0o0 o0o0o0o02 = o0oo0oo0.f14520OooOoOO;
                        o0OO0oO0.OooOOO0(o0o0o0o02);
                        o0o0o0o02.f14396OooOooO.OooO0Oo(o00oo.OooO0oo(), "Invalid sampling rate. Event name, sample rate", Integer.valueOf(((com.google.android.gms.internal.measurement.o00OOO00) o00oo.f26683OooOo0o).OooOo0O()));
                    } else {
                        arrayMap3.put(o00oo.OooO0oo(), Integer.valueOf(((com.google.android.gms.internal.measurement.o00OOO00) o00oo.f26683OooOo0o).OooOo0O()));
                    }
                }
            }
        }
        this.f14487OooOoO.put(str, hashSet);
        this.f14489OooOoOO.put(str, arrayMap);
        this.f14491OooOoo0.put(str, arrayMap2);
        this.f14492OooOooO.put(str, arrayMap3);
    }

    public final void OooOOo0(String str) {
        OooOO0o();
        OooOO0O();
        o000000O.OooO0o0(str);
        ArrayMap arrayMap = this.f14490OooOoo;
        if (arrayMap.get(str) == 0) {
            o00OO0OO o00oo0oo = this.f14916OooOo0o.f14792OooOo;
            oOO0000.OoooOO0(o00oo0oo);
            OooOo00 oooOo00O00ooo = o00oo0oo.o00ooo(str);
            ArrayMap arrayMap2 = this.f14494Oooo0;
            ArrayMap arrayMap3 = this.f14497Oooo00o;
            ArrayMap arrayMap4 = this.f14496Oooo00O;
            ArrayMap arrayMap5 = this.f14488OooOoO0;
            if (oooOo00O00ooo != null) {
                com.google.android.gms.internal.measurement.o00OOO0 o00ooo0 = (com.google.android.gms.internal.measurement.o00OOO0) OooOo00(str, (byte[]) oooOo00O00ooo.f13712OooOo0o).OooO();
                OooOOo(str, o00ooo0);
                arrayMap5.put(str, OooOo0((com.google.android.gms.internal.measurement.o00OOO0O) o00ooo0.OooO0o0()));
                arrayMap.put(str, (com.google.android.gms.internal.measurement.o00OOO0O) o00ooo0.OooO0o0());
                OooOOoo(str, (com.google.android.gms.internal.measurement.o00OOO0O) o00ooo0.OooO0o0());
                arrayMap4.put(str, ((com.google.android.gms.internal.measurement.o00OOO0O) o00ooo0.f26683OooOo0o).OooOoOO());
                arrayMap3.put(str, (String) oooOo00O00ooo.f13710OooOo);
                arrayMap2.put(str, (String) oooOo00O00ooo.f13713OooOoO0);
                return;
            }
            arrayMap5.put(str, null);
            this.f14489OooOoOO.put(str, null);
            this.f14487OooOoO.put(str, null);
            this.f14491OooOoo0.put(str, null);
            arrayMap.put(str, null);
            arrayMap4.put(str, null);
            arrayMap3.put(str, null);
            arrayMap2.put(str, null);
            this.f14492OooOooO.put(str, null);
        }
    }

    public final void OooOOoo(String str, com.google.android.gms.internal.measurement.o00OOO0O o00ooo0o) {
        int iOooOoO0 = o00ooo0o.OooOoO0();
        oo0oO0 oo0oo0 = this.f14493OooOooo;
        if (iOooOoO0 == 0) {
            oo0oo0.remove(str);
            return;
        }
        o0OO0oO0 o0oo0oo0 = (o0OO0oO0) this.f14574OooOo0O;
        o0O0O0o0 o0o0o0o0 = o0oo0oo0.f14520OooOoOO;
        o0OO0oO0.OooOOO0(o0o0o0o0);
        o0o0o0o0.f14398Oooo0.OooO0OO(Integer.valueOf(o00ooo0o.OooOoO0()), "EES programs found");
        com.google.android.gms.internal.measurement.o0OO000 o0oo000 = (com.google.android.gms.internal.measurement.o0OO000) o00ooo0o.OooOo().get(0);
        try {
            com.google.android.gms.internal.measurement.o000000O o000000o2 = new com.google.android.gms.internal.measurement.o000000O();
            C1386ai c1386ai = o000000o2.f26473OooO00o;
            ((HashMap) ((com.google.android.gms.internal.measurement.oO00Oo0) c1386ai.f17045OooOoO).f26700OooOo0O).put("internal.remoteConfig", new oo0ooO(this, str, 2));
            ((HashMap) ((com.google.android.gms.internal.measurement.oO00Oo0) c1386ai.f17045OooOoO).f26700OooOo0O).put("internal.appMetadata", new oo0ooO(this, str, 0));
            ((HashMap) ((com.google.android.gms.internal.measurement.oO00Oo0) c1386ai.f17045OooOoO).f26700OooOo0O).put("internal.logger", new o0OO00OO(this));
            o000000o2.OooO0O0(o0oo000);
            oo0oo0.put(str, o000000o2);
            o0OO0oO0.OooOOO0(o0o0o0o0);
            o0O0oo0o o0o0oo0o = o0o0o0o0.f14398Oooo0;
            o0o0oo0o.OooO0Oo(str, "EES program loaded for appId, activities", Integer.valueOf(o0oo000.OooOOo0().OooOOo0()));
            for (com.google.android.gms.internal.measurement.o0O o0o : o0oo000.OooOOo0().OooOOOo()) {
                o0OO0oO0.OooOOO0(o0o0o0o0);
                o0o0oo0o.OooO0OO(o0o.OooOOOo(), "EES program activity");
            }
        } catch (o0000O unused) {
            o0O0O0o0 o0o0o0o02 = o0oo0oo0.f14520OooOoOO;
            o0OO0oO0.OooOOO0(o0o0o0o02);
            o0o0o0o02.f14393OooOoOO.OooO0OO(str, "Failed to load EES program. appId");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String OooOo(String str) {
        OooOO0O();
        OooOOo0(str);
        return (String) this.f14496Oooo00O.get(str);
    }

    public final com.google.android.gms.internal.measurement.o00OOO0O OooOo00(String str, byte[] bArr) {
        o0OO0oO0 o0oo0oo0 = (o0OO0oO0) this.f14574OooOo0O;
        if (bArr == null) {
            return com.google.android.gms.internal.measurement.o00OOO0O.Oooo00O();
        }
        try {
            com.google.android.gms.internal.measurement.o00OOO0O o00ooo0o = (com.google.android.gms.internal.measurement.o00OOO0O) ((com.google.android.gms.internal.measurement.o00OOO0) oo0OOoo.OoooOOo(com.google.android.gms.internal.measurement.o00OOO0O.Oooo000(), bArr)).OooO0o0();
            o0O0O0o0 o0o0o0o0 = o0oo0oo0.f14520OooOoOO;
            o0OO0oO0.OooOOO0(o0o0o0o0);
            o0o0o0o0.f14398Oooo0.OooO0Oo(o00ooo0o.OooOOOo() ? Long.valueOf(o00ooo0o.OooOOo0()) : null, "Parsed config. version, gmp_app_id", o00ooo0o.OooOOo() ? o00ooo0o.OooOOoo() : null);
            return o00ooo0o;
        } catch (com.google.android.gms.internal.measurement.oO00O0oO e) {
            o0O0O0o0 o0o0o0o02 = o0oo0oo0.f14520OooOoOO;
            o0OO0oO0.OooOOO0(o0o0o0o02);
            o0o0o0o02.f14396OooOooO.OooO0Oo(o0O0O0o0.OooOOoo(str), "Unable to merge remote config. appId", e);
            return com.google.android.gms.internal.measurement.o00OOO0O.Oooo00O();
        } catch (RuntimeException e2) {
            o0O0O0o0 o0o0o0o03 = o0oo0oo0.f14520OooOoOO;
            o0OO0oO0.OooOOO0(o0o0o0o03);
            o0o0o0o03.f14396OooOooO.OooO0Oo(o0O0O0o0.OooOOoo(str), "Unable to merge remote config. appId", e2);
            return com.google.android.gms.internal.measurement.o00OOO0O.Oooo00O();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.google.android.gms.internal.measurement.o00OOO0O OooOo0o(String str) {
        OooOO0o();
        OooOO0O();
        o000000O.OooO0o0(str);
        OooOOo0(str);
        return (com.google.android.gms.internal.measurement.o00OOO0O) this.f14490OooOoo.get(str);
    }

    public final boolean OooOoO(String str, String str2) {
        Boolean bool;
        OooOO0O();
        OooOOo0(str);
        if ("1".equals(OooO0o(str, "measurement.upload.blacklist_internal")) && oOO00OO.Oooo00o(str2)) {
            return true;
        }
        if ("1".equals(OooO0o(str, "measurement.upload.blacklist_public")) && oOO00OO.Oooooo(str2)) {
            return true;
        }
        Map map = (Map) this.f14489OooOoOO.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:259:0x025e, code lost:
    
        r8 = r0.OooOOo().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x026a, code lost:
    
        if (r8.hasNext() == false) goto L391;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x0276, code lost:
    
        if (((com.google.android.gms.internal.measurement.oo0oOO0) r8.next()).OooOOOo() != false) goto L399;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x0278, code lost:
    
        r0 = r5.f14520OooOoOO;
        OoooOOO.o0OO0oO0.OooOOO0(r0);
        r0.f14396OooOooO.OooO0Oo(OoooOOO.o0O0O0o0.OooOOoo(r30), "Property filter with no ID. Audience definition ignored. appId, audienceId", java.lang.Integer.valueOf(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x028e, code lost:
    
        r8 = r0.OooOo0().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x029a, code lost:
    
        r22 = r0;
        r0 = "filter_id";
        r23 = r1;
        r24 = r3;
        r3 = "app_id";
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x02ac, code lost:
    
        if (r8.hasNext() == false) goto L400;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x02ae, code lost:
    
        r14 = (com.google.android.gms.internal.measurement.o00O0O00) r8.next();
        r9.OooOO0o();
        r9.OooOO0O();
        Oooo00O.o000000O.OooO0o0(r30);
        Oooo00O.o000000O.OooO0oo(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x02c8, code lost:
    
        if (r14.OooOOo().isEmpty() == false) goto L278;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x02ca, code lost:
    
        r0 = r5.f14520OooOoOO;
        OoooOOO.o0OO0oO0.OooOOO0(r0);
        r0 = r0.f14396OooOooO;
        r3 = OoooOOO.o0O0O0o0.OooOOoo(r30);
        r4 = java.lang.Integer.valueOf(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x02df, code lost:
    
        if (r14.OooOOOo() == false) goto L276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x02e1, code lost:
    
        r5 = java.lang.Integer.valueOf(r14.OooOOo0());
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x02ed, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x02ee, code lost:
    
        r0.OooO0o0("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", r3, r4, java.lang.String.valueOf(r5));
        r25 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x02f9, code lost:
    
        r25 = r7;
        r7 = r14.OooO00o();
        r26 = r8;
        r8 = new android.content.ContentValues();
        r8.put("app_id", r30);
        r8.put("audience_id", java.lang.Integer.valueOf(r25));
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x0314, code lost:
    
        if (r14.OooOOOo() == false) goto L281;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x0316, code lost:
    
        r1 = java.lang.Integer.valueOf(r14.OooOOo0());
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x031f, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x0320, code lost:
    
        r8.put("filter_id", r1);
        r8.put("event_name", r14.OooOOo());
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x0330, code lost:
    
        if (r14.OooOoO() == false) goto L285;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x0332, code lost:
    
        r0 = java.lang.Boolean.valueOf(r14.OooOoOO());
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x033b, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x033c, code lost:
    
        r8.put("session_scoped", r0);
        r8.put("data", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x034e, code lost:
    
        if (r9.OoooOoO().insertWithOnConflict("event_filters", null, r8, 5) != (-1)) goto L403;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x0350, code lost:
    
        r0 = r5.f14520OooOoOO;
        OoooOOO.o0OO0oO0.OooOOO0(r0);
        r0.f14393OooOoOO.OooO0OO(OoooOOO.o0O0O0o0.OooOOoo(r30), "Failed to insert event filter (got -1). appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x0360, code lost:
    
        r0 = r22;
        r1 = r23;
        r3 = r24;
        r7 = r25;
        r8 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x036c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x036d, code lost:
    
        r1 = r5.f14520OooOoOO;
        OoooOOO.o0OO0oO0.OooOOO0(r1);
        r1.f14393OooOoOO.OooO0Oo(OoooOOO.o0O0O0o0.OooOOoo(r30), "Error storing event filter. appId", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x037f, code lost:
    
        r25 = r7;
        r7 = r22.OooOOo().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x038d, code lost:
    
        if (r7.hasNext() == false) goto L404;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x038f, code lost:
    
        r8 = (com.google.android.gms.internal.measurement.oo0oOO0) r7.next();
        r9.OooOO0o();
        r9.OooOO0O();
        Oooo00O.o000000O.OooO0o0(r30);
        Oooo00O.o000000O.OooO0oo(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x03a9, code lost:
    
        if (r8.OooOOo().isEmpty() == false) goto L303;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x03ab, code lost:
    
        r0 = r5.f14520OooOoOO;
        OoooOOO.o0OO0oO0.OooOOO0(r0);
        r0 = r0.f14396OooOooO;
        r3 = OoooOOO.o0O0O0o0.OooOOoo(r30);
        r4 = java.lang.Integer.valueOf(r25);
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x03c0, code lost:
    
        if (r8.OooOOOo() == false) goto L301;
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x03c2, code lost:
    
        r5 = java.lang.Integer.valueOf(r8.OooOOo0());
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x03cb, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x03cc, code lost:
    
        r0.OooO0o0("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", r3, r4, java.lang.String.valueOf(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x03d5, code lost:
    
        r14 = r8.OooO00o();
        r22 = r7;
        r7 = new android.content.ContentValues();
        r7.put(r3, r30);
        r26 = r3;
        r7.put("audience_id", java.lang.Integer.valueOf(r25));
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x03f0, code lost:
    
        if (r8.OooOOOo() == false) goto L306;
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x03f2, code lost:
    
        r3 = java.lang.Integer.valueOf(r8.OooOOo0());
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x03fb, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x03fc, code lost:
    
        r7.put(r0, r3);
        r27 = r0;
        r7.put("property_name", r8.OooOOo());
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x040e, code lost:
    
        if (r8.OooOo0O() == false) goto L310;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x0410, code lost:
    
        r0 = java.lang.Boolean.valueOf(r8.OooOo0o());
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x0419, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x041a, code lost:
    
        r7.put("session_scoped", r0);
        r7.put("data", r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x042c, code lost:
    
        if (r9.OoooOoO().insertWithOnConflict("property_filters", null, r7, 5) != (-1)) goto L318;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x042e, code lost:
    
        r0 = r5.f14520OooOoOO;
        OoooOOO.o0OO0oO0.OooOOO0(r0);
        r0.f14393OooOoOO.OooO0OO(OoooOOO.o0O0O0o0.OooOOoo(r30), "Failed to insert property filter (got -1). appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x043f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x0441, code lost:
    
        r7 = r22;
        r3 = r26;
        r0 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x0449, code lost:
    
        r1 = r5.f14520OooOoOO;
        OoooOOO.o0OO0oO0.OooOOO0(r1);
        r1.f14393OooOoOO.OooO0Oo(OoooOOO.o0O0O0o0.OooOOoo(r30), "Error storing property filter. appId", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x0459, code lost:
    
        r9.OooOO0o();
        r9.OooOO0O();
        Oooo00O.o000000O.OooO0o0(r30);
        r0 = r9.OoooOoO();
        r0.delete("property_filters", "app_id=? and audience_id=?", new java.lang.String[]{r30, java.lang.String.valueOf(r25)});
        r0.delete("event_filters", "app_id=? and audience_id=?", new java.lang.String[]{r30, java.lang.String.valueOf(r25)});
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x047c, code lost:
    
        r1 = r23;
        r3 = r24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooOoO0(byte[] r29, java.lang.String r30, java.lang.String r31, java.lang.String r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1559
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: OoooOOO.o0OO00o0.OooOoO0(byte[], java.lang.String, java.lang.String, java.lang.String):void");
    }

    public final boolean OooOoOO(String str, String str2) {
        Boolean bool;
        OooOO0O();
        OooOOo0(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.f14491OooOoo0.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean OooOoo(String str) {
        OooOO0O();
        OooOOo0(str);
        ArrayMap arrayMap = this.f14487OooOoO;
        if (arrayMap.get(str) != 0) {
            return ((Set) arrayMap.get(str)).contains("os_version") || ((Set) arrayMap.get(str)).contains("device_info");
        }
        return false;
    }

    public final int OooOoo0(String str, String str2) {
        Integer num;
        OooOO0O();
        OooOOo0(str);
        Map map = (Map) this.f14492OooOooO.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    public final boolean OooOooO(String str) {
        OooOO0O();
        OooOOo0(str);
        ArrayMap arrayMap = this.f14487OooOoO;
        return arrayMap.get(str) != 0 && ((Set) arrayMap.get(str)).contains("app_instance_id");
    }

    public final boolean OooOooo(String str, oO00000 oo00000) {
        OooOO0O();
        OooOOo0(str);
        com.google.android.gms.internal.measurement.o00OO0OO o00oo0ooOooo000 = Oooo000(str);
        if (o00oo0ooOooo000 == null) {
            return false;
        }
        for (com.google.android.gms.internal.measurement.o00OO000 o00oo000 : o00oo0ooOooo000.OooOOOo()) {
            if (oo00000 == OooOo0O(o00oo000.OooOOOo())) {
                return o00oo000.OooOOo0() == 2;
            }
        }
        return false;
    }

    public final com.google.android.gms.internal.measurement.o00OO0OO Oooo000(String str) {
        OooOO0O();
        OooOOo0(str);
        com.google.android.gms.internal.measurement.o00OOO0O o00ooo0oOooOo0o = OooOo0o(str);
        if (o00ooo0oOooOo0o == null || !o00ooo0oOooOo0o.OooOoo0()) {
            return null;
        }
        return o00ooo0oOooOo0o.OooOoo();
    }

    @Override // OoooOOO.oO0Oo0o0
    public final void OooOOO() {
    }
}
