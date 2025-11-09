package o000Oo0O;

import OooOOo.OooOOO;
import OooOOoo.o0000OO0;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.security.keystore.KeyGenParameterSpec;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.ironsource.C3457nk;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.security.Key;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.cert.CertificateException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.Cipher;
import javax.security.auth.x500.X500Principal;
import o000O0Oo.OooO0O0;
import o000O0Oo.OooO0o;
import o000Oo.o0OO00O;
import o000Oo0o.o0ooOOo;
import o000Ooo.o00000O0;
import o000Ooo.o00oO0o;
import o000Ooo.o0OOO0o;
import o000Oooo.o000000;
import o000Oooo.o000OOo;
import o000o00O.OooO;
import o000o00O.OooO0OO;
import o000o00O.OooOO0;
import o000o0O0.OooOOO0;
import o0ooOO0.o0000;
import o0ooOO0.o0000O00;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class OooOo00 implements SuccessContinuation, OooOOO0, OnApplyWindowInsetsListener {

    /* renamed from: OooOo, reason: collision with root package name */
    public Object f30370OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f30371OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public Object f30372OooOo0o;

    public /* synthetic */ OooOo00(int i, Object obj, Object obj2) {
        this.f30371OooOo0O = i;
        this.f30372OooOo0o = obj;
        this.f30370OooOo = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0045 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0040 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static o000Oo0O.OooOo00 OooO00o(android.content.Context r5) throws java.io.IOException {
        /*
            java.lang.String r0 = "generatefid.lock"
            r1 = 0
            java.io.File r2 = new java.io.File     // Catch: java.nio.channels.OverlappingFileLockException -> L2f java.lang.Error -> L33 java.io.IOException -> L35
            java.io.File r5 = r5.getFilesDir()     // Catch: java.nio.channels.OverlappingFileLockException -> L2f java.lang.Error -> L33 java.io.IOException -> L35
            r2.<init>(r5, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L2f java.lang.Error -> L33 java.io.IOException -> L35
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch: java.nio.channels.OverlappingFileLockException -> L2f java.lang.Error -> L33 java.io.IOException -> L35
            java.lang.String r0 = "rw"
            r5.<init>(r2, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L2f java.lang.Error -> L33 java.io.IOException -> L35
            java.nio.channels.FileChannel r5 = r5.getChannel()     // Catch: java.nio.channels.OverlappingFileLockException -> L2f java.lang.Error -> L33 java.io.IOException -> L35
            java.nio.channels.FileLock r0 = r5.lock()     // Catch: java.nio.channels.OverlappingFileLockException -> L28 java.lang.Error -> L2b java.io.IOException -> L2d
            o000Oo0O.OooOo00 r2 = new o000Oo0O.OooOo00     // Catch: java.nio.channels.OverlappingFileLockException -> L22 java.lang.Error -> L24 java.io.IOException -> L26
            r3 = 0
            r2.<init>(r3, r5, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L22 java.lang.Error -> L24 java.io.IOException -> L26
            return r2
        L22:
            r2 = move-exception
            goto L37
        L24:
            r2 = move-exception
            goto L37
        L26:
            r2 = move-exception
            goto L37
        L28:
            r2 = move-exception
        L29:
            r0 = r1
            goto L37
        L2b:
            r2 = move-exception
            goto L29
        L2d:
            r2 = move-exception
            goto L29
        L2f:
            r2 = move-exception
        L30:
            r5 = r1
            r0 = r5
            goto L37
        L33:
            r2 = move-exception
            goto L30
        L35:
            r2 = move-exception
            goto L30
        L37:
            java.lang.String r3 = "CrossProcessLock"
            java.lang.String r4 = "encountered error while creating and acquiring the lock, ignoring"
            android.util.Log.e(r3, r4, r2)
            if (r0 == 0) goto L43
            r0.release()     // Catch: java.io.IOException -> L43
        L43:
            if (r5 == 0) goto L48
            r5.close()     // Catch: java.io.IOException -> L48
        L48:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o000Oo0O.OooOo00.OooO00o(android.content.Context):o000Oo0O.OooOo00");
    }

    public HashMap OooO(Intent intent) {
        Context context = (Context) this.f30370OooOo;
        if (context == null) {
            Log.wtf("IntentSender", "Trying to resolve an activity before the applicationContext was initialized.");
            return null;
        }
        PackageManager packageManager = context.getPackageManager();
        ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 65536);
        if (resolveInfoResolveActivity == null) {
            return null;
        }
        HashMap map = new HashMap();
        map.put("activityName", resolveInfoResolveActivity.activityInfo.name);
        map.put(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME, resolveInfoResolveActivity.activityInfo.packageName);
        map.put("appName", resolveInfoResolveActivity.loadLabel(packageManager));
        return map;
    }

    public Intent OooO0O0(String str, Integer num, String str2, Uri uri, Bundle bundle, String str3, ComponentName componentName, String str4) {
        if (((Context) this.f30370OooOo) == null) {
            Log.wtf("IntentSender", "Trying to build an intent before the applicationContext was initialized.");
            return null;
        }
        Intent intent = new Intent();
        if (str != null) {
            intent.setAction(str);
        }
        if (num != null) {
            intent.addFlags(num.intValue());
        }
        if (!TextUtils.isEmpty(str2)) {
            intent.addCategory(str2);
        }
        if (uri != null && str4 == null) {
            intent.setData(uri);
        }
        if (str4 != null && uri == null) {
            intent.setType(str4);
        }
        if (str4 != null && uri != null) {
            intent.setDataAndType(uri, str4);
        }
        intent.putExtras(bundle);
        if (!TextUtils.isEmpty(str3)) {
            intent.setPackage(str3);
            if (componentName != null) {
                intent.setComponent(componentName);
            }
        }
        return intent;
    }

    public void OooO0OO() throws IOException {
        String str = (String) this.f30372OooOo0o;
        try {
            OooO0o oooO0o = (OooO0o) this.f30370OooOo;
            oooO0o.getClass();
            new File((File) oooO0o.f30140OooOoO0, str).createNewFile();
        } catch (IOException e) {
            Log.e("FirebaseCrashlytics", "Error creating marker: ".concat(str), e);
        }
    }

    public String OooO0Oo() {
        return ((Context) this.f30370OooOo).getPackageName() + ".FlutterSecureStoragePluginKey";
    }

    public AlgorithmParameterSpec OooO0o() {
        return null;
    }

    public OooO OooO0o0(o000000 o000000Var) {
        String string;
        JSONArray jSONArray = o000000Var.f30599OooO0oO;
        long j = o000000Var.f30597OooO0o;
        HashSet hashSet = new HashSet();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String string2 = jSONObject.getString("rolloutId");
                JSONArray jSONArray2 = jSONObject.getJSONArray("affectedParameterKeys");
                if (jSONArray2.length() > 1) {
                    Log.w("FirebaseRemoteConfig", String.format("Rollout has multiple affected parameter keys.Only the first key will be included in RolloutsState. rolloutId: %s, affectedParameterKeys: %s", string2, jSONArray2));
                }
                String strOptString = jSONArray2.optString(0, "");
                o000000 o000000VarOooO0OO = ((o000OOo) this.f30372OooOo0o).OooO0OO();
                String string3 = null;
                if (o000000VarOooO0OO == null) {
                    string = null;
                } else {
                    try {
                        string = o000000VarOooO0OO.f30594OooO0O0.getString(strOptString);
                    } catch (JSONException unused) {
                    }
                }
                if (string == null) {
                    o000000 o000000VarOooO0OO2 = ((o000OOo) this.f30370OooOo).OooO0OO();
                    if (o000000VarOooO0OO2 != null) {
                        try {
                            string3 = o000000VarOooO0OO2.f30594OooO0O0.getString(strOptString);
                        } catch (JSONException unused2) {
                        }
                    }
                    string = string3 != null ? string3 : "";
                }
                int i2 = OooOO0.f30681OooO00o;
                OooO0OO oooO0OO = new OooO0OO();
                if (string2 == null) {
                    throw new NullPointerException("Null rolloutId");
                }
                oooO0OO.f30670OooO00o = string2;
                String string4 = jSONObject.getString("variantId");
                if (string4 == null) {
                    throw new NullPointerException("Null variantId");
                }
                oooO0OO.f30671OooO0O0 = string4;
                if (strOptString == null) {
                    throw new NullPointerException("Null parameterKey");
                }
                oooO0OO.f30672OooO0OO = strOptString;
                oooO0OO.f30673OooO0Oo = string;
                oooO0OO.f30675OooO0o0 = j;
                oooO0OO.f30674OooO0o = (byte) (oooO0OO.f30674OooO0o | 1);
                hashSet.add(oooO0OO.OooO00o());
            } catch (JSONException e) {
                throw new o000OooO.o00Oo0("Exception parsing rollouts metadata to create RolloutsState.", e);
            }
        }
        return new OooO(hashSet);
    }

    public File OooO0oO() {
        if (((File) this.f30372OooOo0o) == null) {
            synchronized (this) {
                try {
                    if (((File) this.f30372OooOo0o) == null) {
                        o0000o0.Oooo0 oooo0 = (o0000o0.Oooo0) this.f30370OooOo;
                        oooo0.OooO00o();
                        this.f30372OooOo0o = new File(oooo0.f29588OooO00o.getFilesDir(), "PersistedInstallation." + ((o0000o0.Oooo0) this.f30370OooOo).OooO0o() + ".json");
                    }
                } finally {
                }
            }
        }
        return (File) this.f30372OooOo0o;
    }

    public Cipher OooO0oo() {
        return Cipher.getInstance(C3457nk.f10547b, "AndroidKeyStoreBCWorkaround");
    }

    public void OooOO0(o0ooOOo o0ooooo) throws JSONException, IOException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", o0ooooo.f30406OooO00o);
            jSONObject.put("Status", OooOOO.OooO0O0(o0ooooo.f30407OooO0O0));
            jSONObject.put("AuthToken", o0ooooo.f30408OooO0OO);
            jSONObject.put("RefreshToken", o0ooooo.f30409OooO0Oo);
            jSONObject.put("TokenCreationEpochInSecs", o0ooooo.f30410OooO0o);
            jSONObject.put("ExpiresInSecs", o0ooooo.f30411OooO0o0);
            jSONObject.put("FisError", o0ooooo.f30412OooO0oO);
            o0000o0.Oooo0 oooo0 = (o0000o0.Oooo0) this.f30370OooOo;
            oooo0.OooO00o();
            File fileCreateTempFile = File.createTempFile("PersistedInstallation", "tmp", oooo0.f29588OooO00o.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (fileCreateTempFile.renameTo(OooO0oO())) {
            } else {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    public KeyGenParameterSpec OooOO0O(Calendar calendar, Calendar calendar2) {
        String str = (String) this.f30372OooOo0o;
        return new KeyGenParameterSpec.Builder(str, 3).setCertificateSubject(new X500Principal(OooO0oO.OooOo.OooOO0("CN=", str))).setDigests("SHA-256").setBlockModes("ECB").setEncryptionPaddings("PKCS1Padding").setCertificateSerialNumber(BigInteger.valueOf(1L)).setCertificateNotBefore(calendar.getTime()).setCertificateNotAfter(calendar2.getTime()).build();
    }

    public o0ooOOo OooOO0o() throws IOException {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(OooO0oO());
            while (true) {
                try {
                    int i = fileInputStream.read(bArr, 0, 16384);
                    if (i < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                } finally {
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String strOptString = jSONObject.optString("Fid", null);
        int iOptInt = jSONObject.optInt("Status", 0);
        String strOptString2 = jSONObject.optString("AuthToken", null);
        String strOptString3 = jSONObject.optString("RefreshToken", null);
        long jOptLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long jOptLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String strOptString4 = jSONObject.optString("FisError", null);
        int i2 = o0ooOOo.f30405OooO0oo;
        byte b = (byte) (((byte) (0 | 2)) | 1);
        int i3 = OooOOO.OooO0OO(5)[iOptInt];
        if (i3 == 0) {
            throw new NullPointerException("Null registrationStatus");
        }
        byte b2 = (byte) (((byte) (b | 2)) | 1);
        if (b2 == 3 && i3 != 0) {
            return new o0ooOOo(strOptString, i3, strOptString2, strOptString3, jOptLong2, jOptLong, strOptString4);
        }
        StringBuilder sb = new StringBuilder();
        if (i3 == 0) {
            sb.append(" registrationStatus");
        }
        if ((b2 & 1) == 0) {
            sb.append(" expiresInSecs");
        }
        if ((b2 & 2) == 0) {
            sb.append(" tokenCreationEpochInSecs");
        }
        throw new IllegalStateException(o0OO00O.OooO0OO(sb, "Missing required properties:"));
    }

    public void OooOOO(Intent intent) {
        if (((Context) this.f30370OooOo) == null) {
            Log.wtf("IntentSender", "Trying to send an intent before the applicationContext was initialized.");
            return;
        }
        Log.v("IntentSender", "Sending intent " + intent);
        Activity activity = (Activity) this.f30372OooOo0o;
        if (activity != null) {
            activity.startActivity(intent);
        } else {
            intent.addFlags(268435456);
            ((Context) this.f30370OooOo).startActivity(intent);
        }
    }

    public void OooOOO0() throws IOException {
        try {
            ((FileLock) this.f30370OooOo).release();
            ((FileChannel) this.f30372OooOo0o).close();
        } catch (IOException e) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e);
        }
    }

    public void OooOOOO(Intent intent) {
        if (((Context) this.f30370OooOo) == null) {
            Log.wtf("IntentSender", "Trying to send an intent before the applicationContext was initialized.");
            return;
        }
        Log.v("IntentSender", "Sending service intent " + intent);
        Activity activity = (Activity) this.f30372OooOo0o;
        if (activity != null) {
            activity.startService(intent);
        } else {
            intent.addFlags(268435456);
            ((Context) this.f30370OooOo).startService(intent);
        }
    }

    public void OooOOOo(Locale locale) {
        Locale.setDefault(locale);
        Context context = (Context) this.f30370OooOo;
        Configuration configuration = context.getResources().getConfiguration();
        configuration.setLocale(locale);
        context.createConfigurationContext(configuration);
    }

    public Key OooOOo0(byte[] bArr) throws Exception {
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        String str = (String) this.f30372OooOo0o;
        Key key = keyStore.getKey(str, null);
        if (key == null) {
            throw new Exception(OooO0oO.OooOo.OooOO0("No key found under alias: ", str));
        }
        if (!(key instanceof PrivateKey)) {
            throw new Exception("Not an instance of a PrivateKey");
        }
        Cipher cipherOooO0oo = OooO0oo();
        cipherOooO0oo.init(4, (PrivateKey) key, OooO0o());
        return cipherOooO0oo.unwrap(bArr, "AES", 3);
    }

    @Override // o00O00oO.o0000O0
    public Object get() {
        return new o000o0O.Oooo0((o000o00o.OooOOO0) ((o000o0O0.OooOOO) this.f30372OooOo0o).get(), (o00O0O0O.OooOOO0) ((o0000OO0) this.f30370OooOo).f13531OooOo0o);
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        o0000O00 o0000o00 = new o0000O00();
        o0000O00 o0000o002 = (o0000O00) this.f30370OooOo;
        o0000o00.f33101OooO00o = o0000o002.f33101OooO00o;
        o0000o00.f33102OooO0O0 = o0000o002.f33102OooO0O0;
        o0000o00.f33103OooO0OO = o0000o002.f33103OooO0OO;
        o0000o00.f33104OooO0Oo = o0000o002.f33104OooO0Oo;
        return ((o0000) this.f30372OooOo0o).OooO00o(view, windowInsetsCompat, o0000o00);
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        switch (this.f30371OooOo0O) {
            case 2:
                if (((o000O0O0.OooO0OO) obj) == null) {
                    Log.w("FirebaseCrashlytics", "Received null app settings, cannot send reports at crash time.", null);
                    return Tasks.forResult(null);
                }
                o000Ooo.oo000o oo000oVar = (o000Ooo.oo000o) this.f30370OooOo;
                o0OOO0o o0ooo0o = oo000oVar.f30528OooOoOO;
                return Tasks.whenAll((Task<?>[]) new Task[]{o0OOO0o.OooO00o(o0ooo0o), o0ooo0o.f30509OooOOO0.OooOoO0(o0ooo0o.f30503OooO0o0.f30099OooO00o, oo000oVar.f30526OooOoO ? (String) this.f30372OooOo0o : null)});
            default:
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue = bool.booleanValue();
                o0OOO0o o0ooo0o2 = (o0OOO0o) this.f30370OooOo;
                if (zBooleanValue) {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Sending cached crash reports...", null);
                    }
                    boolean zBooleanValue2 = bool.booleanValue();
                    o00000O0 o00000o02 = o0ooo0o2.f30499OooO0O0;
                    if (zBooleanValue2) {
                        o00000o02.f30463OooO0oo.trySetResult(null);
                        return ((Task) this.f30372OooOo0o).onSuccessTask(o0ooo0o2.f30503OooO0o0.f30099OooO00o, new o00oO0o(this, 0));
                    }
                    o00000o02.getClass();
                    throw new IllegalStateException("An invalid data collection token was used.");
                }
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Deleting cached crash reports...", null);
                }
                Iterator it = OooO0o.OooOo(((File) o0ooo0o2.f30504OooO0oO.f30140OooOoO0).listFiles(o0OOO0o.f30496OooOo00)).iterator();
                while (it.hasNext()) {
                    ((File) it.next()).delete();
                }
                OooO0o oooO0o = ((OooO0O0) o0ooo0o2.f30509OooOOO0.f30136OooOo).f30132OooO0O0;
                OooO0O0.OooO00o(OooO0o.OooOo(((File) oooO0o.f30141OooOoOO).listFiles()));
                OooO0O0.OooO00o(OooO0o.OooOo(((File) oooO0o.f30143OooOoo0).listFiles()));
                OooO0O0.OooO00o(OooO0o.OooOo(((File) oooO0o.f30142OooOoo).listFiles()));
                o0ooo0o2.f30512OooOOo.trySetResult(null);
                return Tasks.forResult(null);
        }
    }

    public /* synthetic */ OooOo00(Object obj, boolean z, Object obj2, int i) {
        this.f30371OooOo0O = i;
        this.f30370OooOo = obj;
        this.f30372OooOo0o = obj2;
    }

    public OooOo00(int i) {
        this.f30371OooOo0O = i;
        switch (i) {
            case 11:
                this.f30372OooOo0o = new HashMap();
                this.f30370OooOo = null;
                break;
            default:
                this.f30372OooOo0o = new AtomicInteger();
                this.f30370OooOo = new AtomicInteger();
                break;
        }
    }

    public OooOo00(Context context) throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        this.f30371OooOo0O = 9;
        this.f30370OooOo = context;
        String strOooO0Oo = OooO0Oo();
        this.f30372OooOo0o = strOooO0Oo;
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        if (keyStore.getKey(strOooO0Oo, null) == null) {
            Locale locale = Locale.getDefault();
            try {
                OooOOOo(Locale.ENGLISH);
                Calendar calendar = Calendar.getInstance();
                Calendar calendar2 = Calendar.getInstance();
                calendar2.add(1, 25);
                KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
                keyPairGenerator.initialize(OooOO0O(calendar, calendar2));
                keyPairGenerator.generateKeyPair();
            } finally {
                OooOOOo(locale);
            }
        }
    }

    public OooOo00(o000Oo00.OooOOO oooOOO) {
        this.f30371OooOo0O = 6;
        this.f30370OooOo = Collections.synchronizedMap(new HashMap());
        this.f30372OooOo0o = oooOOO;
    }

    public OooOo00(o0000o0.Oooo0 oooo0) {
        this.f30371OooOo0O = 1;
        this.f30370OooOo = oooo0;
    }
}
