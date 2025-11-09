package o000Ooo;

import OooO0oO.OooOOO0;
import OooOo0O.OooO0O0;
import OoooO0O.o0000O;
import OoooOOO.o0O00000;
import OoooOOO.o0O0oo00;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.NavigableSet;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicMarkableReference;
import o000O00.o0000O0;
import o000O00.o0000O00;
import o000O00.o00O00;
import o000O00.o00O00O;
import o000O00.o00O00OO;
import o000O00.o00oOoo;
import o000O00.o0oOO;
import o000O00.oOO00O;
import o000O000.OooO00o;
import o000O000.OooO0OO;
import o000O0O.OooO;
import o000O0Oo.OooO0o;
import o000Oo0.OooOO0;
import o000Oo0O.OooOo00;

/* loaded from: classes2.dex */
public final class o0OOO0o {

    /* renamed from: OooO */
    public final OooOO0 f30497OooO;

    /* renamed from: OooO00o */
    public final Context f30498OooO00o;

    /* renamed from: OooO0O0 */
    public final o00000O0 f30499OooO0O0;

    /* renamed from: OooO0OO */
    public final OooOo00 f30500OooO0OO;

    /* renamed from: OooO0Oo */
    public final OooO0o f30501OooO0Oo;

    /* renamed from: OooO0o */
    public final o0000Ooo f30502OooO0o;

    /* renamed from: OooO0o0 */
    public final OooO f30503OooO0o0;

    /* renamed from: OooO0oO */
    public final OooO0o f30504OooO0oO;

    /* renamed from: OooO0oo */
    public final OoooO0O.o00Ooo f30505OooO0oo;

    /* renamed from: OooOO0 */
    public final OooO00o f30506OooOO0;

    /* renamed from: OooOO0O */
    public final o000.OooO00o f30507OooOO0O;
    public final o00Ooo OooOO0o;

    /* renamed from: OooOOO */
    public o00000 f30508OooOOO;

    /* renamed from: OooOOO0 */
    public final OooO0o f30509OooOOO0;

    /* renamed from: OooOo00 */
    public static final o000O0Oo.OooO00o f30496OooOo00 = new o000O0Oo.OooO00o(3);
    public static final Charset OooOo0 = Charset.forName("UTF-8");

    /* renamed from: OooOOOO */
    public OooOOOo.o0ooOOo f30510OooOOOO = null;

    /* renamed from: OooOOOo */
    public final TaskCompletionSource f30511OooOOOo = new TaskCompletionSource();

    /* renamed from: OooOOo0 */
    public final TaskCompletionSource f30513OooOOo0 = new TaskCompletionSource();

    /* renamed from: OooOOo */
    public final TaskCompletionSource f30512OooOOo = new TaskCompletionSource();

    /* renamed from: OooOOoo */
    public final AtomicBoolean f30514OooOOoo = new AtomicBoolean(false);

    public o0OOO0o(Context context, o0000Ooo o0000ooo, o00000O0 o00000o02, OooO0o oooO0o, OooOo00 oooOo00, OoooO0O.o00Ooo o00ooo2, OooO0o oooO0o2, OooOO0 oooOO0, OooO0o oooO0o3, OooO00o oooO00o, o000.OooO00o oooO00o2, o00Ooo o00ooo3, OooO oooO) {
        this.f30498OooO00o = context;
        this.f30502OooO0o = o0000ooo;
        this.f30499OooO0O0 = o00000o02;
        this.f30504OooO0oO = oooO0o;
        this.f30500OooO0OO = oooOo00;
        this.f30505OooO0oo = o00ooo2;
        this.f30501OooO0Oo = oooO0o2;
        this.f30497OooO = oooOO0;
        this.f30506OooOO0 = oooO00o;
        this.f30507OooOO0O = oooO00o2;
        this.OooOO0o = o00ooo3;
        this.f30509OooOOO0 = oooO0o3;
        this.f30503OooO0o0 = oooO;
    }

