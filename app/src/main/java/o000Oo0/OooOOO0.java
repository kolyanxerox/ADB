package o000Oo0;

import android.util.Log;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o000Ooo.o00O0O;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class OooOOO0 {

    /* renamed from: OooO0O0, reason: collision with root package name */
    public static final Charset f30347OooO0O0 = Charset.forName("UTF-8");

    /* renamed from: OooO00o, reason: collision with root package name */
    public final o000O0Oo.OooO0o f30348OooO00o;

    public OooOOO0(o000O0Oo.OooO0o oooO0o) {
        this.f30348OooO00o = oooO0o;
    }

    public static HashMap OooO00o(String str) {
        JSONObject jSONObject = new JSONObject(str);
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOptString = null;
            if (!jSONObject.isNull(next)) {
                strOptString = jSONObject.optString(next, null);
            }
            map.put(next, strOptString);
        }
        return map;
    }

    public static ArrayList OooO0O0(String str) throws JSONException {
        JSONArray jSONArray = new JSONObject(str).getJSONArray("rolloutsState");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            String string = jSONArray.getString(i);
            try {
                o000Ooo0.OooOO0 oooOO0 = Oooo0.f30359OooO00o;
                JSONObject jSONObject = new JSONObject(string);
                String string2 = jSONObject.getString("rolloutId");
                String string3 = jSONObject.getString("parameterKey");
                String string4 = jSONObject.getString("parameterValue");
                String string5 = jSONObject.getString("variantId");
                long j = jSONObject.getLong("templateVersion");
                if (string4.length() > 256) {
                    string4 = string4.substring(0, 256);
                }
                arrayList.add(new OooO0O0(string2, string3, string4, string5, j));
            } catch (Exception e) {
                Log.w("FirebaseCrashlytics", "Failed de-serializing rollouts state. " + string, e);
            }
        }
        return arrayList;
    }

    public static void OooO0o(File file) {
        if (file.exists() && file.delete()) {
            Log.i("FirebaseCrashlytics", "Deleted corrupt file: " + file.getAbsolutePath(), null);
        }
    }

    public static String OooO0o0(List list) {
        HashMap map = new HashMap();
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < list.size(); i++) {
            try {
                jSONArray.put(new JSONObject(Oooo0.f30359OooO00o.OooO00o(list.get(i))));
            } catch (JSONException e) {
                Log.w("FirebaseCrashlytics", "Exception parsing rollout assignment!", e);
            }
        }
        map.put("rolloutsState", jSONArray);
        return new JSONObject(map).toString();
    }

    public static void OooO0oO(File file, String str) {
        if (file.exists() && file.delete()) {
            Log.i("FirebaseCrashlytics", androidx.datastore.preferences.protobuf.OooO00o.OooOO0o("Deleted corrupt file: ", file.getAbsolutePath(), "\nReason: ", str), null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.Closeable] */
    public final void OooO(String str, List list) {
        Throwable th;
        BufferedWriter bufferedWriter;
        Exception e;
        String strOooO0o0;
        File fileOooOOOO = this.f30348OooO00o.OooOOOO(str, "rollouts-state");
        ?? IsEmpty = list.isEmpty();
        if (IsEmpty != 0) {
            OooO0oO(fileOooOOOO, "Rollout state is empty for session: " + str);
            return;
        }
        try {
            try {
                strOooO0o0 = OooO0o0(list);
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileOooOOOO), f30347OooO0O0));
            } catch (Exception e2) {
                bufferedWriter = null;
                e = e2;
            } catch (Throwable th2) {
                IsEmpty = 0;
                th = th2;
                o00O0O.OooO0O0(IsEmpty, "Failed to close rollouts state file.");
                throw th;
            }
            try {
                bufferedWriter.write(strOooO0o0);
                bufferedWriter.flush();
                o00O0O.OooO0O0(bufferedWriter, "Failed to close rollouts state file.");
            } catch (Exception e3) {
                e = e3;
                Log.w("FirebaseCrashlytics", "Error serializing rollouts state.", e);
                OooO0o(fileOooOOOO);
                o00O0O.OooO0O0(bufferedWriter, "Failed to close rollouts state file.");
            }
        } catch (Throwable th3) {
            th = th3;
            o00O0O.OooO0O0(IsEmpty, "Failed to close rollouts state file.");
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.io.Closeable] */
    public final Map OooO0OO(String str, boolean z) throws Throwable {
        Throwable th;
        FileInputStream fileInputStream;
        Exception e;
        o000O0Oo.OooO0o oooO0o = this.f30348OooO00o;
        File fileOooOOOO = z ? oooO0o.OooOOOO(str, "internal-keys") : oooO0o.OooOOOO(str, "keys");
        if (!fileOooOOOO.exists() || fileOooOOOO.length() == 0) {
            OooO0oO(fileOooOOOO, "The file has a length of zero for session: " + str);
            return Collections.EMPTY_MAP;
        }
        try {
            try {
                fileInputStream = new FileInputStream(fileOooOOOO);
            } catch (Exception e2) {
                fileInputStream = null;
                e = e2;
            } catch (Throwable th2) {
                ?? r1 = 0;
                th = th2;
                o00O0O.OooO0O0(r1, "Failed to close user metadata file.");
                throw th;
            }
            try {
                HashMap mapOooO00o = OooO00o(o00O0O.OooO(fileInputStream));
                o00O0O.OooO0O0(fileInputStream, "Failed to close user metadata file.");
                return mapOooO00o;
            } catch (Exception e3) {
                e = e3;
                Log.w("FirebaseCrashlytics", "Error deserializing user metadata.", e);
                OooO0o(fileOooOOOO);
                o00O0O.OooO0O0(fileInputStream, "Failed to close user metadata file.");
                return Collections.EMPTY_MAP;
            }
        } catch (Throwable th3) {
            th = th3;
            o00O0O.OooO0O0(r1, "Failed to close user metadata file.");
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    public final String OooO0Oo(String str) {
        FileInputStream fileInputStream;
        File fileOooOOOO = this.f30348OooO00o.OooOOOO(str, "user-data");
        Closeable closeable = null;
        if (fileOooOOOO.exists()) {
            ?? r3 = (fileOooOOOO.length() > 0L ? 1 : (fileOooOOOO.length() == 0L ? 0 : -1));
            try {
                if (r3 != 0) {
                    try {
                        fileInputStream = new FileInputStream(fileOooOOOO);
                    } catch (Exception e) {
                        e = e;
                        fileInputStream = null;
                    } catch (Throwable th) {
                        th = th;
                        o00O0O.OooO0O0(closeable, "Failed to close user metadata file.");
                        throw th;
                    }
                    try {
                        JSONObject jSONObject = new JSONObject(o00O0O.OooO(fileInputStream));
                        String strOptString = !jSONObject.isNull("userId") ? jSONObject.optString("userId", null) : null;
                        String str2 = "Loaded userId " + strOptString + " for session " + str;
                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                            Log.d("FirebaseCrashlytics", str2, null);
                        }
                        o00O0O.OooO0O0(fileInputStream, "Failed to close user metadata file.");
                        return strOptString;
                    } catch (Exception e2) {
                        e = e2;
                        Log.w("FirebaseCrashlytics", "Error deserializing user metadata.", e);
                        OooO0o(fileOooOOOO);
                        o00O0O.OooO0O0(fileInputStream, "Failed to close user metadata file.");
                        return null;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                closeable = r3;
            }
        }
        String strOooOO0 = OooO0oO.OooOo.OooOO0("No userId set for session ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", strOooOO0, null);
        }
        OooO0o(fileOooOOOO);
        return null;
    }

    public final void OooO0oo(String str, Map map, boolean z) {
        o000O0Oo.OooO0o oooO0o = this.f30348OooO00o;
        File fileOooOOOO = z ? oooO0o.OooOOOO(str, "internal-keys") : oooO0o.OooOOOO(str, "keys");
        BufferedWriter bufferedWriter = null;
        try {
            try {
                String string = new JSONObject(map).toString();
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileOooOOOO), f30347OooO0O0));
                try {
                    bufferedWriter2.write(string);
                    bufferedWriter2.flush();
                    o00O0O.OooO0O0(bufferedWriter2, "Failed to close key/value metadata file.");
                } catch (Exception e) {
                    e = e;
                    bufferedWriter = bufferedWriter2;
                    Log.w("FirebaseCrashlytics", "Error serializing key/value metadata.", e);
                    OooO0o(fileOooOOOO);
                    o00O0O.OooO0O0(bufferedWriter, "Failed to close key/value metadata file.");
                } catch (Throwable th) {
                    th = th;
                    bufferedWriter = bufferedWriter2;
                    o00O0O.OooO0O0(bufferedWriter, "Failed to close key/value metadata file.");
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    public final void OooOO0(String str, String str2) {
        File fileOooOOOO = this.f30348OooO00o.OooOOOO(str, "user-data");
        BufferedWriter bufferedWriter = null;
        try {
            try {
                OooOO0O oooOO0O = new OooOO0O();
                oooOO0O.put("userId", str2);
                String string = oooOO0O.toString();
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileOooOOOO), f30347OooO0O0));
                try {
                    bufferedWriter2.write(string);
                    bufferedWriter2.flush();
                    o00O0O.OooO0O0(bufferedWriter2, "Failed to close user metadata file.");
                } catch (Exception e) {
                    e = e;
                    bufferedWriter = bufferedWriter2;
                    Log.w("FirebaseCrashlytics", "Error serializing user metadata.", e);
                    o00O0O.OooO0O0(bufferedWriter, "Failed to close user metadata file.");
                } catch (Throwable th) {
                    th = th;
                    bufferedWriter = bufferedWriter2;
                    o00O0O.OooO0O0(bufferedWriter, "Failed to close user metadata file.");
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }
}
