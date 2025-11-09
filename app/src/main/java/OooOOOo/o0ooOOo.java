package OooOOOo;

import OoooOOO.C0001o0;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.internal.ads.BinderC1913ou;
import com.google.android.gms.internal.ads.C1472cv;
import com.google.android.gms.internal.ads.C1521e7;
import com.google.android.gms.internal.ads.C1548ey;
import com.google.android.gms.internal.ads.C1595g7;
import com.google.android.gms.internal.ads.C1619gv;
import com.google.android.gms.internal.ads.C1692iv;
import com.google.android.gms.internal.ads.C2174vw;
import com.google.android.gms.internal.ads.C2247xv;
import com.google.android.gms.internal.ads.InterfaceC1506dt;
import com.google.android.gms.internal.ads.a40;
import com.google.android.gms.internal.ads.cq0;
import com.google.android.gms.internal.ads.ec0;
import com.google.android.gms.internal.ads.fg0;
import com.google.android.gms.internal.ads.i60;
import com.google.android.gms.internal.ads.ii0;
import com.google.android.gms.internal.ads.kd0;
import com.google.android.gms.internal.ads.rd0;
import com.google.android.gms.internal.ads.wp0;
import com.google.android.gms.internal.ads.x70;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import o000O0O0.OooO00o;
import o000O0O0.OooO0OO;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class o0ooOOo {

    /* renamed from: OooO */
    public Object f13429OooO;

    /* renamed from: OooO00o */
    public Object f13430OooO00o;

    /* renamed from: OooO0O0 */
    public Object f13431OooO0O0;

    /* renamed from: OooO0OO */
    public Object f13432OooO0OO;

    /* renamed from: OooO0Oo */
    public Object f13433OooO0Oo;

    /* renamed from: OooO0o */
    public Object f13434OooO0o;

    /* renamed from: OooO0o0 */
    public Object f13435OooO0o0;

    /* renamed from: OooO0oO */
    public Object f13436OooO0oO;

    /* renamed from: OooO0oo */
    public Object f13437OooO0oo;

    public o0ooOOo(rd0 rd0Var, kd0 kd0Var, C1472cv c1472cv, C1619gv c1619gv, ec0 ec0Var, BinderC1913ou binderC1913ou, C2247xv c2247xv, C1692iv c1692iv, C2174vw c2174vw) {
        this.f13431OooO0O0 = rd0Var;
        this.f13432OooO0OO = kd0Var;
        this.f13433OooO0Oo = c1472cv;
        this.f13435OooO0o0 = c1619gv;
        this.f13434OooO0o = ec0Var;
        this.f13436OooO0oO = binderC1913ou;
        this.f13430OooO00o = c2247xv;
        this.f13437OooO0oo = c1692iv;
        this.f13429OooO = c2174vw;
    }

    public static void OooO0OO(String str, JSONObject jSONObject) {
        StringBuilder sbOooOo0O = OooO0oO.OooOo.OooOo0O(str);
        sbOooOo0O.append(jSONObject.toString());
        String string = sbOooOo0O.toString();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", string, null);
        }
    }

    public OooO0OO OooO00o(int i) {
        OooO0OO oooO0OO = null;
        try {
            if (!OooOOo.OooOOO.OooO00o(2, i)) {
                JSONObject jSONObjectOooO0O0 = ((OooO00o) this.f13434OooO0o).OooO0O0();
                if (jSONObjectOooO0O0 != null) {
                    OooO0OO OooO0OO2 = ((o000Ooo0.OooOO0) this.f13433OooO0Oo).OooO0OO(jSONObjectOooO0O0);
                    OooO0OO("Loaded cached settings: ", jSONObjectOooO0O0);
                    ((C0001o0) this.f13435OooO0o0).getClass();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (OooOOo.OooOOO.OooO00o(3, i) || OooO0OO2.f30121OooO0OO >= jCurrentTimeMillis) {
                        try {
                            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                Log.v("FirebaseCrashlytics", "Returning cached settings.", null);
                            }
                            return OooO0OO2;
                        } catch (Exception e) {
                            e = e;
                            oooO0OO = OooO0OO2;
                            Log.e("FirebaseCrashlytics", "Failed to get cached settings", e);
                            return oooO0OO;
                        }
                    }
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Cached settings have expired.", null);
                        return null;
                    }
                } else if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "No cached settings data found.", null);
                }
            }
            return null;
        } catch (Exception e2) {
            e = e2;
        }
    }

    public OooO0OO OooO0O0() {
        return (OooO0OO) ((AtomicReference) this.f13437OooO0oo).get();
    }

    public LinkedHashMap OooO0Oo(LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2) {
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(linkedHashMap);
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            String str3 = (String) linkedHashMap3.get(str);
            C1521e7 c1521e7 = (C1521e7) ((HashMap) this.f13433OooO0Oo).get(str);
            if (c1521e7 == null) {
                c1521e7 = C1521e7.f18507OooO0O0;
            }
            linkedHashMap3.put(str, c1521e7.OooO00o(str3, str2));
        }
        return linkedHashMap3;
    }

    public void OooO0o(LinkedHashMap linkedHashMap, C1595g7 c1595g7) {
        Uri.Builder builderBuildUpon = Uri.parse((String) this.f13430OooO00o).buildUpon();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        String string = builderBuildUpon.build().toString();
        if (c1595g7 != null) {
            StringBuilder sb = new StringBuilder(string);
            String str = c1595g7.f19246OooOo0o;
            if (!TextUtils.isEmpty(str)) {
                sb.append("&it=");
                sb.append(str);
            }
            String str2 = c1595g7.f19244OooOo;
            if (!TextUtils.isEmpty(str2)) {
                sb.append("&blat=");
                sb.append(str2);
            }
            string = sb.toString();
        }
        if (!((AtomicBoolean) this.f13437OooO0oo).get()) {
            zzv.zzq();
            zzs.zzM((Context) this.f13435OooO0o0, (String) this.f13434OooO0o, string);
            return;
        }
        File file = (File) this.f13429OooO;
        if (file == null) {
            zzo.zzj("CsiReporter: File doesn't exist. Cannot write CSI data to file.");
            return;
        }
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, true);
                try {
                    fileOutputStream2.write(string.getBytes());
                    fileOutputStream2.write(10);
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e) {
                        zzo.zzk("CsiReporter: Cannot close file: sdk_csi_data.txt.", e);
                    }
                } catch (IOException e2) {
                    e = e2;
                    fileOutputStream = fileOutputStream2;
                    zzo.zzk("CsiReporter: Cannot write to file: sdk_csi_data.txt.", e);
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e3) {
                            zzo.zzk("CsiReporter: Cannot close file: sdk_csi_data.txt.", e3);
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e4) {
                            zzo.zzk("CsiReporter: Cannot close file: sdk_csi_data.txt.", e4);
                        }
                    }
                    throw th;
                }
            } catch (IOException e5) {
                e = e5;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public void OooO0o0(kd0 kd0Var) {
        o00000oO.OooOOO oooOOOOoooo00;
        synchronized (this) {
            Iterator it = kd0Var.f20487OooO00o.iterator();
            while (true) {
                if (!it.hasNext()) {
                    oooOOOOoooo00 = ii0.Ooooo00(new a40(3));
                    break;
                }
                i60 i60VarOooO00o = ((InterfaceC1506dt) this.f13433OooO0Oo).OooO00o(kd0Var.f20488OooO0O0, (String) it.next());
                if (i60VarOooO00o != null && i60VarOooO00o.OooO00o((rd0) this.f13429OooO, kd0Var)) {
                    oooOOOOoooo00 = ii0.o00Oo0(i60VarOooO00o.OooO0O0((rd0) this.f13429OooO, kd0Var), kd0Var.f20527OoooO0, TimeUnit.MILLISECONDS, (ScheduledExecutorService) this.f13432OooO0OO);
                    break;
                }
            }
        }
        ((x70) this.f13435OooO0o0).OooO00o((rd0) this.f13429OooO, kd0Var, oooOOOOoooo00, (fg0) this.f13434OooO0o);
        oooOOOOoooo00.addListener(new wp0(0, oooOOOOoooo00, new C1548ey(this, false, kd0Var, 15)), (cq0) this.f13431OooO0O0);
    }

    public o0ooOOo() {
        this.f13431OooO0O0 = new ArrayBlockingQueue(100);
        this.f13432OooO0OO = new LinkedHashMap();
        this.f13433OooO0Oo = new HashMap();
        this.f13436OooO0oO = new HashSet(Arrays.asList("noop", "activeViewPingSent", "viewabilityChanged", "visibilityChanged"));
    }
}
