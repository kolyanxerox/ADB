package o0000o0;

import Oooo0OO.o00oO0o;
import OoooOOO.o0O00000;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.collection.ArrayMap;
import androidx.core.os.UserManagerCompat;
import com.google.android.gms.common.api.internal.OooO0OO;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import o0000oo0.o000000O;
import o0000oo0.o00Oo0;
import o0000oo0.o0OOO0o;
import o0000oo0.oo000o;
import o0000ooO.o0O0OOO0;
import o000OOoO.OooO0o;

/* loaded from: classes2.dex */
public final class Oooo0 {

    /* renamed from: OooOO0O */
    public static final Object f29586OooOO0O = new Object();
    public static final ArrayMap OooOO0o = new ArrayMap();

    /* renamed from: OooO00o */
    public final Context f29588OooO00o;

    /* renamed from: OooO0O0 */
    public final String f29589OooO0O0;

    /* renamed from: OooO0OO */
    public final o0OoOo0 f29590OooO0OO;

    /* renamed from: OooO0Oo */
    public final o0OOO0o f29591OooO0Oo;

    /* renamed from: OooO0oO */
    public final o000000O f29594OooO0oO;

    /* renamed from: OooO0oo */
    public final o000Oo00.OooOOO f29595OooO0oo;

    /* renamed from: OooO0o0 */
    public final AtomicBoolean f29593OooO0o0 = new AtomicBoolean(false);

    /* renamed from: OooO0o */
    public final AtomicBoolean f29592OooO0o = new AtomicBoolean();

    /* renamed from: OooO */
    public final CopyOnWriteArrayList f29587OooO = new CopyOnWriteArrayList();

