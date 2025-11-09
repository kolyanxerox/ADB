package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.util.Base64;
import android.util.JsonReader;
import android.view.MotionEvent;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zzbs;
import com.google.android.gms.ads.internal.util.zzj;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import com.ironsource.C3034d9;
import com.ironsource.C3037dc;
import com.ironsource.C3121fl;
import com.ironsource.InterfaceC3771vj;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.ads.core.data.datasource.AndroidTcfDataSource;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.PriorityBlockingQueue;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.sk */
/* loaded from: classes2.dex */
public final class C2051sk implements OoooO0O.o000O00, vp0, bf0 {

    /* renamed from: OooOoOO */
    public static C2051sk f24095OooOoOO;

    /* renamed from: OooOo */
    public Object f24096OooOo;

    /* renamed from: OooOo0O */
    public final /* synthetic */ int f24097OooOo0O;

    /* renamed from: OooOo0o */
    public Object f24098OooOo0o;

    /* renamed from: OooOoO */
    public Object f24099OooOoO;

    /* renamed from: OooOoO0 */
    public Object f24100OooOoO0;

    public C2051sk(int i) {
        this.f24097OooOo0O = i;
        switch (i) {
            case 17:
                this.f24098OooOo0o = new HashMap();
                this.f24096OooOo = new HashMap();
                this.f24100OooOoO0 = new HashMap();
                this.f24099OooOoO = new HashMap();
                break;
            case 24:
                this.f24096OooOo = new ArrayDeque();
                this.f24100OooOoO0 = new ArrayDeque();
                this.f24099OooOoO = new ArrayDeque();
                break;
            default:
                this.f24098OooOo0o = null;
                this.f24096OooOo = null;
                this.f24100OooOoO0 = null;
                this.f24099OooOoO = tr0.f24488OooOoO;
                break;
        }
    }

    public static C2051sk OooO0o(Reader reader, C2197wi c2197wi) {
        try {
            try {
                return new C2051sk(new JsonReader(reader), c2197wi);
            } catch (IOException | AssertionError | IllegalStateException | NumberFormatException | JSONException e) {
                throw new nd0("unable to parse ServerResponse", e);
            }
        } finally {
            Oooo0OO.o00oO0o.OooO0Oo(reader);
        }
    }

