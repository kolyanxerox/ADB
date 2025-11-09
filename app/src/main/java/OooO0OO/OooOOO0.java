package OooO0oO;

import OooOOo0.o0Oo0oo;
import OooOOoo.o0000O;
import OooOOoo.o0000OO0;
import OooOo.OooO00o;
import OooOooo.o000O0;
import OooOooo.o000O0Oo;
import Oooo00O.o000000O;
import OoooO0O.o00000O;
import OoooO0O.o00000O0;
import OoooO0O.o000O0o;
import OoooO0O.o000Oo0;
import OoooO0O.o00oOoo;
import OoooO0O.o0O0ooO;
import OoooOOO.o0O;
import OoooOOO.o0O00000;
import OoooOOO.o0O000O;
import OoooOOO.o0O0O0o0;
import OoooOOO.o0OO00o0;
import OoooOOO.o0OO0oO0;
import OoooOOO.oO000O0;
import OoooOOO.oO0O0O00;
import OoooOOO.oO0O0OoO;
import OoooOOO.oOo0o0oO;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import androidx.webkit.internal.OooO0O0;
import com.github.superadb.R;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.play_billing.C2360o;
import com.google.android.gms.internal.play_billing.o0OOO0;
import com.google.android.gms.internal.play_billing.o0OOOO00;
import com.google.android.gms.internal.play_billing.oO00000;
import com.google.android.gms.internal.play_billing.oO000O0O;
import com.google.android.gms.internal.play_billing.oO000OOo;
import com.google.android.gms.internal.play_billing.oO0Oo0oo;
import com.google.android.gms.internal.play_billing.oO0Ooooo;
import com.google.android.gms.internal.play_billing.oOO00O;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.ump.ConsentForm;
import com.google.android.ump.UserMessagingPlatform;
import com.ironsource.C3034d9;
import java.io.FileWriter;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
import o00000oo.o0ooOOo;
import o0000oOO.o0O00;
import o000Ooo.o00O0O;
import o000Ooo.o00oO0o;
import o00O00oO.o0000O0;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class OooOOO0 implements OooOo00, o0000O, AppSetIdClient, UserMessagingPlatform.OnConsentFormLoadSuccessListener, o00oOoo, OnCompleteListener, SuccessContinuation, o000O0o0.OooOO0 {

    /* renamed from: OooOo */
    public Object f13278OooOo;

    /* renamed from: OooOo0O */
    public final /* synthetic */ int f13279OooOo0O;

    /* renamed from: OooOo0o */
    public Object f13280OooOo0o;

    public /* synthetic */ OooOOO0(int i, Object obj, Object obj2) {
        this.f13279OooOo0O = i;
        this.f13280OooOo0o = obj2;
        this.f13278OooOo = obj;
    }

    public void OooO(boolean z, Status status) {
        HashMap map;
        HashMap map2;
        synchronized (((Map) this.f13280OooOo0o)) {
            map = new HashMap((Map) this.f13280OooOo0o);
        }
        synchronized (((Map) this.f13278OooOo)) {
            map2 = new HashMap((Map) this.f13278OooOo);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                entry.getKey().getClass();
                throw new ClassCastException();
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((TaskCompletionSource) entry2.getKey()).trySetException(new Oooo000.OooO0o(status));
            }
        }
    }

    public void OooO00o(Object obj, String str) {
        ((ArrayList) this.f13280OooOo0o).add(OooOo.OooOoo(str, C3034d9.i.f8173b, String.valueOf(obj)));
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.datatransport.cct.CctBackendFactory OooO0O0(java.lang.String r14) throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            Method dump skipped, instructions count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: OooO0oO.OooOOO0.OooO0O0(java.lang.String):com.google.android.datatransport.cct.CctBackendFactory");
    }

    public String OooO0OO(String str) {
        String str2 = (String) this.f13278OooOo;
        Resources resources = (Resources) this.f13280OooOo0o;
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    public void OooO0Oo(Throwable th) {
        oO0O0OoO oo0o0ooo = (oO0O0OoO) this.f13278OooOo;
        oo0o0ooo.OooOO0O();
        oo0o0ooo.f14731OooOooO = false;
        o0OO0oO0 o0oo0oo0 = (o0OO0oO0) oo0o0ooo.f14574OooOo0O;
        int i = 2;
        if (o0oo0oo0.f14519OooOoO0.OooOo0(null, o0O000O.f14296o0000O0)) {
            String message = th.getMessage();
            oo0o0ooo.f14734Oooo0 = false;
            if (message != null) {
                if ((th instanceof IllegalStateException) || message.contains("garbage collected") || th.getClass().getSimpleName().equals("ServiceUnavailableException")) {
                    if (message.contains("Background")) {
                        oo0o0ooo.f14734Oooo0 = true;
                    }
                    i = 1;
                } else if ((th instanceof SecurityException) && !message.endsWith("READ_DEVICE_CONFIG")) {
                    i = 3;
                }
            }
        }
        int i2 = i - 1;
        oOo0o0oO ooo0o0oo = (oOo0o0oO) this.f13280OooOo0o;
        o0O0O0o0 o0o0o0o0 = o0oo0oo0.f14520OooOoOO;
        if (i2 == 0) {
            o0OO0oO0.OooOOO0(o0o0o0o0);
            o0o0o0o0.f14396OooOooO.OooO0Oo(o0O0O0o0.OooOOoo(o0oo0oo0.OooOOo().OooOOo0()), "registerTriggerAsync failed with retriable error. Will try later. App ID, throwable", o0O0O0o0.OooOOoo(th.toString()));
            oo0o0ooo.f14732OooOooo = 1;
            oo0o0ooo.Oooo0().add(ooo0o0oo);
            return;
        }
        if (i2 != 1) {
            o0OO0oO0.OooOOO0(o0o0o0o0);
            o0o0o0o0.f14393OooOoOO.OooO0Oo(o0O0O0o0.OooOOoo(o0oo0oo0.OooOOo().OooOOo0()), "registerTriggerAsync failed. Dropping URI. App ID, Throwable", th);
            OooOO0();
            oo0o0ooo.f14732OooOooo = 1;
            oo0o0ooo.Oooo0O0();
            return;
        }
        oo0o0ooo.Oooo0().add(ooo0o0oo);
        if (oo0o0ooo.f14732OooOooo > ((Integer) o0O000O.o0ooOoO.OooO00o(null)).intValue()) {
            oo0o0ooo.f14732OooOooo = 1;
            o0OO0oO0.OooOOO0(o0o0o0o0);
            o0o0o0o0.f14396OooOooO.OooO0Oo(o0O0O0o0.OooOOoo(o0oo0oo0.OooOOo().OooOOo0()), "registerTriggerAsync failed. May try later. App ID, throwable", o0O0O0o0.OooOOoo(th.toString()));
            return;
        }
        o0OO0oO0.OooOOO0(o0o0o0o0);
        o0o0o0o0.f14396OooOooO.OooO0o0("registerTriggerAsync failed. App ID, delay in seconds, throwable", o0O0O0o0.OooOOoo(o0oo0oo0.OooOOo().OooOOo0()), o0O0O0o0.OooOOoo(String.valueOf(oo0o0ooo.f14732OooOooo)), o0O0O0o0.OooOOoo(th.toString()));
        int i3 = oo0o0ooo.f14732OooOooo;
        if (oo0o0ooo.f14735Oooo000 == null) {
            oo0o0ooo.f14735Oooo000 = new oO000O0(oo0o0ooo, o0oo0oo0, 1);
        }
        oo0o0ooo.f14735Oooo000.OooO0O0(i3 * 1000);
        int i4 = oo0o0ooo.f14732OooOooo;
        oo0o0ooo.f14732OooOooo = i4 + i4;
    }

    @Override // o000O0o0.OooOO0
    public StackTraceElement[] OooO0o(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        o000O0o0.OooOO0[] oooOO0Arr = (o000O0o0.OooOO0[]) this.f13280OooOo0o;
        StackTraceElement[] stackTraceElementArrOooO0o = stackTraceElementArr;
        for (int i = 0; i < 1; i++) {
            o000O0o0.OooOO0 oooOO0 = oooOO0Arr[i];
            if (stackTraceElementArrOooO0o.length <= 1024) {
                break;
            }
            stackTraceElementArrOooO0o = oooOO0.OooO0o(stackTraceElementArr);
        }
        return stackTraceElementArrOooO0o.length > 1024 ? ((o0O00000) this.f13278OooOo).OooO0o(stackTraceElementArrOooO0o) : stackTraceElementArrOooO0o;
    }

    public void OooO0o0(int i, Bundle bundle) {
        Locale locale = Locale.US;
        String str = "Analytics listener received message. ID: " + i + ", Extras: " + bundle;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str, null);
        }
        String string = bundle.getString("name");
        if (string != null) {
            Bundle bundle2 = bundle.getBundle("params");
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            o000OoO.OooOo00 oooOo00 = "clx".equals(bundle2.getString("_o")) ? (o000OOO.OooOO0O) this.f13280OooOo0o : (o000Ooo0.OooOO0) this.f13278OooOo;
            if (oooOo00 == null) {
                return;
            }
            oooOo00.onEvent(string, bundle2);
        }
    }

    public void OooO0oO(o000OO.OooOo oooOo) throws GeneralSecurityException {
        o000OO.Oooo0 oooo0 = new o000OO.Oooo0(oooOo.f30171OooO00o, o0000O.OooOO0O.class);
        HashMap map = (HashMap) this.f13280OooOo0o;
        if (!map.containsKey(oooo0)) {
            map.put(oooo0, oooOo);
            return;
        }
        o000OO.OooOo oooOo2 = (o000OO.OooOo) map.get(oooo0);
        if (oooOo2.equals(oooOo) && oooOo.equals(oooOo2)) {
            return;
        }
        throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: " + oooo0);
    }

    public void OooO0oo(o0ooOOo o0ooooo) throws GeneralSecurityException {
        if (o0ooooo == null) {
            throw new NullPointerException("wrapper must be non-null");
        }
        Class clsOooO0OO = o0ooooo.OooO0OO();
        HashMap map = (HashMap) this.f13278OooOo;
        if (!map.containsKey(clsOooO0OO)) {
            map.put(clsOooO0OO, o0ooooo);
            return;
        }
        o0ooOOo o0ooooo2 = (o0ooOOo) map.get(clsOooO0OO);
        if (o0ooooo2.equals(o0ooooo) && o0ooooo.equals(o0ooooo2)) {
            return;
        }
        throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type" + clsOooO0OO);
    }

    public void OooOO0() {
        o0OO0oO0 o0oo0oo0 = (o0OO0oO0) ((oO0O0OoO) this.f13278OooOo).f14574OooOo0O;
        o0O o0o = o0oo0oo0.f14518OooOoO;
        o0OO0oO0.OooOO0O(o0o);
        SparseArray sparseArrayOooOOo0 = o0o.OooOOo0();
        oOo0o0oO ooo0o0oo = (oOo0o0oO) this.f13280OooOo0o;
        sparseArrayOooOOo0.put(ooo0o0oo.zzc, Long.valueOf(ooo0o0oo.zzb));
        o0O o0o2 = o0oo0oo0.f14518OooOoO;
        o0OO0oO0.OooOO0O(o0o2);
        int[] iArr = new int[sparseArrayOooOOo0.size()];
        long[] jArr = new long[sparseArrayOooOOo0.size()];
        for (int i = 0; i < sparseArrayOooOOo0.size(); i++) {
            iArr[i] = sparseArrayOooOOo0.keyAt(i);
            jArr[i] = ((Long) sparseArrayOooOOo0.valueAt(i)).longValue();
        }
        Bundle bundle = new Bundle();
        bundle.putIntArray("uriSources", iArr);
        bundle.putLongArray("uriTimestamps", jArr);
        o0o2.f14192Oooo0.OooOOO(bundle);
    }

    public void OooOO0O(o0OOO0 o0ooo0) {
        if (o0ooo0 == null) {
            return;
        }
        try {
            oO000O0O oo000o0oOooOOoo = oO0Ooooo.OooOOoo();
            oO00000 oo00000 = (oO00000) this.f13280OooOo0o;
            oo000o0oOooOOoo.OooO0Oo();
            oO0Ooooo.OooOOOo((oO0Ooooo) oo000o0oOooOOoo.f27076OooOo0o, oo00000);
            oo000o0oOooOOoo.OooO0Oo();
            oO0Ooooo.OooOOO((oO0Ooooo) oo000o0oOooOOoo.f27076OooOo0o, o0ooo0);
            ((Oooo000) this.f13278OooOo).OooO0oO((oO0Ooooo) oo000o0oOooOOoo.OooO0O0());
        } catch (Throwable th) {
            oOO00O.OooO("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // OoooO0O.o00O000
    /* renamed from: OooOO0o */
    public o00000O0 zza() {
        o00000O o00000o = (o00000O) ((o0O0ooO) this.f13280OooOo0o).zza();
        Handler handler = o000O0o.f13967OooO00o;
        o000Oo0.OooO0OO(handler);
        return new o00000O0(o00000o, handler, ((o000OO.o0OoOo0) this.f13278OooOo).OooO0OO());
    }

    public void OooOOO(o0OOOO00 o0oooo00) {
        if (o0oooo00 == null) {
            return;
        }
        try {
            oO000O0O oo000o0oOooOOoo = oO0Ooooo.OooOOoo();
            oO00000 oo00000 = (oO00000) this.f13280OooOo0o;
            oo000o0oOooOOoo.OooO0Oo();
            oO0Ooooo.OooOOOo((oO0Ooooo) oo000o0oOooOOoo.f27076OooOo0o, oo00000);
            oo000o0oOooOOoo.OooO0Oo();
            oO0Ooooo.OooOOOO((oO0Ooooo) oo000o0oOooOOoo.f27076OooOo0o, o0oooo00);
            ((Oooo000) this.f13278OooOo).OooO0oO((oO0Ooooo) oo000o0oOooOOoo.OooO0O0());
        } catch (Throwable th) {
            oOO00O.OooO("BillingLogger", "Unable to log.", th);
        }
    }

    public void OooOOO0(o0OOO0 o0ooo0, int i) {
        try {
            C2360o c2360o = (C2360o) ((oO00000) this.f13280OooOo0o).OooO0oO();
            c2360o.OooO0Oo();
            oO00000.OooOOO((oO00000) c2360o.f27076OooOo0o, i);
            this.f13280OooOo0o = (oO00000) c2360o.OooO0O0();
            OooOO0O(o0ooo0);
        } catch (Throwable th) {
            oOO00O.OooO("BillingLogger", "Unable to log.", th);
        }
    }

    public void OooOOOO(oO0Oo0oo oo0oo0oo) {
        try {
            Oooo000 oooo000 = (Oooo000) this.f13278OooOo;
            oO000O0O oo000o0oOooOOoo = oO0Ooooo.OooOOoo();
            oO00000 oo00000 = (oO00000) this.f13280OooOo0o;
            oo000o0oOooOOoo.OooO0Oo();
            oO0Ooooo.OooOOOo((oO0Ooooo) oo000o0oOooOOoo.f27076OooOo0o, oo00000);
            oo000o0oOooOOoo.OooO0Oo();
            oO0Ooooo.OooOOo0((oO0Ooooo) oo000o0oOooOOoo.f27076OooOo0o, oo0oo0oo);
            oooo000.OooO0oO((oO0Ooooo) oo000o0oOooOOoo.OooO0O0());
        } catch (Throwable th) {
            oOO00O.OooO("BillingLogger", "Unable to log.", th);
        }
    }

    public void OooOOOo(oO000OOo oo000ooo) {
        if (oo000ooo == null) {
            return;
        }
        try {
            oO000O0O oo000o0oOooOOoo = oO0Ooooo.OooOOoo();
            oO00000 oo00000 = (oO00000) this.f13280OooOo0o;
            oo000o0oOooOOoo.OooO0Oo();
            oO0Ooooo.OooOOOo((oO0Ooooo) oo000o0oOooOOoo.f27076OooOo0o, oo00000);
            oo000o0oOooOOoo.OooO0Oo();
            oO0Ooooo.OooOOo((oO0Ooooo) oo000o0oOooOOoo.f27076OooOo0o, oo000ooo);
            ((Oooo000) this.f13278OooOo).OooO0oO((oO0Ooooo) oo000o0oOooOOoo.OooO0O0());
        } catch (Throwable th) {
            oOO00O.OooO("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // o00O00oO.o0000O0
    public Object get() {
        switch (this.f13279OooOo0O) {
            case 4:
                return new OooOOo.Oooo000((Context) ((o0000OO0) this.f13280OooOo0o).f13531OooOo0o, (OooOOo.OooOo00) ((OooOOo.OooOo) this.f13278OooOo).get());
            default:
                return new OooOo.OooOo(new o000OOoO.OooO(4), new o000000.OooO(4), OooO00o.f13539OooO0o, (OooOo.Oooo0) ((OooOOo.OooOo) this.f13280OooOo0o).get(), (o0000O0) this.f13278OooOo);
        }
    }

    @Override // com.google.android.gms.appset.AppSetIdClient
    public Task getAppSetIdInfo() {
        return ((Oooo.Oooo0) this.f13280OooOo0o).getAppSetIdInfo().continueWithTask(new o000Ooo0.OooOO0(this, 2));
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        ((Map) ((OooOOO0) this.f13278OooOo).f13278OooOo).remove((TaskCompletionSource) this.f13280OooOo0o);
    }

    @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadSuccessListener
    public void onConsentFormLoadSuccess(ConsentForm consentForm) {
        consentForm.show((Activity) this.f13280OooOo0o, (ConsentForm.OnConsentFormDismissedListener) this.f13278OooOo);
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) throws Throwable {
        FileWriter fileWriter;
        JSONObject jSONObject = (JSONObject) ((o000O0O.OooO) this.f13280OooOo0o).f30101OooO0OO.f30104OooOo0O.submit(new OooO0O0(this, 2)).get();
        FileWriter fileWriter2 = null;
        if (jSONObject != null) {
            OooOOOo.o0ooOOo o0ooooo = (OooOOOo.o0ooOOo) this.f13278OooOo;
            o000O0O0.OooO0OO OooO0OO2 = ((o000Ooo0.OooOO0) o0ooooo.f13433OooO0Oo).OooO0OO(jSONObject);
            long j = OooO0OO2.f30121OooO0OO;
            o000O0O0.OooO00o oooO00o = (o000O0O0.OooO00o) o0ooooo.f13434OooO0o;
            oooO00o.getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Writing settings to cache file...", null);
            }
            try {
                jSONObject.put("expires_at", j);
                fileWriter = new FileWriter(oooO00o.f30116OooOo0O);
            } catch (Exception e) {
                e = e;
                fileWriter = null;
            } catch (Throwable th) {
                th = th;
                o00O0O.OooO0O0(fileWriter2, "Failed to close settings writer.");
                throw th;
            }
            try {
                try {
                    fileWriter.write(jSONObject.toString());
                    fileWriter.flush();
                } catch (Throwable th2) {
                    th = th2;
                    fileWriter2 = fileWriter;
                    o00O0O.OooO0O0(fileWriter2, "Failed to close settings writer.");
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                Log.e("FirebaseCrashlytics", "Failed to cache settings", e);
                o00O0O.OooO0O0(fileWriter, "Failed to close settings writer.");
                OooOOOo.o0ooOOo.OooO0OO("Loaded settings: ", jSONObject);
                String str = ((o000O0O0.OooO) o0ooooo.f13432OooO0OO).f30112OooO0o;
                SharedPreferences.Editor editorEdit = ((Context) o0ooooo.f13431OooO0O0).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                editorEdit.putString("existing_instance_identifier", str);
                editorEdit.apply();
                ((AtomicReference) o0ooooo.f13437OooO0oo).set(OooO0OO2);
                ((TaskCompletionSource) ((AtomicReference) o0ooooo.f13429OooO).get()).trySetResult(OooO0OO2);
                return Tasks.forResult(null);
            }
            o00O0O.OooO0O0(fileWriter, "Failed to close settings writer.");
            OooOOOo.o0ooOOo.OooO0OO("Loaded settings: ", jSONObject);
            String str2 = ((o000O0O0.OooO) o0ooooo.f13432OooO0OO).f30112OooO0o;
            SharedPreferences.Editor editorEdit2 = ((Context) o0ooooo.f13431OooO0O0).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
            editorEdit2.putString("existing_instance_identifier", str2);
            editorEdit2.apply();
            ((AtomicReference) o0ooooo.f13437OooO0oo).set(OooO0OO2);
            ((TaskCompletionSource) ((AtomicReference) o0ooooo.f13429OooO).get()).trySetResult(OooO0OO2);
        }
        return Tasks.forResult(null);
    }

    public String toString() {
        switch (this.f13279OooOo0O) {
            case 8:
                StringBuilder sb = new StringBuilder(100);
                sb.append(this.f13278OooOo.getClass().getSimpleName());
                sb.append('{');
                ArrayList arrayList = (ArrayList) this.f13280OooOo0o;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    sb.append((String) arrayList.get(i));
                    if (i < size - 1) {
                        sb.append(", ");
                    }
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ OooOOO0(int i, boolean z) {
        this.f13279OooOo0O = i;
    }

    public OooOOO0(Context context, int i) {
        Oooo.OooOo00 oooOo00;
        this.f13279OooOo0O = i;
        switch (i) {
            case 9:
                o000000O.OooO0oo(context);
                Resources resources = context.getResources();
                this.f13280OooOo0o = resources;
                this.f13278OooOo = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
                return;
            default:
                this.f13280OooOo0o = new Oooo.Oooo0(context, o000O0Oo.f13671OooO0O0);
                synchronized (Oooo.OooOo00.class) {
                    try {
                        if (Oooo.OooOo00.f13708OooOoO == null) {
                            Oooo.OooOo00.f13708OooOoO = new Oooo.OooOo00(context.getApplicationContext(), 0);
                        }
                        oooOo00 = Oooo.OooOo00.f13708OooOoO;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                this.f13278OooOo = oooOo00;
                return;
        }
    }

    public /* synthetic */ OooOOO0(Context context, int i, boolean z) {
        this.f13279OooOo0O = i;
        this.f13278OooOo = null;
        this.f13280OooOo0o = context;
    }

    public /* synthetic */ OooOOO0(Object obj, boolean z, Object obj2, int i) {
        this.f13279OooOo0O = i;
        this.f13280OooOo0o = obj;
        this.f13278OooOo = obj2;
    }

    public OooOOO0(o0OO00o0 o0oo00o0, String str) {
        this.f13279OooOo0O = 14;
        this.f13280OooOo0o = str;
        Objects.requireNonNull(o0oo00o0);
        this.f13278OooOo = o0oo00o0;
    }

    public OooOOO0(oO0O0OoO oo0o0ooo, oOo0o0oO ooo0o0oo) {
        this.f13279OooOo0O = 15;
        this.f13280OooOo0o = ooo0o0oo;
        Objects.requireNonNull(oo0o0ooo);
        this.f13278OooOo = oo0o0ooo;
    }

    public OooOOO0(oO0O0O00 oo0o0o00) {
        this.f13279OooOo0O = 16;
        Objects.requireNonNull(oo0o0o00);
        this.f13278OooOo = oo0o0o00;
    }

    public OooOOO0(Context context, oO00000 oo00000) {
        this.f13279OooOo0O = 1;
        Oooo000 oooo000 = new Oooo000();
        try {
            o0Oo0oo.OooO0O0(context);
            oooo000.f13287OooOo0o = o0Oo0oo.OooO00o().OooO0OO(OooOOOO.OooO00o.f13324OooO0o0).OooO00o("PLAY_BILLING_LIBRARY", new OooOOO.OooO0O0("proto"), new OooOOO.OooO0o() { // from class: com.android.billingclient.api.zzcm
                @Override // OooOOO.OooO0o
                public final Object apply(Object obj) {
                    return ((oO0Ooooo) obj).OooO0O0();
                }
            });
        } catch (Throwable unused) {
            oooo000.f13286OooOo0O = true;
        }
        this.f13278OooOo = oooo000;
        this.f13280OooOo0o = oo00000;
    }

    public OooOOO0(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.o0000OO0 o0000oo02) {
        this.f13279OooOo0O = 17;
        Objects.requireNonNull(appMeasurementDynamiteService);
        this.f13278OooOo = appMeasurementDynamiteService;
        this.f13280OooOo0o = o0000oo02;
    }

    public /* synthetic */ OooOOO0(Object obj) {
        this.f13279OooOo0O = 8;
        this.f13278OooOo = obj;
        this.f13280OooOo0o = new ArrayList();
    }

    public OooOOO0(String str, com.google.android.gms.internal.measurement.o0OOO0 o0ooo0, o000OOoO.OooO oooO) {
        this.f13279OooOo0O = 7;
        this.f13278OooOo = str;
        this.f13280OooOo0o = o0ooo0;
    }

    public OooOOO0(o00oO0o o00oo0o, OooOOO0 oooOOO0) {
        this.f13279OooOo0O = 25;
        this.f13278OooOo = oooOOO0;
        o00oo0o.OooO0o(new o0O00(this));
        this.f13280OooOo0o = new HashSet();
    }

    public OooOOO0(int i) {
        this.f13279OooOo0O = i;
        switch (i) {
            case 19:
                this.f13280OooOo0o = Collections.synchronizedMap(new WeakHashMap());
                this.f13278OooOo = Collections.synchronizedMap(new WeakHashMap());
                break;
            case 21:
                this.f13280OooOo0o = new Rect();
                this.f13278OooOo = new Rect();
                break;
            case 29:
                this.f13280OooOo0o = new HashMap();
                this.f13278OooOo = new HashMap();
                break;
            default:
                o000O0 o000o0 = o000O0.f13666OooO0Oo;
                this.f13280OooOo0o = new SparseIntArray();
                this.f13278OooOo = o000o0;
                break;
        }
    }

    public OooOOO0(o000O0o0.OooOO0[] oooOO0Arr) {
        this.f13279OooOo0O = 28;
        this.f13280OooOo0o = oooOO0Arr;
        this.f13278OooOo = new o0O00000(17);
    }

    public OooOOO0(o000OO.o000oOoO o000oooo2) {
        this.f13279OooOo0O = 29;
        this.f13280OooOo0o = new HashMap(o000oooo2.f30176OooO00o);
        this.f13278OooOo = new HashMap(o000oooo2.f30177OooO0O0);
    }
}