    /* renamed from: OooOO0 */
    public final CopyOnWriteArrayList f29596OooOO0 = new CopyOnWriteArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.List] */
    public Oooo0(Context context, String str, o0OoOo0 o0oooo0) throws PackageManager.NameNotFoundException {
        ?? arrayList;
        this.f29588OooO00o = context;
        Oooo00O.o000000O.OooO0o0(str);
        this.f29589OooO0O0 = str;
        this.f29590OooO0OO = o0oooo0;
        OooOOO0 oooOOO0 = FirebaseInitProvider.f28147OooOo0O;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList arrayList2 = new ArrayList();
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                Log.w("ComponentDiscovery", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) ComponentDiscoveryService.class), 128);
                if (serviceInfo == null) {
                    Log.w("ComponentDiscovery", ComponentDiscoveryService.class + " has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("ComponentDiscovery", "Application info not found.");
        }
        if (bundle == null) {
            Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList();
            for (String str2 : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str2)) && str2.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str2.substring(31));
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new oo000o((String) it.next(), 0));
        }
        Trace.endSection();
        Trace.beginSection("Runtime");
        o0O0OOO0 o0o0ooo0 = o0O0OOO0.f29724OooOo0O;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        arrayList3.addAll(arrayList2);
        arrayList3.add(new oo000o(new FirebaseCommonRegistrar(), 1));
        arrayList3.add(new oo000o(new ExecutorsRegistrar(), 1));
        arrayList4.add(o00Oo0.OooO0OO(context, Context.class, new Class[0]));
        arrayList4.add(o00Oo0.OooO0OO(this, Oooo0.class, new Class[0]));
        arrayList4.add(o00Oo0.OooO0OO(o0oooo0, o0OoOo0.class, new Class[0]));
        o0O00000 o0o00000 = new o0O00000(21);
        if (UserManagerCompat.isUserUnlocked(context) && FirebaseInitProvider.f28148OooOo0o.get()) {
            arrayList4.add(o00Oo0.OooO0OO(oooOOO0, OooOOO0.class, new Class[0]));
        }
        o0OOO0o o0ooo0o = new o0OOO0o(arrayList3, arrayList4, o0o00000);
        this.f29591OooO0Oo = o0ooo0o;
        Trace.endSection();
        this.f29594OooO0oO = new o000000O(new OooOOOO(0, this, context));
        this.f29595OooO0oo = o0ooo0o.OooO0o0(OooO0o.class);
        OooOo00 oooOo00 = new OooOo00(this);
        OooO00o();
        if (this.f29593OooO0o0.get()) {
            OooO0OO.f16689OooOoO.f16691OooOo0O.get();
        }
        this.f29587OooO.add(oooOo00);
        Trace.endSection();
    }

    public static Oooo0 OooO(Context context, String str, o0OoOo0 o0oooo0) {
        Oooo0 oooo0;
        AtomicReference atomicReference = OooOo.f29584OooO00o;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = OooOo.f29584OooO00o;
            if (atomicReference2.get() == null) {
                OooOo oooOo = new OooOo();
                while (true) {
                    if (atomicReference2.compareAndSet(null, oooOo)) {
                        OooO0OO.OooO0O0(application);
                        OooO0OO.f16689OooOoO.OooO00o(oooOo);
                        break;
                    }
                    if (atomicReference2.get() != null) {
                        break;
                    }
                }
            }
        }
        String strTrim = str.trim();
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f29586OooOO0O) {
            ArrayMap arrayMap = OooOO0o;
            Oooo00O.o000000O.OooOO0O(!arrayMap.containsKey(strTrim), "FirebaseApp name " + strTrim + " already exists!");
            Oooo00O.o000000O.OooO(context, "Application context cannot be null.");
            oooo0 = new Oooo0(context, strTrim, o0oooo0);
            arrayMap.put(strTrim, oooo0);
        }
        oooo0.OooO0oO();
        return oooo0;
    }

    public static ArrayList OooO0OO() {
        ArrayList arrayList = new ArrayList();
        synchronized (f29586OooOO0O) {
            try {
                for (V v : OooOO0o.values()) {
                    v.OooO00o();
                    arrayList.add(v.f29589OooO0O0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Oooo0 OooO0Oo() {
        Oooo0 oooo0;
        synchronized (f29586OooOO0O) {
            try {
                oooo0 = (Oooo0) OooOO0o.get("[DEFAULT]");
                if (oooo0 == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + o00oO0o.OooO0o() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                ((OooO0o) oooo0.f29595OooO0oo.get()).OooO0O0();
            } catch (Throwable th) {
                throw th;
            }
        }
        return oooo0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Oooo0 OooO0o0(String str) {
        Oooo0 oooo0;
        String str2;
        synchronized (f29586OooOO0O) {
            try {
                oooo0 = (Oooo0) OooOO0o.get(str.trim());
                if (oooo0 == null) {
                    ArrayList arrayListOooO0OO = OooO0OO();
                    if (arrayListOooO0OO.isEmpty()) {
                        str2 = "";
                    } else {
                        str2 = "Available app names: " + TextUtils.join(", ", arrayListOooO0OO);
                    }
                    throw new IllegalStateException("FirebaseApp with name " + str + " doesn't exist. " + str2);
                }
                ((OooO0o) oooo0.f29595OooO0oo.get()).OooO0O0();
            } finally {
            }
        }
        return oooo0;
    }

    public static Oooo0 OooO0oo(Context context) {
        synchronized (f29586OooOO0O) {
            try {
                if (OooOO0o.containsKey("[DEFAULT]")) {
                    return OooO0Oo();
                }
                o0OoOo0 o0oooo0OooO00o = o0OoOo0.OooO00o(context);
                if (o0oooo0OooO00o == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return OooO(context, "[DEFAULT]", o0oooo0OooO00o);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void OooO00o() {
        Oooo00O.o000000O.OooOO0O(!this.f29592OooO0o.get(), "FirebaseApp was deleted");
    }

    public final void OooO0O0() {
        if (this.f29592OooO0o.compareAndSet(false, true)) {
            synchronized (f29586OooOO0O) {
                OooOO0o.remove(this.f29589OooO0O0);
            }
            Iterator it = this.f29596OooOO0.iterator();
            while (it.hasNext()) {
                o000o00o.o00oO0o o00oo0o = (o000o00o.o00oO0o) it.next();
                o00oo0o.getClass();
                Log.w("FirebaseSessions", "FirebaseApp instance deleted. Sessions library will stop collecting data.");
                o00oo0o.f30866OooO00o.f30868OooOo0o = false;
            }
        }
    }

    public final String OooO0o() {
        StringBuilder sb = new StringBuilder();
        OooO00o();
        byte[] bytes = this.f29589OooO0O0.getBytes(Charset.defaultCharset());
        sb.append(bytes == null ? null : Base64.encodeToString(bytes, 11));
        sb.append("+");
        OooO00o();
        byte[] bytes2 = this.f29590OooO0OO.f29605OooO0O0.getBytes(Charset.defaultCharset());
        sb.append(bytes2 != null ? Base64.encodeToString(bytes2, 11) : null);
        return sb.toString();
    }

    public final void OooO0oO() {
        HashMap map;
        if (!UserManagerCompat.isUserUnlocked(this.f29588OooO00o)) {
            StringBuilder sb = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            OooO00o();
            sb.append(this.f29589OooO0O0);
            Log.i("FirebaseApp", sb.toString());
            Context context = this.f29588OooO00o;
            AtomicReference atomicReference = Oooo000.f29597OooO0O0;
            if (atomicReference.get() == null) {
                Oooo000 oooo000 = new Oooo000(context);
                while (!atomicReference.compareAndSet(null, oooo000)) {
                    if (atomicReference.get() != null) {
                        return;
                    }
                }
                context.registerReceiver(oooo000, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                return;
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder("Device unlocked: initializing all Firebase APIs for app ");
        OooO00o();
        sb2.append(this.f29589OooO0O0);
        Log.i("FirebaseApp", sb2.toString());
        o0OOO0o o0ooo0o = this.f29591OooO0Oo;
        OooO00o();
        boolean zEquals = "[DEFAULT]".equals(this.f29589OooO0O0);
        AtomicReference atomicReference2 = o0ooo0o.f29685OooOoOO;
        Boolean boolValueOf = Boolean.valueOf(zEquals);
        while (true) {
            if (atomicReference2.compareAndSet(null, boolValueOf)) {
                synchronized (o0ooo0o) {
                    map = new HashMap(o0ooo0o.f29681OooOo0O);
                }
                o0ooo0o.OooO0oO(map, zEquals);
                break;
            } else if (atomicReference2.get() != null) {
                break;
            }
        }
        ((OooO0o) this.f29595OooO0oo.get()).OooO0O0();
    }

    public final boolean OooOO0() {
        boolean z;
        OooO00o();
        o000OoOo.OooOOOO oooOOOO = (o000OoOo.OooOOOO) this.f29594OooO0oO.get();
        synchronized (oooOOOO) {
            z = oooOOOO.f30416OooO0Oo;
        }
        return z;
    }

    public final void OooOO0O(boolean z) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        Iterator it = this.f29587OooO.iterator();
        while (it.hasNext()) {
            Oooo0 oooo0 = ((OooOo00) it.next()).f29585OooO00o;
            if (z) {
                oooo0.getClass();
            } else {
                ((OooO0o) oooo0.f29595OooO0oo.get()).OooO0O0();
            }
        }
    }

    public final void OooOO0o(Boolean bool) {
        OooO00o();
        o000OoOo.OooOOOO oooOOOO = (o000OoOo.OooOOOO) this.f29594OooO0oO.get();
        synchronized (oooOOOO) {
            try {
                if (bool == null) {
                    oooOOOO.f30414OooO0O0.edit().remove("firebase_data_collection_default_enabled").apply();
                    oooOOOO.OooO0O0(oooOOOO.OooO00o());
                } else {
                    boolean zEquals = Boolean.TRUE.equals(bool);
                    oooOOOO.f30414OooO0O0.edit().putBoolean("firebase_data_collection_default_enabled", zEquals).apply();
                    oooOOOO.OooO0O0(zEquals);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Oooo0)) {
            return false;
        }
        Oooo0 oooo0 = (Oooo0) obj;
        oooo0.OooO00o();
        return this.f29589OooO0O0.equals(oooo0.f29589OooO0O0);
    }

    public final int hashCode() {
        return this.f29589OooO0O0.hashCode();
    }

    public final String toString() {
        OooO0oO.OooOOO0 oooOOO0 = new OooO0oO.OooOOO0(this);
        oooOOO0.OooO00o(this.f29589OooO0O0, "name");
        oooOOO0.OooO00o(this.f29590OooO0OO, "options");
        return oooOOO0.toString();
    }
}