    public static synchronized C2051sk OooOo00(Context context) {
        try {
            C2051sk c2051sk = f24095OooOoOO;
            if (c2051sk != null) {
                return c2051sk;
            }
            Context applicationContext = context.getApplicationContext();
            AbstractC1448c7.OooO00o(applicationContext);
            zzj zzjVarOooO0Oo = zzv.zzp().OooO0Oo();
            zzjVarOooO0Oo.zzp(applicationContext);
            applicationContext.getClass();
            Oooo0OO.o00Ooo o00oooZzC = zzv.zzC();
            o00oooZzC.getClass();
            C2162vk c2162vkZzo = zzv.zzo();
            ii0.Oooo0oO(C2162vk.class, c2162vkZzo);
            C2051sk c2051sk2 = new C2051sk(applicationContext, o00oooZzC, zzjVarOooO0Oo, c2162vkZzo);
            f24095OooOoOO = c2051sk2;
            SharedPreferencesOnSharedPreferenceChangeListenerC1829mk sharedPreferencesOnSharedPreferenceChangeListenerC1829mk = (SharedPreferencesOnSharedPreferenceChangeListenerC1829mk) ((p31) c2051sk2.f24096OooOo).zzb();
            SharedPreferences sharedPreferences = sharedPreferencesOnSharedPreferenceChangeListenerC1829mk.f21258OooO0O0;
            sharedPreferences.registerOnSharedPreferenceChangeListener(sharedPreferencesOnSharedPreferenceChangeListenerC1829mk);
            sharedPreferencesOnSharedPreferenceChangeListenerC1829mk.onSharedPreferenceChanged(sharedPreferences, "gad_has_consent_for_cookies");
            if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17779o00000o0)).booleanValue()) {
                sharedPreferencesOnSharedPreferenceChangeListenerC1829mk.onSharedPreferenceChanged(sharedPreferences, AndroidTcfDataSource.TCF_TCSTRING_KEY);
            } else {
                sharedPreferencesOnSharedPreferenceChangeListenerC1829mk.onSharedPreferenceChanged(sharedPreferences, "IABTCF_PurposeConsents");
            }
            C2273yk c2273yk = (C2273yk) ((p31) f24095OooOoOO.f24099OooOoO).zzb();
            if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17773o000000O)).booleanValue()) {
                zzv.zzq();
                Map mapZzw = zzs.zzw((String) zzbe.zzc().OooO00o(AbstractC1448c7.f17774o000000o));
                Iterator it = mapZzw.keySet().iterator();
                while (it.hasNext()) {
                    c2273yk.OooO00o((String) it.next());
                }
                C2199wk c2199wk = new C2199wk(c2273yk, mapZzw);
                synchronized (c2273yk) {
                    c2273yk.f25931OooO0O0.add(c2199wk);
                }
            }
            return f24095OooOoOO;
        } catch (Throwable th) {
            throw th;
        }
    }

    public static String OooOooo(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        C1846n0 c1846n0OooOo0o = C1920p0.OooOo0o();
        c1846n0OooOo0o.OooO0Oo();
        C1920p0.OooOoO((C1920p0) c1846n0OooOo0o.f25822OooOo0o, 5);
        hz0 hz0VarOooOo0 = jz0.OooOo0(bArr, 0, bArr.length);
        c1846n0OooOo0o.OooO0Oo();
        C1920p0.OooOo((C1920p0) c1846n0OooOo0o.f25822OooOo0o, hz0VarOooOo0);
        return Base64.encodeToString(((C1920p0) c1846n0OooOo0o.OooO0O0()).OooO0Oo(), 11);
    }

    public synchronized void OooO(oOOO00o0 oooo00o0) {
        try {
            HashMap map = (HashMap) this.f24098OooOo0o;
            String strZzj = oooo00o0.zzj();
            List list = (List) map.remove(strZzj);
            if (list == null || list.isEmpty()) {
                return;
            }
            if (oOOo0O00.f22855OooO00o) {
                oOOo0O00.OooO0OO("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(list.size()), strZzj);
            }
            oOOO00o0 oooo00o02 = (oOOO00o0) list.remove(0);
            ((HashMap) this.f24098OooOo0o).put(strZzj, list);
            synchronized (oooo00o02.f22829OooOoO) {
                oooo00o02.f22836Oooo000 = this;
            }
            try {
                ((PriorityBlockingQueue) this.f24100OooOoO0).put(oooo00o02);
            } catch (InterruptedException e) {
                oOOo0O00.OooO0O0("Couldn't add request to queue. %s", e.toString());
                Thread.currentThread().interrupt();
                oOO0OO0O ooo0oo0o = (oOO0OO0O) this.f24096OooOo;
                ooo0oo0o.f22813OooOoO0 = true;
                ooo0oo0o.interrupt();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:262:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0315  */
    @Override // OoooO0O.o000O00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean OooO00o(java.lang.String r22, org.json.JSONObject r23) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 1038
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2051sk.OooO00o(java.lang.String, org.json.JSONObject):boolean");
    }

    public o0000O.OooOo OooO0O0() throws GeneralSecurityException {
        Integer num = (Integer) this.f24098OooOo0o;
        if (num == null) {
            throw new GeneralSecurityException("key size is not set");
        }
        if (((Integer) this.f24096OooOo) == null) {
            throw new GeneralSecurityException("tag size is not set");
        }
        if (((o0000O.OooO0o) this.f24100OooOoO0) == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        if (((o0000O.OooO0o) this.f24099OooOoO) == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        if (num.intValue() < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", (Integer) this.f24098OooOo0o));
        }
        Integer num2 = (Integer) this.f24096OooOo;
        int iIntValue = num2.intValue();
        o0000O.OooO0o oooO0o = (o0000O.OooO0o) this.f24100OooOoO0;
        if (iIntValue < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", num2));
        }
        if (oooO0o == o0000O.OooO0o.f29323OooO0oO) {
            if (iIntValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num2));
            }
        } else if (oooO0o == o0000O.OooO0o.f29324OooO0oo) {
            if (iIntValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num2));
            }
        } else if (oooO0o == o0000O.OooO0o.f29318OooO) {
            if (iIntValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num2));
            }
        } else if (oooO0o == o0000O.OooO0o.f29325OooOO0) {
            if (iIntValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num2));
            }
        } else {
            if (oooO0o != o0000O.OooO0o.f29326OooOO0O) {
                throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
            }
            if (iIntValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num2));
            }
        }
        return new o0000O.OooOo(((Integer) this.f24098OooOo0o).intValue(), ((Integer) this.f24096OooOo).intValue(), (o0000O.OooO0o) this.f24099OooOoO, (o0000O.OooO0o) this.f24100OooOoO0);
    }

    public void OooO0OO(o00OOO0.o0OOO0o o0ooo0o) {
        ArrayDeque arrayDeque = (ArrayDeque) this.f24100OooOoO0;
        synchronized (this) {
            if (!arrayDeque.remove(o0ooo0o)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        OooO0Oo();
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void OooO0Oo() {
        /*
            Method dump skipped, instructions count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2051sk.OooO0Oo():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x011b A[Catch: NumberFormatException | JSONException -> 0x0123, NumberFormatException | JSONException -> 0x0123, TRY_LEAVE, TryCatch #0 {NumberFormatException | JSONException -> 0x0123, blocks: (B:97:0x0031, B:131:0x009d, B:131:0x009d, B:132:0x00ab, B:132:0x00ab, B:134:0x00b8, B:134:0x00b8, B:136:0x00ca, B:136:0x00ca, B:137:0x00d3, B:137:0x00d3, B:138:0x00d7, B:138:0x00d7, B:140:0x00e4, B:140:0x00e4, B:142:0x00f6, B:142:0x00f6, B:143:0x00ff, B:143:0x00ff, B:144:0x0103, B:144:0x0103, B:145:0x010f, B:145:0x010f, B:146:0x011b, B:146:0x011b), top: B:158:0x0031, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.os.Bundle OooO0o0() throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 347
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2051sk.OooO0o0():android.os.Bundle");
    }

    public com.google.android.gms.internal.measurement.Oooo0 OooO0oO(com.google.android.gms.internal.measurement.Oooo0 oooo0) {
        return ((com.google.android.gms.internal.measurement.oo000o) this.f24096OooOo).OooO0OO(this, oooo0);
    }

    public void OooO0oo(int i) throws GeneralSecurityException {
        if (i != 12 && i != 16) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(i)));
        }
        this.f24096OooOo = Integer.valueOf(i);
    }

    public void OooOO0(ot0 ot0Var) throws GeneralSecurityException {
        ot0Var.getClass();
        wu0 wu0Var = new wu0(su0.class, ot0Var.f23115OooO00o);
        HashMap map = (HashMap) this.f24096OooOo;
        if (!map.containsKey(wu0Var)) {
            map.put(wu0Var, ot0Var);
            return;
        }
        ot0 ot0Var2 = (ot0) map.get(wu0Var);
        if (!ot0Var2.equals(ot0Var) || !ot0Var.equals(ot0Var2)) {
            throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(wu0Var.toString()));
        }
    }

    public com.google.android.gms.internal.measurement.Oooo0 OooOO0o(com.google.android.gms.internal.measurement.OooO0o oooO0o) {
        com.google.android.gms.internal.measurement.Oooo0 oooo0OooO0OO = com.google.android.gms.internal.measurement.Oooo0.OooOO0o;
        Iterator itOooO = oooO0o.OooO();
        while (itOooO.hasNext()) {
            oooo0OooO0OO = ((com.google.android.gms.internal.measurement.oo000o) this.f24096OooOo).OooO0OO(this, oooO0o.OooOO0O(((Integer) itOooO.next()).intValue()));
            if (oooo0OooO0OO instanceof com.google.android.gms.internal.measurement.OooOO0) {
                break;
            }
        }
        return oooo0OooO0OO;
    }

    public void OooOOO(Bundle bundle) {
        Iterator<String> it;
        JSONObject jSONObject;
        boolean zOooOo0;
        OoooOOO.o0O0O0o0 o0o0o0o0;
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        OoooOOO.o0O o0o = (OoooOOO.o0O) this.f24099OooOoO;
        SharedPreferences sharedPreferencesOooOOOO = o0o.OooOOOO();
        OoooOOO.o0OO0oO0 o0oo0oo0 = (OoooOOO.o0OO0oO0) o0o.f14574OooOo0O;
        SharedPreferences.Editor editorEdit = sharedPreferencesOooOOOO.edit();
        int size = bundle2.size();
        String str = (String) this.f24098OooOo0o;
        if (size == 0) {
            editorEdit.remove(str);
        } else {
            JSONArray jSONArray = new JSONArray();
            Iterator<String> it2 = bundle2.keySet().iterator();
            while (it2.hasNext()) {
                String next = it2.next();
                Object obj = bundle2.get(next);
                if (obj != null) {
                    try {
                        jSONObject = new JSONObject();
                        jSONObject.put(C3037dc.f8262q, next);
                        com.google.android.gms.internal.measurement.Oo0000.OooO00o();
                        zOooOo0 = o0oo0oo0.f14519OooOoO0.OooOo0(null, OoooOOO.o0O000O.f14297o0000O00);
                        o0o0o0o0 = o0oo0oo0.f14520OooOoOO;
                    } catch (JSONException e) {
                        e = e;
                        it = it2;
                    }
                    if (zOooOo0) {
                        it = it2;
                        try {
                        } catch (JSONException e2) {
                            e = e2;
                            OoooOOO.o0O0O0o0 o0o0o0o02 = o0oo0oo0.f14520OooOoOO;
                            OoooOOO.o0OO0oO0.OooOOO0(o0o0o0o02);
                            o0o0o0o02.f14393OooOoOO.OooO0OO(e, "Cannot serialize bundle value to SharedPreferences");
                            it2 = it;
                        }
                        if (obj instanceof String) {
                            jSONObject.put("v", obj.toString());
                            jSONObject.put("t", "s");
                        } else if (obj instanceof Long) {
                            jSONObject.put("v", obj.toString());
                            jSONObject.put("t", "l");
                        } else if (obj instanceof int[]) {
                            jSONObject.put("v", Arrays.toString((int[]) obj));
                            jSONObject.put("t", "ia");
                        } else if (obj instanceof long[]) {
                            jSONObject.put("v", Arrays.toString((long[]) obj));
                            jSONObject.put("t", "la");
                        } else if (obj instanceof Double) {
                            jSONObject.put("v", obj.toString());
                            jSONObject.put("t", "d");
                        } else {
                            OoooOOO.o0OO0oO0.OooOOO0(o0o0o0o0);
                            o0o0o0o0.f14393OooOoOO.OooO0OO(obj.getClass(), "Cannot serialize bundle value to SharedPreferences. Type");
                            it2 = it;
                        }
                        jSONArray.put(jSONObject);
                        it2 = it;
                    } else {
                        it = it2;
                        jSONObject.put("v", obj.toString());
                        if (obj instanceof String) {
                            jSONObject.put("t", "s");
                        } else if (obj instanceof Long) {
                            jSONObject.put("t", "l");
                        } else if (obj instanceof Double) {
                            jSONObject.put("t", "d");
                        } else {
                            OoooOOO.o0OO0oO0.OooOOO0(o0o0o0o0);
                            o0o0o0o0.f14393OooOoOO.OooO0OO(obj.getClass(), "Cannot serialize bundle value to SharedPreferences. Type");
                            it2 = it;
                        }
                        jSONArray.put(jSONObject);
                        it2 = it;
                    }
                }
            }
            editorEdit.putString(str, jSONArray.toString());
        }
        editorEdit.apply();
        this.f24100OooOoO0 = bundle2;
    }

    public void OooOOO0(int i) throws InvalidAlgorithmParameterException {
        if (i != 16 && i != 24 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.f24098OooOo0o = Integer.valueOf(i);
    }

    public void OooOOOO(qt0 qt0Var) throws GeneralSecurityException {
        xu0 xu0Var = new xu0(qt0Var.f23698OooO00o, su0.class);
        HashMap map = (HashMap) this.f24098OooOo0o;
        if (!map.containsKey(xu0Var)) {
            map.put(xu0Var, qt0Var);
            return;
        }
        qt0 qt0Var2 = (qt0) map.get(xu0Var);
        if (!qt0Var2.equals(qt0Var) || !qt0Var.equals(qt0Var2)) {
            throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(xu0Var.toString()));
        }
    }

    public C2051sk OooOOOo() {
        return new C2051sk(this, (com.google.android.gms.internal.measurement.oo000o) this.f24096OooOo);
    }

    public void OooOOo(hu0 hu0Var) throws GeneralSecurityException {
        hu0Var.getClass();
        wu0 wu0Var = new wu0(tu0.class, hu0Var.f19866OooO00o);
        HashMap map = (HashMap) this.f24099OooOoO;
        if (!map.containsKey(wu0Var)) {
            map.put(wu0Var, hu0Var);
            return;
        }
        hu0 hu0Var2 = (hu0) map.get(wu0Var);
        if (!hu0Var2.equals(hu0Var) || !hu0Var.equals(hu0Var2)) {
            throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(wu0Var.toString()));
        }
    }

    public void OooOOo0() {
        this.f24100OooOoO0 = 16;
    }

    public synchronized boolean OooOOoo(oOOO00o0 oooo00o0) {
        try {
            HashMap map = (HashMap) this.f24098OooOo0o;
            String strZzj = oooo00o0.zzj();
            if (!map.containsKey(strZzj)) {
                ((HashMap) this.f24098OooOo0o).put(strZzj, null);
                synchronized (oooo00o0.f22829OooOoO) {
                    oooo00o0.f22836Oooo000 = this;
                }
                if (oOOo0O00.f22855OooO00o) {
                    oOOo0O00.OooO00o("new request, sending to network %s", strZzj);
                }
                return false;
            }
            List arrayList = (List) ((HashMap) this.f24098OooOo0o).get(strZzj);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            oooo00o0.zzm("waiting-for-response");
            arrayList.add(oooo00o0);
            ((HashMap) this.f24098OooOo0o).put(strZzj, arrayList);
            if (oOOo0O00.f22855OooO00o) {
                oOOo0O00.OooO00o("Request for cacheKey=%s is in flight, putting on hold.", strZzj);
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized int OooOo() {
        try {
        } catch (Exception e) {
            throw new gj0(e, InterfaceC3771vj.a.f12374f);
        }
        return ((Integer) this.f24098OooOo0o.getClass().getDeclaredMethod("lcs", null).invoke(this.f24098OooOo0o, null)).intValue();
    }

    public synchronized void OooOo0(MotionEvent motionEvent) {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            HashMap map = new HashMap();
            map.put("t", new Throwable());
            map.put(C3121fl.f8585b, null);
            map.put("evt", motionEvent);
            this.f24098OooOo0o.getClass().getDeclaredMethod("he", Map.class).invoke(this.f24098OooOo0o, map);
            ((OoooOOO.o0O0oo00) this.f24099OooOoO).OooO0oo(3003, System.currentTimeMillis() - jCurrentTimeMillis);
        } catch (Exception e) {
            throw new gj0(e, InterfaceC3771vj.a.f12372d);
        }
    }

    public void OooOo0O(ju0 ju0Var) throws GeneralSecurityException {
        xu0 xu0Var = new xu0(ju0Var.f20393OooO00o, tu0.class);
        HashMap map = (HashMap) this.f24100OooOoO0;
        if (!map.containsKey(xu0Var)) {
            map.put(xu0Var, ju0Var);
            return;
        }
        ju0 ju0Var2 = (ju0) map.get(xu0Var);
        if (!ju0Var2.equals(ju0Var) || !ju0Var.equals(ju0Var2)) {
            throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(xu0Var.toString()));
        }
    }

    public boolean OooOo0o(String str) {
        if (((HashMap) this.f24100OooOoO0).containsKey(str)) {
            return true;
        }
        C2051sk c2051sk = (C2051sk) this.f24098OooOo0o;
        if (c2051sk != null) {
            return c2051sk.OooOo0o(str);
        }
        return false;
    }

    public void OooOoO(String str, com.google.android.gms.internal.measurement.Oooo0 oooo0) {
        C2051sk c2051sk;
        HashMap map = (HashMap) this.f24100OooOoO0;
        if (!map.containsKey(str) && (c2051sk = (C2051sk) this.f24098OooOo0o) != null && c2051sk.OooOo0o(str)) {
            c2051sk.OooOoO(str, oooo0);
        } else {
            if (((HashMap) this.f24099OooOoO).containsKey(str)) {
                return;
            }
            if (oooo0 == null) {
                map.remove(str);
            } else {
                map.put(str, oooo0);
            }
        }
    }

    public ur0 OooOoO0() throws GeneralSecurityException {
        Integer num = (Integer) this.f24098OooOo0o;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (((Integer) this.f24096OooOo) == null) {
            throw new GeneralSecurityException("IV size is not set");
        }
        if (((Integer) this.f24100OooOoO0) == null) {
            throw new GeneralSecurityException("Tag size is not set");
        }
        int iIntValue = num.intValue();
        int iIntValue2 = ((Integer) this.f24096OooOo).intValue();
        ((Integer) this.f24100OooOoO0).getClass();
        return new ur0(iIntValue, iIntValue2, (tr0) this.f24099OooOoO);
    }

    public void OooOoOO(String str, com.google.android.gms.internal.measurement.Oooo0 oooo0) {
        if (((HashMap) this.f24099OooOoO).containsKey(str)) {
            return;
        }
        HashMap map = (HashMap) this.f24100OooOoO0;
        if (oooo0 == null) {
            map.remove(str);
        } else {
            map.put(str, oooo0);
        }
    }

    public com.google.android.gms.internal.measurement.Oooo0 OooOoo(String str) {
        HashMap map = (HashMap) this.f24100OooOoO0;
        if (map.containsKey(str)) {
            return (com.google.android.gms.internal.measurement.Oooo0) map.get(str);
        }
        C2051sk c2051sk = (C2051sk) this.f24098OooOo0o;
        if (c2051sk != null) {
            return c2051sk.OooOoo(str);
        }
        throw new IllegalArgumentException(OooO0oO.OooOo.OooOoo0(str, " is not defined"));
    }

    public synchronized void OooOoo0() {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.f24098OooOo0o.getClass().getDeclaredMethod("close", null).invoke(this.f24098OooOo0o, null);
            ((OoooOOO.o0O0oo00) this.f24099OooOoO).OooO0oo(IronSourceError.ERROR_DELIVERY_CAPPING_VALIDATION_FAILED, System.currentTimeMillis() - jCurrentTimeMillis);
        } catch (Exception e) {
            throw new gj0(e, InterfaceC3771vj.b.f12381c);
        }
    }

    public synchronized boolean OooOooO() {
        try {
        } catch (Exception e) {
            throw new gj0(e, 2001);
        }
        return ((Boolean) this.f24098OooOo0o.getClass().getDeclaredMethod(C3034d9.a.f7919f, null).invoke(this.f24098OooOo0o, null)).booleanValue();
    }

    public synchronized byte[] Oooo000(HashMap map) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
        } catch (Exception e) {
            ((OoooOOO.o0O0oo00) this.f24099OooOoO).OooO0oO(2007, System.currentTimeMillis() - jCurrentTimeMillis, e);
            return null;
        }
        return (byte[]) this.f24098OooOo0o.getClass().getDeclaredMethod("xss", Map.class, Map.class).invoke(this.f24098OooOo0o, null, map);
    }

    @Override // OoooO0O.o000O00
    public Executor zza() {
        return (OoooO0O.o000O000) this.f24099OooOoO;
    }

    /* JADX WARN: Removed duplicated region for block: B:303:0x03b7  */
    @Override // com.google.android.gms.internal.ads.vp0
    /* renamed from: zzb */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo13705zzb(java.lang.Object r25) throws java.net.URISyntaxException {
        /*
            Method dump skipped, instructions count: 1222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2051sk.mo13705zzb(java.lang.Object):void");
    }

    @Override // com.google.android.gms.internal.ads.vp0
    public void zza(Throwable th) {
        switch (this.f24097OooOo0O) {
            case 5:
                zzv.zzp().OooO0oo("OpenGmsgHandler.attributionReportingManager", th);
                break;
            case 8:
                ((C1468cr) this.f24099OooOoO).f18049OooO0o0.OooO00o(new OoooO0O.o00O0O0(this, th, (hg0) this.f24098OooOo0o, (String) this.f24096OooOo, (com.google.android.gms.ads.internal.util.client.zzv) this.f24100OooOoO0, 5));
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.bf0
    public Object zza(Object obj) {
        return ((p60) ((l80) this.f24098OooOo0o).f20828OooO0o0).OooO00o((rd0) this.f24096OooOo, (kd0) this.f24100OooOoO0, (l60) this.f24099OooOoO);
    }

    public /* synthetic */ C2051sk(int i, boolean z) {
        this.f24097OooOo0O = i;
    }

    public C2051sk(Context context, Oooo0OO.o00Ooo o00ooo2, zzj zzjVar, C2162vk c2162vk) {
        this.f24097OooOo0O = 0;
        this.f24098OooOo0o = o00ooo2;
        r31 r31VarOooO00o = r31.OooO00o(context);
        r31 r31VarOooO00o2 = r31.OooO00o(zzjVar);
        this.f24096OooOo = p31.OooO0O0(new C1866nk(r31VarOooO00o, r31VarOooO00o2, 0));
        r31 r31VarOooO00o3 = r31.OooO00o(o00ooo2);
        p31 p31VarOooO0O0 = p31.OooO0O0(new C1940pk(r31VarOooO00o3, r31VarOooO00o2, r31.OooO00o(c2162vk), 0));
        this.f24100OooOoO0 = p31VarOooO0O0;
        this.f24099OooOoO = p31.OooO0O0(new C1866nk(r31VarOooO00o, new C2014rk(r31VarOooO00o3, p31VarOooO0O0), 1));
    }

    public C2051sk(C2130up c2130up, OooO0oO.Oooo0 oooo0) {
        this.f24097OooOo0O = 7;
        this.f24099OooOoO = c2130up;
        this.f24098OooOo0o = oooo0;
        this.f24096OooOo = p31.OooO0O0(new o20(c2130up.f24688OooOOOo, 23));
        zb0 zb0Var = new zb0(oooo0, 1);
        zb0 zb0Var2 = new zb0(oooo0, 2);
        zb0 zb0Var3 = new zb0(oooo0, 4);
        C1834mp c1834mp = c2130up.f24681OooO0oO;
        p31 p31Var = c2130up.f24678OooO0Oo;
        new C1984qr(c1834mp, p31Var, zb0Var, zb0Var2, zb0Var3);
        new C1797lp(c1834mp, 25);
        zb0 zb0Var4 = new zb0(oooo0, 0);
        new C1651hq(zb0Var4, 24);
        new C1908op(p31Var, c1834mp, 7);
        zb0 zb0Var5 = new zb0(oooo0, 3);
        p31 p31Var2 = c2130up.f24713Oooo0oo;
        new C1984qr(p31Var2, (q31) zb0Var5, (q31) zb0Var3, (q31) zb0Var4, p31Var, 17);
        new ab0(zb0Var4, p31Var2, p31Var, 2);
        zb0 zb0Var6 = new zb0(oooo0, 5);
        p31 p31VarOooO0O0 = p31.OooO0O0(AbstractC1641hg.f19758OoooO);
        p31 p31VarOooO0O02 = p31.OooO0O0(wz0.f25471Oooo00O);
        p31 p31VarOooO0O03 = p31.OooO0O0(wz0.f25472Oooo00o);
        p31 p31VarOooO0O04 = p31.OooO0O0(AbstractC1641hg.f19762OoooOO0);
        int i = s31.f23985OooO0O0;
        LinkedHashMap linkedHashMapOooo0O0 = xh0.Oooo0O0(4);
        ef0 ef0Var = ef0.GMS_SIGNALS;
        ii0.OooOOO0(p31VarOooO0O0, IronSourceConstants.EVENTS_PROVIDER);
        linkedHashMapOooo0O0.put(ef0Var, p31VarOooO0O0);
        ef0 ef0Var2 = ef0.BUILD_URL;
        ii0.OooOOO0(p31VarOooO0O02, IronSourceConstants.EVENTS_PROVIDER);
        linkedHashMapOooo0O0.put(ef0Var2, p31VarOooO0O02);
        ef0 ef0Var3 = ef0.HTTP;
        ii0.OooOOO0(p31VarOooO0O03, IronSourceConstants.EVENTS_PROVIDER);
        linkedHashMapOooo0O0.put(ef0Var3, p31VarOooO0O03);
        ef0 ef0Var4 = ef0.PRE_PROCESS;
        ii0.OooOOO0(p31VarOooO0O04, IronSourceConstants.EVENTS_PROVIDER);
        linkedHashMapOooo0O0.put(ef0Var4, p31VarOooO0O04);
        p31 p31VarOooO0O05 = p31.OooO0O0(new C1940pk(zb0Var6, c2130up.f24681OooO0oO, new s31(linkedHashMapOooo0O0), 13));
        int i2 = x31.f25505OooO0OO;
        List list = Collections.EMPTY_LIST;
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(p31VarOooO0O05);
        this.f24100OooOoO0 = p31.OooO0O0(new sa0(c2130up.f24678OooO0Oo, new C1987qu(new x31(list, arrayList), 23)));
    }

    private final void OooOO0O(Throwable th) {
    }

    public C2051sk(ha1 ha1Var, boolean[] zArr) {
        this.f24097OooOo0O = 18;
        this.f24098OooOo0o = ha1Var;
        this.f24096OooOo = zArr;
        int i = ha1Var.f19674OooO00o;
        this.f24100OooOoO0 = new boolean[i];
        this.f24099OooOoO = new boolean[i];
    }

    public /* synthetic */ C2051sk(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f24097OooOo0O = i;
        this.f24098OooOo0o = obj;
        this.f24096OooOo = obj2;
        this.f24099OooOoO = obj4;
        this.f24100OooOoO0 = obj3;
    }

    public /* synthetic */ C2051sk(Object obj, Object obj2, Object obj3, Object obj4, int i, boolean z) {
        this.f24097OooOo0O = i;
        this.f24098OooOo0o = obj2;
        this.f24096OooOo = obj3;
        this.f24100OooOoO0 = obj4;
        this.f24099OooOoO = obj;
    }

    public C2051sk(OoooOOO.o0O o0o, String str) {
        this.f24097OooOo0O = 3;
        Objects.requireNonNull(o0o);
        this.f24099OooOoO = o0o;
        Oooo00O.o000000O.OooO0o0(str);
        this.f24098OooOo0o = str;
        this.f24096OooOo = new Bundle();
    }

    public C2051sk(Context context, C2129uo c2129uo, C2129uo c2129uo2) {
        this.f24097OooOo0O = 6;
        this.f24098OooOo0o = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f24100OooOoO0 = c2129uo;
        this.f24096OooOo = c2129uo2;
        this.f24099OooOoO = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.ArrayList] */
    public C2051sk(JsonReader jsonReader, C2197wi c2197wi) throws IllegalStateException, JSONException, IOException {
        Bundle bundle;
        Bundle bundle2;
        this.f24097OooOo0O = 13;
        this.f24099OooOoO = c2197wi;
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17849o000oo0O)).booleanValue() && c2197wi != null && (bundle2 = c2197wi.zzm) != null) {
            androidx.datastore.preferences.protobuf.OooO00o.OooOo0O((Oooo0OO.oo000o) zzv.zzC(), bundle2, "server-response-parse-start");
        }
        ?? arrayList = Collections.EMPTY_LIST;
        ArrayList arrayList2 = new ArrayList();
        jsonReader.beginObject();
        md0 md0Var = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if ("responses".equals(strNextName)) {
                jsonReader.beginArray();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    if ("ad_configs".equals(strNextName2)) {
                        arrayList = new ArrayList();
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            arrayList.add(new kd0(jsonReader));
                        }
                        jsonReader.endArray();
                    } else if (strNextName2.equals("common")) {
                        md0Var = new md0(jsonReader);
                        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o000oo0o)).booleanValue() && c2197wi != null && (bundle = c2197wi.zzm) != null) {
                            bundle.putLong("normalize-ad-response-start", md0Var.f21220OooOOoo);
                            c2197wi.zzm.putLong("normalize-ad-response-end", md0Var.f21221OooOo00);
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                jsonReader.endArray();
            } else if (strNextName.equals("actions")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    jsonReader.beginObject();
                    String strNextString = null;
                    JSONObject jSONObjectZzi = null;
                    while (jsonReader.hasNext()) {
                        String strNextName3 = jsonReader.nextName();
                        if ("name".equals(strNextName3)) {
                            strNextString = jsonReader.nextString();
                        } else if ("info".equals(strNextName3)) {
                            jSONObjectZzi = zzbs.zzi(jsonReader);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    if (strNextString != null) {
                        arrayList2.add(new qd0(strNextString, jSONObjectZzi));
                    }
                    jsonReader.endObject();
                }
                jsonReader.endArray();
            }
        }
        this.f24100OooOoO0 = arrayList2;
        this.f24098OooOo0o = arrayList;
        this.f24096OooOo = md0Var == null ? new md0(new JsonReader(new StringReader(JsonUtils.EMPTY_JSON))) : md0Var;
    }

    public C2051sk(oOO0OO0O ooo0oo0o, PriorityBlockingQueue priorityBlockingQueue, C1847n1 c1847n1) {
        this.f24097OooOo0O = 4;
        this.f24098OooOo0o = new HashMap();
        this.f24099OooOoO = c1847n1;
        this.f24096OooOo = ooo0oo0o;
        this.f24100OooOoO0 = priorityBlockingQueue;
    }

    public C2051sk(C2051sk c2051sk, com.google.android.gms.internal.measurement.oo000o oo000oVar) {
        this.f24097OooOo0O = 19;
        this.f24100OooOoO0 = new HashMap();
        this.f24099OooOoO = new HashMap();
        this.f24098OooOo0o = c2051sk;
        this.f24096OooOo = oo000oVar;
    }

    public C2051sk(gn0 gn0Var, ad0 ad0Var, ad0 ad0Var2, ad0 ad0Var3) {
        Object objOooOOOO;
        this.f24097OooOo0O = 14;
        if (gn0Var != null) {
            objOooOOOO = rm0.OooOOOO(gn0Var);
        } else {
            pm0 pm0Var = rm0.f23913OooOo0o;
            objOooOOOO = gn0.f19388OooOoO;
        }
        this.f24098OooOo0o = objOooOOOO;
        this.f24096OooOo = ad0Var;
        this.f24100OooOoO0 = ad0Var2;
        this.f24099OooOoO = ad0Var3;
    }

    public C2051sk(yu0 yu0Var) {
        this.f24097OooOo0O = 17;
        this.f24098OooOo0o = new HashMap(yu0Var.f26027OooO00o);
        this.f24096OooOo = new HashMap(yu0Var.f26028OooO0O0);
        this.f24100OooOoO0 = new HashMap(yu0Var.f26029OooO0OO);
        this.f24099OooOoO = new HashMap(yu0Var.f26030OooO0Oo);
    }

    public C2051sk(SharedPreferences sharedPreferences, Map map) {
        this.f24097OooOo0O = 23;
        this.f24098OooOo0o = o000o0oo.o0OoOo0.valueOf(sharedPreferences.getString("FlutterSecureSAlgorithmKey", "RSA_ECB_PKCS1Padding"));
        this.f24096OooOo = o000o0oo.o00Oo0.valueOf(sharedPreferences.getString("FlutterSecureSAlgorithmStorage", "AES_CBC_PKCS7Padding"));
        Object obj = map.get("keyCipherAlgorithm");
        o000o0oo.o0OoOo0 o0oooo0ValueOf = o000o0oo.o0OoOo0.valueOf(obj != null ? obj.toString() : "RSA_ECB_PKCS1Padding");
        int i = o0oooo0ValueOf.f30983OooOo0o;
        int i2 = Build.VERSION.SDK_INT;
        this.f24100OooOoO0 = i > i2 ? o000o0oo.o0OoOo0.RSA_ECB_PKCS1Padding : o0oooo0ValueOf;
        Object obj2 = map.get("storageCipherAlgorithm");
        o000o0oo.o00Oo0 o00oo0ValueOf = o000o0oo.o00Oo0.valueOf(obj2 != null ? obj2.toString() : "AES_CBC_PKCS7Padding");
        this.f24099OooOoO = o00oo0ValueOf.f30979OooOo0o > i2 ? o000o0oo.o00Oo0.AES_CBC_PKCS7Padding : o00oo0ValueOf;
    }
}