    public static Task OooO00o(o0OOO0o o0ooo0o) {
        Task taskCall;
        o0ooo0o.getClass();
        ArrayList arrayList = new ArrayList();
        for (File file : OooO0o.OooOo(((File) o0ooo0o.f30504OooO0oO.f30140OooOoO0).listFiles(f30496OooOo00))) {
            try {
                long j = Long.parseLong(file.getName().substring(3));
                try {
                    Class.forName("com.google.firebase.crash.FirebaseCrash");
                    Log.w("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, FirebaseCrash exists", null);
                    taskCall = Tasks.forResult(null);
                } catch (ClassNotFoundException unused) {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Logging app exception event to Firebase Analytics", null);
                    }
                    taskCall = Tasks.call(new ScheduledThreadPoolExecutor(1), new o0ooOOo(o0ooo0o, j));
                }
                arrayList.add(taskCall);
            } catch (NumberFormatException unused2) {
                Log.w("FirebaseCrashlytics", "Could not parse app exception timestamp from file " + file.getName(), null);
            }
            file.delete();
        }
        return Tasks.whenAll(arrayList);
    }

    public final void OooO(String str, String str2) {
        try {
            ((o0O0oo00) this.f30501OooO0Oo.f30141OooOoOO).OooO00o(str, str2);
        } catch (IllegalArgumentException e) {
            Context context = this.f30498OooO00o;
            if (context != null && (context.getApplicationInfo().flags & 2) != 0) {
                throw e;
            }
            Log.e("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:275:0x01de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooO0O0(boolean r19, OooOOOo.o0ooOOo r20, boolean r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 923
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o000Ooo.o0OOO0o.OooO0O0(boolean, OooOOOo.o0ooOOo, boolean):void");
    }

    public final void OooO0OO(String str, Boolean bool) {
        String str2;
        String str3;
        String str4;
        int i;
        Integer num;
        Map mapUnmodifiableMap;
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        String strOooOO0 = OooO0oO.OooOo.OooOO0("Opening a new session with ID ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", strOooOO0, null);
        }
        Locale locale = Locale.US;
        o0000Ooo o0000ooo = this.f30502OooO0o;
        OoooO0O.o00Ooo o00ooo2 = this.f30505OooO0oo;
        o00O00O o00o00o = new o00O00O(o0000ooo.f30470OooO0OO, (String) o00ooo2.f14028OooO0o, (String) o00ooo2.f14030OooO0oO, o0000ooo.OooO0OO().f30423OooO00o, o000Oo.o0OO00O.OooO0O0(((String) o00ooo2.f14027OooO0Oo) != null ? 4 : 1), (OooOOO0) o00ooo2.f14031OooO0oo);
        String str5 = Build.VERSION.RELEASE;
        String str6 = Build.VERSION.CODENAME;
        o00O00OO o00o00oo = new o00O00OO(str5, str6, o00O0O.OooO0oO());
        Context context = this.f30498OooO00o;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockCount = statFs.getBlockCount() * statFs.getBlockSize();
        o0OoOo0 o0oooo0 = o0OoOo0.f30519OooOo0O;
        String str7 = Build.CPU_ABI;
        boolean zIsEmpty = TextUtils.isEmpty(str7);
        o0OoOo0 o0oooo02 = o0OoOo0.f30519OooOo0O;
        if (!zIsEmpty) {
            o0OoOo0 o0oooo03 = (o0OoOo0) o0OoOo0.f30520OooOo0o.get(str7.toLowerCase(locale));
            if (o0oooo03 != null) {
                o0oooo02 = o0oooo03;
            }
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Architecture#getValue()::Build.CPU_ABI returned null or empty", null);
        }
        int iOrdinal = o0oooo02.ordinal();
        String str8 = Build.MODEL;
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        long jOooO00o = o00O0O.OooO00o(context);
        boolean zOooO0o = o00O0O.OooO0o();
        int iOooO0OO = o00O0O.OooO0OO();
        String str9 = Build.MANUFACTURER;
        String str10 = Build.PRODUCT;
        this.f30506OooOO0.OooO0Oo(str, jCurrentTimeMillis, new o00O00(o00o00o, o00o00oo, new oOO00O(iOrdinal, str8, iAvailableProcessors, jOooO00o, blockCount, zOooO0o, iOooO0OO, str9, str10)));
        if (!bool.booleanValue() || str == null) {
            str2 = str6;
            str3 = str9;
            str4 = str10;
            i = 4;
        } else {
            OooO0o oooO0o = this.f30501OooO0Oo;
            synchronized (((String) oooO0o.f30138OooOo0o)) {
                oooO0o.f30138OooOo0o = str;
                o000Oo0.OooO oooO = (o000Oo0.OooO) ((AtomicMarkableReference) ((o0O0oo00) oooO0o.f30139OooOoO).f14470OooOo0o).getReference();
                synchronized (oooO) {
                    mapUnmodifiableMap = Collections.unmodifiableMap(new HashMap(oooO.f30324OooO00o));
                }
                str2 = str6;
                str3 = str9;
                str4 = str10;
                i = 4;
                ((OooO) oooO0o.f30140OooOoO0).f30100OooO0O0.OooO00o(new OooO0O0(oooO0o, str, mapUnmodifiableMap, ((o000Oo0.o000oOoO) oooO0o.f30143OooOoo0).OooO00o(), 24));
            }
        }
        OooOO0 oooOO0 = this.f30497OooO;
        ((o000Oo0.OooO0o) oooOO0.f30343OooOo0o).OooO00o();
        oooOO0.f30343OooOo0o = OooOO0.f30341OooOo;
        if (str != null) {
            oooOO0.f30343OooOo0o = new o000Oo0.Oooo000(((OooO0o) oooOO0.f30342OooOo0O).OooOOOO(str, "userlog"));
        }
        this.OooOO0o.OooO00o(str);
        OooO0o oooO0o2 = this.f30509OooOOO0;
        o000000O o000000o2 = (o000000O) oooO0o2.f30138OooOo0o;
        Charset charset = o0oOO.f30067OooO00o;
        o000O00.o0O0O00 o0o0o00 = new o000O00.o0O0O00();
        o0o0o00.f30041OooO00o = "20.0.0";
        OoooO0O.o00Ooo o00ooo3 = o000000o2.f30451OooO0OO;
        String str11 = (String) o00ooo3.f14024OooO00o;
        if (str11 == null) {
            throw new NullPointerException("Null gmpAppId");
        }
        o0o0o00.f30042OooO0O0 = str11;
        o0000Ooo o0000ooo2 = o000000o2.f30450OooO0O0;
        String str12 = o0000ooo2.OooO0OO().f30423OooO00o;
        if (str12 == null) {
            throw new NullPointerException("Null installationUuid");
        }
        o0o0o00.f30044OooO0Oo = str12;
        o0o0o00.f30046OooO0o0 = o0000ooo2.OooO0OO().f30424OooO0O0;
        o0o0o00.f30045OooO0o = o0000ooo2.OooO0OO().f30425OooO0OO;
        String str13 = (String) o00ooo3.f14028OooO0o;
        if (str13 == null) {
            throw new NullPointerException("Null buildVersion");
        }
        o0o0o00.f30048OooO0oo = str13;
        String str14 = (String) o00ooo3.f14030OooO0oO;
        if (str14 == null) {
            throw new NullPointerException("Null displayVersion");
        }
        o0o0o00.f30040OooO = str14;
        o0o0o00.f30043OooO0OO = i;
        o0o0o00.f30051OooOOO0 = (byte) (o0o0o00.f30051OooOOO0 | 1);
        o000O00.o0000Ooo o0000ooo3 = new o000O00.o0000Ooo();
        o0000ooo3.f29913OooO0o = false;
        byte b = (byte) (o0000ooo3.f29919OooOOO0 | 2);
        o0000ooo3.f29912OooO0Oo = jCurrentTimeMillis;
        o0000ooo3.f29919OooOOO0 = (byte) (b | 1);
        if (str == null) {
            throw new NullPointerException("Null identifier");
        }
        o0000ooo3.f29910OooO0O0 = str;
        String str15 = o000000O.f30448OooO0oO;
        if (str15 == null) {
            throw new NullPointerException("Null generator");
        }
        o0000ooo3.f29909OooO00o = str15;
        String str16 = o0000ooo2.f30470OooO0OO;
        if (str16 == null) {
            throw new NullPointerException("Null identifier");
        }
        String str17 = o0000ooo2.OooO0OO().f30423OooO00o;
        OooOOO0 oooOOO0 = (OooOOO0) o00ooo3.f14031OooO0oo;
        if (((o0000O) oooOOO0.f13278OooOo) == null) {
            oooOOO0.f13278OooOo = new o0000O(oooOOO0);
        }
        o0000O o0000o2 = (o0000O) oooOOO0.f13278OooOo;
        String str18 = o0000o2.f13923OooO00o;
        if (o0000o2 == null) {
            oooOOO0.f13278OooOo = new o0000O(oooOOO0);
        }
        o0000ooo3.f29915OooO0oO = new o0000O00(str16, str13, str14, str17, str18, ((o0000O) oooOOO0.f13278OooOo).f13924OooO0O0);
        o00oOoo o00oooo = new o00oOoo();
        o00oooo.f30035OooO00o = 3;
        o00oooo.f30039OooO0o0 = (byte) (o00oooo.f30039OooO0o0 | 1);
        o00oooo.f30036OooO0O0 = str5;
        o00oooo.f30037OooO0OO = str2;
        o00oooo.f30038OooO0Oo = o00O0O.OooO0oO();
        o00oooo.f30039OooO0o0 = (byte) (o00oooo.f30039OooO0o0 | 2);
        o0000ooo3.f29908OooO = o00oooo.OooO00o();
        StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
        int iIntValue = 7;
        if (!TextUtils.isEmpty(str7) && (num = (Integer) o000000O.f30447OooO0o.get(str7.toLowerCase(locale))) != null) {
            iIntValue = num.intValue();
        }
        int iAvailableProcessors2 = Runtime.getRuntime().availableProcessors();
        long jOooO00o2 = o00O0O.OooO00o(o000000o2.f30449OooO00o);
        long blockCount2 = statFs2.getBlockCount() * statFs2.getBlockSize();
        boolean zOooO0o2 = o00O0O.OooO0o();
        int iOooO0OO2 = o00O0O.OooO0OO();
        o0000O0 o0000o02 = new o0000O0();
        o0000o02.f29877OooO00o = iIntValue;
        byte b2 = (byte) (o0000o02.f29885OooOO0 | 1);
        o0000o02.f29878OooO0O0 = str8;
        o0000o02.f29879OooO0OO = iAvailableProcessors2;
        o0000o02.f29880OooO0Oo = jOooO00o2;
        o0000o02.f29882OooO0o0 = blockCount2;
        o0000o02.f29881OooO0o = zOooO0o2;
        o0000o02.f29883OooO0oO = iOooO0OO2;
        o0000o02.f29885OooOO0 = (byte) (((byte) (((byte) (((byte) (((byte) (b2 | 2)) | 4)) | 8)) | 16)) | 32);
        o0000o02.f29884OooO0oo = str3;
        o0000o02.f29876OooO = str4;
        o0000ooo3.f29917OooOO0 = o0000o02.OooO00o();
        o0000ooo3.OooOO0o = 3;
        o0000ooo3.f29919OooOOO0 = (byte) (o0000ooo3.f29919OooOOO0 | 4);
        o0o0o00.f30049OooOO0 = o0000ooo3.OooO00o();
        o000O00.o000OOo o000oooOooO00o = o0o0o00.OooO00o();
        OooO0o oooO0o3 = ((o000O0Oo.OooO0O0) oooO0o2.f30136OooOo).f30132OooO0O0;
        o000O00.o0000 o0000Var = o000oooOooO00o.f29982OooOO0O;
        if (o0000Var == null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not get session for report", null);
                return;
            }
            return;
        }
        String str19 = o0000Var.f29833OooO0O0;
        try {
            o000O0Oo.OooO0O0.f30129OooO0oO.getClass();
            o000O0Oo.OooO0O0.OooO0o(oooO0o3.OooOOOO(str19, "report"), o000O00O.OooO00o.f30097OooO00o.OooO00o(o000oooOooO00o));
            File fileOooOOOO = oooO0o3.OooOOOO(str19, "start-time");
            long j = o0000Var.f29835OooO0Oo;
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(fileOooOOOO), o000O0Oo.OooO0O0.f30128OooO0o0);
            try {
                outputStreamWriter.write("");
                fileOooOOOO.setLastModified(j * 1000);
                outputStreamWriter.close();
            } finally {
            }
        } catch (IOException e) {
            String strOooOO02 = OooO0oO.OooOo.OooOO0("Could not persist report for session ", str19);
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", strOooOO02, e);
            }
        }
    }

    public final boolean OooO0Oo(OooOOOo.o0ooOOo o0ooooo) throws Throwable {
        OooO.OooO00o();
        o00000 o00000Var = this.f30508OooOOO;
        if (o00000Var != null && o00000Var.f30431OooO0o0.get()) {
            Log.w("FirebaseCrashlytics", "Skipping session finalization because a crash has already occurred.", null);
            return false;
        }
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Finalizing previously open sessions.", null);
        }
        try {
            OooO0O0(true, o0ooooo, true);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Closed all previously open sessions.", null);
            }
            return true;
        } catch (Exception e) {
            Log.e("FirebaseCrashlytics", "Unable to finalize previously open sessions.", e);
            return false;
        }
    }

    public final String OooO0o() throws Resources.NotFoundException, IOException {
        InputStream resourceAsStream;
        Context context = this.f30498OooO00o;
        int iOooO0Oo = o00O0O.OooO0Oo(context, "com.google.firebase.crashlytics.version_control_info", "string");
        String string = iOooO0Oo == 0 ? null : context.getResources().getString(iOooO0Oo);
        if (string != null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Read version control info from string resource", null);
            }
            return Base64.encodeToString(string.getBytes(OooOo0), 0);
        }
        ClassLoader classLoader = o0OOO0o.class.getClassLoader();
        if (classLoader == null) {
            Log.w("FirebaseCrashlytics", "Couldn't get Class Loader", null);
            resourceAsStream = null;
        } else {
            resourceAsStream = classLoader.getResourceAsStream("META-INF/version-control-info.textproto");
        }
        if (resourceAsStream == null) {
            if (resourceAsStream != null) {
                resourceAsStream.close();
            }
            Log.i("FirebaseCrashlytics", "No version control information found", null);
            return null;
        }
        try {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Read version control info from file", null);
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i = resourceAsStream.read(bArr);
                    if (i == -1) {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        String strEncodeToString = Base64.encodeToString(byteArray, 0);
                        resourceAsStream.close();
                        return strEncodeToString;
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                }
            } finally {
            }
        } catch (Throwable th) {
            try {
                resourceAsStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final String OooO0o0() {
        NavigableSet navigableSetOooO0OO = ((o000O0Oo.OooO0O0) this.f30509OooOOO0.f30136OooOo).OooO0OO();
        if (navigableSetOooO0OO.isEmpty()) {
            return null;
        }
        return (String) navigableSetOooO0OO.first();
    }

    public final synchronized void OooO0oO(OooOOOo.o0ooOOo o0ooooo, Thread thread, Throwable th, boolean z) throws Throwable {
        Throwable th2;
        Task taskContinueWithTask;
        try {
            try {
                String str = "Handling uncaught exception \"" + th + "\" from thread " + thread.getName();
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    try {
                        Log.d("FirebaseCrashlytics", str, null);
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                }
                if (!z) {
                    o00OoO00.OooOOO0.OooO0o();
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                o000O0O.OooO0O0 oooO0O0 = this.f30503OooO0o0.f30099OooO00o;
                oo000o oo000oVar = new oo000o(this, jCurrentTimeMillis, th, thread, o0ooooo, z);
                synchronized (oooO0O0.f30105OooOo0o) {
                    taskContinueWithTask = oooO0O0.f30103OooOo.continueWithTask(oooO0O0.f30104OooOo0O, new OooO0oo.o00Oo0(oo000oVar, 23));
                    oooO0O0.f30103OooOo = taskContinueWithTask;
                }
                if (!z) {
                    try {
                        try {
                            o0000.OooO00o(taskContinueWithTask);
                        } catch (Exception e) {
                            Log.e("FirebaseCrashlytics", "Error handling uncaught exception", e);
                        }
                    } catch (TimeoutException unused) {
                        Log.e("FirebaseCrashlytics", "Cannot send reports. Timed out while fetching settings.", null);
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                throw th2;
            }
        } catch (Throwable th5) {
            th = th5;
            th2 = th;
            throw th2;
        }
    }

    public final void OooO0oo() throws Resources.NotFoundException {
        try {
            String strOooO0o = OooO0o();
            if (strOooO0o != null) {
                OooO("com.crashlytics.version-control-info", strOooO0o);
                Log.i("FirebaseCrashlytics", "Saved version control info", null);
            }
        } catch (IOException e) {
            Log.w("FirebaseCrashlytics", "Unable to save version control info", e);
        }
    }

    public final void OooOO0(Task task) {
        Task task2;
        Task taskOooO00o;
        OooO0o oooO0o = ((o000O0Oo.OooO0O0) this.f30509OooOOO0.f30136OooOo).f30132OooO0O0;
        boolean zIsEmpty = OooO0o.OooOo(((File) oooO0o.f30141OooOoOO).listFiles()).isEmpty();
        TaskCompletionSource taskCompletionSource = this.f30511OooOOOo;
        if (zIsEmpty && OooO0o.OooOo(((File) oooO0o.f30143OooOoo0).listFiles()).isEmpty() && OooO0o.OooOo(((File) oooO0o.f30142OooOoo).listFiles()).isEmpty()) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No crash reports are available to be sent.", null);
            }
            taskCompletionSource.trySetResult(Boolean.FALSE);
            return;
        }
        OooO0OO oooO0OO = OooO0OO.f30095OooO00o;
        oooO0OO.OooO0oO("Crash reports are available to be sent.");
        o00000O0 o00000o02 = this.f30499OooO0O0;
        if (o00000o02.OooO0O0()) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Automatic data collection is enabled. Allowing upload.", null);
            }
            taskCompletionSource.trySetResult(Boolean.FALSE);
            taskOooO00o = Tasks.forResult(Boolean.TRUE);
        } else {
            oooO0OO.OooO0OO("Automatic data collection is disabled.");
            oooO0OO.OooO0oO("Notifying that unsent reports are available.");
            taskCompletionSource.trySetResult(Boolean.TRUE);
            synchronized (o00000o02.f30458OooO0OO) {
                task2 = o00000o02.f30459OooO0Oo.getTask();
            }
            Task taskOnSuccessTask = task2.onSuccessTask(new o0O00000(20));
            oooO0OO.OooO0OO("Waiting for send/deleteUnsentReports to be called.");
            taskOooO00o = o000O0O.OooO00o.OooO00o(taskOnSuccessTask, this.f30513OooOOo0.getTask());
        }
        taskOooO00o.onSuccessTask(this.f30503OooO0o0.f30099OooO00o, new OooOo00(this, false, task, 3));
    }

    /* JADX WARN: Removed duplicated region for block: B:167:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x014a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooOO0O(java.lang.String r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 904
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o000Ooo.o0OOO0o.OooOO0O(java.lang.String):void");
    }
}
